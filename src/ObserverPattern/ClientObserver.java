package ObserverPattern;

import java.util.Date;

public class ClientObserver implements Observer {
    private String name;
    private Date lastUpdated;

    public ClientObserver(String name, Date lastUpdated) {
        this.name = name;
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public void update() {
        lastUpdated = new Date();
    }

    @Override
    public String toString() {
        return "ClientObserver{" +
                "name='" + name + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
