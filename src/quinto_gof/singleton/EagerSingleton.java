package quinto_gof.singleton;

/**
 * @author falvojr
 * 
 * Singleton "apressado".
 * 
 */
public class EagerSingleton {
		
		private static EagerSingleton instance = new EagerSingleton();;
		
		private EagerSingleton() {
			super();
		}

		public static EagerSingleton getInstance() {
			return instance;
		}
	}