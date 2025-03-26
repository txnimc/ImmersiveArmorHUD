package toni.immersivearmorhud.foundation.data;

#if FABRIC
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import toni.immersivearmorhud.ImmersiveArmorHUD;

public class ImmersiveArmorHUDDatagen  implements DataGeneratorEntrypoint {

    @Override
    public String getEffectiveModId() {
        return ImmersiveArmorHUD.ID;
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(ConfigLangDatagen::new);
    }
}
#endif