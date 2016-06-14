package recfun

import Main._

object test {
  balance("(())(()())".toList)                    //> res0: Boolean = true
  countChange(300,List(5,10,20,50,100,200,500))   //> res1: Int = 1022
}