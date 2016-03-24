package idv.ezbins;

public interface Subject {
	public void registerObserver(Observer o);
	public void remvoeObserver(Observer o);
	public void notifyObservers();
}
