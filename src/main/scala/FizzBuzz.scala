package com.equalexperts.fb

class FizzBuzz extends FizzBuzzOutput {
  def produce(first: Int, last: Int): String = {
    mapRangeToOutput(first, last)
      .map {
        case Left(value) => value.toString
        case Right(value) => value
      }
      .mkString(" ")
  }

  protected def mapRangeToOutput(first: Int, last: Int): IndexedSeq[Either[Int, String]] = {
    (first to last)
      .map(output(_))
  }
}
