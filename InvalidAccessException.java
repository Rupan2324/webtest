public class InvalidAccessException extends Exception{
		String ex;
		InvalidAccessException(String myex){
		System.out.println("InvalidAccessException called");
		this.ex = myex;
		}
		public String toString(){
		return "\nAccess Denied "+this.ex;
		}
		}



