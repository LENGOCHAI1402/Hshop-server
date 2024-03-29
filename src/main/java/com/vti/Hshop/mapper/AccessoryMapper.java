package com.vti.Hshop.mapper;

import com.vti.Hshop.dto.AccessoryDto;
import com.vti.Hshop.entity.Accessory;
import com.vti.Hshop.form.AccessoryCreateForm;
import com.vti.Hshop.form.AccessoryUpdateForm;


public class AccessoryMapper {

    public static Accessory map(AccessoryCreateForm form) {
        var accessory = new Accessory();
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setRepairStatus(form.getRepairStatus());
        accessory.setStatusDamaged(form.getStatusDamaged());
        return accessory;
    }

    public static AccessoryDto map(Accessory accessory) {
        var dto = new AccessoryDto();
        dto.setId(accessory.getId());
        var carPk = accessory.getCar().getPk();
        dto.setName(accessory.getName());
        dto.setPrice(accessory.getPrice());
        dto.setRepairStatus(accessory.getRepairStatus());
        dto.setStatusDamaged(accessory.getStatusDamaged());
        dto.setRepairDate(carPk.getRepairDate());
        dto.setLicensePlate(carPk.getLicensePlate());
        return dto;
    }

    public static void map(AccessoryUpdateForm form, Accessory accessory) {
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setStatusDamaged(form.getStatusDamaged());
        accessory.setRepairStatus(form.getRepairStatus());
    }
}
