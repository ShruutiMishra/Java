package OOPS;

/*
 * In JAVA an object is created from a class(which is a blurprint of creating objects or and object constructor)
 * 
 * to create a class we use 'class' keyword
 * class is a collection of objects
 * blueprint from which we create individual objects
 * class dosent consume any space
 */

//  public class Main{
//     int x = 5;
//  }

/*
 * to create an object of class main we use the 'new' keyword.
 * object is like an instance of a class.
 * 
 */

public class Main {
    int x = 5;
    int y = 7;
    // final
    int z = 0;

    String fname = "shruti";
    String lname = "Mishra";
    int age = 19;

    public static void main(String[] args) {
        Main myobj1 = new Main(); // object 1
        // multiple objects like
        Main myobj2 = new Main(); // object 2
        System.out.println(myobj1.x);
        System.out.println(myobj2.y);

        Main myobj = new Main();
        myobj.z = 40; // generate error since z is initialezes as a final keyword
        System.out.println(myobj.z);

        Main object = new Main();
        System.out.print(object.fname + " ");
        System.out.println(object.lname);
        System.out.println(object.age);

        // final keyword is used to when we dont wnat to override the existing values

    }
    /*
     * Accessing Atributes
     * we access variables or attributes in methods using the(.) dot syntax
     */

}
