import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(formatName("naglis"));
        System.out.println(assertEquals(formatName("NAGLIS"), "Naglis"));
        System.out.println(assertEquals(formatName("nAGLIS"), "Naglis"));
        System.out.println(assertEquals(formatName("naglis"), "Naglis"));


    }

    public static String formatName(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();//suformatuotas Namecase
    }

    public static boolean assertEquals(String actual, String expected){
        return actual.equals(expected);
    }



}