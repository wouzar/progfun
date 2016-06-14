package funsets

import FunSets._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  val sglt = singletonSet(5);System.out.println("""sglt  : funsets.FunSets.Set = """ + $show(sglt ));$skip(21); val res$0 = 
  contains(sglt, 23);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(10); val res$1 = 
  sglt(5);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(30); 
  
  val s1 = singletonSet(2);System.out.println("""s1  : funsets.FunSets.Set = """ + $show(s1 ));$skip(27); 
  val s2 = singletonSet(4);System.out.println("""s2  : funsets.FunSets.Set = """ + $show(s2 ));$skip(24); 
  val s = union(s1, s2);System.out.println("""s  : funsets.FunSets.Set = """ + $show(s ));$skip(26); val res$2 = 
  forall(s, (x => x < 5));System.out.println("""res2: Boolean = """ + $show(res$2))}
  //assert(forall(s, (x => x < 5)), "Forall")
}
