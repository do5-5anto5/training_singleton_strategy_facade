package quinto_gof.singleton;

/**
 * 
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 * 
 * @author falvojr
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		private static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}
}
