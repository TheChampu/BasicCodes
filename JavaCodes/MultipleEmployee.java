public class MultipleEmployee {
    long EmployeeId;
    String EmployeeName;
    double EmployeeSalary;
    public void setMultipleEmployee(int i,String s,double m){
        EmployeeId = i;
        EmployeeName = s;
        EmployeeSalary = m;


    }
    public void showMultipleEmployee(){
        System.out.println("\n Employee ID : "+EmployeeId+ " \n Name : "+EmployeeName+"\n Salary : ₹"+EmployeeSalary+ " per month.");
    }
    public static void main(String[]args){
        MultipleEmployee e1 =  new MultipleEmployee();
        MultipleEmployee e2 =  new MultipleEmployee();
        e1.setMultipleEmployee(12,"Shivanshu",66000);
        e2.setMultipleEmployee(16,"Alok",86000);
        e1.showMultipleEmployee();
        e2.showMultipleEmployee();
    }
}
//Shivanshu Deo