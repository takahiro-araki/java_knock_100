package java_knock_100;

import java.util.Properties;

public class java_01 {

 public static void main(String[] arg){
    System.out.println("こんにちは、世界");
 	Properties prop = System.getProperties();
 	for(Object key : prop.keySet()){
 		System.out.println(key + "=" + prop.get(key));
 	
 	}
 }

}