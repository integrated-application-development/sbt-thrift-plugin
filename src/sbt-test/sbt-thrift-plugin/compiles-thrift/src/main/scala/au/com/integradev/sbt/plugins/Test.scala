package au.com.integradev.sbt.plugins

class Test {
  def main(args: Array[String]): Unit = {
    val testThrift = new SomeStruct("fieldAValue", SomeEnum.VALUE_B, "fieldCValue")

    println(s"a: ${testThrift.fieldA}, b: ${testThrift.fieldB}, c: ${testThrift.fieldC}")
  }
}
