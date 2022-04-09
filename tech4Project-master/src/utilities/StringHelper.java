package utilities;

public class StringHelper {

    public static String getMiddle(String str){
        return (str.length() % 2 == 0)  ? "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2) : "" ;
    }

    // find duplicate elements in a array
    public static String findDuplicates(String[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[i].equals(array[j])){
                    System.out.println(array[i]);
                    break;
                }
            }
        }
        return "yay";
    }

    //find most repeated element in array
    public static String findMostRepeated(String[] array){
        int count = 0;
        int count2 = 0;
        String mostRepeated = "";
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])){
                    count2 += 1;
                }
            }
            if (count2 > count){
                count = count2;
                mostRepeated = array[i];
            }
        }
        System.out.println(mostRepeated);
        return "String";
    }












}
