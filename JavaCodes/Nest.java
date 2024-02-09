// to print the respective open elective courses for the course name and year
class nesty{
    public static void main(String[] args)
    {
        String Branch = "CSE";
        int year = 2;
        switch (year) {
            case 1:
                System.out.println("open elective courses : youth psychology, creative writing, sports");
                break;
            case 2:
                switch (Branch) {
                    case "CSE":
                        System.out.println("open elective courses : finance for non-finance executives, sports, psychology of love");
                        break;
                    case "CCE":
                        System.out.println("elective courses : Machine Learning, Big Data");
                        break;
                    case "ECE":
                        System.out.println("elective courses : Antenna Engineering");
                        break;
                    default:
                        System.out.println("Elective courses : Optimization");
                }
        }
    }
}// Shivanshu Deo
