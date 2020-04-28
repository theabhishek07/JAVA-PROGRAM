public class string_methods {
    public static void main(String[] args) {
        String s="Github";
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.startsWith("Gi"));
        System.out.println(s.endsWith("ar"));
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        String s1="pull request on Github";
        System.out.println(s1);
        String replace=s1.replace("pull", "bash");
        System.out.println(replace);
    }
    
}
