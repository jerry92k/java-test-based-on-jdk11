import java.math.BigDecimal;
import java.math.BigInteger;

public class DobuleTest {
    public static void main(String[] args) {

        // long 값 범위 : -9223372036854775808 ~ 9223372036854775807
        long salary= 1_000_000_000_000_000_000L;
        double bonusRateDouble=0.15555555555553333;
        System.out.println(bonusRateDouble);

        BigDecimal bonusRateBigDecimal = new BigDecimal("0.155555555555566666");

        System.out.println(salary*bonusRateDouble); // 출력 : 1.55555555555566656E17
        System.out.println(bonusRateBigDecimal.multiply(BigDecimal.valueOf(salary))); // 출력 : 1.55555555555566666E17

    }
}
