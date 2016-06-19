package forcomp

import Anagrams._


object test {
	val sentence = List("Linux", "rulez")     //> sentence  : List[String] = List(Linux, rulez)
  //   val sentence = List()
  sentenceAnagrams(sentence)                      //> res0: List[forcomp.Anagrams.Sentence] = List(List(Lin, Rex, Zulu), List(Lin,
                                                  //|  Zulu, Rex), List(nil, Rex, Zulu), List(nil, Zulu, Rex), List(null, Rex, Uzi
                                                  //| ), List(null, Uzi, Rex), List(Rex, Lin, Zulu), List(Rex, nil, Zulu), List(Re
                                                  //| x, null, Uzi), List(Rex, Uzi, null), List(Rex, Zulu, Lin), List(Rex, Zulu, n
                                                  //| il), List(Linux, rulez), List(Uzi, null, Rex), List(Uzi, Rex, null), List(Zu
                                                  //| lu, Lin, Rex), List(Zulu, nil, Rex), List(Zulu, Rex, Lin), List(Zulu, Rex, n
                                                  //| il), List(rulez, Linux))
  }