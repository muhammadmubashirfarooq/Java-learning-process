public class recurrsionInString {
    public static void main(String[] args) {
        String str="madama";
        System.out.println(revString(str));
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