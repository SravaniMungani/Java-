public class Gv{
    public static void getvalues(int...b){
        int result=0;
        for (int a:b){
            result=result+a;
        }
        System.out.println(result);
    }
    public static void main(String...args){
        getvalues(12,20,30,40,50);
        getvalues(10);
        }
}