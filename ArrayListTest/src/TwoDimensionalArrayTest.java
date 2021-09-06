public class TwoDimensionalArrayTest {
    public static void main(String[] args) {

        System.out.println("-- 참조 배열만 선언 --");

        int[][] arr=new int[3][];
        System.out.println("arr : "+arr); // 타입과 참조하는 배열의 시작 메모리 주소 확인 가능
// [[I@ => int배열에 대한 배열
        System.out.println("arr[0] :" +arr[0]+", arr[1] : "+arr[1]+", arr[2] : "+arr[2]);
// 각 원소가 참조할 int배열이 할당되지 않았으므로 null 출력
        System.out.println();

        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];

        System.out.println("-- 각 참조에 int 배열 할당 후 --");
        System.out.println("arr[0] :" +arr[0]+", arr[1] : "+arr[1]+", arr[2] : "+arr[2]); // 각 참조의 타입과 가리키는 배열의 시작 메모리 주소 출력
        System.out.println("arr[0] class :" +arr[0].getClass()+", arr[1] class : "+arr[1].getClass()+", arr[2] class : "+arr[2].getClass());
        System.out.println();

// 새로운 1차원 배열을 메모리에 할당하여 arr[0]의 참조를 변경.
        arr[0]=new int[10];

//메모리 주소가 바뀐것 확인
        System.out.println("-- arr[0] 이 가리키는 참조 메모리 주소 바뀜 --");
        System.out.println("arr[0] :" +arr[0]);
    }
}
