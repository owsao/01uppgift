public class PaymentSlip {
    private String name;
    private int hourlyRate;
    private int hours;

    //Default constructor
    public PaymentSlip() {
    }

    // Parameterized constructor
    public PaymentSlip(String name, int hourlyRate, int hours){
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }

    // Calculate Gross Salary : hourlyRate * hours
    public int calculateSalary(){
        return hourlyRate * hours;
    }

    //Calculate Net Salary (30%tax deduction -> 70% remaining)
    public double calculateNetSalary(){
        return calculateSalary() * 0.7;
    }
}
