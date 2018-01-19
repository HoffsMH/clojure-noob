(ns clojure-noob.core-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (zero? 0))))

(deftest announce-treasure-location-test
  (testing "that announce-treasure-location works"
    (is (= (announce-treasure-location {:lat 28.22 :lng 81.33}) 
      "Treasure lat: 28.22 Treasure lng: 81.33"))))

(deftest lexical-scoping
  (testing "that there is lexical scoping"
    (is (= ((outerfn "okwhat")) "okwhat"))))


(deftest comparing-maps-1
  (is (= {:alpha "Thing"
          :gamma "Triple thing"}
         {:alpha "Thing"
          :beta "Other thing"})))

(deftest comparing-maps-2
  (is (= {:gamma {:beta "Other thing"
                  :boogaloo "Is a mighty fine shoe."
                  :wizards "Are the mightest kings of yore."}
          :zeta {:hehe "feh"}
          :bonk true
          :wonk false}
         {:gamma {:zeta "Wizards"
                  :wimpidy-womp "Is no place to romp."
                  :orcs "Are totally lame dudes you should not invite to your parties."}
          :zeta {:feta "heh"}
          :bonk true
          :wonk false})))
