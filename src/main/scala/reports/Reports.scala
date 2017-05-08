package com.equalexperts.fb

trait Reports {
  val reportOrder = IndexedSeq(
    OutputTypes.Fizz,
    OutputTypes.Buzz,
    OutputTypes.FizzBuzz,
    OutputTypes.Lucky,
    OutputTypes.Integer
  )

  def outputCounter(outputs: IndexedSeq[Either[Int, String]]): Map[String, Int] = {
    outputs.foldLeft(Map[String, Int]()) {
      (reportMap, output) =>
        output match {
          case Left(output) => reportMap + (OutputTypes.Integer -> (reportMap.getOrElse(OutputTypes.Integer, 0) + 1))
          case Right(output) => reportMap + (output -> (reportMap.getOrElse(output, 0) + 1))
        }
    }
  }

  def report(outputs: IndexedSeq[Either[Int, String]]): IndexedSeq[String] = {
    val outputCount = outputCounter(outputs)

    val existingReportOrder = reportOrder.filter(outputCount.contains(_))

    existingReportOrder
      .map { case key => "%s: %s" format (key, outputCount(key)) }
  }

}
