
class ObjectOriented {
	//	int StudentID;
	//	String StudentName;
	//
	//	static void main(String[] args) {
	//	   ObjectOriented st = new ObjectOriented();
	//	   st.StudentID = 1;
	//	   st.StudentName = "Joe"

	private int StudentID;
	private String StudentName;

	void setStudentID(int pID) {
		StudentID = pID;
	}

	void setStudentName(String pName) {
		StudentName = pName;
	}

	int getStudentID() {
		return this.StudentID;
	}

	String getStudentName() {
		return this.StudentName;
	}

	static void main(String[] args) {
		ObjectOriented st = new ObjectOriented();
		st.setStudentID(1);
		st.setStudentName("Joe");

		println(st.getStudentID());
		println(st.getStudentName());
	}
}
