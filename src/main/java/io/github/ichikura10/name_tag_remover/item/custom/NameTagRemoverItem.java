package io.github.ichikura10.name_tag_remover.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class NameTagRemoverItem extends Item {
    public NameTagRemoverItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack pStack, Player pPlayer, LivingEntity pInteractionTarget, InteractionHand pUsedHand) {
        if (!pPlayer.level().isClientSide && pInteractionTarget.hasCustomName()) {
            pInteractionTarget.setCustomName(null);
            pInteractionTarget.setCustomNameVisible(false);
            
            pStack.hurtAndBreak(1, pPlayer, p -> p.broadcastBreakEvent(pUsedHand));

            ItemStack nameTag = new ItemStack(Items.NAME_TAG);
            if (!pPlayer.addItem(nameTag)) {
                pPlayer.drop(nameTag, false);
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
