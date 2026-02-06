package io.github.ichikura10.name_tag_remover.item;

import io.github.ichikura10.name_tag_remover.Name_tag_remover;
import io.github.ichikura10.name_tag_remover.item.custom.NameTagRemoverItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Name_tag_remover.MOD_ID);

    public static final RegistryObject<Item> NAME_TAG_REMOVER = ITEMS.register("name_tag_remover",
            () -> new NameTagRemoverItem(new Item.Properties().durability(64)));
}
