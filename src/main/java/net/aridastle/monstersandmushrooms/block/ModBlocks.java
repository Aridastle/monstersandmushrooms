package net.aridastle.monstersandmushrooms.block;

import net.aridastle.monstersandmushrooms.item.ModCreativeModeTab;
import net.aridastle.monstersandmushrooms.item.ModItems;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, monstersandmushrooms.MOD_ID);

    public static final RegistryObject<Block> ROCKY_MOSS = registerBlock("rocky_moss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.MOSS).strength(0.25f)));
    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLED_COAL = registerBlock("cobbled_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.STONE).strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ICY_DEEPSLATE_TILES = registerBlock("icy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES).strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_AMETHYST = registerBlock("polished_amethyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST).strength(2f).requiresCorrectToolForDrops()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
