
package net.mcreator.ganjacraft.item;

@GanjacraftModElements.ModElement.Tag
public class HempFirestraterItem extends GanjacraftModElements.ModElement {

	@ObjectHolder("ganjacraft:hemp_firestrater")
	public static final Item block = null;

	public HempFirestraterItem(GanjacraftModElements instance) {
		super(instance, 212);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("hemp_firestrater");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
