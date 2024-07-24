package 문제;

import java.util.*;

public class Editer {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        String first = sc.nextLine();
        int count = sc.nextInt();
        int cursor = first.length();
        int length = first.length();
        sc.nextLine();

        for (int i = 0; i < length; i++){
            stack.add(first.substring(i, i+1));
        }

        for (int i = 0; i < count; i++){
            String command = sc.next();
            if (command.equals("L")){

                if (cursor == 0){
                    continue;

                }else{
                    cursor -= 1;
                }
            }else if (command.equals("D")){
                if (cursor == length){
                    continue;

                }else {
                    cursor += 1;
                }
            }else if (command.equals("B")){
                if (cursor == 0 || stack.empty()){
                    continue;

                }else{
                    stack.remove(cursor-1);
                    cursor -= 1;
                    length -= 1;
                }
            }else if (command.equals("P")){
                String add = sc.next();
                stack.add(cursor,add);
                cursor += 1;
                length += 1;
            }
        }
        for (int i = 0; i < length; i++){
            System.out.print(stack.get(i));
        }
    }
}
