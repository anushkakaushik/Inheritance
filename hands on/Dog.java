package CoreJava;
//use of extends keyword to perform inheritance
class Dog extends Mammal{
//methods and fields of mammal 
// methods and fields of Dog
public void sound(){
System.out.println("i bark");
}
public static void main(String[] args){
//creating an object of subclass/child class
Dog d = new Dog();
//accessing fields of superclass


//cALLED METHOD OF superclass using obj of subclass
d.eat();

d.nature();
d.sound();
}
}
