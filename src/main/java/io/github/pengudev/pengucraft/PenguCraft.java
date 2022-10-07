package io.github.pengudev.pengucraft;

import io.github.pengudev.pengucraft.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PenguCraft.MODID)
public class PenguCraft {
    public static final String MODID = "pengucraft";

    public PenguCraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(eventBus);
    }
}
