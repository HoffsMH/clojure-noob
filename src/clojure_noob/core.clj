(ns clojure-noob.core
  (:gen-class))


(def tope "ok")


(defn taco
  []
  (if (= "ok" tope)
    "something was true" "something was not true"))

(defn -main
  [& args]
  (println (taco)))


; if I defined taco here I would get an error
; there is no hoisting and so function definition matters!
