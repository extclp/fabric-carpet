package carpet.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import carpet.fakes.ThreadedAnvilChunkStorageInterface;
import net.minecraft.server.world.ChunkHolder;
import net.minecraft.server.world.ThreadedAnvilChunkStorage;

@Mixin(ThreadedAnvilChunkStorage.class)
public abstract class ThreadedAnvilChunkStorage_scarpetChunkCreationMixin implements ThreadedAnvilChunkStorageInterface
{
    @Shadow
    protected abstract Iterable<ChunkHolder> entryIterator();
    @Override
    public Iterable<ChunkHolder> getChunks() {
        return entryIterator();
    }
}
