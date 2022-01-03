package basicoop.people

import munit.FunSuite

class PersonSuite extends FunSuite:

  val addr = Address("1 Scala Lane", "Bay Area", "CA", ZipCode(98765))

  test("Person.toString returns a human-readable string") {
  assert(addr.toString == "Address(1 Scala Lane,Bay Area,CA,98765)")
}
