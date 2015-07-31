(ns foo.core)

(defn something []
  (let [try-to-rename-me! 42]
    try-to-rename-me!))
