public class StringBuildr {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
            // its not creating new object only changing the object hence taking less space 
        }
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    }
}
