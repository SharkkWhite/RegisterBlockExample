package space.registerblockexample;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import space.registerblockexample.block.ModBlocks;

public class Registerblockexample implements ModInitializer {
    public static final String MOD_ID = "registerblockexample";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing RegisterBlockExample Mod");

        ModBlocks.registerModBlocks();
    }
}