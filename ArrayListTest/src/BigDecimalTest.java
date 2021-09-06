import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {

        BigDecimal testBigDecimal=new BigDecimal("24.354654654");
        System.out.println("unscaledValue: " + testBigDecimal.unscaledValue());
        System.out.println("정수부: "+testBigDecimal.intValue());
        System.out.println("소수부 자리수: "+testBigDecimal.scale());
        System.out.println("전체길이 : "+testBigDecimal.precision());

        BigDecimal testBigDecimal2=new BigDecimal(24.354654654);
        System.out.println("unscaledValue: " + testBigDecimal2.unscaledValue());
        System.out.println("정수부: "+testBigDecimal2.intValue());
        System.out.println("소수부 자리수: "+testBigDecimal2.scale());
        System.out.println("전체길이 : "+testBigDecimal2.precision());

        BigDecimal testBigDecimal3=new BigDecimal(0.5);
        System.out.println("unscaledValue: " + testBigDecimal3.unscaledValue());
        System.out.println("정수부: "+testBigDecimal3.intValue());
        System.out.println("소수부 자리수: "+testBigDecimal3.scale());
        System.out.println("전체길이 : "+testBigDecimal3.precision());

        BigDecimal testBigDecimal4=BigDecimal.valueOf(24.354654654);
        System.out.println("unscaledValue: " + testBigDecimal4.unscaledValue());
        System.out.println("정수부: "+testBigDecimal4.intValue());
        System.out.println("소수부 자리수: "+testBigDecimal4.scale());
        System.out.println("전체길이 : "+testBigDecimal4.precision());
    }
}
