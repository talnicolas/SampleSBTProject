package com.talnicolas.sample

import org.scalatest.{FunSuite, Matchers}

class AnObjectTest extends FunSuite with Matchers {

  test("aMethod returns Number 1!") {
    val obj = new AnObject
    obj.aMethod(1) should be ("Number 1!")
  }

}
