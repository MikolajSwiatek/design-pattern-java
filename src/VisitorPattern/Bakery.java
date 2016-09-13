package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Visitable> products;

    public void addResident(Visitable resident){
        getResidents().add(resident);
    }

    public void visit(Visitor visitor){
        for (Visitable resident : getResidents()) {
            resident.accept(visitor);
        }
    }

    private List<Visitable> getResidents(){
        if(products == null){
            products = new ArrayList<Visitable>();
        }

        return products;
    }
}
