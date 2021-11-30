class Test{
    String statement;
    Test(String a ){
        this.statement=a;
    }
    public static void main(String[]args){
        Test result=new Test("Successfully Completed");
        System.out.println(result.statement);
    }
}