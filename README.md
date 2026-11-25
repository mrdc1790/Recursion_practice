# Recursion practice

Standalone Java exercises for practicing recursive decomposition. The factorial example compares a loop, streams, and recursion on the same input. A separate exercise explores how to split a string into palindromic parts. [Factorial](src/factorial.java) · [Palindrome partitioning](src/PalindromePartitionRecursion.java)

## Run the factorial exercise

Each file under src contains a standalone Java exercise. To compile and run
the factorial comparison from the repository root:

    mkdir build
    javac -d build src/factorial.java
    java -cp build factorial

The factorial example accepts integers from 0 to 12, the range whose
factorials fit in a Java int.
