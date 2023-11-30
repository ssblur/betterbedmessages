package com.ssblur.betterbedmessages.fabric;

import com.ssblur.betterbedmessages.BetterBedMessagesExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class BetterBedMessagesExpectPlatformImpl {
  /**
   * This is our actual method to {@link BetterBedMessagesExpectPlatform#getConfigDirectory()}.
   */
  public static Path getConfigDirectory() {
    return FabricLoader.getInstance().getConfigDir();
  }
}
