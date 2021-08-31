package make1;

public class Go {
	public static void main(String[] args) {
		Go go = new Go();
		System.out.println(go.solution(626331));
		// 626331 이라는 수는 아래 메소드로 계산을 이어가다보면 오버플로우가 나기때문에 음수로 변하여 488이란 숫자가 반환됨.
		// num을 long으로 변환해 오버플로우를 방지함.
		// 오버플로우란 변수의 최대치(최대 바이트 수)를 넘었을때 부호비트가 변환되거나 하여 값이 이상하게 되는것.
	}
	
	
	
	
	
	public int solution(int num) {
        int answer = 0;
        long num1 = num;
        while(true){
            if(num1==1) {
               break;
			}
             if(answer==500){
                answer = -1;
                break;
            }
             answer++;
            if(num1%2==0){
                num1 = num1/2;    
            }else{
                num1 = num1*3+1;
            }
        }
        return answer;
    }
}
