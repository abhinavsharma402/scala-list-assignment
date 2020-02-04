package com.knoldus

class FirstEven {
  def findFirstEven(list: List[Int]): Int
  = {
    list match {
      case Nil => -1
      case element :: rest => if (element % 2 == 0) {
        element
      }
      else {
        findFirstEven(rest)
      }
    }

  }
}

object FirstEven {
  def main(args: Array[String]): Unit = {
    val firstEvenObject = new FirstEven
    print(firstEvenObject.findFirstEven(List(1, 21, 4, 5)))
  }
}