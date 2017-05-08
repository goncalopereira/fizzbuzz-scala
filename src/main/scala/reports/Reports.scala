package com.equalexperts.fb

trait FizzBuzzReports
    extends FizzBuzzReportGenerator {
  val reportOrder = IndexedSeq(
    OutputTypes.Fizz,
    OutputTypes.Buzz,
    OutputTypes.FizzBuzz,
    OutputTypes.Lucky,
    OutputTypes.Integer
  )

  def report(outputs: IndexedSeq[Either[Int, String]]): IndexedSeq[String] = {
    val outputReport = outputCounter(outputs)

    sortedReportToList(outputReport)
  }

  private def sortedReportToList(outputReport: Map[String, Int]): IndexedSeq[String] = {
    val existingReportOrder = reportOrder.filter(outputReport.contains(_))

    existingReportOrder
      .map { case key => "%s: %s" format (key, outputReport(key)) }
  }
}
