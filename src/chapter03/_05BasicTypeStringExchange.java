package chapter03;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-09 09:59
 */
public class _05BasicTypeStringExchange {
    public static void main(String[] args) {
        String2Basic();
        //Basic2String();

    }

    private static void Basic2String() {
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + "\t"+ s2 + "\t" + s3 +"\t"  + s4);

        System.out.println(s1 instanceof String);
        System.out.println(s2 instanceof String);
        System.out.println(s3 instanceof String);
        System.out.println(s4 instanceof String);
    }

    /**
     * 通过基本数据类型的包装类调用parseXX可以实现该功能
     */
    private static void String2Basic() {
        //如果是无法转换的字符串会报错java.lang.NumberFormatException: For input string: "123Hello"
        String s = "123";
        //把字符串“1” 转换为int类型
        int i = Integer.parseInt(s);
        byte b = Byte.parseByte(s);
        short ss = Short.parseShort(s);
        long l = Long.parseLong(s);
        double d = Double.parseDouble(s);
        float f = Float.parseFloat(s);
        System.out.println(i+"\t"+b+"\t"+ss+"\t"+l+"\t"+d+"\t"+f);

        char c1 = s.charAt(1);
        char c2 =(char) Character.codePointAt(s, 1);
        System.out.println("c1 = " + c2);
        System.out.println("c2 = " + c2);
    }
}
