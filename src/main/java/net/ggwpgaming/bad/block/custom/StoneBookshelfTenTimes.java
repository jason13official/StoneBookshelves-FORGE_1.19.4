package net.ggwpgaming.bad.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.extensions.IForgeBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StoneBookshelfTenTimes extends Block implements IForgeBlock {

    public StoneBookshelfTenTimes(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter level, BlockPos pos, Direction facing, IPlantable plantable) {
        return false;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
        return 10;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> list, TooltipFlag flag) {
        if(Screen.hasShiftDown()) {
            list.add(Component.literal("Provides 10x Enchanting Bonus").withStyle(ChatFormatting.YELLOW));
        } else {
            //shift for more info
            list.add(Component.literal("Provides 10x Enchanting Bonus").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(stack, getter, list, flag);
    }
}
