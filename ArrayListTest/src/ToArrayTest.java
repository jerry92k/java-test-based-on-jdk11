import java.math.BigDecimal;
import java.util.ArrayList;

public class ToArrayTest {

    public static void main(String[] args){

        ToArrayTest toArrayTest =new ToArrayTest();
        toArrayTest.test0();
        toArrayTest.test1();
        toArrayTest.test2();
        toArrayTest.test3();

        BigDecimal bigDecimal =new BigDecimal("3.5");
    }

    // 참조타입 객체 초기화시 null 할당 확
    public void test0(){
        System.out.println("test0");
        String[] strs=new String[5];

        for(String str : strs){
            System.out.println(str);
        }
    }

    // ArrayList size와 동일한 길이의 배열을 매개변수로 넘겨줌
    public void test1(){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("hi");
        arr.add("wel");
        arr.add("come");

        System.out.println("test1");
        String[] convertedArr= arr.toArray(new String[3]);

        for(String word : convertedArr){
            System.out.println(word);
        }
    }

    // ArrayList size 보다 큰 길이의 배열을 매개변수로 넘겨줌
    public void test2(){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("hi");
        arr.add("wel");
        arr.add("come");

        System.out.println("test2");
        String[] convertedArr= arr.toArray(new String[5]);

        for(String word : convertedArr){
            System.out.println(word);
        }
    }

    // ArrayList size 보다 작은 길이의 배열을 매개변수로 넘겨줌
    public void test3(){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("hi");
        arr.add("wel");
        arr.add("come");

        System.out.println("test3");
        String[] convertedArr= arr.toArray(new String[2]);

        for(String word : convertedArr){
            System.out.println(word);
        }
    }
}
