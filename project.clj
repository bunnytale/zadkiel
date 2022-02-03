(defproject zadkiel "0.1.0-SNAPSHOT"
  :description "database management tool"
  :url "https://github.com/bunnytale/zadkiel.git"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [http-kit "2.3.0"]
                 [compojure  "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [org.clojure/data.json "0.2.6"]]
  :main zadkiel.core/main
  :repl-options {:init-ns zadkiel.core})
