(ns clojure-noob.core
  (:gen-class))

(+ 1 1 3)

(str "It was the panda " "in the library " "with the dust bunny.")

;; (if boolean-form
     ; then-form
     ; optional-else-form)

(if true
  ;; do lets you do multiple things in an if form
  (do (println "first pass")
      (println "first pass")
      "By Zeus' hammer")
  "By Aquaman's trident")

(when true
  (println "one")
  (println "two")
  "abra cadabra")

(nil? 1)
(nil? nil)

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)

(and :free_wifi :hot_coffee)
(and :feeling_good nil false)

(def severity :mild)
(defn error-message
  [severity]
  (str "Oh GOD! It's a disaster! We're "
       (if (= severity :mild)
         "mildly incovenienced"
         "DOOOOOOMMMMEEEEEDDDD!!!!")))

(error-message severity)
