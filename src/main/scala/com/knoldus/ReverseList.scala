package com.knoldus

class ReverseList {
  def reverseList(list: List[Int]): List[Int] = {
    @scala.annotation.tailrec
    def reverse(tempList: List[Int], addReverseElement: List[Int]): List[Int] = {
      tempList match {
        case Nil=>List()
        case first :: Nil => first :: addReverseElement
        case first :: rest =>
          reverse(rest, first :: addReverseElement)
      }
    }

    reverse(list, List())
  }
}
object  ReverseList{
  def main(args: Array[String]): Unit = {
    val reverseListObject=new ReverseList
    print(reverseListObject.reverseList(List(1,2,3,4)))
  }
}