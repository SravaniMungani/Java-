public class Fast{
    public static void main(String[]args){
        String[] names={"ABC","DEF","GHI"};
        int i=0;
        do{
            System.out.println(names[i]);
            i++;
        }
        while(i<=names.length-1);  //(i<=2);
    }
}