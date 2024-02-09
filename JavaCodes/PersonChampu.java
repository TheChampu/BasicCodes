public class PersonChampu {
    private String Firstname;

    private String Lastname;

    public PersonChampu (String firstname, String lastname){
        this.Firstname = firstname;
        this.Lastname = lastname;
    }
    public void showPersonChampu(){
        System.out.println(Firstname + Lastname);
    }
    public static void main(String[] args){
        PersonChampu s = new PersonChampu("Shivanshu"," Deo");
        s.showPersonChampu();
    }
}
//Shivanshu Deo
//2201010012