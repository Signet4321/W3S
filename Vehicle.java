class Vehicle {
  protected String brand = "Ford";         
  public void honk() {                    
    System.out.println("Tuut, Honk!");
  }
}

class Car3 extends Vehicle {
  private String modelName = "Mustang";    
  public static void main(String[] args) {


    Car3 myCar = new Car3();

  
    myCar.honk();

    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
}
