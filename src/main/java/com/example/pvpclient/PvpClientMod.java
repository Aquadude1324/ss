package com.yourusername.pvpclient;

import net.fabricmc.api.ModInitializer;

public class PvpClientMod implements ModInitializer {
    public static final String MOD_ID = "pvpclient";

    @Override
    public void onInitialize() {
        PerformanceModule.init();
        HudModule.init();
        MovementModule.init();
        PvpToolsModule.init();
        CosmeticsModule.init();
        GuiModule.init();
        MinimapModule.init();
        ChatModule.init();
        MiscModule.init();
        SafetyModule.init();
    }
}