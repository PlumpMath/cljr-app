(ns cljr.lang.api.core)

(defn say-hello
  [name]
  (str "Hello " name))

(defn say-hi
  "Sample function used to test clojure.core/apply"
  [^{:tag String} fname ^{:tag String} lname]
  (str "Hello, " fname " " lname))

(defn only-even
  "Sample function used to return the even elements"
  [coll]
  (filter #(even? %) coll))

