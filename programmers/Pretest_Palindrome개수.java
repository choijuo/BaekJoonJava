
public class Pretest_Palindrome°³¼ö {

	private boolean check(String str){
		boolean isPalindrome=true;
	    
	    for(int i=0;i<str.length()/2;i++){
	    	if(str.charAt(i)!=str.charAt(str.length()-i-1)){
	          isPalindrome=false;
	          break;
	        }
	    }
	    return isPalindrome;
	}
	public int solution(int n,int m){
		int answer=0;
	    
	    for(int i=n;i<=m;i++){
	    	String num=Integer.toString(i);
	        if(check(num)==true)
	        	answer++;
	    }
	    return answer;
	}


}
