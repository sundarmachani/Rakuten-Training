
class ExceptionHandling {
	static void main(String[] args) {
		//		println("checked exception");
		//		File file = new File("file.txt");
		//		FileReader fr = new FileReader(file);

		//		println("\nunchecked exception");
		//		def arr = new int[3];
		//		arr[5] = 5;

		//		try {
		//		//Protected code
		//	 } catch(ExceptionName e1) {
		//		//Catch block
		//	 }
		println("<Catching Exceptions>")
		try {
			def arr = new int[3];
			arr[5] = 5;
		} catch(Exception ex) {
			println("Catching the exception");
		}
		println("Let's move on after the exception");


		println("\n<Multiple Catch Blocks>")
		try {
			def arr = new int[3];
			arr[5] = 5;
		}catch(ArrayIndexOutOfBoundsException ex) {
			println("Catching the Array out of Bounds exception");
		}catch(Exception ex) {
			println("Catching the exception");
		}
		println("Let's move on after the exception");

		//		  SYNTAX OF MULTIPLE CATCH BLOCK AND FINAL BLOSK
		//		  try {
		//		  //Protected code
		//	   } catch(ExceptionType1 e1) {
		//		  //Catch block
		//	   } catch(ExceptionType2 e2) {
		//		  //Catch block
		//	   } catch(ExceptionType3 e3) {
		//		  //Catch block
		//	   } finally {
		//		  //The finally block always executes.
		//	   }

		println("\n<Final Block>")
		try {
			def arr = new int[3];
			arr[5] = 5;
		} catch(ArrayIndexOutOfBoundsException ex) {
			println("Catching the Array out of Bounds exception");
		}catch(Exception ex) {
			println("Catching the exception");
		} finally {
			println("The final block");
		}

		println("Let's move on after the exception");



		println("\n<Methods in Exception Handling>")
		try {
			def arr = new int[3];
			arr[5] = 5;
		}catch(ArrayIndexOutOfBoundsException ex) {
			println(ex.toString());
			println(ex.getMessage());
			println(ex.getStackTrace());
		} catch(Exception ex) {
			println("Catching the exception");
		}finally {
			println("The final block");
		}
		println("Let's move on after the exception");
	}
}
