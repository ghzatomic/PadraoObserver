package br.com.caiopaulucci;

import java.util.Observable;

public class ObservableTest extends Observable{

	public void mudou(String mudanca){
		setChanged();
		notifyObservers(mudanca);
	}
	
}
