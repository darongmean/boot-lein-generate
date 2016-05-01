(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]])

(require '[adzerk.bootlaces :refer :all]
         '[darongmean.boot-lein-generate :refer :all])

(def +version+ "0.1.1")

(bootlaces! +version+)

(task-options!
  pom {:project 'darongmean/boot-lein-generate
       :version +version+
       :description "Boot task to generate project.clj file"
       :url "https://github.com/darongmean/boot-lein-generate"
       :scm {:url "https://github.com/darongmean/boot-lein-generate"}
       :license {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}})