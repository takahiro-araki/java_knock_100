package java_knock_100;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author takahiro.araki
 * クライアントから呼び出すリモートインターフェースです。
 */
public interface RandomNum extends Remote {
	
	int getRandomNum() throws RemoteException;
}
