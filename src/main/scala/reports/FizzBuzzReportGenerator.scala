package com.equalexperts.fb

trait FizzBuzzReportGenerator {

  def outputCounter(outputs: IndexedSeq[Either[Int, String]]): Map[String, Int] = {
    outputs.foldLeft(Map[String, Int]()) {
      (reportMap, output) =>
        output match {
          case Left(output) => reportMap + (
            OutputTypes.Integer -> (reportMap.getOrElse(OutputTypes.Integer, 0) + 1)
          )
          case Right(output) => reportMap + (
            output -> (reportMap.getOrElse(output, 0) + 1)
          )
        }
    }
  }
}
