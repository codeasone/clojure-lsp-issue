(ns core)

(defn dropdown [on-nav-change]
  [:div
   [:select
    {#?@(:cljs [:on-change
                (fn [e]
                  (.preventDefault e)
                  (on-nav-change (.. e -target -value)))])}
    (map (fn [i] [:option {:value (:id i)
                           :key (:id i)}
                  (:title i)])
         [{:id 1
           :title "Foo"}
          {:id 2
           :title "Bar"}
          {:id 3
           :title "Baz"}])]])
