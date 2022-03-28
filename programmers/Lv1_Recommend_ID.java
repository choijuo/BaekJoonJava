package lv1;
public class Lv1_Recommend_ID {
	public String solution(String new_id) {
        String answer = "";
        
        answer=new_id.toLowerCase();//1 phase
        answer=answer.replaceAll("[^-_.a-z0-9]","");//2 phase
        answer=answer.replaceAll("[.]{2,}",".");//3 phase
        answer=answer.replaceAll("^[.]|[.]$","");//4 phase
        
        if(answer.equals("")){
            answer="a";
        }//5phase
        
        //6phase
        if(answer.length()>=16){
            answer=answer.substring(0,15);
            if(answer.substring(answer.length()-1).equals(".")){
                answer=answer.replaceAll("[.]$","");
            }                     
        }
        
        //7phase
        if(answer.length()<=2){
            while(answer.length()<3)
            answer+=answer.substring(answer.length()-1);
        }
        
        
        return answer;
    }
}
