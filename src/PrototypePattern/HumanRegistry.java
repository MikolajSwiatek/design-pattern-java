package PrototypePattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.List;

public class HumanRegistry{
    private Collection<Human> colections;

    public HumanRegistry() {
        colections = new ArrayList<>();
        loadDefaultData();
    }

    public Human createBasicHuman(String name) throws HumanToCloneNotFoundException{
        List<Human> streamHuman  = colections
                .stream()
                .filter(p -> p.getName().equals(name))
                .collect(Collectors.toList());

        if (streamHuman.size() != 1) {
            throw new HumanToCloneNotFoundException("Not found human to clone");
        }

        Human human = streamHuman
                .get(0);

        return human;
    }

    private void loadDefaultData() {
        Boy boy = new Boy();
        boy.setName("M");
        boy.setAge(24);

        Girl girl = new Girl();
        girl.setName("A");
        girl.setAge(20);

        colections.add(boy);
        colections.add(girl);
    }
}

