(ns clojure-noob.core
  (:gen-class))

; (+ 1 1 3)
;
; (str "It was the panda " "in the library " "with the dust bunny.")
;
; ;; (if boolean-form
;      ; then-form
;      ; optional-else-form)
;
; (if true
;   ;; do lets you do multiple things in an if form
;   (do (println "first pass")
;       (println "first pass")
;       "By Zeus' hammer")
;   "By Aquaman's trident")
;
; (when true
;   (println "one")
;   (println "two")
;   "abra cadabra")
;
; (nil? 1)
; (nil? nil)
;
; (or false nil :large_I_mean_venti :why_cant_I_just_say_large)
;
; (and :free_wifi :hot_coffee)
; (and :feeling_good nil false)
;
; (def severity :mild)
; (defn error-message
;   [severity]
;   (str "Oh GOD! It's a disaster! We're "
;        (if (= severity :mild)
;          "mildly incovenienced"
;          "DOOOOOOMMMMEEEEEDDDD!!!!")))
;
; (error-message severity)
;
; ;; this is a map: {}
; (def billy {:first-name "charlie"
;             :last-name "McFishwich"})
;
; (get billy :last-name)
;
; (defn rotary
;   "this function will help with a variety of things"
;   [name]
;   (println name))
;
; (rotary "jyacob")
;
; ;; Smack my hobbit
; (def asym-hobbit-body-parts [{:name "head" :size 3}
;                              {:name "left-eye" :size 1}
;                              {:name "left-ear" :size 1}
;                              {:name "mouth" :size 1}
;                              {:name "nose" :size 1}
;                              {:name "neck" :size 2}
;                              {:name "left-shoulder" :size 3}
;                              {:name "left-upper-arm" :size 3}
;                              {:name "chest" :size 10}
;                              {:name "back" :size 10}
;                              {:name "left-forearm" :size 3}
;                              {:name "abdomen" :size 6}
;                              {:name "left-kidney" :size 1}
;                              {:name "left-hand" :size 2}
;                              {:name "left-knee" :size 2}
;                              {:name "left-thigh" :size 4}
;                              {:name "left-lower-leg" :size 3}
;                              {:name "left-achilles" :size 1}
;                              {:name "left-foot" :size 2}])
;
; (defn matching-part
;   [part]
;   {:name (clojure.string/replace (:name part) #"^left-" "right-")
;    :size (:size part)})
;
; (defn symmetrize-body-parts
;   "Expects a seq of maps that have a :name and :size"
;   [asym-body-parts]
;   (loop [remaining-asym-parts asym-body-parts
;          final-body-parts []]
;     (if (empty? remaining-asym-parts)
;       final-body-parts
;       (let [[part & remaining] remaining-asym-parts]
;         (recur remaining
;                (into final-body-parts
;                      (set [part (matching-part part)])))))))
;
; (defn better-symmetrizer
;   "A better symmetrizer"
;   [asym-body-parts]
;   (reduce (fn [final-body-parts part]
;             (into final-body-parts (set part (matching-part part))))
;           []
;           asym-body-parts))
;
; (defn hit
;   [asym-body-parts]
;
;   (let [sym-parts (better-symmetrizer asym-hobbit-body-parts)
;         body-part-size-sum (reduce + (map :size sym-parts))
;         target (rand body-part-size-sum)]
;     (loop [[part & remaining] sym-parts
;            accumulated-size (:size part)]
;       (if (> accumulated-size target)
;         part
;         (recur remaining (+ accumulated-size (:size (first remaining))))))))

(defn my-counter
  [collection]
  (reduce (fn [accum _] (+ accum 1)) 0 collection))

(= (#(reduce (fn [accum _] (+ accum 1)) 0 %) [1 2 3 4 5 6 7]) 7)

; (= (#() [1 2 3 4 5 6 7]) [7 6 5 4 3 2 1])

(= ((fn my-reverser [thing]
      (let [tail thing
            reversed-thing []]
        (if (seq tail)
          (recur (drop-last tail)
                 (conj reversed-thing (last tail)))
          reversed-thing)))
    [1 2 3 4 5]) [5 4 3 2 1])





