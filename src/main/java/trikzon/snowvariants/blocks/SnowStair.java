package trikzon.snowvariants.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SnowStair extends StairsBlock {

    public final Block origin;

    public SnowStair(Block block) {
        super(block.getDefaultState(), Block.Settings.copy(block));
        ModBlocks.SNOWY_STAIRS.add(this);

        origin = block;
    }

    public Block getOrigin() {
        return origin;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public boolean activate(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        if (player.getStackInHand(handIn).getItem() instanceof ShovelItem) {
            //If world is server
            if (!worldIn.isClient) {
                worldIn.setBlockState(pos, origin.getDefaultState()
                        .with(Properties.BLOCK_HALF, worldIn.getBlockState(pos).get(Properties.BLOCK_HALF))
                        .with(Properties.STAIR_SHAPE, worldIn.getBlockState(pos).get(Properties.STAIR_SHAPE))
                        .with(Properties.HORIZONTAL_FACING, worldIn.getBlockState(pos).get(Properties.HORIZONTAL_FACING)));
                if (!player.isCreative()) {
                    worldIn.spawnEntity(new ItemEntity(worldIn, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, new ItemStack(Blocks.SNOW)));
                    player.getStackInHand(handIn).setDamage(player.getStackInHand(handIn).getDamage() - 1);
                }
            } else {
                worldIn.playSound(player, pos, SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.BLOCKS, (BlockSoundGroup.SNOW.getVolume() + 1.0F) / 2.0F, BlockSoundGroup.SNOW.getPitch() * 0.8F);
            }
            return true;
        }
        return false;
    }
}
