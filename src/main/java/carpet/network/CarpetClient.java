package carpet.network;

import carpet.CarpetServer;
import carpet.CarpetSettings;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class CarpetClient
{
    public static final int HI = 69;
    public static final int HELLO = 420;
    public static final int DATA = 1;
    public static final ResourceLocation CARPET_CHANNEL = new ResourceLocation("carpet:hello");
}
