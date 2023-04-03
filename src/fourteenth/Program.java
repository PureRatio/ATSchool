package fourteenth;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Program {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("0 argumentov");
            return;
        }
        Program obj = new Program();

        obj.printArray(args);
        System.out.println();
        obj.printArray(obj.findDistinction(args));
    }

    public String[] findDistinction(String[] args){
        List<String> arr = new ArrayList<String>();
        for (String str1 : args){
            if(!arr.contains(str1))
                arr.add(str1);
        }

        String[] result = new String[arr.size()];
        return arr.toArray(result);
    }

    public void printArray(String[] strs) {
        StringJoiner sj = new StringJoiner(" ");
        for(var str : strs) {
            sj.add(str);
        }
        System.out.print(sj.toString());
    }
}