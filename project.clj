(defproject zadkiel "0.1.0-SNAPSHOT"
  :description "database management tool"
  :url "https://github.com/bunnytale/zadkiel.git"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/java.jdbc "9.6.1"]]
  :repl-options {:init-ns zadkiel.core})
