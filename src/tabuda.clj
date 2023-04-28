(ns tabuda)

"funcao para mutplicar n*i para elementos do vetor onde n e o valor de tabuada i"
(defn tabuada [n]
  (doseq [i (range 1 11)]
    (println [n]"x"[i]"=" (* n i))))

"faz com que tabuada interaja ate 10"
(doseq [i (range 1 11)]
  (println "-")
  (tabuada i))
