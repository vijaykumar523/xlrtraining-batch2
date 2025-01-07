public class Employee{
    int id;
    String  firstname;
    String lastname;
    String address;
    public Employee(){
        this.id=1;
        this.firstname="vijay";
        this.lastname="Kumar";
        this.address="alur";
    }
     public  Employee(int id,String firstname,String lastname,String address){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
     }
     public String getfull(){
      return firstname +" "+lastname;
    }
    public static void main(String[] args) {
     Employee e1 =new Employee();  
     System.out.println(e1.getfull()); 
     
    }
}