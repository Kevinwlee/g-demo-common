package org.tallythings.common

expect fun platformName(): String
expect fun timestamp(): String
// Hello World stubs
fun createApplicationScreenMessage() : String {
  return "Kotlin Rocks on ${platformName()}"
}