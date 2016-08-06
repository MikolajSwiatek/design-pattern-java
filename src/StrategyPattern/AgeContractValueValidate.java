package StrategyPattern;

public class AgeContractValueValidate implements PlayerValidator {

    @Override
    public boolean validate(Player player) {
        if (player.getAge() < 18) {
            return false;
        }

        return true;
    }
}
