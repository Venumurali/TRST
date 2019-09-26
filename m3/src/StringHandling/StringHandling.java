/**
 * Given an array of Strings, convert each string of the array into 
 * lower case String and then return the array. 
 * 
 * Input : {"Hello", "Hi"}
 * Output : {"hello", "hi"}
 * 
 * @author Siva Sankar
 */
package StringHandling;
public class StringHandling {

    /**
     * This method returns the array of lower case strings.
     * @param arr, the input array.
     * @return the array of lower case Strings based on the input parameter.
     */
    public static String[] lower(String[] arr) {
        //  your code goes here....
        int i;
        if(arr.length>0){
        String [] result=new String[arr.length];
        for(i=0;i<arr.length;i++){
            result[i]=arr[i].toLowerCase();
        }
        return result;
    }
    else{
        return arr;
    }
}
}