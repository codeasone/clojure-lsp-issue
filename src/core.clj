(ns core
  (:require [taoensso.timbre :as timbre]))

(defn showcase
  []
  (timbre/log "Showcase issue")
  (map #(inc %) (range 10)))

(showcase)
