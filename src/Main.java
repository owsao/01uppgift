import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the employee's name?\n> ");
        String name = scanner.nextLine(); 
        
        System.out.print("What is their hourly rate?\n> ");
        int hourlyRate = scanner.nextInt();

        System.out.print("How many hours did they work this month?\n> ");
        int hours = scanner.nextInt();

        System.out.println("Calculating...");

        //Instantiate PaymentSlip object
        PaymentSlip slip = new PaymentSlip(name, hourlyRate, hours);

        //Print payment slip formatted with tabs(\t)
        System.out.println("--------------------");
        System.out.println("## PAYMENT INFORMATION ##\n");
        System.out.println("Name:\t\t" + slip.getName());
        System.out.println("Hourly rate:\t$" + slip.getHourlyRate());
        System.out.println("Hours worked:\t" + slip.getHours());
        System.out.println();
        System.out.println("Salary before tax:\t$" + slip.calculateSalary());
        System.out.println("Salary after tax:\t$" + (int) slip.calculateNetSalary());
        System.out.println();
        System.out.println("If you have any questions regarding your salary, contact Bob");
        System.out.println("--------------------");
        scanner.close();
    }
}