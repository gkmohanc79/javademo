package Main;
import java.util.*;

public class Main
{
public static void main(String[]args){
    System.out.println(" Welcome to 2nd program");
    int a=15;
    boolean krishna= true;
    System.out.println("Integer value is:"+a);
    System.out.println("Employee name is krishna:" + true);
    Main iv= new Main();
    Employee iv1= new Employee();
    Higher h = new Higher();
    System.out.println("Employee ID : "+iv.getEmployeeID());
    System.out.println("switch type : "+iv.getSwitch());
    System.out.println("employeenumber" + iv1.employeenumber);

    System.out.println("Employee Name : "+getEmployeeName());
    System.out.println("Employee ID : "+iv1.getEmployeeAddress());
    System.out.println("Employee ID : "+EmpPhone.getEmployeePhone());
   System.out.println("Employee Name : "+ h.getEmpHigher());

    int myNum =15;
    myNum=35;
    System.out.println("my number is :" +myNum);
    //final int myNum1 =15;
    //myNum1=35; mynum=35;
    //System.out.println(myNum1);

//    int Emp1 =89;
//    int Emp2 =67;
//    if (Emp1 >= Emp2) {
//        System.out.println("Employee one got Higher vote!" +Emp1);
//    } else {
//        System.out.println("Employee two got Higher vote!" +Emp2 );
//    }

    int day = 7;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        // Outputs "Sunday" (day 7)
        default:
            System.out.println("Looking forward to the Weekend");
            // Outputs "Looking forward to the Weekend"
    }

}

        public int getEmployeeID()
        {
            int empid = 1979;
            return empid;
        }
        public String getSwitch()
    {
         String swi = " maindoor";
            return swi;

    }
        public static String getEmployeeName()
        {
            String empname = "GKM";
            return empname;
        }




}

class Employee
{
    int employeenumber = 1000;
    public String getEmployeeAddress()
    {
        String Empaddress = " 24/c, Adirel Apartments,Chennai";
        return Empaddress;

    }
}
class EmpPhone
{
    public static int getEmployeePhone()
    {
        int Empphone = 2145972650;
        return Empphone;
    }
}

class Higher {

    public static String getEmpHigher() {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the employee1 value");
        int emp1 = sc.nextInt();
        System.out.println("Enter the employee2 value");
        int emp2 = sc.nextInt();
        if (emp1 >= emp2){
           return "Employee 1 has the highest value";
        } else{
            return "Employee 2 has the highest value";
        }
    }
}