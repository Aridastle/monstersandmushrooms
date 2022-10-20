package net.aridastle.monstersandmushrooms.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MONSTERSANDMUSHROOMS_TAB = new CreativeModeTab("monstersandmushroomstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGIC_MUSHROOM.get());
        }
    };
}
