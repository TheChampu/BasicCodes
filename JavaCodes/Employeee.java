class Employeee {
    int id;
    String name;
    double salary;

    void setEmployeee(int i, String n, double s){
        id = i;
        name = n;
        salary = s;
    }
    void showEmployee(){
        System.out.println("22010100"+id+" "+name+" ₹"+salary);
    }
    public static void main(String[] args){
        Employeee s = new Employeee();
        s.setEmployeee(12, "Shivanshu", 650000);
        s.showEmployee();
    }
}
//Shivanshu Deo(2201010012)