 // Problem 2 of Lecture 52
 class Rectengle{
    public int width;
    public int length;
    Rectengle(int w , int l){
        this.width =w;
        this.length=l;     
    }
    public int areaOfRectangle(){
        System.out.println("Area of Rectangle : ");
        return width*length;
    }

}
class Cuboid extends Rectengle{
    public  int base;
    public  int height;

    Cuboid(int w, int l, int b ,int h ) {
        super(w, l);
        this.height=h;
        this.base= b;
    }
    public int areaOfCuboid(){
        System.out.println("Area of Cuboid : ");
        return 2*length*base+base*base*height+height*length;
    }


}
public class Lec52P2 {
    public static void main(String[] args) {
        Rectengle R = new Rectengle(12, 14);
        Cuboid C= new Cuboid(10, 12, 15, 5);
        System.out.println(R.areaOfRectangle());
        System.out.println(C.areaOfCuboid());
    }
    
}
