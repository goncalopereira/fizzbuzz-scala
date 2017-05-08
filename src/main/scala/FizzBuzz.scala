package com.equalexperts.fb

class FizzBuzz {
  def isMultipleOf3(value: Int): Boolean = value % 3 == 0
  def isMultipleOf5(value: Int): Boolean = value % 5 == 0

  def produce(first: Int, last: Int): String = {
    val outputs = mapRangeToOutput(first, last)
    outputToString(outputs)
  }

  def mapRangeToOutput(first: Int, last: Int): IndexedSeq[Either[Int, String]] = {
    (first to last)
      .map(output(_))
  }

  def outputToString(outputs: IndexedSeq[Either[Int, String]]): String = {
    outputs.map {
      case Left(value) => value
      case Right(value) => value
    }
      .mkString(" ")
  }

  def output(value: Int): Either[Int, String] = value match {
    case _ if isMultipleOf3(value) && isMultipleOf5(value) => Right(OutputTypes.FizzBuzz)
    case _ if isMultipleOf3(value) => Right(OutputTypes.Fizz)
    case _ if isMultipleOf5(value) => Right(OutputTypes.Buzz)
    case _ => Left(value)
  }
}
