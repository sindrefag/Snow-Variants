package trikzon.snowvariants.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.EntityContext;
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
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SnowWall extends WallBlock {

    public final Block origin;

    public SnowWall(Block block) {
        super(Settings.copy(block));
        ModBlocks.SNOWY_WALLS.add(this);

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
    public VoxelShape getOutlineShape(BlockState blockState_1, BlockView blockView_1, BlockPos blockPos_1, EntityContext entityContext_1) {
        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    }

    @Override
    public boolean activate(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        if (player.getStackInHand(handIn).getItem() instanceof ShovelItem) {
            //If world is server
            if (!worldIn.isClient) {
                worldIn.setBlockState(pos, origin.getDefaultState()
                        .with(Properties.NORTH, worldIn.getBlockState(pos).get(Properties.NORTH))
                        .with(Properties.SOUTH, worldIn.getBlockState(pos).get(Properties.SOUTH))
                        .with(Properties.EAST, worldIn.getBlockState(pos).get(Properties.EAST))
                        .with(Properties.WEST, worldIn.getBlockState(pos).get(Properties.WEST))
                        .with(Properties.UP, worldIn.getBlockState(pos).get(Properties.UP))
                        .with(Properties.WATERLOGGED, worldIn.getBlockState(pos).get(Properties.WATERLOGGED)));
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