(ns clojure-noob.core
  (:gen-class))

(defn taco
  []
  (if true
    "something was true" "something was not true")
  )

(defn -main
  [& args]
  (println (taco)))

