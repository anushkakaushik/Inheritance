package CoreJava;
class Child extends Parent{
public void ch(){
System.out.println("hello i am child");
}

public static void main(String[] args){
Child c= new Child();
c.g();
c.p();
c.ch();
}
}