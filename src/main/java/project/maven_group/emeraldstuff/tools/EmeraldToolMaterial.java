package project.maven_group.emeraldstuff.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {
    public static final EmeraldToolMaterial INSTANCE = new EmeraldToolMaterial();

    @Override
    public int getDurability () {
        return 1796;
    }

    @Override
    public float getMiningSpeedMultiplier () {
        return 9.0F;
    }

    @Override
    public float getAttackDamage () {
        return 5.0F;
    }

    @Override
    public int getMiningLevel () {
        return 3;
    }

    @Override
    public int getEnchantability () {
        return 25;
    }

    public Ingredient getRepairIngredient () {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
