package carpet.mixins;

import carpet.CarpetSettings;
import net.minecraft.server.commands.FillBiomeCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FillBiomeCommand.class)
public class FillBiomeCommandMixin
{
	@ModifyConstant(method = "fill", constant = @Constant(intValue = 32768))
	private static int fillLimit(int original)
	{
		return CarpetSettings.fillLimit;
	}
}