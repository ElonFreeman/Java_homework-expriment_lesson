class TestOne {
    String s;
    int number;
    TestOne(String str,int n){
        s = str;
        number = n;
    }
    String testFun(){
        String str= "";
        for(int i=0;i<number;i++)
            str += s;
        return str;
    }   

    public static void main(String args[]) {
        System.out.println(new TestOne("Woo",5).testFun() + "!");
    }
}