package com.groovyx.concepts

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames=true, includeFields=true)
@EqualsAndHashCode(includeFields=true, includes=["title"])
class Book {
  // properties = private field + public setter/getters
  String title
  String author

  // field
  private int noOfPages

}
