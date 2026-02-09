package Topics.Searching.Linearsearch;

public class StringSearch {
    public static void main(String[] args) {
        String str="Sunny";
       char target='u';
       boolean ans=StringMatch(str,target);
       System.out.println(ans);
    }
    static boolean StringMatch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int charat = 0; charat < str.length(); charat++) {
            char element=str.charAt(charat);
            if(element==target){
                return true;
            }
        }
        return false;
    }
}

