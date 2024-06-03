import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        solution(arrA, arrB);
    }

    public  static void solution(int[] arrA, int[] arrB){
        int[] arrC = new int[arrA.length + arrB.length];
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] += arrA[i];
        }
        for (int i = arrA.length; i < arrA.length + arrB.length; i++){
            arrC[i] += arrB[i - arrA.length];
        }

        Arrays.sort(arrC);

        System.out.println(Arrays.toString(arrC));
    }
}
