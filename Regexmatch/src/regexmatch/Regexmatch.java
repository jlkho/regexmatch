package regexmatch;


public class Regexmatch {

    public static boolean isTrue(String str){
        return str.matches("[tT]rue");
    }
    public static void main(String[] args) {
        System.out.println(isTrue("True"));
    }
    
}
