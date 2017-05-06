package org.infinity.cyclicUB.proxy;

import org.infinity.cyclicUB.CyclicUpgradeBase;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CyclicUpgradeBase.modId + ":" + id, "inventory"));
	}
}
