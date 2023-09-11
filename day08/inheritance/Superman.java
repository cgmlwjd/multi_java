package day08.inheritance;
//Overriding : 재정의
//부모로 부터 상속받은 메서드를 다시 정의해서 구성하는 것
/* [규칙]
 * 	- 부모의 메서드와 이름을 동일하게
 *  - 매개변수도 부모의 것과 동일하게
 *  - 반환타입도 부모와 동일하게
 *  - 메서드 몸체-내용은 다르게 구성하는 것
 *  - 접근제한자는 부모와 동일하거나 부모의 접근 제한자보다
 *  	범위가 더 넓은 범위 사용 가능
 *  - Exception 은 부모와 동일하거나 더 구첵적인 예외를 발생시킬 수 있다
 * 
 * */
//상속관계는 "is a"관계가 성립되어야 한다
//Superman is a Human [o]
//Superman is a CoffeeMachine [x]
/*******************************************
 * super => 부모로 부터 상속받은 것을 접근할 때 사용하는 키워드
 * - super.변수
 * - super.메서드()
 * - super(): 부모 생성자
 *    
 * */
public class Superman extends Human 
{
	int power;
	
	public Superman(String n, int h, int p) {
		super.name=n;
		super.height=h;
		this.power=p;
	}
	
	@Override //annotation
	public void showInfo() {
		super.showInfo();//이름, 키
		//System.out.println("이 름: "+name);
		//System.out.println("키  : "+height);
		System.out.println("초능력: "+power);
	}

	//Overload
	public void showInfo(String title) {
		System.out.println(title);
		//이름, 키, 초능력
		this.showInfo();
	}
	//showInfo() 오버로드 하기
	public String showInfo(String title, int upPower){
		String str=title+"\n";
		str+="이름 : "+name+"\n키: "+height+"\n초능력: "+power;
		str+=">>>초능력 UP: "+upPower+"<<<\n";
		power+=upPower;
		str+="현재 초능력: "+power;
		return str;
	}
	
}/////////////////////

