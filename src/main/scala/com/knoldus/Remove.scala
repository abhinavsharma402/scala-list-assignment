package com.knoldus

class Remove {
  def drop(list: List[Int]): List[Int] = {
    @scala.annotation.tailrec
    def removeElement(tempList: List[Int], removeElementList: List[Int], i: Int): List[Int] = {
      tempList match {
        case Nil => List()
        case first :: Nil => removeElementList :+ first
        case first :: rest => if (i == 1) {
          removeElement(rest, removeElementList, i = i - 1)
        }
        else {
          removeElement(rest, removeElementList :+ first, i = i - 1)
        }

      }


    }

    removeElement(list, List(), 3)
  }

}

object Remove {
  def main(args: Array[String]): Unit = {
    val removeObject = new Remove
    print(removeObject.drop(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)))

  }
}
