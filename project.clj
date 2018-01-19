(defproject clojure-noob "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :dev-dependencies [[lein-tar "1.1.2"]]
  :main ^:skip-aot clojure-noob.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[jonase/eastwood "0.2.5"][lein-tar "3.3.0"][lein-kibit "0.1.5"]])
