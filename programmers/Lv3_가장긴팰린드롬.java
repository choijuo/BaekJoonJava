package lv3;

public class Lv3_가장긴팰린드롬 {
	

	public boolean isPalindrome(String s,int start,int end){
        int len=end-start;
        for(int i=0;i<len/2;i++){
            if(s.charAt(i+start)!=s.charAt(end-1-i)){
                return false;
            }
        }
        return true;
    }

    public int solution(String s)
    {
        

        for(int len=s.length();len>1;len--){
            for(int i=0;i+len<=s.length();i++){
                if(isPalindrome(s,i,i+len)){
                    return len;
                }
            }
        }

        return 1;
    }

}
