public class PersonShivanshu {
    private String Firstname;

    private String Lastname;

    public PersonShivanshu(String firstname, String lastname) {
        this.Firstname = firstname;
        this.Lastname = lastname;
    }

    public void showPersonShivanshu() {
        System.out.println(Firstname + "  " + Lastname);
    }
}
class Employee extends PersonShivanshu {
    private int employeeId;

    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void showEmployee() {
        System.out.println(employeeId + "     " + jobTitle);
    }

    public static void main(String[] args) {
        Employee e = new Employee  ("Shivanshu", "Deo", 12, "HR Manager");
        e.showPersonShivanshu();
        e.showEmployee();
    }
}
//Shivanshu Deo
// 220201010012