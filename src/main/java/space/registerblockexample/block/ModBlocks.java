package space.registerblockexample.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import space.registerblockexample.Registerblockexample;

public class ModBlocks {

    public static final Block EXAMPLE_BLOCK = registerBlock("example_block",
            new Block(Block.Settings.create()
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Registerblockexample.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Registerblockexample.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Registerblockexample.LOGGER.info("Registering Mod Blocks for " + Registerblockexample.MOD_ID);
    }
}