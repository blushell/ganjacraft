
package net.mcreator.ganjacraft.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class SnoopDogg48x48Painting extends GanjacraftModElements.ModElement {
	public SnoopDogg48x48Painting(GanjacraftModElements instance) {
		super(instance, 118);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(48, 48).setRegistryName("snoop_dogg_48x_48"));
	}
}
