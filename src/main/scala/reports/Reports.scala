package com.equalexperts.fb

trait Reports {
  val reportOrder = IndexedSeq(
    OutputTypes.Fizz,
    OutputTypes.Buzz,
    OutputTypes.FizzBuzz,
    OutputTypes.Lucky,
    OutputTypes.Integer
  )

  def isInteger(input: String): Boolean = input.forall(_.isDigit)

  def outputsCounter(outputs: IndexedSeq[String]): Map[String, Int] = {
    outputs.groupBy(identity).mapValues(_.size)
  }

  def outputsFormatting(counterReport: Map[String, Int]): IndexedSeq[String] = {

    val existingReportOrder = reportOrder.filter(counterReport.contains(_))

    existingReportOrder.map { case key => "%s: %s" format (key, counterReport(key)) }
  }

  def report(outputs: IndexedSeq[String]): IndexedSeq[String] = {
    val outputsWithInteger = outputs.map(
      output => if (isInteger(output)) OutputTypes.Integer else output
    )

    val counterReport = outputsCounter(outputsWithInteger)

    outputsFormatting(counterReport)
  }
}
