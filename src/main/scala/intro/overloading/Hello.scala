package intro.overloading

class Hello {

  def hello(): String = {
     "Hello, user"
  }
  def hello(admin:String): String = {
     s"Hello, $admin"
  }
  def hello(admin:String,guest:String): String =  {
    s"Hello, $admin , Hello $guest"
  }
}
