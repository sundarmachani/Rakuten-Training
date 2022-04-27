
class Maps {
	static void main(String[] args) {
		def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
		println("containsKey()")
		println(mp.containsKey("TopicName"));
		println(mp.containsKey("Topic"));
		
		println("\nget()")
		println(mp.get("TopicName"));
		println(mp.get("Topic"));
		
		println("\nkeySet()");
		println(mp.keySet());
		
		println("\nput()")
		mp.put("TopicID","1");
		println(mp);
		
		println("\nsize()");
		println(mp.size());
		mp.put("TopicID","1");
		println(mp.size());
		
		println("\nvalues()");
		println(mp.values());
	}
}
