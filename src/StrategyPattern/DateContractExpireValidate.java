package StrategyPattern;

import java.util.Date;

public class DateContractExpireValidate implements PlayerValidator {

    @Override
    public boolean validate(Player player) {
        long now = new Date().getTime();

        if (player.getContractExpire() > now) {
            return false;
        }

        return true;
    }
}
