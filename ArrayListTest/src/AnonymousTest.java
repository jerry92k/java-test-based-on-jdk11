public class AnonymousTest {

    public static void main(String[] args) {
        AnonymousTest anonymousTest =new AnonymousTest();
        anonymousTest.anonymousTest();
        anonymousTest.lambdaTest();
    }

    public void anonymousTest(){
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("익명클래스 구현부");
            }
        });
        t.start();
    }

    public void lambdaTest(){
        Thread t = new Thread(()->System.out.println("익명클래스 구현부2"));
        t.start();
    }
}
