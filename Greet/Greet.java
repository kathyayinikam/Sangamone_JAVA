package in.sode;
public class Greet {
    
        public static String greet() {
		return "Hello Guest";
	}
        public static String greet(String name) {
		return "Hello "+name; 
	}
       public static String greet(String name, String gender) {
		if(gender.equals("M") || gender.equals("male") ||gender.equals("m") ||gender.equals("Male") || gender.equals("MALE")) {
			return "Hello Mr. "+name;
		}
                                   else if(name.equals("M")||name.equals("male")||name.equals("m")||name.equals("Male")  ){
                                         return "Hello Mr."+gender;
                                     }
                                 else if(gender.equals("F")||gender.equals("f")||gender.equals("female")||gender.equals("Female")||gender.equals("FEMALE")) {
			return "Hello Ms. "+name;
		}
                               else if(name.equals("F")||name.equals("f")||name.equals("female")||name.equals("Female")){
                                                       return "Hello Ms."+gender;
                                   }
		else {
			return "Please mention gender correctly";
		}
}
    
}
