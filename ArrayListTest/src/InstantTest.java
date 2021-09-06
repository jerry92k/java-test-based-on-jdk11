public class InstantTest {

    public static void main(String[] args){

        InstantTest instantTest =new InstantTest("first");
        InstantTest instantTest2 =new InstantTest("second");
        InstantTest instantTest3 =new InstantTest("third");
        System.out.println(0.2+0.1);
        System.out.println(0.3);
        Thread t=new Thread(new Runnable() {
            public void run() {
                System.out.println("익명클래스 구현부");
            }
        });
    }

    public InstantTest(String name){
        System.out.println("construct : "+name);
    }

    {
        System.out.println("instant init");
    }

    static {
        System.out.println("class init");
    }
}
