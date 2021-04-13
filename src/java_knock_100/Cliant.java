package java_knock_100;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliant {
	
	private Cliant() {}

	public static void main(String[] args) {
		String host = (args.length <1) ? null :args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			RandomNum stub = (RandomNum)registry.lookup("RandomNum");
			int response = stub.getRandomNum();
			System.out.println("response is :"+response);
		}catch (Exception e) {
			System.err.println("Client Exception"+ e.toString());
			e.printStackTrace();
		}

	}

}
