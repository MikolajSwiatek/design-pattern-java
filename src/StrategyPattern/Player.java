package StrategyPattern;

public class Player {
    private String fullname;
    private int age;
    private long contractExpire;

    public Player(String fullname, int age, long contractExpire) {
        this.fullname = fullname;
        this.age = age;
        this.contractExpire = contractExpire;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public long getContractExpire() {
        return contractExpire;
    }
}
