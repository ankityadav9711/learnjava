package string;

  class StringMethod {
    static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(2));
        System.out.println(s.startsWith("J"));
        System.out.println(s.endsWith("g"));
        String s1 = "  ankit   ";
        String s2 = "Ankit";
        System.out.println(s1.contains("n"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("n"));
        System.out.println(s1.repeat(10));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(3));
        System.out.println(s1.trim());

        String s3 = "Java Python Datascience";
        String [] arr = s3.split(" ");
        for(String x: arr)
        {
            System.out.println(x);
        }
    }
}
