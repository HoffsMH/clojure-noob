(ns clojure-noob.core
  (:gen-class))

(defn taco
  []
  (if (= nil tope)
    "something was true" "something was not true")
  )

(defn -main
  [& args]
  (println (taco)))

