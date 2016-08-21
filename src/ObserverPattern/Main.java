package ObserverPattern;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
        ClientObserver client1 = new ClientObserver("A1", null);
        ClientObserver client2 = new ClientObserver("A2", null);
        ClientObserver client3 = new ClientObserver("A3", null);

        ProductSubject product = new ProductSubject("P1", "T1", false);
        product.register(client1);
        product.register(client2);

        System.out.println(product.getObservers().size());

        product.register(client3);
        product.unregister(client2);

        System.out.println(product.getObservers().size());

        product.unregister(client3);

        System.out.println(product.getObservers().size());

        product.setIsExist(true);

        String tmpDate = client1.getLastUpdated() == null ?  "null" : client1.getLastUpdated().toString();

        System.out.println(tmpDate);

        tmpDate = client2.getLastUpdated() == null ?  "null" : client1.getLastUpdated().toString();

        System.out.println(tmpDate);

        tmpDate = client3.getLastUpdated() == null ?  "null" : client1.getLastUpdated().toString();

        System.out.println(tmpDate);

        product.notifyObservers();

        tmpDate = client1.getLastUpdated() == null ?  "null" : client1.getLastUpdated().toString();

        System.out.println(tmpDate);

        tmpDate = client2.getLastUpdated() == null ?  "null" : client1.getLastUpdated().toString();

        System.out.println(tmpDate);

        tmpDate = client3.getLastUpdated() == null ?  "null" : client1.getLastUpdated().toString();

        System.out.println(tmpDate);
    }

}