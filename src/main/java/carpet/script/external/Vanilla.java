package carpet.script.external;

import carpet.CarpetSettings;
import net.minecraft.server.MinecraftServer;


public class Vanilla
{
    public static int MinecraftServer_getRunPermissionLevel(MinecraftServer server)
    {
        return CarpetSettings.runPermissionLevel;
    }
}
