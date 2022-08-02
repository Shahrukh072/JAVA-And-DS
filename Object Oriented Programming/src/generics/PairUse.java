package generics;

public class PairUse {

	public static void main(String[] args) {
		Pair<String, Integer> pInner = new Pair<>("ab", 100);
 		Pair<Pair<String, Integer>, String> p = new Pair<>();
 		p.setFirst(pInner);
		System.out.println(p.getFirst());
		System.out.println(p.getFirst().getFirst());
		System.out.println(p.getFirst().getSecond());
		
//		p.setSecond("abc");
//		System.out.println(p.getSecond());
		
//		Pair<String, Integer> pSI = new Pair<String, Integer>("ab", 10);		
//		Pair<String> p = new Pair<>();
//		p.setFirst("abc");
//		System.out.println(p.getFirst() + " " + p.getSecond());
//		
////		Pair<Integer> p = new Pair<>(10, 20);
////		p.setFirst("aa");
////		p.setFirst(10);
////		
////		String f = (String) p.getFirst();
//		
////		System.out.println(p.getFirst() + " " + p.getSecond());
//		
////		PairString pS = new PairString("aa", "bb");
////        PairDouble pD = new  PairDouble("3.1", "7.2");
//		
//		Pair<String> pS = new Pair<String>("aa", "bb");
//		System.out.println(pS.getFirst() + " " + pS.getSecond());
//		pS.setFirst("xyz");
//		
//		Pair<Integer> pI = new Pair<Integer>(10, 20);
//		System.out.println(pI.getFirst() + " " + pI.getSecond());
//		
//		Pair<Double> pD;
//			pD =	new Pair<Double>(10.1, 20.6);
//		System.out.println(pD.getFirst() + " " + pD.getSecond());
//		
////		Pair<Vehicle> pV = new Pair<Vehicle>(new Vehicle(), new Vehicle());
		
		
	}

}
