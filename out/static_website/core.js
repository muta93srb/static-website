// Compiled by ClojureScript 1.10.866 {:optimizations :none}
goog.provide('static_website.core');
goog.require('cljs.core');
goog.require('goog.dom');
goog.require('goog.dom.classlist');
goog.require('goog.events');
goog.require('goog.fx.dom');
static_website.core.add_event = (function static_website$core$add_event(element,e,cb){
return goog.events.listen(element,cljs.core.name.call(null,e),cb);
});
static_website.core.fadein = (function static_website$core$fadein(element){
var anim = (new goog.fx.dom.Fade(element,(0),(1),(500)));
return anim.play();
});
static_website.core.close_menu = (function static_website$core$close_menu(){
return cljs.core.map.call(null,(function (p1__528_SHARP_){
return goog.dom.classlist.remove(p1__528_SHARP_,"show");
}),document.getElementsByClassName("navbar-collapse"));
});
static_website.core.highlight_menu = (function static_website$core$highlight_menu(no){
var elements_529 = document.querySelectorAll(".navbar .navbar-nav > .nav-item");
goog.dom.classlist.remove(cljs.core.first.call(null,elements_529),"selected");

goog.dom.classlist.remove(cljs.core.second.call(null,elements_529),"selected");

goog.dom.classlist.remove(cljs.core.second.call(null,cljs.core.rest.call(null,elements_529)),"selected");

goog.dom.classlist.remove(cljs.core.last.call(null,elements_529),"selected");

return goog.dom.classlist.add(goog.dom.getParentElement(cljs.core.first.call(null,document.querySelectorAll([".navbar .navbar-nav > .nav-item > .nav-link[data-no='",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"']"].join('')))),"selected");
});
static_website.core.open_page = (function static_website$core$open_page(no){
var elements_530 = document.querySelectorAll(".cd-hero-slider li");
goog.dom.classlist.add(cljs.core.first.call(null,elements_530),"hidden");

goog.dom.classlist.add(cljs.core.second.call(null,elements_530),"hidden");

goog.dom.classlist.add(cljs.core.second.call(null,cljs.core.rest.call(null,elements_530)),"hidden");

goog.dom.classlist.add(cljs.core.last.call(null,elements_530),"hidden");

console.log(document.querySelectorAll([".cd-hero-slider li[data-page-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join('')));

goog.dom.classlist.remove(cljs.core.first.call(null,document.querySelectorAll([".cd-hero-slider li[data-page-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''))),"hidden");

static_website.core.fadein.call(null,cljs.core.first.call(null,document.querySelectorAll([".cd-hero-slider li[data-page-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''))));

return static_website.core.close_menu.call(null);
});
static_website.core.change_page = (function static_website$core$change_page(event){
var no = event.target.dataset.no;
static_website.core.highlight_menu.call(null,no);

return static_website.core.open_page.call(null,no);
});
var elements_531 = document.querySelectorAll(".navbar .navbar-nav > .nav-item");
static_website.core.add_event.call(null,cljs.core.first.call(null,elements_531),goog.events.EventType.CLICK,static_website.core.change_page);

static_website.core.add_event.call(null,cljs.core.second.call(null,elements_531),goog.events.EventType.CLICK,static_website.core.change_page);

static_website.core.add_event.call(null,cljs.core.second.call(null,cljs.core.rest.call(null,elements_531)),goog.events.EventType.CLICK,static_website.core.change_page);

static_website.core.add_event.call(null,cljs.core.last.call(null,elements_531),goog.events.EventType.CLICK,static_website.core.change_page);
static_website.core.highlight_menu.call(null,(1));
static_website.core.open_page.call(null,(1));
goog.dom.classlist.add(cljs.core.first.call(null,document.getElementsByTagName("body")),"loaded");

//# sourceMappingURL=core.js.map
