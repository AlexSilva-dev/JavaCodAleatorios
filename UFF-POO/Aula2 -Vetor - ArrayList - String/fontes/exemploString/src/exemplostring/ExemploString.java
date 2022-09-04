package exemplostring;

public class ExemploString {

    public static void main(String[] args) {
        String s1 = "Ana";
        String s2 = "Ana";

        if (s1 == s2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferente");
        }

        String s3 = new String("Ana");
        if (s1 == s3) {
            System.out.println("iguais");
        } else {
            System.out.println("diferente");
        }

        String s4 = "Ana";
        if (s1.equals(s4)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferente");
        }

    }

}
