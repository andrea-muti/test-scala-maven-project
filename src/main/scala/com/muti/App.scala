package com.muti

/**
  * @author Andrea Muti <muti.andrea@gmail.com>
  * @since 25/05/2019
  */
object App {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
