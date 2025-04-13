public class stringContainsDigit {
    
    public static void main(String args[]){
        String str="hello123world";
        boolean containsDigit=false;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                containsDigit=true;
                break;
            }
        }
        if(containsDigit){
            System.out.println("String contains digit");
        }else{
            System.out.println("String does not contain digit");
        }
    }
}
