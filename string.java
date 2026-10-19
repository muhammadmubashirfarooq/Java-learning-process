public class string {

    public static void main(String[] args) {
        String str="programming";
        System.out.println("The count of vowel in the str is "+ countVowel(str));
        System.out.println("The reverse of str is " + reverse(str));
        System.out.println(ispalindrome("madam"));
        System.out.println("The count of char is " + countChar(str , 'm'));
        System.out.println("hello: " + ispalindrome("hello"));       // false
        System.out.println(countVowel("education"));                // 5
        System.out.println(countChar("banana", 'a'));                // 3
        System.out.println(countVowel("Apple"));    
    }
    public static int countVowel(String s){
        int count=0;
        s = s.toLowerCase();
        for(int i=0 ; i<s.length() ; i++ ){
            char ch = s.charAt(i);
            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count+=1;
            }
            }
        return count;
        }
    public static String reverse(String s){
        String result = "";
        for (int i = s.length()-1 ; i>=0 ; i--) {

            result = result + s.charAt(i);

            }
        return result ;

    }   
    public static boolean ispalindrome(String s){
        return s.equals(reverse(s));
    }
    public static int countChar(String s , char c){
        int count = 0;
        for (int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==c){
                count+=1;
            }
        }
        return count;
    }
}