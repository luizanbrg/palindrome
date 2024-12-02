public class Main {

    public static boolean palindrome(String pal){
        String newSentence = pal.replace(" ", "").replace(",", "").replace(".","").replace("?", "").toLowerCase();
        int indexNumber = newSentence.length();

        int left = 0;
        int right = indexNumber - 1;

            while (left < right){
                if ((newSentence.charAt(left)) != (newSentence.charAt(right))){
                    System.out.println("ce n'est pas un palindrome");
                    return false;
                }
                left++;
                right--;
            }
            System.out.println(("c'est un palindrome"));
            return true;
    }


    public static void main(String[] args) {

        palindrome("Never a foot too far, even.");
        palindrome("Straw? No, too stupid a fad. I put soot on warts.");
        palindrome("Now do I repay a period won.");
        palindrome("Now do I repay a won.");
    }
}