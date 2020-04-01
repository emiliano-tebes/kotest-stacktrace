package org.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row

class StringSpecExample : StringSpec({
    val myClass = SomeRandomClass()

    "this test should throw a NPE with stacktrace" {
        forAll(
            row("a", "b", "c", "abc"),
            row("hel", "lo wo", "rld", "hello world"),
            row("", "z", "", "z")
        ) { a, b, c, d ->
            myClass.someRandomFunction(a, b, c)
        }
    }
})