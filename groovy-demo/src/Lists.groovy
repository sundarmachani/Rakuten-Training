
class Lists {
	static void main(String[] args) {
		def lst = [11, 12, 13, 14];
		println("add()");
		println(lst);
		lst.add(15);
		println(lst);
		lst.add(2,20);
		println(lst);

		println("\ncontains()");
		println(lst.contains(12));
		println(lst.contains(18));

		println("\nget()")
		println(lst.get(0));
		println(lst.get(2));

		println("\nisEmpty()");
		def emptylst = [];
		println(lst.isEmpty());
		println(emptylst.isEmpty());

		println("\nminus()");
		def newlst = [];
		newlst = lst.minus([12, 13]);
		println(newlst);

		println("\nplus()");
		//def newlst = [];
		newlst = lst.plus([15, 16]);
		println(newlst);

		println("\npop()");
		println(lst.pop());
		println(lst);

		println("\nremove()");
		println(lst.remove(2));
		println(lst);

		println("\nreverse()");
		def revlst = lst.reverse();
		println(revlst);

		println("\nsize()");
		println(lst.size);

		println("\nsort()");
		//def newlst = lst.sort();
		println(newlst);
	}
}
