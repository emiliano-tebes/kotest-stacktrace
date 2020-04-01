package org.example

import java.lang.NullPointerException

class SomeRandomClass {
    fun someRandomFunction(a: String): String {
        return otherFunction(a)
    }

    private fun otherFunction(a: String): String {
        throw NullPointerException("I throw a NPE, you should see my stacktrace, not just my message.")
    }
}