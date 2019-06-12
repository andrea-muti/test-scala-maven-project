package com.muti

/**
  * Simple App
  *
  * @author Andrea Muti <muti.andrea@gmail.com>
  * @since 25/05/2019
  */
object App {

  /**
    * foo method that concats in a single strings all the
    * elements of the array provided as argument
    *
    * @param x
    * @return
    */
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def newFeature(): Unit = {
    println("this is a new feature")
  }

  /**
    * The main method
    *
    * @param args
    */
  def main(args : Array[String]) {

    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    println("This line was added into the 'develop' branch")

    println("Again, this is a second new line, added to develop after creating the new-feature branch")

  }
}
