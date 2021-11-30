//copying values without Constructor
class Student1{
    int id;
    String name;
    Student1(int i,String n){
        id=i;
        name=n;
    }
    Student1(){}
    public static void main(String[]args){
        Student1 s1=new Student1(1,"Sam");
        Student1 s2=new Student1();
        s2.id=s1.id;     //by assining the values of one object into another
        s2.name=s1.name;
        System.out.println(s1.id);
        System.out.println(s2.id);

    }

}