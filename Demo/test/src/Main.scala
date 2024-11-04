package demo

import zio.test.*

object Test extends ZIOSpecDefault {
  def spec = test("demo")(
    assertCompletes
  )
}