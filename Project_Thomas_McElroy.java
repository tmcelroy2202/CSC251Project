import java.util.Scanner;

public class Project_Thomas_McElroy {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the Policy Number: ");
    int number = scan.nextInt();
    scan.nextLine();

    System.out.print("Please enter the Provider Name: ");
    String providerName = scan.nextLine();
    System.out.print("Please enter the Policyholder’s First Name: ");
    String holderFirstName = scan.nextLine();
    System.out.print("Please enter the Policyholder’s Last Name: ");
    String holderLastName = scan.nextLine();
    System.out.print("Please enter the Policyholder’s Age: ");
    int holderAge = scan.nextInt();
    scan.nextLine();
    System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
    String holderSmoker = scan.nextLine();
    System.out.print("Please enter the Policyholder’s Height (in inches): ");
    float holderHeight = scan.nextFloat();
    System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
    float holderWeight = scan.nextFloat();

    Policy myPolicy = new Policy(number,providerName,holderFirstName,holderLastName,holderAge,holderSmoker,holderWeight,holderHeight);

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
    System.out.print(myPolicy.getHolderHeight());
    System.out.println(" inches");
    System.out.print("Policyholder’s Weight: ");
    System.out.print(myPolicy.getHolderWeight());
    System.out.println(" pounds");
    System.out.print("Policyholder’s BMI: ");
    System.out.printf("%.2f", myPolicy.calcBMI());
    System.out.println();
    System.out.print("Policy Price: $");
    System.out.println(myPolicy.calcPolicyPrice());

  }
}
