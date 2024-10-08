(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot."))

(+ 1 2 3)

(str "it was the panda " "with the dustbuster " "in the library!")

(if true
  (do (println "success!")
      "by zeus's hammen!")
  (do (println "failure!")
      "by aquaman's trident"))

(when true
  (println "Success!")
  "abra cadabra")

(nil? 1)

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)
(or (= 0 1) (= "yes" "no"))

; (def failed-protagonist-names
;   ["larry potter" "doreen the explorer" "the incredible bulk"])

(def wookieName "Chewbacca")
(str "\"Uggllglglglglglglll\" -" wookieName)

(defn too-enthusiastic
  "Return a cheer that might be too enthusiastic"
  [name]
  (str "Oh. My. God" name "You are most definitely like the best"))
(too-enthusiastic "zelda")

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))
(x-chop "Kanye West" "slap")
(x-chop "Kanye East")

(map (fn [name] (str "Hi " name))
     ["Darth Vader" "Mr. Magooo"])
