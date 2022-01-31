public class Calculator {
    
    public Calculator(){
    }
    
    public int subtract(int a, int b){
      System.out.println("subtract");
      return a-b;
    }

    public int add(int a, int b){
      System.out.println("add");
      return a+b;
    }
    
    public int multiply(int a, int b){
      System.out.println("multiply");
      return a*b;
    }

    public int modulo(int a, int b){
      System.out.println("modulo");
      return a%b;
    }
    
    public int divide(int a, int b){
      System.out.println("divide");
      return a/b;
    }
    
    public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.subtract(45, 11));
      System.out.println(myCalculator.add(45, 11));
    }       
  }
  