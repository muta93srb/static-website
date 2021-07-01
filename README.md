# static-website
test github pages website in clojurescript

dev build main.js
```
clj -m cljs.main -d "static-website/out" -c static-website.core -r
```

prod build main.js
```
clj -m cljs.main -d "out" -c static-website.core -r
```

build index.html
```
clj -X:build-html
```