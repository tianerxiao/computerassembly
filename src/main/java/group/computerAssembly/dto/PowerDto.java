package group.computerAssembly.dto;

import group.computerAssembly.entity.Power;
import group.computerAssembly.entity.PowerDetail;

public class PowerDto {
    private Power power;
    private PowerDetail powerDetail;

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public PowerDetail getPowerDetail() {
        return powerDetail;
    }

    public void setPowerDetail(PowerDetail powerDetail) {
        this.powerDetail = powerDetail;
    }
}
