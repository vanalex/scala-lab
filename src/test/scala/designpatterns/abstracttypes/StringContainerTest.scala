package designpatterns.abstracttypes

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test

class StringContainerTest {

  @Test
  def testStringContainerWhenGivenStringIsTrue(): Unit = {
    val stringContainer = new StringContainer("some text")
    assertTrue(stringContainer.compare("some text"))
  }

  @Test
  def testStringContainerWhenGivenStringIsFalse(): Unit = {
    val stringContainer = new StringContainer("ome text")
    assertFalse(stringContainer.compare("some text"))
  }
}
