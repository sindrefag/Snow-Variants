package trikzon.snowvariants.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import team.abnormals.abnormalib.utils.registry.RegistryUtils;
import trikzon.snowvariants.SnowVariants;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static List<SnowStair> SNOWY_STAIRS = new ArrayList<>();
    public static List<SnowSlab> SNOWY_SLABS = new ArrayList<>();
    public static List<SnowWall> SNOWY_WALLS = new ArrayList<>();
    public static List<SnowFence> SNOWY_FENCES = new ArrayList<>();

    public static final SnowStair MINECRAFT_SPRUCE_STAIRS = null;

    static {
        register(new SnowStair(Blocks.PURPUR_STAIRS));
        register(new SnowStair(Blocks.OAK_STAIRS));
        register(new SnowStair(Blocks.COBBLESTONE_STAIRS));
        register(new SnowStair(Blocks.BRICK_STAIRS));
        register(new SnowStair(Blocks.STONE_BRICK_STAIRS));
        register(new SnowStair(Blocks.NETHER_BRICK_STAIRS));
        register(new SnowStair(Blocks.SANDSTONE_STAIRS));
        register(new SnowStair(Blocks.SPRUCE_STAIRS));
        register(new SnowStair(Blocks.BIRCH_STAIRS));
        register(new SnowStair(Blocks.JUNGLE_STAIRS));
        register(new SnowStair(Blocks.QUARTZ_STAIRS));
        register(new SnowStair(Blocks.ACACIA_STAIRS));
        register(new SnowStair(Blocks.DARK_OAK_STAIRS));
        register(new SnowStair(Blocks.PRISMARINE_STAIRS));
        register(new SnowStair(Blocks.PRISMARINE_BRICK_STAIRS));
        register(new SnowStair(Blocks.DARK_PRISMARINE_STAIRS));
        register(new SnowStair(Blocks.RED_SANDSTONE_STAIRS));
        register(new SnowStair(Blocks.POLISHED_GRANITE_STAIRS));
        register(new SnowStair(Blocks.SMOOTH_RED_SANDSTONE_STAIRS));
        register(new SnowStair(Blocks.MOSSY_STONE_BRICK_STAIRS));
        register(new SnowStair(Blocks.POLISHED_DIORITE_STAIRS));
        register(new SnowStair(Blocks.MOSSY_COBBLESTONE_STAIRS));
        register(new SnowStair(Blocks.END_STONE_BRICK_STAIRS));
        register(new SnowStair(Blocks.STONE_STAIRS));
        register(new SnowStair(Blocks.SMOOTH_SANDSTONE_STAIRS));
        register(new SnowStair(Blocks.SMOOTH_QUARTZ_STAIRS));
        register(new SnowStair(Blocks.GRANITE_STAIRS));
        register(new SnowStair(Blocks.ANDESITE_STAIRS));
        register(new SnowStair(Blocks.RED_NETHER_BRICK_STAIRS));
        register(new SnowStair(Blocks.POLISHED_ANDESITE_STAIRS));
        register(new SnowStair(Blocks.DIORITE_STAIRS));

        register(new SnowSlab(Blocks.OAK_SLAB));
        register(new SnowSlab(Blocks.SPRUCE_SLAB));
        register(new SnowSlab(Blocks.BIRCH_SLAB));
        register(new SnowSlab(Blocks.JUNGLE_SLAB));
        register(new SnowSlab(Blocks.ACACIA_SLAB));
        register(new SnowSlab(Blocks.DARK_OAK_SLAB));
        register(new SnowSlab(Blocks.STONE_SLAB));
        register(new SnowSlab(Blocks.SMOOTH_STONE_SLAB));
        register(new SnowSlab(Blocks.SANDSTONE_SLAB));
        register(new SnowSlab(Blocks.CUT_SANDSTONE_SLAB));
        register(new SnowSlab(Blocks.PETRIFIED_OAK_SLAB));
        register(new SnowSlab(Blocks.COBBLESTONE_SLAB));
        register(new SnowSlab(Blocks.BRICK_SLAB));
        register(new SnowSlab(Blocks.STONE_BRICK_SLAB));
        register(new SnowSlab(Blocks.NETHER_BRICK_SLAB));
        register(new SnowSlab(Blocks.QUARTZ_SLAB));
        register(new SnowSlab(Blocks.RED_SANDSTONE_SLAB));
        register(new SnowSlab(Blocks.CUT_RED_SANDSTONE_SLAB));
        register(new SnowSlab(Blocks.PURPUR_SLAB));
        register(new SnowSlab(Blocks.PRISMARINE_SLAB));
        register(new SnowSlab(Blocks.PRISMARINE_BRICK_SLAB));
        register(new SnowSlab(Blocks.DARK_PRISMARINE_SLAB));
        register(new SnowSlab(Blocks.POLISHED_GRANITE_SLAB));
        register(new SnowSlab(Blocks.SMOOTH_RED_SANDSTONE_SLAB));
        register(new SnowSlab(Blocks.MOSSY_STONE_BRICK_SLAB));
        register(new SnowSlab(Blocks.POLISHED_DIORITE_SLAB));
        register(new SnowSlab(Blocks.MOSSY_COBBLESTONE_SLAB));
        register(new SnowSlab(Blocks.END_STONE_BRICK_SLAB));
        register(new SnowSlab(Blocks.SMOOTH_SANDSTONE_SLAB));
        register(new SnowSlab(Blocks.SMOOTH_QUARTZ_SLAB));
        register(new SnowSlab(Blocks.GRANITE_SLAB));
        register(new SnowSlab(Blocks.ANDESITE_SLAB));
        register(new SnowSlab(Blocks.RED_NETHER_BRICK_SLAB));
        register(new SnowSlab(Blocks.POLISHED_ANDESITE_SLAB));
        register(new SnowSlab(Blocks.DIORITE_SLAB));

        register(new SnowFence(Blocks.OAK_FENCE));
        register(new SnowFence(Blocks.SPRUCE_FENCE));
        register(new SnowFence(Blocks.BIRCH_FENCE));
        register(new SnowFence(Blocks.JUNGLE_FENCE));
        register(new SnowFence(Blocks.ACACIA_FENCE));
        register(new SnowFence(Blocks.DARK_OAK_FENCE));

        register(new SnowWall(Blocks.COBBLESTONE_WALL));
        register(new SnowWall(Blocks.MOSSY_COBBLESTONE_WALL));
        register(new SnowWall(Blocks.BRICK_WALL));
        register(new SnowWall(Blocks.PRISMARINE_WALL));
        register(new SnowWall(Blocks.RED_SANDSTONE_WALL));
        register(new SnowWall(Blocks.MOSSY_STONE_BRICK_WALL));
        register(new SnowWall(Blocks.GRANITE_WALL));
        register(new SnowWall(Blocks.STONE_BRICK_WALL));
        register(new SnowWall(Blocks.NETHER_BRICK_WALL));
        register(new SnowWall(Blocks.ANDESITE_WALL));
        register(new SnowWall(Blocks.RED_NETHER_BRICK_WALL));
        register(new SnowWall(Blocks.SANDSTONE_WALL));
        register(new SnowWall(Blocks.END_STONE_BRICK_WALL));
        register(new SnowWall(Blocks.DIORITE_WALL));
    }
    
    private static void register(SnowSlab block) {
        RegistryUtils.register(block, new Identifier(SnowVariants.MODID, String.format("snowy_%s", Registry.BLOCK.getId(block.getOrigin()).getPath())), SnowVariants.SNOWY_BLOCKS);
    }

    private static void register(SnowStair block) {
        RegistryUtils.register(block, new Identifier(SnowVariants.MODID, String.format("snowy_%s", Registry.BLOCK.getId(block.getOrigin()).getPath())), SnowVariants.SNOWY_BLOCKS);
    }

    private static void register(SnowFence block) {
        RegistryUtils.register(block, new Identifier(SnowVariants.MODID, String.format("snowy_%s", Registry.BLOCK.getId(block.getOrigin()).getPath())), SnowVariants.SNOWY_BLOCKS);
        /*BlockTags.FENCES.entries().add(new Tag.Entry<>() {
            @Override
            public void build(Collection<Block> collection) {

            }

            @Override
            public void toJson(JsonArray jsonArray, Function<Block, Identifier> function) {

            }
        });*/
    }

    private static void register(SnowWall block) {
        RegistryUtils.register(block, new Identifier(SnowVariants.MODID, String.format("snowy_%s", Registry.BLOCK.getId(block.getOrigin()).getPath())), SnowVariants.SNOWY_BLOCKS);
    }
    
}
