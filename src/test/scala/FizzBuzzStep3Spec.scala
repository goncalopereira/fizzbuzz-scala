package com.equalexperts.fb

import org.scalatest._

class FizzBuzzStep3Spec extends FlatSpec with Matchers {

  behavior of "The FizzBuzz"

  val fb = new FizzBuzzStep3
  "Output" should "integer given 1" in {
    fb.output(1) shouldEqual Left(1)
  }

  it should "fizz given 3" in {
    fb.output(3) shouldEqual Right("lucky")
  }

  it should "fizzbuzz given 6" in {
    fb.output(6) shouldEqual Right("fizz")
  }

  it should "buzz given 5" in {
    fb.output(5) shouldEqual Right("buzz")
  }

  it should "fizzbuzz given 15" in {
    fb.output(15) shouldEqual Right("fizzbuzz")
  }

  "outputCounter" should "fizz and fizz count given fizz" in {
    fb.outputCounter(IndexedSeq(Right("fizz"))) shouldEqual Map[String, Int]("fizz" -> 1)
  }

  it should "integer and integer count given 1" in {
    fb.outputCounter(IndexedSeq(Left(1))) shouldEqual Map[String, Int]("integer" -> 1)
  }

  "Report" should "fizz and fizz count given fizz" in {
    fb.report(IndexedSeq(Right("fizz"))) shouldEqual IndexedSeq("fizz: 1")
  }

  it should "integer and integer count given 1" in {
    fb.report(IndexedSeq((Left(1)))) shouldEqual IndexedSeq("integer: 1")
  }

  "Produce" should "integer given range one element" in {
    fb.produce(1, 1) shouldEqual "1 integer: 1"
  }

  it should "known string given known range" in {
    val knownRange = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"

    fb.produce(1, 20) shouldEqual knownRange
  }
}
