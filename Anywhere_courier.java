
package In.sode.test;

class box{
    int length;
    int width;
    int height;
    double rate=3.5;
    box(int l,int w, int h){  //constructor
        this.length=l;
        this.width=w;
        this.height=h;
       
    }
    double Price(){
        double rateV=3.5;
        double vol=length*width*height;
        return vol*rateV;
    }
}
class heavybox extends box{  //inheritance in Java
    double weight;

    heavybox(int l, int w, int h) {   //variables l,w,h from super class
        super(l, w, h);
    }
    double Price(double wt){
        double ratew=6;
        return Price()*wt*ratew;
    }
    
}
public class Anywhere_courier {
    public static void main(String[]args){
        System.out.println("Couriers shipping rate");
        box b1=new box(3,3,2);                                   
        box b2=new box(12,8,1);
        heavybox b3=new heavybox(4,2,1);
        double amt1=b1.Price();
        double amt2=b2.Price();
        double amt3=b3.Price(4.0);
        System.out.println("box1 - "+"Rs "+amt1);
        System.out.println("box2-"+"Rs "+amt2);
        System.out.println("box3 - "+"Rs "+amt3);
    
    }
}
