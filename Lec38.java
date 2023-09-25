class Emp{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("My id is: " + id);
        System.out.println("My name is; "+name);
    }
    public void setsalary(int newsalary){
        salary = newsalary;
    }
    public int getsalary(){
        return salary;
    }

}
public class Lec38 {
    public static void main(String[] args) {
     Emp sagar = new Emp();
     Emp pankaj = new Emp();
     sagar.id = 1;
     sagar.name = "sagar saxena";
     pankaj.id = 2;
     pankaj.name = "Pankaj Pandey";
     sagar.printdetails();
     pankaj.printdetails(); 
     pankaj.setsalary(15000); 
     System.out.println(pankaj.getsalary());
     sagar.setsalary(50000);
     System.out.println(sagar.getsalary());
    }
}
