(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]])

(require '[adzerk.bootlaces :refer :all]
         '[boot.lein :refer :all])

(def +version+ "0.1.2")

(bootlaces! +version+)

(task-options!
  pom {:project     'onetom/boot-lein-generate
       :version     +version+
       :description "Boot task to generate project.clj file"
       :url         "https://github.com/onetom/boot-lein-generate"
       :scm         {:url "https://github.com/onetom/boot-lein-generate"}
       :license     {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}})
