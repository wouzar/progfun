package forcomp

import Anagrams._


object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
	val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(58); val res$0 = 
  //   val sentence = List()
  sentenceAnagrams(sentence);System.out.println("""res0: List[forcomp.Anagrams.Sentence] = """ + $show(res$0))}
  }
