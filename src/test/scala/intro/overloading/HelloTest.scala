package intro.overloading

import org.junit.Assert.assertEquals
import org.junit.Test

class HelloTest {

  @Test
  def helloUserTest(): Unit ={
    val hello = new Hello()
    assertEquals(hello.hello(), "Hello, user")
  }

  @Test
  def helloAdminTest(): Unit ={
    val hello = new Hello()
    assertEquals(hello.hello("admin"), "Hello, admin")
  }

  @Test
  def helloGuestTest(): Unit ={
    val hello = new Hello()
    assertEquals(hello.hello("admin", "guest"), "Hello, admin , Hello guest")
  }
}
