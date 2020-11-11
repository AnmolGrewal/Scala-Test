package main

import java.util

object mainclass {

  def main(args: Array[String]): Unit = {
    //Uncomment below to run
    //Excerise 2
    //printDivisors()
    //printPrimes()
    //joinString()
    //pytha()
    //Exercise 4
    //hailSeq()
    //no spaces write as i.e 193276485 Only sorts single digits and String
    //mergeSort()
    //Exercise 5
    //fib()


    //Examples
    //Java Class Implementation
    /*
    Example 1
    This demonstrates that Scala can do method overloading without multiple methods compared to Java and uses a
    significantly lower amount of code to do it.
     */
    //This showcases Method Overloading
    var person1 = new Person(firstName = "Santa",lastName = "Claus", Age = 2018)
    //
    var person2 = new Person(Age = 55)
    //Showcases Setter and Getter
    person1.SIN = 55

    //Example 2
    //An implementation that is Better than Haskell
    //Uses a library method to make all strings uppercase instead of recursively going through each and losing it later
    //System.out.println(betterThanHaskell("Anmol"))

    //Example 3
    //Worse than Haskell
    //Adds the ASCII Value of String array to Int using for loop where as haskell would do pattern matching
    //(x:xs)
    //worseThanHaskell("total")
  }

  def printDivisors(): Unit = {
    System.out.print("Enter the number :  ")
    var num = scala.io.StdIn.readInt()
    var i: Long = 0l
    //Num 1 is the base case
    if (num != 0) {
      System.out.print("Divisors of " + num + " = 1 , ")
    } else {
      System.out.print("There are no divisors")
    }
    i = 2
    while (i <= num / 2) {
      if (num % i == 0) {
        System.out.print(i + " , ")
      }
      {
        i += 1; i - 1
      }
    }
    if (num != 0) {
      println(num)
    }
  }

  def printPrimes(): Unit = {
    System.out.print("Enter the number :  ")
    val num = scala.io.StdIn.readInt()
    var i: Int = 2
    while (i <= num) {
      if (isPrime(i)) {
        System.out.print(i + " , ")
      }
      {
        i += 1; i - 1
      }
    }
  }
  //adapted from https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
  def isPrime(n: Int): Boolean = {
    if (n == 2) {
      return true
    }
    //check if n is a multiple of 2
    if (n % 2 == 0) return false
    //if not, then just check the odds
    var i: Int = 3
    while (i * i <= n) {
      if (n % i == 0) return false
      i += 2
    }
    return true
  }

  def joinString(): Unit = {
    println("Enter the seperator you wish to have")
    val seperator = scala.io.StdIn.readLine()
    println("Enter what you want joined with spaces in between")
    val total = scala.io.StdIn.readLine()
    val splited: Array[String] = total.split("\\s+")
    var totalNum: Int = 0
    for (i <- splited) {
      if (totalNum == 0) {
        System.out.print(i)
      } else {
        System.out.print(seperator + i)
      }
      { totalNum += 1; totalNum - 1 }
    }
  }

  def pytha(): Unit = {
    println("Enter the number for pytha:")
    val sum = scala.io.StdIn.readInt()
    var a: Int = 1
    while (a <= sum) {
      var b: Int = a + 1
      while (b <= sum) {
        var c: Int = 1
        while (c <= sum) {
          if (((a * a) + (b * b) == (c * c)) && sum > 0) {
            System.out.print("(" + a + "," + b + "," + c + "),")
          }
          { c += 1; c - 1 }
        }
        { b += 1; b - 1 }
      }
      { a += 1; a - 1 }
    }
  }

  def hailSeq(): Unit = {
    System.out.print("Enter the number :  ")
    var sum = scala.io.StdIn.readInt()
    System.out.print(sum + ",")
    while (sum != 1) {
      sum = if (sum % 2 == 0) sum / 2 else (3 * sum) + 1
      System.out.print(sum + ",")
    }
  }

  def mergeSort(): Unit = {
    println("Enter what to sort below:")
    val sum = scala.io.StdIn.readLine()
    val firstPart: String = sum.substring(0, (sum.length / 2))
    val secondPart: String = sum.substring((sum.length / 2), sum.length)
    val firstHalf: Array[Char] = firstPart.toCharArray()
    val secondHalf: Array[Char] = secondPart.toCharArray()
    val total: Array[Char] =
      Array.ofDim[Char](firstHalf.length + secondHalf.length)
    var i: Int = 0
    var j: Int = 0
    var k: Int = 0
    util.Arrays.sort(firstHalf)
    util.Arrays.sort(secondHalf)
    while (i < firstHalf.length && j < secondHalf.length) {
      if (firstHalf(i) <= secondHalf(j)) {
        total(k) = firstHalf(i)
        i += 1
      } else {
        total(k) = secondHalf(j)
        j += 1
      }
      k += 1
    }
    while (i < firstHalf.length) {
      total(k) = firstHalf(i)
      i += 1
      k += 1
    }
    while (j < secondHalf.length) {
      total(k) = secondHalf(j)
      j += 1
      k += 1
    }
    for (display <- total) {
      System.out.print(display)
    }
  }

  def fib(): Unit = {
    println("Enter number:")
    val sum = scala.io.StdIn.readInt()
    println(fibSequence(sum))
  }

  def fibSequence(sum: Int): Int = {
    if (sum == 0) {
      return 0
    }
    if (sum == 1) {
      return 1
    }
    return (fibSequence(sum - 2) + fibSequence(sum - 1))
  }


  //Examples Code 1
  case class Person(var firstName: String = "Anmol", var lastName: String = "Grewal", var DOB: String = "09/09/96", var Age: Int = 22, var SIN: Int = 0)

  //Examples Code 2
  def betterThanHaskell(name: String): String = name.toUpperCase()

  //Examples Code 3
  def worseThanHaskell(src: String): Unit = {
    var sum: Int = 0
    for (i <- 0 until src.length) {
      sum += src.charAt(i)
    }
    println(sum)
  }
}
