(ns clojure-noob.core
  (:gen-class))

; now lets see about lexical scoping
(defn outerfn
  [x]
  (fn [] str x))
; yup looks about right
; how would I go about testing that?

;; Return the first element of a collection
; so earlier I was thinking that destructuring only works in let
; but you can destructure right there in fn args which is nice
(defn my-first
  [[first-thing]] ; Notice that first-thing is within a vector
  first-thing)

(my-first ["oven" "bike" "war-axe"])

(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case you need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))

(chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])

(defn announce-treasure-location
   [{:keys [lat lng]}]
   (str "Treasure lat: " lat " Treasure lng: " lng))

(announce-treasure-location {:lat 28.22 :lng 81.33})

; hok
(defn some-func
  [one two three four]
  (str four one two three))

(def multiplayer-game-state
  {:joe {:class "Ranger"
         :weapon "Longbow"
         :score 100}
   :jane {:class "Knight"
          :weapon "Greatsword"
          :score 140}
   :ryan {:class "Wizard"
          :weapon "Mystic Staff"
          :score 150}})

(let [{{:keys [class weapon]} :joe :as hotdog} multiplayer-game-state]
  (println "Joe is a" class "wielding a" weapon)
  (println "well here is hotdog " hotdog))

(def tope "ok")

; looks like I can just have expressions floating out in space with no connections?
(or false true)

; looks like def is fine without a definition
; this ends up being clojure lang unbound?
(def tall)

(def venti
  (or false nil :large_I_mean_venti :why_cant_I_just_say_large))

; looks like this gets run even though its completely outside of main
; this seems like it could be a little dangerous no?
(println "some text outside of main")

; this is not nil (which is what I expected) its an unbound object ??
; #object[clojure.lang.Var$Unbound 0x36916eb0 Unbound: #'clojure-noob.core/tall]
; this also gets printed out
(println tall)

; predictably prints out :large_I_mean_venti
(println venti)


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


(into [] (flatten (conj [3 4 5 6 7] [1 2 5 7])))

(into [] (concat [1 2 3 4] [2 3]))
