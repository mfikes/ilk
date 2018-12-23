(ns ilk.core-test
  (:require
   [clojure.test :refer [deftest is]]
   [ilk.core :refer [inferred-type]]))

(deftest inferred-type-test
  (is (= 'boolean (inferred-type false)))
  (is (= 'number (inferred-type 0)))
  (is (= 'string (inferred-type "")))
  (let [x 17]
    (is (= 'number (inferred-type x)))))