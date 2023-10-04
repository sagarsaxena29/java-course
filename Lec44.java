
 class Cylinder{
     private int radius;
     private int height;
    //  public Cylinder(int redius, int height){
    //    this.radius=radius;      
    //     this.height = height;
         
   //  }
    public Cylinder(int radius , int height){
        this.height= height;
        this.radius =radius;
    }
      public int getRadius() {
       return radius;
    }
    public int getHeight() {
        return height;
     }
    // public void setHeight(int height) {
    //     this.height = height;
    // }
    
    // public void setRadius(int radius) {
    //     this.radius = radius;
    // }
     public double volume(){
        return 3.14 * radius * radius *height ;
         
     }
    
   
 }   
public class Lec44 {
 public static void main(String[] args) {
    Cylinder mycylinder = new Cylinder(10,12);
   // mycylinder.setHeight(12);
   // mycylinder.setRadius(10);
     System.out.println(mycylinder.getHeight());
    System.out.println(mycylinder.getRadius());
    System.out.println(mycylinder.volume());

 }
}
