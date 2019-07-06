package trikzon.snowvariants.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.blocks.SnowSlab;
import trikzon.snowvariants.blocks.SnowStair;

public class TransformationEvent {

    static {
        UseBlockCallback.EVENT.register((playerIn, world, hand, hitResult) -> {
            if (!world.isClient) {
                if (!(playerIn.getStackInHand(hand).isItemEqual(new ItemStack(Blocks.SNOW)))) return ActionResult.PASS;

                if (hitResult == null) return ActionResult.PASS;
                if (hitResult.getType() != BlockHitResult.Type.BLOCK) return ActionResult.PASS;

                BlockPos blockPos = hitResult.getBlockPos();
                BlockState blockStateAtPos = world.getBlockState(blockPos);
                Block blockAtPos = blockStateAtPos.getBlock();

                if (blockAtPos instanceof StairsBlock) {
                    for (SnowStair block : ModBlocks.SNOWY_STAIRS) {
                        if (blockAtPos.equals(block.origin)) {
                            if (blockStateAtPos.get(Properties.BLOCK_HALF).equals(BlockHalf.BOTTOM)) {
                                world.setBlockState(blockPos, block.getDefaultState()
                                        .with(Properties.HORIZONTAL_FACING, blockStateAtPos.get(Properties.HORIZONTAL_FACING))
                                        .with(Properties.BLOCK_HALF, blockStateAtPos.get(Properties.BLOCK_HALF))
                                        .with(Properties.STAIR_SHAPE, blockStateAtPos.get(Properties.STAIR_SHAPE)));

                                if (!playerIn.isCreative())
                                    playerIn.getStackInHand(hand).decrement(1);

                                playerIn.playSound(SoundEvents.BLOCK_SNOW_PLACE, (BlockSoundGroup.SNOW.getVolume() + 1.0f) / 2.0f, BlockSoundGroup.SNOW.getPitch() * 0.8f);
                            }
                            break;
                        }
                    }
                }

                if (blockAtPos instanceof SlabBlock) {
                    for (SnowSlab block : ModBlocks.SNOWY_SLABS) {
                        if (blockAtPos.equals(block.origin)) {
                            if (blockStateAtPos.get(Properties.SLAB_TYPE).equals(SlabType.BOTTOM)) {
                                world.setBlockState(blockPos, block.getDefaultState());

                                if (!playerIn.isCreative())
                                    playerIn.getStackInHand(hand).decrement(1);

                                world.playSound(playerIn, blockPos, BlockSoundGroup.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (BlockSoundGroup.SNOW.getVolume() + 1.0f) / 2.0f, BlockSoundGroup.SNOW.getPitch() * 0.8f);
                            }
                        }
                    }
                }

                if (blockAtPos instanceof SlabBlock) {
                    for (SnowSlab block : ModBlocks.SNOWY_SLABS) {
                        if (blockAtPos.equals(block.origin)) {
                            if (blockStateAtPos.get(Properties.SLAB_TYPE).equals(SlabType.BOTTOM)) {
                                world.setBlockState(blockPos, block.getDefaultState());

                                if (!playerIn.isCreative())
                                    playerIn.getStackInHand(hand).decrement(1);

                                world.playSound(playerIn, blockPos, BlockSoundGroup.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (BlockSoundGroup.SNOW.getVolume() + 1.0f) / 2.0f, BlockSoundGroup.SNOW.getPitch() * 0.8f);
                            }
                        }
                    }
                }

                if (blockAtPos instanceof SlabBlock) {
                    for (SnowSlab block : ModBlocks.SNOWY_SLABS) {
                        if (blockAtPos.equals(block.origin)) {
                            if (blockStateAtPos.get(Properties.SLAB_TYPE).equals(SlabType.BOTTOM)) {
                                world.setBlockState(blockPos, block.getDefaultState());

                                if (!playerIn.isCreative())
                                    playerIn.getStackInHand(hand).decrement(1);

                                world.playSound(playerIn, blockPos, BlockSoundGroup.SNOW.getPlaceSound(), SoundCategory.BLOCKS, (BlockSoundGroup.SNOW.getVolume() + 1.0f) / 2.0f, BlockSoundGroup.SNOW.getPitch() * 0.8f);
                            }
                        }
                    }
                }
            }
            return ActionResult.SUCCESS;
        });
    }

}
