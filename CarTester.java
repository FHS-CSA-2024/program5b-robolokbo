import java.util.Scanner;

public class CarTester{
    public static Car addCar(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("\nPlease enter the car's name: ");
        String inputName = inputScanner.nextLine();
        
        System.out.print("Please enter the car's miles: ");
        double inputMiles = inputScanner.nextDouble();
        
        System.out.print("Please enter the car's gallons: ");
        double inputGallons = inputScanner.nextDouble();
        
        Car car = new Car(inputName, inputMiles, inputGallons);
        
        return car;
    }
    
    public static void main(String[] args){
        Car car1 = addCar();
        System.out.println(car1);
        
        System.out.print("----------NEXT CAR----------");
        
        Car car2 = addCar();
        System.out.println(car2);
    }
}
