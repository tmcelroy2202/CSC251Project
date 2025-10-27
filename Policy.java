import java.lang.Math;

/**
 * Represents an insurance policy.
 */
public class Policy {
  private int number;
  private String providerName;
  private String holderFirstName;
  private String holderLastName;
  private int holderAge;
  private String holderSmoker;
  private float holderWeight;
  private float holderHeight;

  /**
   * constructor that initializes a Policy object with default values.
   */
  public Policy() {
    this.number = 0;
    this.providerName = "None";
    this.holderFirstName = "Jane";
    this.holderLastName = "Doe";
    this.holderAge = 0;
    this.holderSmoker = "None";
    this.holderWeight = 0;
    this.holderHeight = 0;
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
    this.holderFirstName = holderFirstName;
    this.holderLastName = holderLastName;
    this.holderAge = holderAge;
    this.holderSmoker = holderSmoker;
    this.holderWeight = holderWeight;
    this.holderHeight = holderHeight;
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
   * Gets the policyholder's first name.
   *
   * @return policyholder's first name.
   */
  public String getHolderFirstName() {
    return this.holderFirstName;
  }

  /**
   * Gets the policyholder's last name.
   *
   * @return policyholder's last name.
   */
  public String getHolderLastName() {
    return this.holderLastName;
  }

  /**
   * Gets the policyholder's age.
   *
   * @return policyholder's age.
   */
  public int getHolderAge() {
    return this.holderAge;
  }

  /**
   * Gets the policyholder's smoking status.
   *
   * @return policyholder's smoking status.
   */
  public String getHolderSmoker() {
    return this.holderSmoker;
  }

  /**
   * Gets the policyholder's weight.
   *
   * @return policyholder's weight.
   */
  public float getHolderWeight() {
    return this.holderWeight;
  }

  /**
   * Gets the policyholder's height.
   *
   * @return policyholder's height.
   */
  public float getHolderHeight() {
    return this.holderHeight;
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
   * Sets the policyholder's first name.
   *
   * @param name The new first name.
   */
  public void setHolderFirstName(String name) {
    this.holderFirstName = name;
  }

  /**
   * Sets the policyholder's last name.
   *
   * @param name The new last name.
   */
  public void setHolderLastName(String name) {
    this.holderLastName = name;
  }

  /**
   * Sets the policyholder's age.
   *
   * @param age The new age.
   */
  public void setHolderAge(int age) {
    this.holderAge = age;
  }

  /**
   * Sets the policyholder's smoking status.
   *
   * @param smoker The new smoking status.
   */
  public void setHolderSmoker(String smoker) {
    this.holderSmoker = smoker;
  }

  /**
   * Sets the policyholder's weight.
   *
   * @param weight The new weight.
   */
  public void setHolderWeight(float weight) {
    this.holderWeight = weight;
  }

  /**
   * Sets the policyholder's height.
   *
   * @param height The new height.
   */
  public void setHolderHeight(float height) {
    this.holderHeight = height;
  }

  /**
   * Calculates the policyholder's Body Mass Index (BMI).
   *
   * @return The calculated BMI.
   */
  public float calcBMI(){
    return (this.getHolderWeight()*703)/((float)(Math.pow(this.getHolderHeight(),2)));
  }

  /**
   * Calculates the price of the insurance policy based on age, smoking status, and BMI.
   *
   * @return The calculated policy price.
   */
  public float calcPolicyPrice() {
    float price = 600;
    if (this.getHolderAge() > 50){
      price += 75;
    }
    if (this.getHolderSmoker().equals("smoker")) {
      price += 100;
    }
    if (this.calcBMI() > 35) {
      price += (this.calcBMI()-35)*20;
    }
    double rounded = Math.round(price * 100.0) / 100.0;
    price = (float) rounded;
    return price;
  }
}
