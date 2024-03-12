package Main;
import java.util.*;
class Main {
  public static void main(String[] args) {  
      // 使用時
  Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
  //person1.print();
  Person person2 = new Person("山田", "花子", 22, 1.5, 40);
  //person2.print();

  //Person.printCount();
 
  Car car = new Car();
  Bicycle bicycle = new Bicycle();
  //ownerを設定
  //car.setOwner(person1.fullName());
  //bicycle.setOwner(person2.fullName());
 
  //System.out.println(car.getOwner());
  //System.out.println(bicycle.getOwner());

 
  // 乗り物を購入
  person1.buy(car);
  person2.buy(bicycle);
  }

}
class Person{
public static int count = 0;
public String firstName;
public String lastName;
public int age;
public double height, weight;

// コンストラクタを定義しインスタンスフィールドに値をセット
Person(String firstName, int age, double height, double weight) {
Person.count++;

    this.firstName = firstName;
    this.age = age;
    this.height = height;
    this.weight = weight;
}

// コンストラクタのオーバーロード
Person(String firstName, String lastName, int age, double height, double weight) {
Person.count++;

    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
}

public String fullName(){
return this.firstName + this.lastName;
}
     // 使用時
public void print(){
System.out.println("名前は" + this.fullName() + "です");
System.out.println("年は" + this.age + "です");
}

public double bmi(){
return this.weight / this.height / this.height;
}
     // 使用時
public static void printCount(){
System.out.println("合計" + Person.count + "人です");
}
public void buy(Car car) {
car.setOwner(this.fullName());
System.out.println(car.getOwner() + "が購入しました");
}
     // 使用時
public void buy(Bicycle bicycle) {
bicycle.setOwner(this.fullName());
System.out.println(bicycle.getOwner() + "が購入しました");
}
}
 class Vehicle {

private String owner;

public String getOwner() {
return owner;
}

public void setOwner(String owner) {
this.owner = owner;
}

}
class Car extends Vehicle {

}
class Bicycle extends Vehicle{

}
