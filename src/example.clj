(ns example)

(defn showcase
  []
  (map #(inc %) (range 10)))

(showcase)
