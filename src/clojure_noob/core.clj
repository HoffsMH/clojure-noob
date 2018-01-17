(ns clojure-noob.core
  (:gen-class))


(def tope "ok")

(defn taco
  []
  (if (= "ok" tope)
    "something was true" "something was not true")
  )

(defn -main
  [& args]
  (println (taco)))

