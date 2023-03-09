package project.maven_group.emeraldstuff;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import project.maven_group.emeraldstuff.armor.EmeraldArmorMaterial;
import project.maven_group.emeraldstuff.tools.EmeraldAxeItem;
import project.maven_group.emeraldstuff.tools.EmeraldHoeItem;
import project.maven_group.emeraldstuff.tools.EmeraldPickaxeItem;
import project.maven_group.emeraldstuff.tools.EmeraldToolMaterial;

public class RegisterItems {
    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new EmeraldArmorMaterial();
    public static final Item EMERALD_HELMET = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item EMERALD_LEGGINGS = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item EMERALD_BOOTS = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());
    public static final ToolItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static final ToolItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings());
    public static final ToolItem EMERALD_PICKAXE = new EmeraldPickaxeItem(EmeraldToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static final ToolItem EMERALD_AXE = new EmeraldAxeItem(EmeraldToolMaterial.INSTANCE, 4.0F, -2.9F, new Item.Settings());
    public static final ToolItem EMERALD_HOE = new EmeraldHoeItem(EmeraldToolMaterial.INSTANCE, -4, 0.0F, new Item.Settings());

    public static void register () {
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_boots"), EMERALD_BOOTS);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_axe"), EMERALD_AXE);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_shovel"), EMERALD_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("emerald_stuff", "emerald_hoe"), EMERALD_HOE);
    }
}
