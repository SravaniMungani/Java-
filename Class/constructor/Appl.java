class Appl{
    String yes;
    int num;
    Appl(String a){
        this.yes=a;
    }
    Appl(int b){
        this.num=b;
    }
    public static void main(String[]args){
        Appl over=new Appl("Overloaded is Applicable for constructor");
        Appl number=new Appl('9');
        System.out.println(over.yes);
        System.out.println(number.num);
        }
}