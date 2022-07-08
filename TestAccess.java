import java.util.*;
public class TestAccess {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		List<String> i2=Arrays.asList("hi","she","it");
		l1.add(8225);
		l1.add(8226);
		l1.add(8227);
		l1.add(8228);
	String s1 = args[0];
	try{
	int id = Integer.parseInt(s1);
	if (l1.contains(id)){
	System.out.println("Access accepted");
	}
	else{
	throw new InvalidAccessException(s1);
	}
	}
	catch(InvalidAccessException e){
	System.out.println("Your id card is inavalid "+e);
	}
	}
}
