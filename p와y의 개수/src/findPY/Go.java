package findPY;

public class Go {
	public static void main(String[] args) {
		Go go = new Go();
		System.out.println(go.solution("pyYPtrgdgwPYp"));
		// String 의 toLowerCase() 라는 메소드를 이용하여 파라미터 s의 내용을 모두 소문자로 바꾸고,
		// 각각 반복문 속에서 indexOf를 이용해 문자를 찾아 cnt변수를 올리고
		// 두 cnt 변수를 비교하여 반환함.
	}
	
	
	
	
	boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int whereY = s.indexOf("y");
        int whereP = s.indexOf("p");
        
        int cntY = 0;
        int cntP = 0;
        
        while(whereY!=-1) {
        	whereY = s.indexOf("y",whereY+1);
        	cntY++;
        }
        while(whereP!=-1) {
        	whereP = s.indexOf("p",whereP+1);
        	cntP++;
        }
        
        if(cntY!=cntP) {
        	answer = false;
        }

        return answer;
    }
}
