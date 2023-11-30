package com.ssblur.betterbedmessages.forge;

import dev.architectury.platform.forge.EventBuses;
import com.ssblur.betterbedmessages.BetterBedMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterBedMessages.MOD_ID)
public class BetterBedMessagesForge {
  public BetterBedMessagesForge() {
    // Submit our event bus to let architectury register our content on the right time
    EventBuses.registerModEventBus(BetterBedMessages.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
    BetterBedMessages.init();
  }
}
