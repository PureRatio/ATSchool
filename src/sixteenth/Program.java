package sixteenth;

public class Program {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Не передано название операции.");
            return;
        }

        if (args.length == 1){
            System.out.println("Не переданы числа для операции.");
            return;
        }

        int[] array = new int[args.length - 1];

        for (int i = 1; i < args.length; i++){
            try {
                array[i-1] = Integer.parseInt(args[i]);
            } catch (Exception e){
                System.out.printf("%s не число\n", args[i]);
                return;
            }
        }

        Program program = new Program();
        program.printArray(array);
        switch (args[0]){
            case "Half":
                array = program.applyFunction(array, new Half());
                break;
            case "Double":
                array = program.applyFunction(array, new Double());
                break;
            case "Exact":
                array = program.applyFunction(array, new Exact());
                break;
            case "Square":
                array = program.applyFunction(array, new Square());
                break;
            default:
                System.out.printf("Операция %s не поддерживается\n", args[0]);
                return;
        }
        program.printArray(array);
    }

    void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }
    int[] applyFunction(int[] arr, Function function){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = function.evaluate(arr[i]);
        }
        return result;
    }
}
