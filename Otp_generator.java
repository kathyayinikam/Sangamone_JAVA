
package In.sode.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Otp_generator {
	public static void main(String[] args) throws IOException {
ArrayList<String> s1=new ArrayList<>();
	int otp=0;
         File f1=new File("output.txt");
                FileWriter f2=new FileWriter(f1);
	for(int i=1;i<10;i++) {
		otp=(int)(Math.random()*Math.pow(10, 8));
		 f2.write(String.valueOf(otp) + "\n"); 
        }
        f2.close(); 
        }
}


