package trikzon.snowvariants;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trikzon.snowvariants.blocks.ModBlocks;
import trikzon.snowvariants.events.TransformationEvent;


public class SnowVariants implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID =  "snowvariants";

    public static ItemGroup SNOWY_BLOCKS = FabricItemGroupBuilder.create(new Identifier(MODID, "snowy_blocks")).icon(() -> new ItemStack(Blocks.SPRUCE_STAIRS)).build();

    @Override
    public void onInitialize() {
        new TransformationEvent();
        new ModBlocks();
    }
}
