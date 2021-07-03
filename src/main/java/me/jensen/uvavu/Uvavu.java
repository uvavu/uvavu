package me.jensen.uvavu;

 import me.jensen.uvavu.proxy.CommonProxy;
import me.jensen.uvavu.util.Refrence;
import net.minecraft.client.main.Main;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION)
public class Uvavu {

	@Instance
	public Main instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
	
	}
	
	@EventHandler
	public void init (FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(instance);
		
	}
	
	@EventHandler
	public void PostInit (FMLPreInitializationEvent event) {
		
	}
}
