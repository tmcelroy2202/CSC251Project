import java.util.Scanner;

public class Policy {
  private int number;
  private String providerName;
  private String holderFirstName;
  private String holderLastName;
  private int holderAge;
  private String holderSmoker;
  private float holderWeight;
  private float holderHeight;

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

  public int getNumber() {
    return this.number;
  }

  public String getProviderName() {
    return this.providerName;
  }

  public String getHolderFirstName() {
    return this.holderFirstName;
  }

  public String getHolderLastName() {
    return this.holderLastName;
  }

  public int getHolderAge() {
    return this.holderAge;
  }

  public String getHolderSmoker() {
    return this.holderSmoker;
  }

  public float getHolderWeight() {
    return this.holderWeight;
  }

  public float getHolderHeight() {
    return this.holderHeight;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setProviderName(String name) {
    this.providerName = name;
  }

  public void setHolderFirstName(String name) {
    this.holderFirstName = name;
  }

  public void setHolderLastName(String name) {
    this.holderLastName = name;
  }

  public void setHolderAge(int age) {
    this.holderAge = age;
  }

  public void setHolderSmoker(String smoker) {
    this.holderSmoker = smoker;
  }

  public void setHolderWeight(float weight) {
    this.holderWeight = weight;
  }

  public void setHolderHeight(float height) {
    this.holderHeight = height;
  }

  public float calcBMI(){
    return (this.getHolderWeight()*703)/((float)(Math.pow(this.getHolderHeight(),2)));
  }

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
