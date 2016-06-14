package objsets

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
	val a = new Tweet("user", "text", 3);System.out.println("""a  : objsets.Tweet = """ + $show(a ));$skip(49); 
  val b = new Tweet("username", "more text", 15);System.out.println("""b  : objsets.Tweet = """ + $show(b ));$skip(47); 
  val c = new Tweet("hostname", "hahahah", 10);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(48); 
  
  val set = (new Empty) incl a incl b incl c;System.out.println("""set  : objsets.TweetSet = """ + $show(set ));$skip(17); val res$0 = 
  set contains c;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(47); 
  val newset = set.filter(x => x.retweets > 5);System.out.println("""newset  : objsets.TweetSet = """ + $show(newset ));$skip(45); 
  val newnewset = set.filter(_.retweets < 4);System.out.println("""newnewset  : objsets.TweetSet = """ + $show(newnewset ));$skip(20); val res$1 = 
  newset contains a;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(59); 
	
	val s = set.descendingByRetweet;System.out.println("""s  : objsets.TweetList = """ + $show(s ));$skip(24); //newnewset union newset
	s foreach (println(_))}
	
	
		
}
