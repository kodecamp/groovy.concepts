package test

import com.groovyx.concepts.Book
import groovy.transform.CompileStatic

class BookTest {

  static def main(args) {
//    def book1 = new Book(title: "Java Essentials", author: "Josua Bloch", noOfPages: 100)
    def book1 = new Book()
    book1.title = "Java Essential"
    book1.author = "Josua Bloch"
    book1.noOfPages = 100
        
    println book1
    println("****************************************")
    def book2 = new Book()
    book2.title = "Java Essential"
    book2.author = "Josua Bloch"
    book2.noOfPages = 101
    
    println book2
    
    println "book1 == book2 => ${book1 == book2}"

    def book3 = new Book()
    book3.title = "Java Essential"
    book3.author = "Josua Bloch Junior"
    book3.noOfPages = 102
    
    println book3
    println "book2 == book3 => ${book2 == book3}"

    
  }
  
  static def test() {
    
  }
}
