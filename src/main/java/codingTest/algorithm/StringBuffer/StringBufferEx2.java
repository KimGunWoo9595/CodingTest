package codingTest.algorithm.StringBuffer;

public class StringBufferEx2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);

        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);


        System.out.println("sb = " + sb);// 0123456789.0
        System.out.println("sb2 = " + sb2);// 0123456789.0
        System.out.println("sb3 = " + sb3);// 0123456789.0
    }



}
