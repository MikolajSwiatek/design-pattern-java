package PrototypePattern;

abstract class Human {
    protected String name;
    protected int age;

    public Human clone() {
        Human clonedItem = null;

        try {
          clonedItem = (Human) super.clone();
          clonedItem.setName(name);
          clonedItem.setAge(age);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedItem ;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
