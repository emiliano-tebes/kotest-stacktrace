package org.example

import io.kotest.core.spec.style.WordSpec
import io.kotest.data.forAll
import io.kotest.data.row

class StringSpecExample : WordSpec() {
    private val myClass = SomeRandomClass()

    init {

        "this test should throw a NPE with stacktrace" should {

            "but it loses stacktrace" {
                forAll(
                    row("a"),
                    row("simple"),
                    row("data test")
                ) { a ->
                    myClass.someRandomFunction(a)
                    assert(true)
                }
            }

            "this one shows stacktrace ok" {
                myClass.someRandomFunction("a value")
                assert(true)
            }
        }

    }

}