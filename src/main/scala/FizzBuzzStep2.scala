package com.equalexperts.fb

class FizzBuzzStep2
    extends FizzBuzz {
  def contains3(value: Int): Boolean = value.toString contains "3"

  override def output(value: Int): String = {
    if (contains3(value)) OutputTypes.Lucky else super.output(value)
  }
}
