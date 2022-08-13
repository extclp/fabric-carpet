package carpet.mixins;

import carpet.fakes.ThreadedAnvilChunkStorageInterface;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ChunkMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ChunkMap.class)
public abstract class ChunkMap_scarpetChunkCreationMixin implements ThreadedAnvilChunkStorageInterface
{
    @Shadow protected abstract Iterable<ChunkHolder> getChunks();

    @Override
    public Iterable<ChunkHolder> getChunksCM() {
        return getChunks();
    }
}