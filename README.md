# boot-lein-generate


[![Clojars Project](https://img.shields.io/clojars/v/onetom/boot-lein-generate.svg)](https://clojars.org/onetom/boot-lein-generate)

Generate a leiningen `project.clj` file.

Forked from https://github.com/darongmean/boot-lein-generate and made
Clojure 1.9.x compatible because the author didn't respond to the
pull request and the chat on clojurians.slack.com as the #darong user.

## Usage

Add boot-lein-generate to your build.boot dependencies and require the namespace:

```clj
(set-env! :dependencies '[[onetom/boot-lein-generate "0.1.3" :scope "test"]])
(require 'boot.lein)
(boot.lein/generate)
```

This ensures updating `project.clj` on every run of boot.
This way we can add `project.clj` to our `.gitignore` and have IntelliJ+Cursive
see the latest dependencies.

## From the CLI

```
boot -d onetom/boot-lein-generate generate
```

## License

Copyright © 2016 Darong Mean

Distributed under the Eclipse Public License, the same as Clojure.
