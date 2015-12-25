package home.seven.spring.form.validating;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class OtherTest {
	public static void main(String[] args) {
		String a = "abc";
		String c = a + "d";
		String b = new String("abcd");
		String d = new String("abcd");
		//对于Object子类没有实现equals的，== 比较的是值，equals比较的是地址
		//String 重写了equals ==比较的是地址，equals比较的是值
		System.out.println(d == b);
		System.out.println(b.equals(c));
		System.out.println(d.equals(b));
		System.out.println(Math.max((int) (10/.75f) + 1, 16));
		Map<String, String> map = new LinkedHashMap<String, String>(1,0.9f);
		map.put("code", "sxq");
		map.put("co1de", "sx1q");
		Random random = new Random();
		for(int i = 0 ; i < 10000 ; i ++){
			map.put(i+"",String.valueOf((char) (65 + random.nextInt(26))));
		}
		System.out.println(map.size());
		System.out.println(map);
	}
}
