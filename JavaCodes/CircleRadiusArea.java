public class CircleRadiusArea {
    int radius;
    public void setRadius(int r){
        radius = r;
    }
    public double printArea(){
        System.out.print("The area of circle with Radius = "+ radius +" is: ");
        return 3.14*(radius*radius);
    }
    public double printParameter(){
        System.out.print("The parameter of circle with Radius = "+ radius +" is: ");
        return 2 * 3.14*radius;
    }
    public static void main(String[] args) {
        CircleRadiusArea c1 = new CircleRadiusArea();
        c1.setRadius(10);
        System.out.println(c1.printArea());
        System.out.println(c1.printParameter());

        // Circle class 2nd object(c2)
        CircleRadiusArea c2 = new CircleRadiusArea();
        c2.setRadius(50);
        System.out.println(c2.printArea());
        System.out.println(c2.printParameter());
    }
}
// Shivanshu Deo