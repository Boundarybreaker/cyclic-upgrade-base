package org.infinity.cyclicUB;

import org.infinity.cyclicUB.item.ModItems;
import org.infinity.cyclicUB.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=CyclicUpgradeBase.modId, name=CyclicUpgradeBase.name, version=CyclicUpgradeBase.version, acceptedMinecraftVersions="[1.10.2]")
public class CyclicUpgradeBase {
	public static final String modId = "cyclicupgradebase";
	public static final String name = "Cyclic Upgrade Base";
	public static final String version = "1.0.0";
	
	@Mod.Instance(modId)
	public static CyclicUpgradeBase instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + "is loading!");
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@SidedProxy(serverSide = "org.infinity.cyclicUB.proxy.CommonProxy", clientSide = "org.infinity.cyclicUB.proxy.ClientProxy")
	public static CommonProxy proxy;
	
}