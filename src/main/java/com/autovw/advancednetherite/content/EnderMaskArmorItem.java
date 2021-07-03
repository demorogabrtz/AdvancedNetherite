package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.config.Config;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

/**
 * Author: Autovw
 */
public class EnderMaskArmorItem extends ArmorItem {
    public EnderMaskArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
        super(material, slot, builder);
    }

    @Override
    public boolean isEnderMask(ItemStack stack, PlayerEntity player, EndermanEntity enderman) {
        return Config.ArmorConfig.emeraldEndermanPassiveArmor.get();
    }
}