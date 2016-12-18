package alsender.earthworks.main;

import alsender.earthworks.main.proxy.CommonProxy;
import alsender.earthworks.main.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


/**
 * Created by alsender on 12/12/16.
 */
@Mod(modid = Earthworks.mod_id, name = Earthworks.name, version = Earthworks.version)

public class Earthworks {

    public static final String mod_id = "Earthworks";
    public static final String name = "Earthworks";
    public static final String version = "0.0.1";

    @Mod.Instance
    public static Earthworks instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SidedProxy(serverSide = "alsender.earthworks.main.proxy.CommonProxy", clientSide = "alsender.earthworks.main.proxy.ClientProxy")
    public static CommonProxy proxy;

}