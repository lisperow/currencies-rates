(ns currencies-rates.prod
  (:require [currencies-rates.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
