//Problem 1 of Lecture 52
class Circle{
    public int radius;
    Circle (int r ){
         this.radius = r ;
    }
    public double area(){
        System.out.println( " Area of Circle: ");
        return Math.PI*this.radius*this.radius;

    } 
}
    class Cylinder extends Circle{
        Cylinder(int r , int h){
            super(r);
            this.height =h;
            
        }
        public int height;  
        public double volume(){
            System.out.println(" Volume of Cylinder: ");
            return Math.PI*this.radius*this.radius;
        }
    }

public class Lec52 {
    public static void main(String[] args) {
         Circle A = new Circle(12);
        Cylinder C = new Cylinder(12, 5);
        
        // System.out.println(A.area());
        System.out.println(C.volume());
    }

    
}

