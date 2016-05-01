# boot-lein-generate

Generate a leiningen `project.clj` file.

## Usage

Add boot-lein-generate to your build.boot dependencies and require the namespace:

```clojure
(set-env! :dependencies '[[darongmean/boot-lein-generate "0.1.1" :scope "test"]])
(require '[darongmean.boot-lein-generate :refer [lein-generate]])
```

To generate `project.clj`, run
```bash
boot lein-generate
```

## License

Copyright © 2016 Darong Mean

Distributed under the Eclipse Public License, the same as Clojure.