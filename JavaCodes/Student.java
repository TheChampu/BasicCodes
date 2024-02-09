class Student {
    int rollnumber;
    String name;
    double marks;

    void inputStudent(int r, String n, double m){
        rollnumber = r;
        name = n;
        marks = m;
    }
    void displayStudent(){
        System.out.println(rollnumber+" "+ name +" "+ marks);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.inputStudent(12, "Shivanshu", 14);
        s.displayStudent();
    }
}
//Shivanshu Deo(2201010012)🐼