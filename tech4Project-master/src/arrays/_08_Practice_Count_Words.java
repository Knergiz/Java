package arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        int a = 0;
        String s2 = "Some countries I visited were Argentina, Belguim and malta";
        String[] words = s2.split(" ");
        for (int i = 0; i < words.length; i++){
            if (words[i].toLowerCase().charAt(0) == 'a'){
                a++;
            }
        }
        System.out.println(a);



    }
}
