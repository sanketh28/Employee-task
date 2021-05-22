import java.util.Scanner;
 
public class Employee {
 
 int yearofjoining;
 String name;
 float salary;
 String address;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the yearofjoining :: ");
  yearofjoining = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
  System.out.print("Enter the address :: ");
 address = in.next();
 }
 
 public void display() {
  
  System.out.println("Employee yearofjoining = " + yearofjoining);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
  System.out.println("Employee address = " + address);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[3];
  
  for(int i=0; i<3; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<3; i++) {
   
   e[i].display();
  }
 }
}