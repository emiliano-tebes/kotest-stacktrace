# kotest-stacktrace


If you write a test using forAll and row to provide data, and an exception is thrown in tested methods (or any of the inner consumed methods), stacktrace is lost. If not using forAll and row, stacktrace is shown

##Steps to reproduce

run SomeRandomClassTest
watch the different outcomes when using and not using forAll and row