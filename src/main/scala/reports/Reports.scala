package com.equalexperts.fb

trait Reports {
  val reportOrder = IndexedSeq(
    OutputTypes.Fizz,
    OutputTypes.Buzz,
    OutputTypes.Fizz + OutputTypes.Buzz,
    OutputTypes.Lucky,
    OutputTypes.Integer
  )

  def isInteger(input: String): Boolean = input.forall(_.isDigit)

  def outputsCounter(outputs: IndexedSeq[String]): Map[String, Int] = {
    outputs.groupBy(identity).mapValues(_.size)
  }

  def outputsFormatting(counterReport: Map[String, Int]): IndexedSeq[String] = {

    val outputsReport = reportOrder.map {
      case key if counterReport.contains(key) => Some("%s: %s" format (key, counterReport(key)))
      case key if !counterReport.contains(key) => None
    }

    outputsReport.flatten
  }

  def report(outputs: IndexedSeq[String]): IndexedSeq[String] = {
    val outputsWithInteger = outputs.map(
      output => if (isInteger(output)) OutputTypes.Integer else output
    )

    val counterReport = outputsCounter(outputsWithInteger)

    outputsFormatting(counterReport)
  }
}
