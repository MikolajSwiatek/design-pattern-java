package ObserverPattern;

import java.util.ArrayList;

public class ProductSubject implements Subject {
    private String name;
    private String type;
    private boolean isExist;
    private ArrayList<Observer> observers;

    public ProductSubject(String name, String type, boolean isExist) {
        super();
        this.name = name;
        this.type = type;
        this.isExist = isExist;
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("notifyObservers");
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isExist() {
        return isExist;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setIsExist(boolean isExist) {
        this.isExist = isExist;

        if (this.isExist)
            notifyObservers();
    }

    @Override
    public String toString() {
        return "ProductSubject{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isExist=" + isExist +
                ", observers=" + observers +
                '}';
    }
}
