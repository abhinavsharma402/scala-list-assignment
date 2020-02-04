package com.knoldus

class FindElement {
  def findIndexElement(list: List[Int], i: Int): Int = {
    list match {
      case Nil => -1
      case element :: Nil => element
      case indexElement :: rest => if (i != 0) {

        findIndexElement(rest, i = i - 1)
      }
      else {
        indexElement
      }
    }


  }
}

object FindElement {
  def main(args: Array[String]): Unit = {


    val findElementObject = new FindElement
    print(findElementObject.findIndexElement(List(1, 2, 3, 4), 3))
  }
}