public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello, ") ;

        sb.append("world!");    

        String result = sb.toString();
        System.out.println(result);
    }
}
