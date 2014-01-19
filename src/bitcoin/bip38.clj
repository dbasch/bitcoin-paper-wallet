(ns bitcoin.bip38
  (:import com.fruitcat.bitcoin.BIP38))

(defn -main [& args]
  (println (first args))
  (println (com.fruitcat.bitcoin.BIP38/decrypt (first args) (second args))))