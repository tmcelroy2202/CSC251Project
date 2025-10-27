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
        Policy policy = new Policy(number, providerName, holderFirstName, holderLastName, holderAge, holderSmoker,
            holderHeight, holderWeight);
        policies.add(policy);
      }
      fileScanner.close();
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
    int smokerCount = 0;
    int nonSmokerCount = 0;
    for (Policy policy : policies) {
      System.out.println("--------------------");
      System.out.println("Policy Number: " + policy.getNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder's Age: " + policy.getHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getHolderSmoker());
      System.out.println("Policyholder's Height: " + policy.getHolderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getHolderWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.calcBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calcPolicyPrice());
      if (policy.getHolderSmoker().equalsIgnoreCase("smoker")) {
        smokerCount++;
      } else {
        nonSmokerCount++;
      }
    }
    System.out.println("\n--------------------");
    System.out.println("There were " + policies.size() + " Policy objects created.");
    System.out.println("The number of policies with a smoker is: " + smokerCount);
    System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
  }
}
