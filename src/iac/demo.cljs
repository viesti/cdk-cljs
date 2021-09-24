(ns iac.demo
  (:require ["@aws-cdk/core" :refer [App Stack]]
            ["@aws-cdk/aws-s3" :refer [Bucket]]
            ["fs" :as fs]
            ["string_decoder" :as st]))

(def decoder (st/StringDecoder. "utf8"))

(defn main []
  (let [app (App.)
        stack (Stack. app)]
    (Bucket. stack "my-bucket")
    (let [assembly (.synth app)]
      (println (.write decoder (fs/readFileSync (str (.-directory assembly) "/Default.template.json")))))))
