package net.ilikememes.betterbeacons.item;

import net.ilikememes.betterbeacons.BetterBeacons;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterBeacons.MOD_ID);

    public static final DeferredItem<Item> POOP = ITEMS.register("poop",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STILL_POOP = ITEMS.register("still_poop",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
