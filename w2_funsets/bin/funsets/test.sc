package funsets

import FunSets._

object test {
  val sglt = singletonSet(5)                      //> sglt  : funsets.FunSets.Set = <function1>
  contains(sglt, 23)                              //> res0: Boolean = false
  sglt(5)                                         //> res1: Boolean = true
  
  val s1 = singletonSet(2)                        //> s1  : funsets.FunSets.Set = <function1>
  val s2 = singletonSet(4)                        //> s2  : funsets.FunSets.Set = <function1>
  val s = union(s1, s2)                           //> s  : funsets.FunSets.Set = <function1>
  forall(s, (x => x < 5))                         //> res2: Boolean = true
  //assert(forall(s, (x => x < 5)), "Forall")
}