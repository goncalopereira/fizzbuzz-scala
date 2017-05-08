package com.equalexperts.fb

trait FizzBuzzOutput {
  def isMultipleOf3(value: Int): Boolean = value % 3 == 0
  def isMultipleOf5(value: Int): Boolean = value % 5 == 0

  def output(value: Int): Either[Int, String] = value match {
    case _ if isMultipleOf3(value) && isMultipleOf5(value) => Right(OutputTypes.FizzBuzz)
    case _ if isMultipleOf3(value) => Right(OutputTypes.Fizz)
    case _ if isMultipleOf5(value) => Right(OutputTypes.Buzz)
    case _ => Left(value)
  }
}
