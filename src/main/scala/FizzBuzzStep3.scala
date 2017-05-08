package com.equalexperts.fb

class FizzBuzzStep3
    extends FizzBuzzStep2
    with FizzBuzzReports {

  override def produce(first: Int, last: Int): String = {
    val outputs = mapRangeToOutput(first, last)

    val outputsReport = report(outputs)

    val outputToList = outputs.map {
      case Left(value) => value.toString
      case Right(value) => value
    }

    (outputToList ++ outputsReport)
      .mkString(" ")
  }
}
