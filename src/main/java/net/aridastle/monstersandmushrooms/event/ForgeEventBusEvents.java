package net.aridastle.monstersandmushrooms.event;

import net.aridastle.monstersandmushrooms.entity.custom.*;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;

@Mod.EventBusSubscriber(modid = monstersandmushrooms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusEvents {

    @SubscribeEvent
    public static void block_break(final BlockEvent.BreakEvent event){
        Block blockIn = event.getState().getBlock();
        BlockPos blockpos = event.getPos();
        Level level = (Level) event.getLevel();
        ResourceKey block_biome = event.getLevel().getBiome(blockpos).unwrapKey().get();
        int max = 99;
        int min = 0;
        int rand_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(rand_int < 2){
            if(blockIn == Blocks.DEEPSLATE || blockIn == Blocks.DEEPSLATE_COAL_ORE || blockIn == Blocks.DEEPSLATE_COPPER_ORE
                    || blockIn == Blocks.DEEPSLATE_DIAMOND_ORE || blockIn == Blocks.DEEPSLATE_EMERALD_ORE || blockIn == Blocks.DEEPSLATE_GOLD_ORE
                    || blockIn == Blocks.DEEPSLATE_IRON_ORE || blockIn == Blocks.DEEPSLATE_LAPIS_ORE || blockIn == Blocks.DEEPSLATE_REDSTONE_ORE){
                Gnome gnome_spawn = new Gnome(ModEntityTypes.GNOME.get(), level);
                gnome_spawn.setPos(blockpos.getX(), blockpos.getY(), blockpos.getZ());
                level.addFreshEntity(gnome_spawn);
            }
            else if (blockIn == Blocks.BROWN_MUSHROOM || blockIn == Blocks.BROWN_MUSHROOM_BLOCK || blockIn == Blocks.RED_MUSHROOM
                    || blockIn == Blocks.RED_MUSHROOM_BLOCK || blockIn == Blocks.MUSHROOM_STEM || blockIn == Blocks.SHROOMLIGHT
                    || blockIn == Blocks.CRIMSON_FUNGUS || blockIn == Blocks.WARPED_FUNGUS || blockIn == Blocks.WARPED_FUNGUS){
                Shroomster shroomster_spawn = new Shroomster(ModEntityTypes.SHROOMSTER.get(), level);
                shroomster_spawn.setPos(blockpos.getX(), blockpos.getY(), blockpos.getZ());
                level.addFreshEntity(shroomster_spawn);
            }
            else if (blockIn == Blocks.WHEAT || blockIn == Blocks.CARROTS || blockIn == Blocks.POTATOES || blockIn == Blocks.BEETROOTS
                    || blockIn == Blocks.PUMPKIN || blockIn == Blocks.MELON || blockIn == Blocks.SWEET_BERRY_BUSH || blockIn == Blocks.BAMBOO
                    || blockIn == Blocks.SUGAR_CANE || blockIn == Blocks.CHORUS_FLOWER || blockIn == Blocks.CACTUS){
                Bugsy bugsy_spawn = new Bugsy(ModEntityTypes.BUGSY.get(), level);
                bugsy_spawn.setPos(blockpos.getX(), blockpos.getY(), blockpos.getZ());
                level.addFreshEntity(bugsy_spawn);
            }
            else if (blockIn == Blocks.CHEST || blockIn == Blocks.ENDER_CHEST || blockIn == Blocks.TRAPPED_CHEST || blockIn == Blocks.BARREL
                    || blockIn == Blocks.HOPPER || blockIn == Blocks.FURNACE){
                Maggart maggart_spawn = new Maggart(ModEntityTypes.MAGGART.get(), level);
                maggart_spawn.setPos(blockpos.getX(), blockpos.getY(), blockpos.getZ());
                level.addFreshEntity(maggart_spawn);
            }
            else if ((blockIn == Blocks.STONE || blockIn == Blocks.COAL_ORE || blockIn == Blocks.COPPER_ORE || blockIn == Blocks.EMERALD_ORE
                    || blockIn == Blocks.DIAMOND_ORE || blockIn == Blocks.GOLD_ORE || blockIn == Blocks.IRON_ORE || blockIn == Blocks.LAPIS_ORE
                    || blockIn == Blocks.REDSTONE_ORE) && (block_biome == Biomes.JAGGED_PEAKS || block_biome == Biomes.FROZEN_PEAKS
                    || block_biome == Biomes.MEADOW || block_biome == Biomes.GROVE || block_biome == Biomes.SNOWY_SLOPES || block_biome == Biomes.STONY_PEAKS)){
                Avala avala_spawn = new Avala(ModEntityTypes.AVALA.get(), level);
                avala_spawn.setPos(blockpos.getX(), blockpos.getY(), blockpos.getZ());
                level.addFreshEntity(avala_spawn);
            }
        }

    }
}
