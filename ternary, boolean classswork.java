public class Main {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(1*5));
    System.out.println(Math.abs(1-5));
    System.out.println(Math.pow(1,5));
    System.out.println(Math.exp(1));
    System.out.println(Math.cbrt(1));
    
    if (0>5){
      System.out.println("1 is greater than 5");
  }
    else{
      System.out.println("5 is greater than 1");
    }
    
    //TERNARY
    
    double m0 =1;
    double m1 =5;
    String smaller = m1==m0 ? "5 is equal to 1" : "5 is not equal to 1";
    System.out.println(smaller);

    smaller = m1>m0 ? "5 is greater than 1" : "5 is not greater than 1";
    System.out.println(smaller);

    smaller = m1<m0 ? "5 is less than 1" : "5 is not less than 1";
      
    System.out.println(smaller);
    
    //BOOLEAN
    int x = 7;
    int y = 5;
    
    System.out.println(x>y);
    System.out.println(x<y);
    System.out.println(x==y);
    
    System.out.println(x>y&&x<y);
    System.out.println(x>y||x<y);
    System.out.println(!(x>y&&x<y));
        //ITERATION
   for (int i = 0; i<=99; i++) {
      if(i==05){
        System.out.println(i);
      }}
    
   int day = 6;
  switch (day){
   case 1 : 
  System.out.println("monday");   
  break;
  
   case 2 : 
  System.out.println("tuesday");   
  break;
  
   case 3 : 
  System.out.println("wednesday");   
  break;
 
   case 4 : 
  System.out.println("thursday");   
  break;
 
   case 5 : 
  System.out.println("friday");   
  break;
  
   case 6 : 
  System.out.println("saturday");   
  break;
   case 7 : 
  System.out.println("sunday");   
  break;
  
  }
  
  
  }}
