package com.ssblur.betterbedmessages.fabric;

import com.ssblur.betterbedmessages.BetterBedMessages;
import net.fabricmc.api.ModInitializer;

public class BetterBedMessagesFabric implements ModInitializer {
  @Override
  public void onInitialize() {
    BetterBedMessages.init();
  }
}
