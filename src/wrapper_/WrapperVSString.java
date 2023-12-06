package wrapper_;

/**
 * @author liushuo
 * @version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer) -> String
        Integer i = 100; //自动装箱
        //方式1
        String str1 = i + "";

        //方式2
        String str2 = i.toString();
        System.out.println(str2);
        //方式3
        String str3 = String.valueOf(i);

        //方式4.
        String str4 = String.valueOf(i);
        System.out.println(str4);


        //String => Integer
        String k = "200";
        //方式1
        Integer k2 = Integer.parseInt(k);
        //方式2
        Integer k3 = new Integer(k);

        System.out.println("ok~");




    }
}
