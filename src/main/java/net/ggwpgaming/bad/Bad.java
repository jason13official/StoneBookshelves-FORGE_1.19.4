package net.ggwpgaming.bad;

import com.mojang.logging.LogUtils;
import net.ggwpgaming.bad.block.ModBlocks;
import net.ggwpgaming.bad.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import static net.ggwpgaming.bad.item.ModCreativeModeTabs.BAD_TAB;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Bad.MOD_ID)
public class Bad
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "bad";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
//    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
//    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
//    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
//
//    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
//    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));

    public Bad()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

//        // Register the Deferred Register to the mod event bus so blocks get registered
//        BLOCKS.register(modEventBus);
//        // Register the Deferred Register to the mod event bus so items get registered
//        ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
//        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS)
//            event.accept(EXAMPLE_BLOCK_ITEM);

        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.AMETHYST_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.ANCIENT_DEBRIS_BOOKSHELF);
            event.accept(ModBlocks.ANDESITE_BOOKSHELF);
            event.accept(ModBlocks.BASALT_BOOKSHELF);
            event.accept(ModBlocks.BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.BLACK_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BLACK_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BLUE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BLUE_ICE_BOOKSHELF);
            event.accept(ModBlocks.BLUE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BONE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.BRAIN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.BRICKS_BOOKSHELF);
            event.accept(ModBlocks.BROWN_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BROWN_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BUBBLE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.BUDDING_AMETHYST_BOOKSHELF);
            event.accept(ModBlocks.CALCITE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_POLISHED_BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_QUARTZ_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.COAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.COAL_ORE_BOOKSHELF);
            event.accept(ModBlocks.COBBLED_DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.COBBLESTONE_BOOKSHELF);
            event.accept(ModBlocks.COPPER_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.COPPER_ORE_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_TILES_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRIMSON_NYLIUM_BOOKSHELF);
            event.accept(ModBlocks.CRYING_OBSIDIAN_BOOKSHELF);
            event.accept(ModBlocks.CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.CUT_RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CUT_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CYAN_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.CYAN_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.DARK_PRISMARINE_BOOKSHELF);
            event.accept(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_FIRE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_HORN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_TUBE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_COAL_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_COPPER_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_DIAMOND_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_EMERALD_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_GOLD_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_IRON_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_LAPIS_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_REDSTONE_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_TILES_BOOKSHELF);
            event.accept(ModBlocks.DIAMOND_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DIAMOND_ORE_BOOKSHELF);
            event.accept(ModBlocks.DIORITE_BOOKSHELF);
            event.accept(ModBlocks.DRIPSTONE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.EMERALD_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.EMERALD_ORE_BOOKSHELF);
            event.accept(ModBlocks.END_STONE_BOOKSHELF);
            event.accept(ModBlocks.END_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.EXPOSED_COPPER_BOOKSHELF);
            event.accept(ModBlocks.EXPOSED_CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.FIRE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.GILDED_BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.GOLD_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.GOLD_ORE_BOOKSHELF);
            event.accept(ModBlocks.GRANITE_BOOKSHELF);
            event.accept(ModBlocks.GRAY_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.GRAY_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.GREEN_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.GREEN_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.HORN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.ICE_BOOKSHELF);
            event.accept(ModBlocks.IRON_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.IRON_ORE_BOOKSHELF);
            event.accept(ModBlocks.LAPIS_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.LAPIS_ORE_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIME_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIME_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LODESTONE_BOOKSHELF);
            event.accept(ModBlocks.MAGENTA_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.MOSSY_COBBLESTONE_BOOKSHELF);
            event.accept(ModBlocks.MOSSY_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.MUD_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.NETHERITE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.NETHERRACK_BOOKSHELF);
            event.accept(ModBlocks.NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.NETHER_GOLD_ORE_BOOKSHELF);
            event.accept(ModBlocks.NETHER_QUARTZ_ORE_BOOKSHELF);
            event.accept(ModBlocks.OBSIDIAN_BOOKSHELF);
            event.accept(ModBlocks.ORANGE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.OXIDIZED_COPPER_BOOKSHELF);
            event.accept(ModBlocks.OXIDIZED_CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.PACKED_ICE_BOOKSHELF);
            event.accept(ModBlocks.PACKED_MUD_BOOKSHELF);
            event.accept(ModBlocks.PINK_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.PINK_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_ANDESITE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_BASALT_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_DIORITE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_GRANITE_BOOKSHELF);
            event.accept(ModBlocks.PRISMARINE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.PURPLE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.PURPUR_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.PURPUR_PILLAR_BOOKSHELF);
            event.accept(ModBlocks.QUARTZ_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.QUARTZ_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.QUARTZ_PILLAR_BOOKSHELF);
            event.accept(ModBlocks.RAW_COPPER_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.RAW_GOLD_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.RAW_IRON_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.REDSTONE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.REDSTONE_ORE_BOOKSHELF);
            event.accept(ModBlocks.RED_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.RED_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.RED_NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.RED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_BASALT_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_QUARTZ_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_STONE_BOOKSHELF);
            event.accept(ModBlocks.STONE_BOOKSHELF);
            event.accept(ModBlocks.STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.TUBE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.TUFF_BOOKSHELF);
            event.accept(ModBlocks.WEATHERED_COPPER_BOOKSHELF);
            event.accept(ModBlocks.WEATHERED_CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.WHITE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.WHITE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.YELLOW_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_BOOKSHELF);
        }
        if(event.getTab() == BAD_TAB) {
            event.accept(ModBlocks.AMETHYST_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.ANCIENT_DEBRIS_BOOKSHELF);
            event.accept(ModBlocks.ANDESITE_BOOKSHELF);
            event.accept(ModBlocks.BASALT_BOOKSHELF);
            event.accept(ModBlocks.BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.BLACK_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BLACK_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BLUE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BLUE_ICE_BOOKSHELF);
            event.accept(ModBlocks.BLUE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BONE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.BRAIN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.BRICKS_BOOKSHELF);
            event.accept(ModBlocks.BROWN_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BROWN_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.BUBBLE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.BUDDING_AMETHYST_BOOKSHELF);
            event.accept(ModBlocks.CALCITE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_POLISHED_BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_QUARTZ_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CHISELED_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.COAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.COAL_ORE_BOOKSHELF);
            event.accept(ModBlocks.COBBLED_DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.COBBLESTONE_BOOKSHELF);
            event.accept(ModBlocks.COPPER_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.COPPER_ORE_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_TILES_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRACKED_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.CRIMSON_NYLIUM_BOOKSHELF);
            event.accept(ModBlocks.CRYING_OBSIDIAN_BOOKSHELF);
            event.accept(ModBlocks.CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.CUT_RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CUT_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.CYAN_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.CYAN_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.DARK_PRISMARINE_BOOKSHELF);
            event.accept(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_FIRE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_HORN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEAD_TUBE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_COAL_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_COPPER_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_DIAMOND_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_EMERALD_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_GOLD_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_IRON_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_LAPIS_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_REDSTONE_ORE_BOOKSHELF);
            event.accept(ModBlocks.DEEPSLATE_TILES_BOOKSHELF);
            event.accept(ModBlocks.DIAMOND_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.DIAMOND_ORE_BOOKSHELF);
            event.accept(ModBlocks.DIORITE_BOOKSHELF);
            event.accept(ModBlocks.DRIPSTONE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.EMERALD_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.EMERALD_ORE_BOOKSHELF);
            event.accept(ModBlocks.END_STONE_BOOKSHELF);
            event.accept(ModBlocks.END_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.EXPOSED_COPPER_BOOKSHELF);
            event.accept(ModBlocks.EXPOSED_CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.FIRE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.GILDED_BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.GOLD_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.GOLD_ORE_BOOKSHELF);
            event.accept(ModBlocks.GRANITE_BOOKSHELF);
            event.accept(ModBlocks.GRAY_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.GRAY_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.GREEN_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.GREEN_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.HORN_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.ICE_BOOKSHELF);
            event.accept(ModBlocks.IRON_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.IRON_ORE_BOOKSHELF);
            event.accept(ModBlocks.LAPIS_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.LAPIS_ORE_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIME_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LIME_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.LODESTONE_BOOKSHELF);
            event.accept(ModBlocks.MAGENTA_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.MOSSY_COBBLESTONE_BOOKSHELF);
            event.accept(ModBlocks.MOSSY_STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.MUD_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.NETHERITE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.NETHERRACK_BOOKSHELF);
            event.accept(ModBlocks.NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.NETHER_GOLD_ORE_BOOKSHELF);
            event.accept(ModBlocks.NETHER_QUARTZ_ORE_BOOKSHELF);
            event.accept(ModBlocks.OBSIDIAN_BOOKSHELF);
            event.accept(ModBlocks.ORANGE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.OXIDIZED_COPPER_BOOKSHELF);
            event.accept(ModBlocks.OXIDIZED_CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.PACKED_ICE_BOOKSHELF);
            event.accept(ModBlocks.PACKED_MUD_BOOKSHELF);
            event.accept(ModBlocks.PINK_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.PINK_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_ANDESITE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_BASALT_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_BLACKSTONE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_DEEPSLATE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_DIORITE_BOOKSHELF);
            event.accept(ModBlocks.POLISHED_GRANITE_BOOKSHELF);
            event.accept(ModBlocks.PRISMARINE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.PURPLE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.PURPUR_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.PURPUR_PILLAR_BOOKSHELF);
            event.accept(ModBlocks.QUARTZ_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.QUARTZ_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.QUARTZ_PILLAR_BOOKSHELF);
            event.accept(ModBlocks.RAW_COPPER_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.RAW_GOLD_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.RAW_IRON_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.REDSTONE_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.REDSTONE_ORE_BOOKSHELF);
            event.accept(ModBlocks.RED_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.RED_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.RED_NETHER_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.RED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_BASALT_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_QUARTZ_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_RED_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_SANDSTONE_BOOKSHELF);
            event.accept(ModBlocks.SMOOTH_STONE_BOOKSHELF);
            event.accept(ModBlocks.STONE_BOOKSHELF);
            event.accept(ModBlocks.STONE_BRICKS_BOOKSHELF);
            event.accept(ModBlocks.TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.TUBE_CORAL_BLOCK_BOOKSHELF);
            event.accept(ModBlocks.TUFF_BOOKSHELF);
            event.accept(ModBlocks.WEATHERED_COPPER_BOOKSHELF);
            event.accept(ModBlocks.WEATHERED_CUT_COPPER_BOOKSHELF);
            event.accept(ModBlocks.WHITE_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.WHITE_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.YELLOW_CONCRETE_BOOKSHELF);
            event.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BOOKSHELF);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_BOOKSHELF);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
