package com.equalexperts.fb

class FizzBuzz {
  def isMultipleOf3(value: Int): Boolean = value % 3 == 0
  def isMultipleOf5(value: Int): Boolean = value % 5 == 0

  def produce(first: Int, last: Int): String = {
    mapRangeToOutput(first, last)
      .mkString(" ")
  }

  def mapRangeToOutput(first: Int, last: Int): IndexedSeq[String] = {
    (first to last)
      .map(output(_))
  }

  def output(value: Int): String = value match {
    case value if isMultipleOf3(value) && isMultipleOf5(value) => OutputTypes.FizzBuzz
    case value if isMultipleOf3(value) => OutputTypes.Fizz
    case value if isMultipleOf5(value) => OutputTypes.Buzz
    case value => value.toString
  }
}
