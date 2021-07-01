(ns static-website.core
  (:require [goog.dom :as dom]
            [goog.dom.classlist :as dom-classlist]
            [goog.events :as events]
            [goog.fx.dom :as fx]))

(defn add-event [element e cb]
  (events/listen element (name e) cb))

(defn fadein [element]
  (let [anim (fx/Fade. element 0 1 500)]
    (. anim (play))))

(defn close-menu []
  (map #(dom-classlist/remove % "show") (.getElementsByClassName js/document "navbar-collapse")))

(defn highlight-menu [no]
  (let [elements (.querySelectorAll js/document ".navbar .navbar-nav > .nav-item")]
    (dom-classlist/remove (first elements) "selected")
    (dom-classlist/remove (second elements) "selected")
    (dom-classlist/remove (second (rest elements )) "selected")
    (dom-classlist/remove (last elements) "selected"))
  (dom-classlist/add
    (dom/getParentElement
      (first
        (.querySelectorAll
          js/document
          (str ".navbar .navbar-nav > .nav-item > .nav-link[data-no='" no "']"))))
    "selected"))

(defn open-page [no]
  (let [elements (.querySelectorAll js/document ".cd-hero-slider li")]
    (dom-classlist/add (first elements) "hidden")
    (dom-classlist/add (second elements) "hidden")
    (dom-classlist/add (second (rest elements)) "hidden")
    (dom-classlist/add (last elements) "hidden"))
  (js/console.log (.querySelectorAll js/document (str ".cd-hero-slider li[data-page-no=\"" no "\"]")))
  (dom-classlist/remove (first (.querySelectorAll js/document (str ".cd-hero-slider li[data-page-no=\"" no "\"]"))) "hidden")
  (fadein (first (.querySelectorAll js/document (str ".cd-hero-slider li[data-page-no=\"" no "\"]"))))
  (close-menu))

(defn change-page [event]
  (let [no (.-no (.-dataset (.-target event)))]
    (highlight-menu no)
    (open-page no)))

(let [elements (.querySelectorAll js/document ".navbar .navbar-nav > .nav-item")]
  (add-event (first elements) (.-CLICK events/EventType) change-page)
  (add-event (second elements) (.-CLICK events/EventType) change-page)
  (add-event (second (rest elements)) (.-CLICK events/EventType) change-page)
  (add-event (last elements) (.-CLICK events/EventType) change-page))

(highlight-menu 1)
(open-page 1)
(dom-classlist/add (first (.getElementsByTagName js/document "body")) "loaded")
