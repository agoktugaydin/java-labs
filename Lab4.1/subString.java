public class subString {
    public static void main(String[] args) {
        String str = "Java Programlama Dersi Fall 2012";
        int first = str.indexOf("P");
        int last = str.indexOf("F");
        String istenenString = str.substring(first, last);
        System.out.println(istenenString);
    }   
}
