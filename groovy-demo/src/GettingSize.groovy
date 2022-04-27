
class GettingSize {
	static void main(String[] args) {
		File file = new File("Example.txt")
		println "The file ${file.absolutePath} has ${file.length()} bytes"
	 }
}
