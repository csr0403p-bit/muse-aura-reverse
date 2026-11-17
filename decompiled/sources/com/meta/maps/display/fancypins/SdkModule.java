package com.meta.maps.display.fancypins;

import X.ETi;
import com.meta.maps.core.SdkModuleBase;

/* loaded from: classes4.dex */
public final class SdkModule extends SdkModuleBase {
    public static final SdkModule INSTANCE = new SdkModule();
    public static final String name = "maps-jni-display-fancypins";

    @Override // com.meta.maps.core.SdkModuleBase
    public String getName() {
        return name;
    }

    @Override // com.meta.maps.core.SdkModuleBase
    public void internalLoad() {
        ETi.loadLibrary(SdkModuleKt.SO_NAME, 16);
    }
}
