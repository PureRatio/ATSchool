package eleventh;

public class SecondTask {
    public static void main(String[] args) {
        String path = args[0];
        String slash1 = "/";
        String slash2 = "\\";
        String slash = "";
        String result;

        if(path.contains(slash1) == path.contains(slash2)){
            System.out.println("Это вообще не путь");
            return;
        }

        if(path.contains(slash1)){
            slash = slash1;
        } else if(path.contains(slash2)){
            slash = slash2;
        }

        int i = path.lastIndexOf(slash);
        result = path.substring(i+1);
        if(result.equals("")){
            System.out.println("Введен некорректный путь до файла.");
            return;
        }
        path = path.substring(0, i+1);
        System.out.printf("Путь: %s \nИмя файла: %s", path, result);
    }
}
