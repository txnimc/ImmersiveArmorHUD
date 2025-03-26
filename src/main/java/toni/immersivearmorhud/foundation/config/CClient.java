package toni.immersivearmorhud.foundation.config;

import toni.lib.config.ConfigBase;

public class CClient extends ConfigBase {

    public final ConfigBool rightAligned = b(false, "Right Aligned", "Render the armor hud on the right side.");
    public final ConfigInt yOffset = i(0, "Y Offset", "Additional Y offset of the armor hud");
    public final ConfigInt xOffset = i(0, "X Offset", "Additional X offset of the armor hud");

    @Override
    public String getName() {
        return "client";
    }
}
