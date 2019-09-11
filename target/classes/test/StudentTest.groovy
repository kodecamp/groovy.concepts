package test

import com.groovyx.concepts.Student
import groovy.transform.CompileStatic

class StudentTest {

  static def main(args) {
   
   println "****************************************" 
   def stu2 = [rollNo: '1234', name: "Sunil", college: 'UCER'] as Student 
   println "Roll No : ${stu2.rollNo}, Name : ${stu2.name}, College : ${stu2.college}"

   println stu2.name
   println stu2.college
   println stu2.rollNo

  }
}
