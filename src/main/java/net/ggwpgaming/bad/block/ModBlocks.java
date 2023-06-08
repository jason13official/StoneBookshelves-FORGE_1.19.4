package net.ggwpgaming.bad.block;

import net.ggwpgaming.bad.Bad;
import net.ggwpgaming.bad.block.custom.*;
import net.ggwpgaming.bad.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Bad.MOD_ID);
    // When adding a new block, include related files in blockstates, models/block, models/item
    // Register items in Bad.java for creative mode tabs

//    public static final RegistryObject<Block> STONE_BOOKSHELF = registerBlock("stone_bookshelf",
//            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
//                    .strength(0.5F).sound(SoundType.STONE)));

    // new StoneBookshelf creates a "standard" bookshelf
    public static final RegistryObject<Block> AMETHYST_BLOCK_BOOKSHELF = registerBlock("amethyst_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> ANCIENT_DEBRIS_BOOKSHELF = registerBlock("ancient_debris_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> ANDESITE_BOOKSHELF = registerBlock("andesite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BASALT_BOOKSHELF = registerBlock("basalt_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLACKSTONE_BOOKSHELF = registerBlock("blackstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLACK_CONCRETE_BOOKSHELF = registerBlock("black_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("black_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLACK_TERRACOTTA_BOOKSHELF = registerBlock("black_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLUE_CONCRETE_BOOKSHELF = registerBlock("blue_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("blue_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLUE_ICE_BOOKSHELF = registerBlock("blue_ice_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BLUE_TERRACOTTA_BOOKSHELF = registerBlock("blue_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BONE_BLOCK_BOOKSHELF = registerBlock("bone_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BRAIN_CORAL_BLOCK_BOOKSHELF = registerBlock("brain_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BRICKS_BOOKSHELF = registerBlock("bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BROWN_CONCRETE_BOOKSHELF = registerBlock("brown_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("brown_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BROWN_TERRACOTTA_BOOKSHELF = registerBlock("brown_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BUBBLE_CORAL_BLOCK_BOOKSHELF = registerBlock("bubble_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> BUDDING_AMETHYST_BOOKSHELF = registerBlock("budding_amethyst_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CALCITE_BOOKSHELF = registerBlock("calcite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_DEEPSLATE_BOOKSHELF = registerBlock("chiseled_deepslate_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_BOOKSHELF = registerBlock("chiseled_nether_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_BOOKSHELF = registerBlock("chiseled_polished_blackstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_QUARTZ_BLOCK_BOOKSHELF = registerBlock("chiseled_quartz_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_BOOKSHELF = registerBlock("chiseled_red_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_SANDSTONE_BOOKSHELF = registerBlock("chiseled_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_BOOKSHELF = registerBlock("chiseled_stone_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> COAL_BLOCK_BOOKSHELF = registerBlock("coal_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> COAL_ORE_BOOKSHELF = registerBlock("coal_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BOOKSHELF = registerBlock("cobbled_deepslate_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> COBBLESTONE_BOOKSHELF = registerBlock("cobblestone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> COPPER_BLOCK_BOOKSHELF = registerBlock("copper_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> COPPER_ORE_BOOKSHELF = registerBlock("copper_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_BOOKSHELF = registerBlock("cracked_deepslate_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_BOOKSHELF = registerBlock("cracked_deepslate_tiles_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_BOOKSHELF = registerBlock("cracked_nether_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_BOOKSHELF = registerBlock("cracked_polished_blackstone_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRACKED_STONE_BRICKS_BOOKSHELF = registerBlock("cracked_stone_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRIMSON_NYLIUM_BOOKSHELF = registerBlock("crimson_nylium_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf",
            () -> new StoneBookshelfEightTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CUT_COPPER_BOOKSHELF = registerBlock("cut_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CUT_RED_SANDSTONE_BOOKSHELF = registerBlock("cut_red_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CUT_SANDSTONE_BOOKSHELF = registerBlock("cut_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CYAN_CONCRETE_BOOKSHELF = registerBlock("cyan_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("cyan_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> CYAN_TERRACOTTA_BOOKSHELF = registerBlock("cyan_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DARK_PRISMARINE_BOOKSHELF = registerBlock("dark_prismarine_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEAD_BRAIN_CORAL_BLOCK_BOOKSHELF = registerBlock("dead_brain_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEAD_BUBBLE_CORAL_BLOCK_BOOKSHELF = registerBlock("dead_bubble_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEAD_FIRE_CORAL_BLOCK_BOOKSHELF = registerBlock("dead_fire_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEAD_HORN_CORAL_BLOCK_BOOKSHELF = registerBlock("dead_horn_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEAD_TUBE_CORAL_BLOCK_BOOKSHELF = registerBlock("dead_tube_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_BOOKSHELF = registerBlock("deepslate_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_BRICKS_BOOKSHELF = registerBlock("deepslate_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_BOOKSHELF = registerBlock("deepslate_coal_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_BOOKSHELF = registerBlock("deepslate_copper_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_BOOKSHELF = registerBlock("deepslate_diamond_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_BOOKSHELF = registerBlock("deepslate_emerald_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_BOOKSHELF = registerBlock("deepslate_gold_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_BOOKSHELF = registerBlock("deepslate_iron_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_BOOKSHELF = registerBlock("deepslate_lapis_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_ORE_BOOKSHELF = registerBlock("deepslate_redstone_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DEEPSLATE_TILES_BOOKSHELF = registerBlock("deepslate_tiles_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DIAMOND_BLOCK_BOOKSHELF = registerBlock("diamond_block_bookshelf",
            () -> new StoneBookshelfEightTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DIAMOND_ORE_BOOKSHELF = registerBlock("diamond_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DIORITE_BOOKSHELF = registerBlock("diorite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> DRIPSTONE_BLOCK_BOOKSHELF = registerBlock("dripstone_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> EMERALD_BLOCK_BOOKSHELF = registerBlock("emerald_block_bookshelf",
            () -> new StoneBookshelfEightTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> EMERALD_ORE_BOOKSHELF = registerBlock("emerald_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> END_STONE_BOOKSHELF = registerBlock("end_stone_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> END_STONE_BRICKS_BOOKSHELF = registerBlock("end_stone_bricks_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> EXPOSED_COPPER_BOOKSHELF = registerBlock("exposed_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_BOOKSHELF = registerBlock("exposed_cut_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> FIRE_CORAL_BLOCK_BOOKSHELF = registerBlock("fire_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));


                    public static final RegistryObject<Block> GILDED_BLACKSTONE_BOOKSHELF = registerBlock("gilded_blackstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GOLD_BLOCK_BOOKSHELF = registerBlock("gold_block_bookshelf",
            () -> new StoneBookshelfFourTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GOLD_ORE_BOOKSHELF = registerBlock("gold_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GRANITE_BOOKSHELF = registerBlock("granite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GRAY_CONCRETE_BOOKSHELF = registerBlock("gray_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("gray_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GRAY_TERRACOTTA_BOOKSHELF = registerBlock("gray_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GREEN_CONCRETE_BOOKSHELF = registerBlock("green_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("green_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> GREEN_TERRACOTTA_BOOKSHELF = registerBlock("green_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> HORN_CORAL_BLOCK_BOOKSHELF = registerBlock("horn_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> ICE_BOOKSHELF = registerBlock("ice_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> IRON_BLOCK_BOOKSHELF = registerBlock("iron_block_bookshelf",
            () -> new StoneBookshelfFourTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> IRON_ORE_BOOKSHELF = registerBlock("iron_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LAPIS_BLOCK_BOOKSHELF = registerBlock("lapis_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LAPIS_ORE_BOOKSHELF = registerBlock("lapis_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_BOOKSHELF = registerBlock("light_blue_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("light_blue_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BOOKSHELF = registerBlock("light_blue_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_BOOKSHELF = registerBlock("light_gray_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("light_gray_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BOOKSHELF = registerBlock("light_gray_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIME_CONCRETE_BOOKSHELF = registerBlock("lime_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("lime_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LIME_TERRACOTTA_BOOKSHELF = registerBlock("lime_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> LODESTONE_BOOKSHELF = registerBlock("lodestone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));


                    public static final RegistryObject<Block> MAGENTA_CONCRETE_BOOKSHELF = registerBlock("magenta_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("magenta_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BOOKSHELF = registerBlock("magenta_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BOOKSHELF = registerBlock("mossy_cobblestone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_BOOKSHELF = registerBlock("mossy_stone_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> MUD_BRICKS_BOOKSHELF = registerBlock("mud_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> NETHERITE_BLOCK_BOOKSHELF = registerBlock("netherite_block_bookshelf",
            () -> new StoneBookshelfTenTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> NETHERRACK_BOOKSHELF = registerBlock("netherrack_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> NETHER_BRICKS_BOOKSHELF = registerBlock("nether_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> NETHER_GOLD_ORE_BOOKSHELF = registerBlock("nether_gold_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_BOOKSHELF = registerBlock("nether_quartz_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf",
            () -> new StoneBookshelfEightTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> ORANGE_CONCRETE_BOOKSHELF = registerBlock("orange_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("orange_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BOOKSHELF = registerBlock("orange_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> OXIDIZED_COPPER_BOOKSHELF = registerBlock("oxidized_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_BOOKSHELF = registerBlock("oxidized_cut_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));


                    public static final RegistryObject<Block> PACKED_ICE_BOOKSHELF = registerBlock("packed_ice_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PACKED_MUD_BOOKSHELF = registerBlock("packed_mud_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PINK_CONCRETE_BOOKSHELF = registerBlock("pink_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("pink_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PINK_TERRACOTTA_BOOKSHELF = registerBlock("pink_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_ANDESITE_BOOKSHELF = registerBlock("polished_andesite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_BASALT_BOOKSHELF = registerBlock("polished_basalt_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BOOKSHELF = registerBlock("polished_blackstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_BOOKSHELF = registerBlock("polished_blackstone_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BOOKSHELF = registerBlock("polished_deepslate_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_DIORITE_BOOKSHELF = registerBlock("polished_diorite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> POLISHED_GRANITE_BOOKSHELF = registerBlock("polished_granite_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PRISMARINE_BRICKS_BOOKSHELF = registerBlock("prismarine_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PURPLE_CONCRETE_BOOKSHELF = registerBlock("purple_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("purple_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BOOKSHELF = registerBlock("purple_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PURPUR_BLOCK_BOOKSHELF = registerBlock("purpur_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> PURPUR_PILLAR_BOOKSHELF = registerBlock("purpur_pillar_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));


                    public static final RegistryObject<Block> QUARTZ_BLOCK_BOOKSHELF = registerBlock("quartz_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> QUARTZ_BRICKS_BOOKSHELF = registerBlock("quartz_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> QUARTZ_PILLAR_BOOKSHELF = registerBlock("quartz_pillar_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RAW_COPPER_BLOCK_BOOKSHELF = registerBlock("raw_copper_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RAW_GOLD_BLOCK_BOOKSHELF = registerBlock("raw_gold_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RAW_IRON_BLOCK_BOOKSHELF = registerBlock("raw_iron_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> REDSTONE_BLOCK_BOOKSHELF = registerBlock("redstone_block_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> REDSTONE_ORE_BOOKSHELF = registerBlock("redstone_ore_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RED_CONCRETE_BOOKSHELF = registerBlock("red_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("red_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RED_NETHER_BRICKS_BOOKSHELF = registerBlock("red_nether_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RED_SANDSTONE_BOOKSHELF = registerBlock("red_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> RED_TERRACOTTA_BOOKSHELF = registerBlock("red_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> SANDSTONE_BOOKSHELF = registerBlock("sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> SMOOTH_BASALT_BOOKSHELF = registerBlock("smooth_basalt_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> SMOOTH_QUARTZ_BOOKSHELF = registerBlock("smooth_quartz_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_BOOKSHELF = registerBlock("smooth_red_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> SMOOTH_SANDSTONE_BOOKSHELF = registerBlock("smooth_sandstone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> SMOOTH_STONE_BOOKSHELF = registerBlock("smooth_stone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> STONE_BOOKSHELF = registerBlock("stone_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> STONE_BRICKS_BOOKSHELF = registerBlock("stone_bricks_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> TERRACOTTA_BOOKSHELF = registerBlock("terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> TUBE_CORAL_BLOCK_BOOKSHELF = registerBlock("tube_coral_block_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> TUFF_BOOKSHELF = registerBlock("tuff_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> WEATHERED_COPPER_BOOKSHELF = registerBlock("weathered_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_BOOKSHELF = registerBlock("weathered_cut_copper_bookshelf",
            () -> new StoneBookshelfTwoTimes(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> WHITE_CONCRETE_BOOKSHELF = registerBlock("white_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("white_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> WHITE_TERRACOTTA_BOOKSHELF = registerBlock("white_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> YELLOW_CONCRETE_BOOKSHELF = registerBlock("yellow_concrete_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_BOOKSHELF = registerBlock("yellow_glazed_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));
                    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BOOKSHELF = registerBlock("yellow_terracotta_bookshelf",
            () -> new StoneBookshelf(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(0.5F).sound(SoundType.STONE)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
