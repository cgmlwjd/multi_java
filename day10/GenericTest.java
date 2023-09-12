package day10;

class Truck<T1, T2>{
	T1 weight;
	T2 distance;
	
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
	
	
}///////////////////

public class GenericTest {

	public static void main(String[] args) {
		Truck  t1=new Truck();
		Truck<Double, Integer> t2=new Truck<>();
		t2.weight=2.5;
		t2.distance=5000;
		
		System.out.println(t1);
		System.out.println(t2);
		
		Truck<String, Float> t3=new Truck<>();
		t3.weight="5.0";
		t3.distance=2500.5f;
		System.out.println(t3);

	}

}
