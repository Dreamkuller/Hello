//package up;

/**
 * Created by and on 25.10.16.
 */
import java.util.Arrays;

public class cmd {

    public static void main(String[] args) {

        //String a = Arrays.toString(args);
      //  String a = "qapaq";
        String arguments = "";
        for (int i = 0; i < args.length; i++) {

            String a = args[i];

            if (a.equals(reverse(a)))
                arguments = arguments + " palindrome ";
            else
                arguments = arguments + " " + reverse(a) + " ";
        }
        System.out.println(arguments);


    }


    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

}
