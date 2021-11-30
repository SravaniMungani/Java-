//Using constructor to initialize another object
class Student {
    int id ;
    String name;
    Student(int i,String n){
        id=i;
        name=n;
    }
    Student(Student s){
        id=s.id;
        name=s.name;
    }
    public static void main(String[]args){
        Student s1= new Student(1,"Ram");
        Student s2=new Student(s1);
        System.out.println(s1.id);
        System.out.println(s2.name);
    }
}