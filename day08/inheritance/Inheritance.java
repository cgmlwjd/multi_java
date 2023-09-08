package day08.inheritance;
//상속성
public class Inheritance {

	public static void main(String[] args) {
		// Human객체 생성해서 이름,키값 주고  showInfo()호출하기
		Human h=new Human();
		h.name="홍길동";
		h.height=166;
		
		h.showInfo();//이름+키
		System.out.println("----");
		// Superman객체 생성해서 이름,키,초능력 값 주고  showInfo()호출하기
		Superman s1=new Superman("김슈퍼",177,500);
		s1.showInfo();//이름+키+초능력
		System.out.println("----");
		//Aquaman객체 생성
		Aquaman a1=new Aquaman("최인어",178,55.12);
		a1.showInfo();
		
		s1.showInfo("###슈퍼맨 정보####");
		
		String info=s1.showInfo("@@@슈퍼맨 정보@@@", 300);
		System.out.println(info);
		
		//다형성
		//부모 자식의 상속관계를 맺을 경우
		//부모타입 변수 = new 자식객체생성(); 
		//이때 부모타입의 변수로는 접근할 수 있는 변수나 메서드가 제한이 있다
		//[1] 부모가 물려준 변수,메서드는 접근 가능
		//[2] 그러나 오버라이드한 메서드가 있을 경우에는 자식의 오버라이드한 메서드를 적용한다
		//[3] 자식만이 갖는 고유한 변수나 메서드는 접근 할 수 없다.
		
		System.out.println("**********************");
		Human hs=new Superman("이슈퍼",168,900);
		System.out.println("hs.name: "+hs.name);
		System.out.println("hs.height: "+hs.height);
		//System.out.println("hs.power: "+hs.power); [x]
		hs.showInfo();
		
		//hs.showInfo("~~~~슈퍼맨 정보~~~~");//[x]
		
		System.out.println(((Superman)hs).power);
		((Superman)hs).showInfo("~~~슈퍼맨 정보~~~~");
		
		String a=((Superman)hs).showInfo("~~~슈퍼맨 정보~~~~",600);
		System.out.println(a);
		
		
		//Aquaman객체를 부모타입으로 선언해서 참조하도록 객체 생성후
		//name,speed
		//showInfo()호출해보기
		Human ha=new Aquaman("이생선",120,789.123);
		System.out.println(hs.name+"/"+ha.height);
		System.out.println(((Aquaman)ha).speed);
		
		ha.showInfo();
		
		
	}

}
