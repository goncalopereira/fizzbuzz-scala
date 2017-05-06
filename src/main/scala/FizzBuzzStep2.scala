package com.equalexperts.fb

class FizzBuzzStep2 extends FizzBuzz {
  val Lucky = "lucky"
  override def output(value: Int): String = {
    if (value.toString contains "3") {
      Lucky
    } else {
      super.output(value)
    }
  }
}
