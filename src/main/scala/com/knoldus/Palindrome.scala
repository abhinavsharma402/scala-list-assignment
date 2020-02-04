package com.knoldus

class Palindrome {
  def isPalindrome(list: List[Int]): String = {
    @scala.annotation.tailrec
    def checkPalindrome(tempList: List[Int], addReverseElement: List[Int]): String = {
      tempList match {
        case Nil => "empty list"
        case first :: Nil => if (first :: addReverseElement == list) {
          "true"
        }
        else {
          "false"
        }
        case first :: rest =>
          checkPalindrome(rest, first :: addReverseElement)
      }
    }

    checkPalindrome(list, List())
  }
}

object Palindrome {
  def main(args: Array[String]): Unit = {
    val palindromeObject = new Palindrome
    print(palindromeObject.isPalindrome(List(1, 2, 3, 2, 1)))
  }
}