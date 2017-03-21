package br.com.caiopaulucci;

public class Main {

	public static void main(String[] args) {
		ObservableTest observable =  new ObservableTest();
		
		ObserverTest obs1 = new ObserverTest();
		ObserverTest obs2 = new ObserverTest();
		ObserverTest obs3 = new ObserverTest();
		
		observable.addObserver(obs1);
		observable.addObserver(obs2);
		observable.addObserver(obs3);
		
		observable.mudou("MSG DO OBSERVABLE");
		System.out.println("Acabou");

		
	}
	
}
