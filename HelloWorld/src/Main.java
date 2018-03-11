//import com.sun.org.apache.xpath.internal.operations.String;

import org.dy.test.*;

import java.net.InetAddress;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws IllegalAccessException {
        //数组去重方法五
        String[] array = {"a","b","c","c","d","e","e","e","a"};
        Set<String> set = new HashSet<>();
        for(int i=0;i<array.length;i++){
            set.add(array[i]);
        }
        String[] arrayResult = (String[]) set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(array));
    }
}