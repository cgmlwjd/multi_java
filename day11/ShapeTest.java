package day11;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	public static void main(String[] args) {
		System.out.println("여러 도형의 면적을 구합니다~");
		System.out.printf("가로: %d, 세로: %d인 도형 면적---\n", 12, 10);
		//사각형 객체 생성해서 area() 호출
		Rectangle rt = new Rectangle();
		rt.area(12, 10);
		
		//직삼각형 객체 생성해서 area() 호출
		Triangle tr = new Triangle();
		tr.area(12, 10);
		
		//원 객체 생성해서 area() 호출하기
		Circle cr = new SubCircle();
		cr.area(12, 10);
		((SubCircle)cr).area(12);
		
		//Shape sp = new Shape();
		Shape sp = new Rectangle();
		sp.area(8, 5);
		
		SubCircle sc = new SubCircle();
		sc.area(8);
		
		//rt, tr, cr, sp, sc를 저장할 배열을 생성하고 저장한 후 반복문 돌려서 면적 출력하세요
		//20, 30
		//반지름: 20
		
		Shape[] arr = {rt, tr, cr, sp, sc};
		for(Shape sh:arr) {
			System.out.println("----------------------");
			if(sh instanceof SubCircle) {
				((SubCircle)sh).area(20);
			} else {
				sh.area(20, 30);
			}
		}
		
		((SubCircle)arr[4]).area(20);
		
		List<Shape> list = new ArrayList<>();
		list.add(rt);
		list.add(tr);
		list.add(cr);
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i);
			Shape obj = list.get(i);
			System.out.println("*****************");
			if(obj instanceof SubCircle) {
				((SubCircle)obj).area(4);
			} else {
				obj.area(4, 9);

			}
		}
	}

}
