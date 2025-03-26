package toni.immersivearmorhud.foundation;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import toni.immersivearmorhud.ArmorBarRenderer;
import toni.immersivearmorhud.foundation.config.AllConfigs;

public class GuiOverlayHandler {
    public static final IGuiOverlay ARMOR_HUD = (ForgeGui gui, GuiGraphics guiGraphics, float partialTick, int screenWidth, int screenHeight) -> {
        Minecraft minecraft = gui.getMinecraft();
        if (!minecraft.options.hideGui && gui.shouldDrawSurvivalElements()) {
            var didRender = ArmorBarRenderer.render(guiGraphics, guiGraphics.guiHeight() - (AllConfigs.client().rightAligned.get() ?  gui.rightHeight :  gui.leftHeight));
            if (didRender) {
                if (AllConfigs.client().rightAligned.get()) {
                    gui.rightHeight += 10;
                } else {
                    gui.leftHeight += 10;
                }
            }
        }
    };
}