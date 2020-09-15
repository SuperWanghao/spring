package hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring
 * @description: hashMap 原理分析 jdk 1.8
 * @author: wanghao
 * @create: 2020-09-15 11:04
 **/
public class HashMapAnalysis {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(16);
		map.put("wanghao", 222);
		map.put("test", 222);
		int age = Integer.valueOf((Integer) map.get("wanghao"));
		System.out.println(age);
	}
}
    
