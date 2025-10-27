import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Thomas_McElroy {
  public static void main(String[] args) {
    ArrayList<Policy> policies = new ArrayList<>();
    try {
      File inputFile = new File("PolicyInformation.txt");
      Scanner fileScanner = new Scanner(inputFile);
      while (fileScanner.hasNext()) {
        int number = fileScanner.nextInt();
        fileScanner.nextLine();
        String providerName = fileScanner.nextLine();
        String holderFirstName = fileScanner.nextLine();
        String holderLastName = fileScanner.nextLine();
        int holderAge = fileScanner.nextInt();
        fileScanner.nextLine();
        String holderSmoker = fileScanner.nextLine();
        float holderHeight = fileScanner.nextFloat();
        float holderWeight = fileScanner.nextFloat();
        if (fileScanner.hasNextLine()) {
          fileScanner.nextLine();
        }
        if (fileScanner.hasNextLine()) {
          fileScanner.nextLine();
        }
        Policy policy = new Policy(number, providerName, holderFirstName, holderLastName, holderAge, holderSmoker, holderWeight, holderHeight);
        policies.add(policy);
      }
      fileScanner.close();
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
    int smokerCount = 0;
    int nonSmokerCount = 0;
    for (Policy policy : policies) {
      System.out.print("Policy Number: ");
      System.out.println(policy.getNumber());
      System.out.print("Provider Name: ");
      System.out.println(policy.getProviderName());
      System.out.print("Policyholder’s First Name: ");
      System.out.println(policy.getHolderFirstName());
      System.out.print("Policyholder’s Last Name: ");
      System.out.println(policy.getHolderLastName());
      System.out.print("Policyholder’s Age: ");
      System.out.println(policy.getHolderAge());
      System.out.print("Policyholder’s Smoking Status: ");
      System.out.println(policy.getHolderSmoker());
      System.out.print("Policyholder’s Height: ");
      System.out.print(policy.getHolderHeight());
      System.out.println(" inches");
      System.out.print("Policyholder’s Weight: ");
      System.out.print(policy.getHolderWeight());
      System.out.println(" pounds");
      System.out.print("Policyholder’s BMI: ");
      System.out.printf("%.2f", policy.calcBMI());
      System.out.println();
      System.out.print("Policy Price: $");
      System.out.printf("%.2f", policy.calcPolicyPrice());
      System.out.println();
      System.out.println(); 
      if (policy.getHolderSmoker().equalsIgnoreCase("smoker")) {
        smokerCount++;
      } else {
        nonSmokerCount++;
      }
    }
    System.out.println("The number of policies with a smoker is: " + smokerCount);
    System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
  }
}
