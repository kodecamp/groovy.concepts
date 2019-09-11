package test

import com.groovyx.concepts.Person
import groovy.transform.CompileStatic

@CompileStatic
class PersonTest {

  static void main(args) {
    def person1 = new Person(socialId: '1',)
    person1.name = 'Dinesh'
    person1.address = 'Tripura'
    println person1

    def person2 = new Person(socialId: '1', name: 'Sunil K')
    person2.address = "Lucknow"
    println person2
    
    def person3 = new Person(socialId: '3', name: 'Rakesh', address: 'Indore')
    println person3
    
    def person4 = [socialId: '4', name: 'Sarvika', address: 'Allahabad'] as Person
    println person4.name
    println method1()
    println method2()
  }
  
  static def method1() {
    def isDone = "Hello World"
    def message = "How are you doing"
    "something"
  }
  
  static def method2() {
    "somting again"
  }
  
  
}




