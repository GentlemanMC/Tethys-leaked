package me.alpha432.oyvey.mixin.mixins;

import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={RenderManager.class})
public interface AccessorRenderManager {

    @Accessor("renderPosX") double getRenderPosX();
    @Accessor("renderPosY") double getRenderPosY();
    @Accessor("renderPosZ") double getRenderPosZ();

}
