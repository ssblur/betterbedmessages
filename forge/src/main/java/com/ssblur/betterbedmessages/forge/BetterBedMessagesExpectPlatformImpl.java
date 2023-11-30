package com.ssblur.betterbedmessages.forge;

import com.ssblur.betterbedmessages.BetterBedMessagesExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class BetterBedMessagesExpectPlatformImpl {
  /**
   * This is our actual method to {@link BetterBedMessagesExpectPlatform#getConfigDirectory()}.
   */
  public static Path getConfigDirectory() {
    return FMLPaths.CONFIGDIR.get();
  }
}
