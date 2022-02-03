(ns zadkiel.core
  (:require [org.httpkit.server :as server]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]
            [clojure.pprint :as pp]
            [clojure.string :as str]
            [clojure.data.json :as json])
  (:gen-class)
  )

(defn simple-body-page [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body  "Hello World"}) 

(defn request-example [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (->>
           {pp/pprint req}
           (str "Request Object: " req))})

(defroutes app-routes
  (GET "/" [] simple-body-page)
  (GET "/request" [] request-example))

(defn main
  "I don't do a whole lot."
  [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "3000"))]
    (server/run-server (wrap-defaults #'app-routes site-defaults) {:port port})
    (println (str "Running webserver at http://127.0.0.1:" port "/"))))
