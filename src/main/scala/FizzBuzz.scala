package com.equalexperts.fb

object FizzBuzz {
  val Fizz = "fizz"
  val Buzz = "buzz"

  def isMultipleOf3(value: Int): Boolean = value % 3 == 0
  def isMultipleOf5(value: Int): Boolean = value % 5 == 0

  def produce(first: Int, last: Int): String = {
    (first to last)
    .map(output(_))
    .mkString(" ")
  }

  def output(value: Int): String = value match {
    case value if isMultipleOf3(value) && isMultipleOf5(value) => Fizz + Buzz
    case value if isMultipleOf3(value) => Fizz
    case value if isMultipleOf5(value) => Buzz
    case value => value.toString
  }
}
