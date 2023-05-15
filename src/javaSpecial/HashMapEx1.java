package javaSpecial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ȫ�浿", 90);
		map.put("��ö��", 80);
		map.put("�̿���", 70);
		map.put("����ȣ", 36);
		map.put("�����", 7);
		System.out.println("�� �ڷ�� : "+map.size());
		System.out.println(map.get("�����"));
		System.out.println(map.get(7));
		map.remove("��ö��");
		//HashMap �����͸� keyset�޼��� ó��
		/*Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}*/
		//HashMap �����͸� entrySet�޼��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator(); 
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
