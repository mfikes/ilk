# ilk

Type tools for ClojureScript.

[![Build Status](https://travis-ci.org/mfikes/ilk.svg?branch=master)](https://travis-ci.org/mfikes/ilk)

# Usage

```
cljs.user=> (require '[ilk.core :refer [inferred-type]])

cljs.user=> (inferred-type 1)
number
```

If you'd like `inferred-type` automatically available in your REPL, see [Auto-loaded user code](https://clojurescript.org/reference/repl#auto-loaded-user-code).

# License

Copyright © 2018 Mike Fikes and Contributors

Distributed under the Eclipse Public License either version 2.0 or (at your option) any later version.
