public class ExtandSwitchTest {

    public static void main(String[] args){

        ExtandSwitchTest extandSwitchTest = new ExtandSwitchTest();
        System.out.println("input age : 20");
        extandSwitchTest.traditionalSwitch(20); // case 20: 절에 break가 없으므로 case 10: 절도 실행됨
        System.out.println("input age : 10");
        extandSwitchTest.traditionalSwitch(10); // break절이 있으므로 switch문을 빠져나옴.
        // => if(age==20 || age == 10) 과 같은 논리가 됨

        System.out.println("input age : 17");
        extandSwitchTest.traditionalSwitch(17); // case 조건에 해당하지 않는 값이므로 default로 빠짐

        System.out.println();
        System.out.println("input name : jerry");
        extandSwitchTest.stringSwitch("jerry"); //java 7부터는 String로 비교대상변수로 사용 가능

    }

    public void traditionalSwitch(int age){
        switch (age){
            case 30:
                System.out.println("age : 30");
                break;
            case 20:
                System.out.println("age : 20");
//                break;
            case 10:
                System.out.println("age : 10");
                break;
            case 5:
                System.out.println("age : 5");
                break;
            default:
                System.out.println("age : default");
        }
    }

    public void stringSwitch(String name){
        switch (name){
            case "kim":
                System.out.println("name : kim");
                break;
            case "lee":
                System.out.println("name : lee");
                break;
            default:
                System.out.println("not fount");

        }
    }
}

