package java_knock_100;

public class java_18 {

	private static Object object;

	public enum java18 {
		RAT("ネズミ", 1), COW("牛", 2);

		private final String name;
		private final int id;

		java18(String name, int id) {
			this.name = name;
			this.id = id;
		}

		public static java18 findByName(String name) {
			for (java18 java : java18.values()) {
				if (java.name.equals(name)) {
					return java;
				}
			}
			return null;
		}

		public static java18 findById(int id) {
			for (java18 java : java18.values()) {
				if (java.id == id) {
					return java;
				}
			}
			return null;
		}

	}

	public static void main(String[] args) {
		java18 name = java18.findByName("牛");
		java18 id = java18.findById(1);
		System.out.println("最初は：" + name + "最後は" + id);
	}
}