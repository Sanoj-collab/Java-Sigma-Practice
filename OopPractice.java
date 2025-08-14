//Question 1 write a correct tatement to assign name of the object.
class Student{
    String name;
    int marks;
}
//Question 2 Which variables can a Person class can acccess.....
class Person{
    String name;
    int weight;

}
class Student1 extends Person{
   int rollNumber;
   String schoolName;
}
//Question 3 Which modifiers are not allowed to use infront of class?
// NOTE: Private and Protected modifiers are not allowed to use infront of class name bcz it will become useless after using it we cann't create object in chikld class of it or we cann't see this class ...
class Vechicle {
    String name;
} 
class Car extends Vechicle{
       int numberWhellers;
}
//Question 8 What will be the output ...?
class Book {
    int price ;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}
//Question 9 
class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks;
    }
}
//Question 10 What will be the output..
class Test1{
    static int a = 10;
    static int b;
    static void changeB(){
        b = a * 3;
    }
}
class Base{
    public Base(){
        System.out.println("Base");
    }
}
class Derived extends Base{
    public Derived(){
        System.out.println("Derived");
    }
}
class DeriDerived extends Derived{
    public DeriDerived(){
        System.out.println("DeriDervied");
    }
}
public class OopPractice {
    public static void main(String[] args) {
        //Q1
        Student s = new Student();
        s.name = "Shubha";
        System.out.println(s.name);

        //Q2
        Person p = new Person();
        p.name = "Sanoj";
        System.out.println(p.name);

        // Person p2 = new Person();
        // p.roolNumber = 187;// Cann't acces by person class due to Student extend peron class .person class don't extends student class...ERROR

        Student1 st = new Student1();
        st.name = "Aryan";
        st.weight = 60;
        st.rollNumber = 101;
        st.schoolName = "MPS";
        System.out.println(st.name + " " +st.weight + " " + st.rollNumber +" "+ st.schoolName);
        //Q4
        Car c = new Car();
        c.name = "alto800";
        System.out.println(c.name);
        Vechicle v = new Vechicle();
        v.name = "Bike";
        System.out.println(v.name);
        Vechicle v1 = new Car();// NOTE : we can create child class  object in the refrence of parrent class.
        v1.name ="Fortuner";
        System.out.println(v1.name);
        //Car c1 = new Vechicle();
        //c1.numberWhellers = 4;
        // System.out.println(c1.numberWhellers);

       //Q5
       //    Vechicle2 obj1 = new Car1();
       //    obj1.print();// Since child class has two print function but one of itself and other of it's base class but it will work on itself function ..Its work on function overriding .

       //    Vechicle2 obj2 = new Vechicle2();
        //    obj2.print();

       //Q6
      //    Vechicle3 obj1 = new car2();
      //    obj1.print1();//ERROR 

      //    Vechicle3 obj2 = new Vechicle3();
      //    obj2.print();

       //Q8
    //    System.out.print(Book.count+" ");
    //    Book b1 = new Book(150);
    //    Book b2 = new Book(250);
    //    System.out.println(Book.count);

    //    //Q9
    //    Test t = new Test();
    //    t.set_marks(98);
    //    System.out.println(Test.marks);

    //    //Q10
    //    Test1 t2 = new Test1();
    //    t2.changeB();
    //    System.out.println(Test1.a + Test1.b);

    Derived b = new DeriDerived();


    }
}
//Question 5 What will be the output ?
class Vechicle2{
     void print(){
        System.out.println("Base class vechicle2");
     }
}
class Car1 extends Vechicle2{
    void print(){
        System.out.println("Derived class Car");
    }
}
//Question 6 What wiil be the output ?
class Vechicle3{
    void print(){
        System.out.println("Base class vechicle3");
    }
}
class car2 extends Vechicle3{
    void print1(){
        System.out.println("Derived class car2");
    }
}
