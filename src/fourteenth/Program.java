package fourteenth;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("0 argumentov");
            return;
        }
        printArray(args);
        System.out.println();
        printArray(findDistinction(args));
    }

    public static String[] findDistinction(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        for (String str1 : args){
            if(!arr.contains(str1))
                arr.add(str1);
        }

        String[] result = new String[arr.size()];
        return arr.toArray(result);
    }

    public static void printArray(String[] strs) {
        for(var str : strs) {
            System.out.print(str + " ");
        }
    }
}