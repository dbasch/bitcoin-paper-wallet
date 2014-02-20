(defproject bitcoin "0.1.0-SNAPSHOT"
  :description "offline paper wallet generator"
  :url "http://diegobasch.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"bitcoinj" "http://distribution.bitcoinj.googlecode.com/git/releases/"}
  :dependencies [[com.google/bitcoinj "0.10.3"]
                 [com.madgag/scprov-jdk15on "1.47.0.3"]
                 [org.clojars.dbasch/bip38 "0.1.0"]
                 [com.google.guava/guava "15.0"]
                 [org.slf4j/slf4j-api "1.7.5"]
                 [com.google.zxing/core "2.3.0"]
                 [com.google.zxing/javase "2.3.0"]
                 [org.clojure/clojure "1.5.1"]]
  :main bitcoin.wallet)
