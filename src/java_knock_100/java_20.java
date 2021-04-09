package java_knock_100;

import java.util.ArrayList;
import java.util.List;

public class java_20 {

	private static final String[] MEDALS = new String[] { "GOLD", "SILVER", "BRONZE" };

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		List objectList = new ArrayList<>();
		for (String element : MEDALS) {
			stringList.add(element);
			objectList.add(element);
		}

		for (int i = 0; i < stringList.size(); i++) {
			System.out.println("ジェネリクスリスト検証" + i + "番目：" + stringList.get(i));
		}

		for (int i = 0; i < objectList.size(); i++) {
			System.out.println("ジェネリクスなしリスト検証" + i + "番目：" + objectList.get(i));
		}

	}
}