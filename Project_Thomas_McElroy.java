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
    System.out.println();
    for (Policy policy : policies) {
      System.out.print(policy);
      System.out.println();
      System.out.println();
      if (policy.getPolicyHolder().getSmoker().equalsIgnoreCase("smoker")) {
        smokerCount++;
      } else {
        nonSmokerCount++;
      }
    }
    System.out.println("There were " + Policy.policyCount + " Policy objects created");
    System.out.println("The number of policies with a smoker is: " + smokerCount);
    System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
  }
}
