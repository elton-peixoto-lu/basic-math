(ns tabuda-test
  (:require [clojure.test :refer :all])
  (:require [tabuda :refer [tabuada]]))

(deftest tabuada-test
  (testing "tabuada"
    (is (= nil (tabuada 1)))
    (is (= nil (tabuada 2)))
    (is (= nil (tabuada 3)))
    (is (= nil (tabuada 4)))
    (is (= nil (tabuada 5)))
    (is (= nil (tabuada 6)))
    (is (= nil (tabuada 7)))
    (is (= nil (tabuada 8)))
    (is (= nil (tabuada 9)))
    (is (= nil (tabuada 10)))))
