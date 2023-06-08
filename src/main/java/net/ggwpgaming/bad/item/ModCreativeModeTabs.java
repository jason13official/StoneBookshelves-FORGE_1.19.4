package net.ggwpgaming.bad.item;

import net.ggwpgaming.bad.Bad;
import net.ggwpgaming.bad.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bad.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab BAD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BAD_TAB = event.registerCreativeModeTab(new ResourceLocation(Bad.MOD_ID, "bad_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.STONE_BOOKSHELF.get()))
                        .title(Component.translatable("bad.bad_creative_tab")));
    }
}