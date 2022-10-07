package io.github.pengudev.pengucraft.init;

import io.github.pengudev.pengucraft.PenguCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PenguCraft.MODID);

    public static final RegistryObject<Item> SAPPHIRE_ITEM = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
}
