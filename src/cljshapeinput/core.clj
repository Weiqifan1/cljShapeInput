(ns cljshapeinput.core)

(load-file "src/cljshapeinput/helper.clj")

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
  "I don't do a whole lot."
  (println (str "Hello, World! 2" 5 (helper_addNumbers 3 4))))




;slut