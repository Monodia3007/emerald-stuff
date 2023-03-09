package project.maven_group.emeraldstuff;

import net.fabricmc.api.ModInitializer;

public class EmeraldStuff implements ModInitializer {
    @Override
    public void onInitialize () {
        RegisterItems.register();
    }
}
