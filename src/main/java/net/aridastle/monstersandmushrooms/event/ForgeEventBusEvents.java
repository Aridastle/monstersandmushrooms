package net.aridastle.monstersandmushrooms.event;

import net.aridastle.monstersandmushrooms.entity.custom.*;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
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
            if(blockIn.defaultBlockState().is(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE) || blockIn == Blocks.DEEPSLATE_COAL_ORE || blockIn == Blocks.DEEPSLATE_COPPER_ORE
                    || blockIn == Blocks.DEEPSLATE_DIAMOND_ORE || blockIn == Blocks.DEEPSLATE_EMERALD_ORE || blockIn == Blocks.DEEPSLATE_GOLD_ORE
                    || blockIn == Blocks.DEEPSLATE_IRON_ORE || blockIn == Blocks.DEEPSLATE_LAPIS_ORE || blockIn == Blocks.DEEPSLATE_REDSTONE_ORE){
                Gnome gnome_spawn = new Gnome(ModEntityTypes.GNOME.get(), level);
                gnome_spawn.setPos(blockpos.getX()+0.5, blockpos.getY(), blockpos.getZ()+0.5);
                level.addFreshEntity(gnome_spawn);
                BlockPos block_temp = blockpos;
                for(double i = gnome_spawn.getBoundingBox().minX; i <= gnome_spawn.getBoundingBox().maxX; i++){
                    for(double j = gnome_spawn.getBoundingBox().minY; j <= gnome_spawn.getBoundingBox().maxY; j++) {
                        for (double k = gnome_spawn.getBoundingBox().minZ; k <= gnome_spawn.getBoundingBox().maxZ; k++) {
                            block_temp = new BlockPos(i, j, k);
                            level.destroyBlock(block_temp, true, gnome_spawn);
                        }
                    }
                }
            }
            else if (blockIn == Blocks.NETHER_WART_BLOCK || blockIn == Blocks.NETHER_WART|| blockIn == Blocks.BROWN_MUSHROOM || blockIn == Blocks.BROWN_MUSHROOM_BLOCK || blockIn == Blocks.RED_MUSHROOM
                    || blockIn == Blocks.RED_MUSHROOM_BLOCK || blockIn == Blocks.MUSHROOM_STEM || blockIn == Blocks.SHROOMLIGHT
                    || blockIn == Blocks.CRIMSON_FUNGUS || blockIn == Blocks.WARPED_FUNGUS || blockIn == Blocks.WARPED_FUNGUS){
                Shroomster shroomster_spawn = new Shroomster(ModEntityTypes.SHROOMSTER.get(), level);
                shroomster_spawn.setPos(blockpos.getX()+0.5, blockpos.getY(), blockpos.getZ()+0.5);
                level.addFreshEntity(shroomster_spawn);
                BlockPos block_temp = blockpos;
                for(double i = shroomster_spawn.getBoundingBox().minX; i <= shroomster_spawn.getBoundingBox().maxX; i++){
                    for(double j = shroomster_spawn.getBoundingBox().minY; j <= shroomster_spawn.getBoundingBox().maxY; j++) {
                        for (double k = shroomster_spawn.getBoundingBox().minZ; k <= shroomster_spawn.getBoundingBox().maxZ; k++) {
                            block_temp = new BlockPos(i, j, k);
                            level.destroyBlock(block_temp, true, shroomster_spawn);
                        }
                    }
                }
            }
            else if (blockIn == Blocks.WHEAT || blockIn == Blocks.CARROTS || blockIn == Blocks.POTATOES || blockIn == Blocks.BEETROOTS
                    || blockIn == Blocks.PUMPKIN || blockIn == Blocks.ATTACHED_PUMPKIN_STEM || blockIn == Blocks.PUMPKIN_STEM
                    || blockIn == Blocks.MELON || blockIn == Blocks.MELON_STEM || blockIn == Blocks.ATTACHED_MELON_STEM
                    || blockIn == Blocks.GRASS || blockIn == Blocks.TALL_GRASS
                    || blockIn == Blocks.CHORUS_FLOWER || blockIn == Blocks.CACTUS || blockIn == Blocks.SUGAR_CANE){
                Bugsy bugsy_spawn = new Bugsy(ModEntityTypes.BUGSY.get(), level);
                bugsy_spawn.setPos(blockpos.getX()+0.5, blockpos.getY(), blockpos.getZ()+0.5);
                level.addFreshEntity(bugsy_spawn);
                BlockPos block_temp = blockpos;
                for(double i = bugsy_spawn.getBoundingBox().minX; i <= bugsy_spawn.getBoundingBox().maxX; i++){
                    for(double j = bugsy_spawn.getBoundingBox().minY; j <= bugsy_spawn.getBoundingBox().maxY; j++) {
                        for (double k = bugsy_spawn.getBoundingBox().minZ; k <= bugsy_spawn.getBoundingBox().maxZ; k++) {
                            block_temp = new BlockPos(i, j, k);
                            level.destroyBlock(block_temp, true, bugsy_spawn);
                        }
                    }
                }
            }
            else if (blockIn.defaultBlockState().is(Tags.Blocks.CHESTS) || blockIn.defaultBlockState().is(Tags.Blocks.BARRELS) || blockIn.defaultBlockState().is(Tags.Blocks.STORAGE_BLOCKS)
                    || blockIn == Blocks.CHEST || blockIn == Blocks.ENDER_CHEST || blockIn == Blocks.TRAPPED_CHEST
                    || blockIn == Blocks.BARREL || blockIn == Blocks.HOPPER || blockIn == Blocks.FURNACE){
                Maggart maggart_spawn = new Maggart(ModEntityTypes.MAGGART.get(), level);
                maggart_spawn.setPos(blockpos.getX()+0.5, blockpos.getY(), blockpos.getZ()+0.5);
                level.addFreshEntity(maggart_spawn);
                BlockPos block_temp = blockpos;
                for(double i = maggart_spawn.getBoundingBox().minX; i <= maggart_spawn.getBoundingBox().maxX; i++){
                    for(double j = maggart_spawn.getBoundingBox().minY; j <= maggart_spawn.getBoundingBox().maxY; j++) {
                        for (double k = maggart_spawn.getBoundingBox().minZ; k <= maggart_spawn.getBoundingBox().maxZ; k++) {
                            block_temp = new BlockPos(i, j, k);
                            level.destroyBlock(block_temp, true, maggart_spawn);
                        }
                    }
                }
            }
            else if ((blockIn.defaultBlockState().is(Tags.Blocks.ORES_IN_GROUND_STONE) || blockIn == Blocks.COAL_ORE || blockIn == Blocks.COPPER_ORE || blockIn == Blocks.EMERALD_ORE
                    || blockIn == Blocks.DIAMOND_ORE || blockIn == Blocks.GOLD_ORE || blockIn == Blocks.IRON_ORE || blockIn == Blocks.LAPIS_ORE
                    || blockIn == Blocks.REDSTONE_ORE) && (block_biome == Biomes.JAGGED_PEAKS || block_biome == Biomes.FROZEN_PEAKS
                    || block_biome == Biomes.MEADOW || block_biome == Biomes.GROVE || block_biome == Biomes.SNOWY_SLOPES || block_biome == Biomes.STONY_PEAKS
                    || event.getLevel().getBiome(blockpos).containsTag(Tags.Biomes.IS_PEAK) || event.getLevel().getBiome(blockpos).containsTag(Tags.Biomes.IS_SLOPE) || event.getLevel().getBiome(blockpos).containsTag(Tags.Biomes.IS_MOUNTAIN))){
                Avala avala_spawn = new Avala(ModEntityTypes.AVALA.get(), level);
                avala_spawn.setPos(blockpos.getX()+0.5, blockpos.getY(), blockpos.getZ()+0.5);
                level.addFreshEntity(avala_spawn);
                BlockPos block_temp = blockpos;
                for(double i = avala_spawn.getBoundingBox().minX; i <= avala_spawn.getBoundingBox().maxX; i++){
                    for(double j = avala_spawn.getBoundingBox().minY; j <= avala_spawn.getBoundingBox().maxY; j++) {
                        for (double k = avala_spawn.getBoundingBox().minZ; k <= avala_spawn.getBoundingBox().maxZ; k++) {
                            block_temp = new BlockPos(i, j, k);
                            level.destroyBlock(block_temp, true, avala_spawn);
                        }
                    }
                }
            }
        }

    }
}
