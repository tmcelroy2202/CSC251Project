import java.lang.Math;

/**
 * Represents an insurance policy holder.
 */
public class PolicyHolder {
  private String FirstName;
  private String LastName;
  private int Age;
  private String Smoker;
  private float Weight;
  private float Height;

  /**
   * constructor that initializes a Policy object with default values.
   */
  public PolicyHolder() {
    this.FirstName = "Jane";
    this.LastName = "Doe";
    this.Age = 0;
    this.Smoker = "None";
    this.Weight = 0;
    this.Height = 0;
  }

  /**
   * Constructor that initializes a Policy object with specified values.
   *
   * @param FirstName The first name of the policyholder.
   * @param LastName The last name of the policyholder.
   * @param Age The age of the policyholder.
   * @param Smoker The smoking status of the policyholder. "smoker" or "non-smoker".
   * @param Weight The weight of the policyholder in pounds.
   * @param Height The height of the policyholder in inches.
   */
  public PolicyHolder(String FirstName, String LastName, int Age,
      String Smoker, float Weight, float Height) {
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Age = Age;
    this.Smoker = Smoker;
    this.Weight = Weight;
    this.Height = Height;
  }

  public PolicyHolder(PolicyHolder holder) {
    this.FirstName = holder.getFirstName();
    this.LastName = holder.getLastName();
    this.Age = holder.getAge();
    this.Smoker = holder.getSmoker();
    this.Weight = holder.getWeight();
    this.Height = holder.getHeight();
  }
    

  /**
   * Gets the holder's first name.
   *
   * @return holder's first name.
   */
  public String getFirstName() {
    return this.FirstName;
  }

  /**
   * Gets the holder's last name.
   *
   * @return holder's last name.
   */
  public String getLastName() {
    return this.LastName;
  }

  /**
   * Gets the holder's age.
   *
   * @return holder's age.
   */
  public int getAge() {
    return this.Age;
  }

  /**
   * Gets the holder's smoking status.
   *
   * @return holder's smoking status.
   */
  public String getSmoker() {
    return this.Smoker;
  }

  /**
   * Gets the holder's weight.
   *
   * @return holder's weight.
   */
  public float getWeight() {
    return this.Weight;
  }

  /**
   * Gets the holder's height.
   *
   * @return holder's height.
   */
  public float getHeight() {
    return this.Height;
  }

  /**
   * Sets the policyholder's first name.
   *
   * @param name The new first name.
   */
  public void setFirstName(String name) {
    this.FirstName = name;
  }

  /**
   * Sets the policyholder's last name.
   *
   * @param name The new last name.
   */
  public void setLastName(String name) {
    this.LastName = name;
  }

  /**
   * Sets the policyholder's age.
   *
   * @param age The new age.
   */
  public void setAge(int age) {
    this.Age = age;
  }

  /**
   * Sets the policyholder's smoking status.
   *
   * @param smoker The new smoking status.
   */
  public void setSmoker(String smoker) {
    this.Smoker = smoker;
  }

  /**
   * Sets the policyholder's weight.
   *
   * @param weight The new weight.
   */
  public void setWeight(float weight) {
    this.Weight = weight;
  }

  /**
   * Sets the policyholder's height.
   *
   * @param height The new height.
   */
  public void setHeight(float height) {
    this.Height = height;
  }

  /**
   * Calculates the policyholder's Body Mass Index (BMI).
   *
   * @return The calculated BMI.
   */
  public float calcBMI(){
    return (this.getWeight()*703)/((float)(Math.pow(this.getHeight(),2)));
  }

}

