(ns ilk.core
  #?(:cljs (:require-macros [cljs.analyzer.macros])))

(defmacro inferred-type
  "Returns the inferred type tag for the supplied form."
  [form]
  `'~(cljs.analyzer/infer-tag &env
       (#?(:clj cljs.analyzer/no-warn :cljs cljs.analyzer.macros/no-warn)
         (cljs.analyzer/analyze &env form))))
