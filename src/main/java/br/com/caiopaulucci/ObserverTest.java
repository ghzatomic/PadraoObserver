package br.com.caiopaulucci;

import java.util.Observable;
import java.util.Observer;

public class ObserverTest implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println(arg);
	}
	
}
