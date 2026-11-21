package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
 public static void main(String[] args) {
	List<String> langs = Arrays.asList("JS", "PHP", "C++");
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
	
	String ultimaLinguagem1 = (String) ListaUtil.getUtil1(langs);
	System.out.println(ultimaLinguagem1);
	
	Integer ultimaInteiro1 = (Integer) ListaUtil.getUtil1(nums);
	System.out.println(ultimaInteiro1);
	
	
	String ultimaLinguagem2 =  ListaUtil.getUtil2(langs);
	System.out.println(ultimaLinguagem2);
	
	Integer ultimaInteiro2 = ListaUtil.getUtil2(nums);
	System.out.println(ultimaInteiro2);
}
}
