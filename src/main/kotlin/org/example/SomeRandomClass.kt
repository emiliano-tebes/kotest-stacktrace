package org.example

import java.lang.NullPointerException

class SomeRandomClass() {
    fun someRandomFunction(a: String, b: String, c: String) {
        throw NullPointerException("I throw a NPE")
    }
}