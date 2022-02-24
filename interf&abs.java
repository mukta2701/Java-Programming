//Design code to implement and to show difference between abstract class and interface. 
/* NAME: MUKTA CHOUDHURY */

interface printable {
    void print();
}

class A6 implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}

abstract class Bike{  
    abstract void run();  
  }  
  class Honda4 extends Bike{  
  void run(){System.out.println("running safely");}  
  public static void main(String args[]){  
   Bike obj = new Honda4();  
   obj.run();  
  }  
  }  