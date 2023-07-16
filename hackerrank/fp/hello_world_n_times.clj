(ns hello_world_n_times)

;; ===============================================================
;; https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem
;; ===============================================================

;; ============= good =============
; dotimes is a function that has no return. That is perfect for side effecting functions.
(defn hello_word_n_times [n] (dotimes [_ n] (println "Hello World")))

;; ============= soso =============
;; (defn hello_word_n_times [n]
;;   (doseq [i (range n)]
;;     (print "Hello World\n")))

;; ============= bad =============
;; (defn hello_word_n_times [n]
;;   (loop [i 1]
;;     (when (<= i n)
;;       (println "Hello World")
;;       (recur (+ i 1)))))

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)

;; ⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀
;; ⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀ ⢳⡀⠀ ⡏⠀⠀⠀⠀ ⢷
;; ⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇
;; ⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇
;; ⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀ ⣿⠀⢹⠀⠀⠀⠀⠀ ⡇
;; ⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼
;; ⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀
;; ⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
;; ⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀
;; ⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀
;; ⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀
;; ⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀⠀