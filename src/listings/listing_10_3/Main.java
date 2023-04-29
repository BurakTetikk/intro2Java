package listings.listing_10_3;

public class Main {
    public static void main(String[] args) {
        BMI bmi = new BMI("Burak" , 25, 90, 190);
        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStatus());

        BMI bmi1 = new BMI("Susan", 215, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    }
}
