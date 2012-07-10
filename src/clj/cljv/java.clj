(ns cljv.java
  (:require [cljv.util :as util]))

(def reserved
  #{"abstract" "assert"
    "boolean" "break" "byte"
    "case" "catch" "char" "class" "const" "continue"
    "default" "do" "double"
    "else" "enum" "extends"
    "false" "final" "finally" "float" "for"
    "goto"
    "if" "implements" "import" "instanceof" "int" "interface"
    "long"
    "native" "new" "null"
    "package" "private" "protected" "public"
    "return"
    "short" "static" "strictfp" "super" "switch" "synchronized"
    "this" "throw" "throws" "transient" "true" "try"
    "void" "volatile"
    "while"})

(def rename-to-java #(util/rename-as % #"\.cljv$" ".java"))
