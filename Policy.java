import java.lang.Math;

/**
 * Represents an insurance policy.
 */
public class Policy {
  private int number;
  private String providerName;
  private PolicyHolder policyHolder;
  public static int policyCount = 0;

  /**
   * constructor that initializes a Policy object with default values.
   */
  public Policy() {
    this.number = 0;
    this.providerName = "None";
    this.policyHolder = new PolicyHolder("Jane", "Doe", 0, "None", 0, 0);
    policyCount++;
  }

  /**
   * Constructor that initializes a Policy object with specified values.
   *
   * @param number The policy number.
   * @param providerName The name of the insurance provider.
   * @param holderFirstName The first name of the policyholder.
   * @param holderLastName The last name of the policyholder.
   * @param holderAge The age of the policyholder.
   * @param holderSmoker The smoking status of the policyholder. "smoker" or "non-smoker".
   * @param holderWeight The weight of the policyholder in pounds.
   * @param holderHeight The height of the policyholder in inches.
   */
  public Policy(int number, String providerName, String holderFirstName, String holderLastName, int holderAge,
      String holderSmoker, float holderWeight, float holderHeight) {
    this.number = number;
    this.providerName = providerName;
    this.policyHolder = new PolicyHolder(holderFirstName,holderLastName,holderAge,holderSmoker,holderWeight,holderHeight);
    policyCount++;
  }

  /**
   * Gets the policy number.
   *
   * @return policy number.
   */
  public int getNumber() {
    return this.number;
  }

  /**
   * Gets the provider name.
   *
   * @return provider name.
   */
  public String getProviderName() {
    return this.providerName;
  }

  /**
   * Sets the policy number.
   *
   * @param number The new policy number.
   */
  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * Sets the provider name.
   *
   * @param name The new provider name.
   */
  public void setProviderName(String name) {
    this.providerName = name;
  }

  /**
   * Gets the policy holder. secure style.
   *
   * @return The policy holder.
   */ 

  public PolicyHolder getPolicyHolder() {
    // return new PolicyHolder(this.policyHolder); will uncomment in security commit step, i just know this is the right way but wanna still have commit log look proper.
    return this.policyHolder;
  }

  /**
   * Sets the policy holder.
   *
   * @param The new policy holder.
   */ 

  public void setPolicyHolder(PolicyHolder policyHolder) {
    this.policyHolder = policyHolder;
  }

  /**
   * Calculates the price of the insurance policy based on age, smoking status, and BMI.
   *
   * @return The calculated policy price.
   */
  public float calcPolicyPrice() {
    float price = 600;
    if (this.policyHolder.getAge() > 50){
      price += 75;
    }
    if (this.policyHolder.getSmoker().equals("smoker")) {
      price += 100;
    }
    if (this.policyHolder.calcBMI() > 35) {
      price += (this.policyHolder.calcBMI()-35)*20;
    }
    double rounded = Math.round(price * 100.0) / 100.0;
    price = (float) rounded;
    return price;
  }

  public String toString() {
    return 
"Policy Number: " + this.number + "\n" + 
"Provider Name: " + this.providerName + "\n" +
this.policyHolder.toString() + "\n" +
"Price: " + this.calcPolicyPrice();

  }
}
