//Adding lower type
class Lower{
public static void main(String[]args){
  byte a=10;
  byte b=10;
  byte c=(byte) a+b;//byte c=a+b; Compile time error
  System.out.println(c);
  }
}  
  