(ns clojure-noob.core
  (:gen-class))


(def tope "ok")

; looks like I can just have expressions floating out in space with no connections?
; (or false true)

; looks like def is fine without a definition
; this ends up being clojure lang unbound?
(def tall)

; (def venti
;   (or false nil :large_I_mean_venti :why_cant_I_just_say_large))

; looks like this gets run even though its completely outside of main
; this seems like it could be a little dangerous no?
(println "some text outside of main")

; this is not nil (which is what I expected) its an unbound object ??
; #object[clojure.lang.Var$Unbound 0x36916eb0 Unbound: #'clojure-noob.core/tall]
; this also gets printed out
(println tall)

; predictably prints out :large_I_mean_venti
; (println venti)


(defn taco
  []
  (if (= "ok" tope)
    "something was true"
    "something was not true"))

(defn -main
  [& args]
  (println (taco)))


; if I defined taco here I would get an error
; there is no hoisting and so function definition matters!
; I guess nothing is below -main then in this file?


; next is that I need to understand the data types that are close to string but not string
; :is a keyword but in ruby its a "symbol" not realy understanding the switch
; truth comparison is supposed to be fast. Is that the only advantage to these
; what is the drawback

; TODO: investigate formatters and linters
; lint eastwood lol
