public class Car {
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    
    public Car(String inputName, double inputMiles, double inputGallons){
        carName = inputName;
        milesDriven = inputMiles;
        gallonsUsed = inputGallons;
    }
    
    public String getName(){
        return carName;
    }
    public double getMiles(){
        return milesDriven;
    }
    public double getGallons(){
        return gallonsUsed;
    }
    
    public void setName(String inputName){
        carName = inputName;
    }
    public void setMiles(double inputMiles){
        milesDriven = inputMiles; 
    }
    public void setGallons(double inputGallons){
        gallonsUsed = inputGallons;
    }
    
    public double calcAvg(){
        double output;
        output = Math.round(10.0 * milesDriven / gallonsUsed) / 10.0;
        return output;
    }
    
    public String toString(){
        String output = "";
        
        output = carName + " averaged " + calcAvg() + " m/g";
        
        return output;
    }
}

/* My output from the terminal
 * 
 * 
    Please enter the car's name: Honda Civic
    Please enter the car's miles: 234
    Please enter the car's gallons: 100
    Honda Civic averaged 2.3 m/g
    ----------NEXT CAR----------
    Please enter the car's name: Toad Mobile
    Please enter the car's miles: 13
    Please enter the car's gallons: 7
    Toad Mobile averaged 1.9 m/g

*/
