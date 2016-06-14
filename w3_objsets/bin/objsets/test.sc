package objsets

object test {
	val a = new Tweet("user", "text", 3)      //> a  : objsets.Tweet = User: user
                                                  //| Text: text [3]
  val b = new Tweet("username", "more text", 15)  //> b  : objsets.Tweet = User: username
                                                  //| Text: more text [15]
  val c = new Tweet("hostname", "hahahah", 10)    //> c  : objsets.Tweet = User: hostname
                                                  //| Text: hahahah [10]
  
  val set = (new Empty) incl a incl b incl c      //> set  : objsets.TweetSet = objsets.NonEmpty@30c7da1e
  set contains c                                  //> res0: Boolean = true
  val newset = set.filter(x => x.retweets > 5)    //> newset  : objsets.TweetSet = objsets.NonEmpty@5b464ce8
  val newnewset = set.filter(_.retweets < 4)      //> newnewset  : objsets.TweetSet = objsets.NonEmpty@57829d67
  newset contains a                               //> res1: Boolean = false
	
	val s = set.descendingByRetweet//newnewset union newset
                                                  //> s  : objsets.TweetList = objsets.Cons@19dfb72a
	s foreach (println(_))                    //> User: username
                                                  //| Text: more text [15]
                                                  //| User: hostname
                                                  //| Text: hahahah [10]
                                                  //| User: user
                                                  //| Text: text [3]
	
	
		
}