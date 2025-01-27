package net.iamtis.delaybegone.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public abstract class RemoveShieldDelay {
	@ModifyConstant(method = "isBlocking", constant = @Constant(intValue = 5))
	private int removeDelay(int delay) {
		delay = 1;
		return delay;
	}
}