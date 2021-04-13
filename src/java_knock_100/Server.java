package java_knock_100;

import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 * @author takahiro.araki
 *リモートサーバーの実装クラスです。
 */
public class Server implements RandomNum {

	public Server() {
	}
	
	/**
	 *ランダムな文字列を取得します。
	 *@return ランダムな数字
	 */
	public int getRandomNum() {
		return new Random().nextInt();
	}

	public static void main(String[] args) {
		try {
			   System.out.println("------ Info -------");
			   String hostAddress = InetAddress.getLocalHost().getHostAddress();
			   System.out.println("Host Address(A)  : " + hostAddress);
			   System.out.println("ServerHostName(B): " + System.getProperties().getProperty(
			       "java.rmi.server.hostname"));
			   System.out.println("Host Name(C)     : " + InetAddress.getLocalHost().getHostName());
			   System.out.println("Host FQDN(C)     : " + InetAddress.getByName(hostAddress).getHostName());
			   System.out.println("LocalHostName?: " + System.getProperties().getProperty(
			       "java.rmi.server.useLocalHostName"));
			   System.out.println("------------------");
			   System.out.println(System.getProperty("java.class.path"));
			   
			//リモートオブジェクトの作成
			Server server = new Server();
			//リモート呼び出しができるように、Java RMIランタイムへオブジェクトをエクスポート
			RandomNum stub = (RandomNum) UnicastRemoteObject.exportObject(server,0);			
			//クライアントがリモートオブジェクトのスタブを取得できるように、レジストリにバインド
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("RandomNum", stub);
			System.out.println("Server ready");
		}catch (Exception e) {
			System.err.printf("Server Exception："+e.toString());
			e.printStackTrace();
		}

	}

}
