import java.util.Scanner;

public class Project_Thomas_McElroy {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Policy myPolicy = new Policy();

    System.out.print("Please enter the Policy Number: ");
    myPolicy.setNumber(scan.nextInt());
    scan.nextLine();

    System.out.print("Please enter the Provider Name: ");
    myPolicy.setProviderName(scan.nextLine());
    System.out.print("Please enter the Policyholder’s First Name: ");
    myPolicy.setHolderFirstName(scan.nextLine());
    System.out.print("Please enter the Policyholder’s Last Name: ");
    myPolicy.setHolderLastName(scan.nextLine());
    System.out.print("Please enter the Policyholder’s Age: ");
    myPolicy.setHolderAge(scan.nextInt());
    scan.nextLine();
    System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
    myPolicy.setHolderSmoker(scan.nextLine());
    System.out.print("Please enter the Policyholder’s Height (in inches): ");
    myPolicy.setHolderHeight(scan.nextFloat());
    System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
    myPolicy.setHolderWeight(scan.nextFloat());

    System.out.print("Policy Number: ");
    System.out.println(myPolicy.getNumber());
    System.out.print("Provider Name: ");
    System.out.println(myPolicy.getProviderName());
    System.out.print("Policyholder’s First Name: ");
    System.out.println(myPolicy.getHolderFirstName());
    System.out.print("Policyholder’s Last Name: ");
    System.out.println(myPolicy.getHolderLastName());
    System.out.print("Policyholder’s Age: ");
    System.out.println(myPolicy.getHolderAge());
    System.out.print("Policyholder’s Smoking Status: ");
    System.out.println(myPolicy.getHolderSmoker());
    System.out.print("Policyholder’s Height: ");
    System.out.println(myPolicy.getHolderHeight());
    System.out.print("Policyholder’s Weight: ");
    System.out.println(myPolicy.getHolderWeight());
    System.out.print("Policyholder’s BMI: ");
    System.out.printf("%.2f", myPolicy.calcBMI());
    System.out.println();
    System.out.print("Policy Price: ");
    System.out.println(myPolicy.calcPolicyPrice());

  }
}
