package com.knoldus

class SecondMax {
  def findSecondMax(list: List[Int]): Int = {
    @scala.annotation.tailrec
    def secondMax(tempList: List[Int]): Int = {
      tempList match {
        case Nil => -1
        case secondHighest :: Nil => secondHighest
        case firstNumber :: secondNumber :: Nil => if (firstNumber > secondNumber) {
          secondNumber
        } else {
          firstNumber
        }

        case first :: second :: rest => if (first > second) {
          secondMax(first :: rest)
        }
        else {
          secondMax(second :: rest)
        }
      }
    }

    secondMax(list)
  }
}

object SecondMax {
  def main(args: Array[String]): Unit = {
    val secondMaxobj = new SecondMax

    print(secondMaxobj.findSecondMax(List(1, 2, 3, 4)))
  }

}