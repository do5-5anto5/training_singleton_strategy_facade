package application;

import quinto_gof.singleton.EagerSingleton;
import quinto_gof.singleton.LazySingleton;
import quinto_gof.singleton.SingletonLazyHolder;
import quinto_gof.strategy.AggressiveBehavior;
import quinto_gof.strategy.Behavior;
import quinto_gof.strategy.DefensiveBehavior;
import quinto_gof.strategy.NormalBehavior;
import quinto_gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Testing Singleton design pattern:

		LazySingleton lazy = LazySingleton.getInstance();
		System.out.println(lazy);
		lazy = LazySingleton.getInstance();
		System.out.println(lazy);
		
		EagerSingleton eager = EagerSingleton.getInstance();
		System.out.println(eager);
		eager = EagerSingleton.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		
		// Testing Strategy design pattern:
		
		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		Robo robo = new Robo();
		robo.setBehavior(normal);
		robo.move();
		robo.move();
		robo.setBehavior(defensive);
		robo.move();
		robo.setBehavior(aggressive);
		robo.move();
		robo.move();
		robo.move();
	}

}
