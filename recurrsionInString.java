public class recurrsionInString {
    public static void main(String[] args) {
        String str="madama";
        // System.out.println(checkvowel(str));
    }
    public static String revString(String str){
        if(str.length()==0) {
            return "";
        }
        return revString(str.substring(1))+str.charAt(0);
    }
    public static boolean isPalin(String str){
    if(str.length() <= 1){          
        return true;
    }
    if(str.charAt(0) != str.charAt(str.length()-1)){
        return false;               
    }
    return isPalin(str.substring(1, str.length()-1));  
}
public static int countVowels(String str){
    if(str.length() == 0){
        return 0;                     
    }
    char ch = str.charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        return 1 + countVowels(str.substring(1));   
    }
    return countVowels(str.substring(1));           
}
public static String removeDup(String str, boolean seen[]){
    if(str.length() == 0) return "";
    char ch = str.charAt(0);
    if(seen[ch - 'a']){
        return removeDup(str.substring(1), seen);      
    }
    seen[ch - 'a'] = true;                             
    return ch + removeDup(str.substring(1), seen);     
}
public static String moveX(String str){
    if(str.length() == 0) return "";
    char ch = str.charAt(0);
    if(ch == 'x'){
        return moveX(str.substring(1)) + ch;    
    }
    return ch + moveX(str.substring(1));        
}
}