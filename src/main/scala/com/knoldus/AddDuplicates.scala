package com.knoldus

class AddDuplicates {
  def addingDuplicates(list: List[Int]): List[Int] = {
    @scala.annotation.tailrec
    def add(tempList: List[Int], addDuplicatesElementList: List[Int]): List[Int] = {
      tempList match {
        case Nil=>List()
        case first :: Nil =>  addDuplicatesElementList:+first:+first
        case first :: rest =>

          add(rest, addDuplicatesElementList:+first:+first)
      }
    }

    add(list, List())
  }
}
object  AddDuplicates{
  def main(args: Array[String]): Unit = {
    val reverseListObject=new AddDuplicates
    print(reverseListObject.addingDuplicates(List(1,2,3,3,4)))
  }
}