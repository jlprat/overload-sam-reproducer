package example

import java.lang.Throwable
import java.util.function.Supplier

object Reproducer {
  
  //assertThrows has 3 overloads, 2 with 3 parameters and 1 with only 2 parameters.

  //This overload is taking a subclasss of `Throwable`, and an `Executable` which is a parameterless SAM returning void
  assertThrows(classOf[IllegalArgumentException], () => 3)
  
  //This overload is taking a subclasss of `Throwable`, an `Executable` which is a parameterless SAM returning void, and a `String`
  assertThrows(classOf[IllegalArgumentException], () => 3, "This is a message")

  //This overload is taking a subclasss of `Throwable`, an `Executable` which is a parameterless SAM returning void, and a `Supplier` returning `String`
  assertThrows(classOf[IllegalArgumentException], () => 3, () => "This is a message")

  def assertThrows[T <: Throwable](clazz: Class[T], executable: Executable): Unit = ???

  def assertThrows[T <: Throwable](clazz: Class[T], executable: Executable, message: String): Unit = ???

  def assertThrows[T <: Throwable](clazz: Class[T], executable: Executable, supplier: Supplier[String]): Unit = ???

  @FunctionalInterface
  trait Executable {
    @throws[Throwable]
    def execute(): Unit
  }

}
