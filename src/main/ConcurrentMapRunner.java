import java.util.Map;
	import java.util.HashTable;
	import java.util.concurrent.atomic.LongAdder;

	public class ConcurrentMapRunner {
		public static void main(String[] args) {
			    String str = "ABCD ABCD ABCD";
			    for(char character:str.toCharArray()) {
			      LongAdder longAdder = occurances.get(character);
			      if(longAdder == null) {
			        longAdder = new LongAdder();
			      }
			      longAdder.increment();
			      occurances.put(character, longAdder);
			    }
		}
	}
