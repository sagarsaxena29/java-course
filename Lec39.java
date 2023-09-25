
    class Myemp{
       private  int salary;
         private String name;

         public void setName( String n){
            name = n ;

         }
         public String getName(){return name;}
         public void setSalary(int s){
            salary = s;
         } 
         public int getSalary(){return salary;}
        
         }
    
    public class Lec39 {
    public static void main(String[] args) {
        Myemp sagar = new Myemp();
        sagar.setName("Sagar saxena");
        sagar.setSalary(500000);
        System.out.println(sagar.getName());
        System.out.println(sagar.getSalary());
    }
}
