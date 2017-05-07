package com.equalexperts.fb

import org.scalatest._

class FizzBuzzStep3Spec extends FlatSpec with Matchers {

  behavior of "The FizzBuzz"

  val fb = new FizzBuzzStep3

  "Output" should "integer given 1" in {
    fb.output(1) shouldEqual "1"
  }

  it should "fizz given 3" in {
    fb.output(3) shouldEqual "lucky"
  }

  it should "fizzbuzz given 6" in {
    fb.output(6) shouldEqual "fizz"
  }

  it should "buzz given 5" in {
    fb.output(5) shouldEqual "buzz"
  }

  it should "fizzbuzz given 15" in {
    fb.output(15) shouldEqual "fizzbuzz"
  }

  "Report" should "fizz and fizz count given fizz" in {
    fb.report(IndexedSeq("fizz")) shouldEqual IndexedSeq("fizz: 1")
  }

  "Produce" should "integer given range one element" in {
    fb.produce(1, 1) shouldEqual "1 integer: 1"
  }

  it should "known string given known range" in {
    val start = 1
    val end = 20
    val knownRange = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"

    fb.produce(start, end) shouldEqual knownRange
  }
}
