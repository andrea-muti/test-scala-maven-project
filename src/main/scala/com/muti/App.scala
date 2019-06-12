package com.muti

/**
  * @author Andrea Muti <muti.andrea@gmail.com>
  *
  * @since 25/05/2019
  */
object App {

  /**
    *
    * @param x
    * @return
    */
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def newFeature(): Unit = { println("this is a new feature") }

  /**
    * The main method
    *
    * @param args
    */
  def main(args : Array[String]) {

    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    println("This line was added into the 'develop' branch")
  }
}
