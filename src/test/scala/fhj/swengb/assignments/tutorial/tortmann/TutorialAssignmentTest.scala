package fhj.swengb.assignments.tutorial.tortmann

import org.junit.Assert._
import org.junit.Test

class TutorialAssignmentTest {

  /**
    * This test shows that your implementation is correct.
    *
    * To pass the tutorial assignment:
    *
    * -> clone the tutorial github repo at
    *    https://github.com/rladstaetter/fhj.swengb.assignments.tutorial
    *
    * -> you have to implement a Scala Object named 'TutorialAssignment'
    *    in the package fh.swengb.assignments.tutorial.<yourId>
    * -> you have to provide a method called "hello"
    * -> you have to return a string with a specific content (see test)
    * -> put the TutorialAssignmentTest in the same package like the
    *    TutorialAssignment object.
    *
    * -> push it to your github account
    *
    * -> the project should have an address like this:
    *    https://github.com/<yourid>/fhj.swengb.assignments.tutorial
    *
    */
  @Test def test(): Unit = {
    assertEquals("Hello world!", TutorialAssignment.hello())
  }

}
