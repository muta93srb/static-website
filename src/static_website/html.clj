(ns static-website.html
  (:require [hiccup.core :as h]))

(defn render-html []
  (h/html
    [:html {:lang "en"}
     [:head
      [:title "Shtanglitza"]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
      [:link {:rel "stylesheet" :href "https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.0-beta2/css/bootstrap.min.css"}]
      [:link {:rel "stylesheet" :href "https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.css"}]
      [:link {:rel "stylesheet" :href "./css/style.css"}]]
     [:body
      [:video {:autoplay "true" :muted "true" :loop "true" :id "bg-video"}
       [:source {:src "./media/circles.mp4" :type "video/mp4"}]]
      [:div {:class "page-container"}
       [:div {:class "container-fluid"}
        [:div {:class "row"}
         [:div {:class "col-xs-12"}
          [:div {:class "cd-slider-nav"}
           [:nav {:class "navbar navbar-expand-lg" :id "tm-nav"}
            [:a {:class "navbar-brand" :href "#"} "Shtanglitza"]
            [:button {:class          "navbar-toggler"
                      :type           "button"
                      :data-bs-toggle "collapse"
                      :data-bs-target "#navbar-supported-content"
                      :aria-controls  "navbarSupportedContent"
                      :aria-expanded  "false"
                      :aria-label     "Toggle navigation"}
             [:span {:class "navbar-toggler-icon"}]]
            [:div {:class "collapse navbar-collapse" :id "navbar-supported-content"}
             [:ul {:class "navbar-nav mb-2 mb-lg-0"}
              [:li {:class "nav-item selected"}
               [:a {:class "nav-link" :href "#home" :data-no "1" :aria-current "page"} "Home"]
               [:div {:class "circle"}]]
              [:li {:class "nav-item"}
               [:a {:class "nav-link" :href "#tech" :data-no "2"} "Technologies"]
               [:div {:class "circle"}]]
              [:li {:class "nav-item"}
               [:a {:class "nav-link" :href "#proj" :data-no "3"} "Projects"]
               [:div {:class "circle"}]]
              [:li {:class "nav-item"}
               [:a {:class "nav-link" :href "#team" :data-no "4"} "Team"]
               [:div {:class "circle"}]]]]]]]]]
       [:div {:class "container-fluid tm-content-container"}
        [:ul {:class "cd-hero-slider mb-0 py-5"}
         [:li {:class "px-3" :data-page-no "1"}
          [:div {:class "page-width-1 page-left"}
           [:div {:class "d-flex position-relative tm-border-top tm-border-bottom intro-container"}
            [:div {:class "intro-left tm-bg-dark"}
             [:h2 {:class "mb-4"} "Shtanglitza"]
             [:p {:class "mb-4"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]
             [:p {:class "mb-0"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]]
            ;[:div
            ; [:img {:src "" :alt "" :class "img-fluid intro-img-1"}]
            ; [:img {:src "" :alt "" :class "img-fluid intro-img-2"}]]
            [:div {:class "circle intro-circle-1"}]
            [:div {:class "circle intro-circle-2"}]
            [:div {:class "circle intro-circle-3"}]
            [:div {:class "circle intro-circle-4"}]]]]
         [:li {:data-page-no "2"}
          [:div {:class "page-width-1 page-left"}
           [:div {:class "d-flex position-relative tm-border-top tm-border-bottom intro-container"}
            [:div {:class "intro-left tm-bg-dark"}
             [:h2 {:class "mb-4"} "Technologies"]
             [:p {:class "mb-4"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]
             [:p {:class "mb-0"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]]
            [:div {:class "circle intro-circle-1"}]
            [:div {:class "circle intro-circle-2"}]
            [:div {:class "circle intro-circle-3"}]
            [:div {:class "circle intro-circle-4"}]]]]
         [:li {:data-page-no "3"}
          [:div {:class "page-width-1 page-left"}
           [:div {:class "d-flex position-relative tm-border-top tm-border-bottom intro-container"}
            [:div {:class "intro-left tm-bg-dark"}
             [:h2 {:class "mb-4"} "Projects"]
             [:p {:class "mb-4"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]
             [:p {:class "mb-0"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]]
            [:div {:class "circle intro-circle-1"}]
            [:div {:class "circle intro-circle-2"}]
            [:div {:class "circle intro-circle-3"}]
            [:div {:class "circle intro-circle-4"}]]]]
         [:li {:data-page-no "4"}
          [:div {:class "page-width-1 page-left"}
           [:div {:class "d-flex position-relative tm-border-top tm-border-bottom intro-container"}
            [:div {:class "intro-left tm-bg-dark"}
             [:h2 {:class "mb-4"} "Team"]
             [:p {:class "mb-4"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]
             [:p {:class "mb-0"}
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."]]
            [:div {:class "circle intro-circle-1"}]
            [:div {:class "circle intro-circle-2"}]
            [:div {:class "circle intro-circle-3"}]
            [:div {:class "circle intro-circle-4"}]]]]]]
       [:div {:class "container-fluid"}
        [:footer {:class "row mx-auto tm-footer"}
         [:div {:class "col-md-6 px-0"}
          "Shtanglitza 2021"]
         [:div {:class "col-md-6 px-0 tm-footer-right"}
          "Shtanglitza d.o.o."]]]]]
     [:div {:id "loader-wrapper"}
      [:div {:id "loader"}]
      [:div {:class "loader-section section-left"}]
      [:div {:class "loader-section section-right"}]]
     [:script {:src "https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.0-beta2/js/bootstrap.min.js"}]
     [:script {:src "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"}]
     [:script {:src "https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.js"}]
     [:script {:src "/static-website/out/main.js"}]]))

(defn write-html-to-file [file]
  (spit file (render-html)))

(defn write-to-index-html [& more]
  (write-html-to-file "./index.html"))

(comment (write-html-to-file "./index.html"))