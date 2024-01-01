
package In.sode.test;
import java.util.Scanner;
class MyPoint{
    int x,y;
    MyPoint(){    //Constructor overloading
        this.x=0;
        this.y=0;
    }
    MyPoint(int x,int y){
    this.x=x;
    this.y=y;
}
    public double Distance(){     //Method overloading
        int xdiff=x-0;
        int ydiff=y-0;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
        
    }
    public double Distance(int x,int y){
        int xdiff=this.x-x;
        int ydiff=this.y-y;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
        
    }
    public double Distance(MyPoint another){
        int xdiff=this.x-another.x;
        int ydiff=this.y-another.y;
          return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
}
public class Constructor_Method {  //Main method
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y coordinates of point A");  //Taking user inputs
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter x and y coordinates of point B");
         int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("Enter x and y coordinates of point C");
          int x3=sc.nextInt();
        int y3=sc.nextInt();
    MyPoint point1=new MyPoint(x1,y1);
    MyPoint point2=new MyPoint(x2,y2);
    MyPoint point3=new MyPoint(x3,y3);
   
    double d1=point1.Distance();
    double d2=point2.Distance(x1,y1);
    double d3=point3.Distance(point2);
    double d4=point1.Distance(point3);
        System.out.println("Point A is at the distance of :"+d1+" from the origin\nPoint B is at the distance of"+d2+"from A\nPoint C is at the distance of "+d3+"from B");
        System.out.println("Distance between A and C="+d4);
       }
}
