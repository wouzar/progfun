package recfun

import Main._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); val res$0 = 
  balance("(())(()())".toList);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(48); val res$1 = 
  countChange(300,List(5,10,20,50,100,200,500));System.out.println("""res1: Int = """ + $show(res$1))}
}
