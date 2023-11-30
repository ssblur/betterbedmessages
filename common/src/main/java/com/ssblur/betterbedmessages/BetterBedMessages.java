package com.ssblur.betterbedmessages;

import com.google.common.base.Suppliers;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.InteractionEvent;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.BedBlock;

import java.util.function.Supplier;

public class BetterBedMessages {
  public static final String MOD_ID = "betterbedmessages";
  public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
  
  public static void init() {
    InteractionEvent.RIGHT_CLICK_BLOCK.register((player, hand, pos, face) -> {
      if(!(player.level().getBlockState(pos).getBlock() instanceof BedBlock))
        player.displayClientMessage(Component.translatable("message.betterbeddmessages.very_useful_message"), true);
      return EventResult.pass();
    });
  }
}
