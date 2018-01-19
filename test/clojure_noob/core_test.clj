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
