//Default Constructor
class Default{
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[]args){
        Default d1=new Default();
        Default d2=new Default();
        d1.display();
        d2.display();

    }
}