public class Para2 {
  int modelYear;
  String modelName;

  public Para2(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Para2 myCar = new Para2(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
 
}
}
