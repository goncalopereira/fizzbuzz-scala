package com.equalexperts.fb

import org.scalatest._

class FizzBuzzStep1Spec extends FlatSpec with Matchers {

  behavior of "The FizzBuzz"

  val fb = new FizzBuzz

  "Output" should "integer given 1" in {
    fb.output(1) shouldEqual "1"
  }

  it should "fizz given 3" in {
    fb.output(3) shouldEqual "fizz"
  }

  it should "buzz given 5" in {
    fb.output(5) shouldEqual "buzz"
  }

  it should "fizzbuzz given 15" in {
    fb.output(15) shouldEqual "fizzbuzz"
  }

  "Produce" should "integer given range one element" in {
    fb.produce(1, 1) shouldEqual "1"
  }

  it should "known string given known range" in {
    val start = 1
    val end = 20
    val knownRange = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"

    fb.produce(start, end) shouldEqual knownRange
  }
}
