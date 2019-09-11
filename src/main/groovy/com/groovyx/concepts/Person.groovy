package com.groovyx.concepts

import groovy.transform.ToString

@ToString(includeNames=true, includePackage=false)
class Person {
  String socialId, name, address
}
