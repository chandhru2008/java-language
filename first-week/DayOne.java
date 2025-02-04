public class DayOne {

    public static void main(String arg[]) {
        System.out.println("Hello world");

        // Creating a object  
        firstClass obj = new firstClass();
        System.out.println(obj.add());
        int res =  obj.add();
        System.out.println(res);
    }
}

class firstClass {
    int num1 = 10;
    int num2 = 20;
    static {
        // static method execute first
        System.out.println("This is  static block");
    }

    firstClass() {
        // constructer is used to intialize object 
        System.out.println("This is Constructers");
    }

    int add() {
        return num1 + num2;
    }

}