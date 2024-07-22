import java.util.*;

public class Josephus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder("<");

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result);

    }
    /*
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int K = sc.nextInt();

            Queue<Integer> q = new LinkedList<>();
            for (int i=1; i<=N; i++){
                q.add(i);
            }

            int[] ans = new int[N];
            for (int i=0; i<N; i++){
                for (int j=1; j<K; j++){
                    q.add(q.poll());
                }
                ans[i] = q.poll();
            }

            System.out.print("<");
            for (int i=0; i<ans.length; i++){
                if (i == ans.length-1) System.out.print(ans[i]);
                else System.out.print(ans[i] + ", ");
            }
            System.out.println(">");
            System.out.println();

        }
    */
}
