package btcore.co.kr.observerpattern;

/**
 * Created by leehaneul on 2018-01-03.
 */

public interface Publisher {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObserver();
}
