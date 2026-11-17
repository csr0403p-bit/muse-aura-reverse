package com.meta.maps.core;

import X.ETi;

/* loaded from: classes4.dex */
public final class SdkModule extends SdkModuleBase {
    public static final SdkModule INSTANCE = new SdkModule();
    public static final String name = "maps-jni-core";

    @Override // com.meta.maps.core.SdkModuleBase
    public String getName() {
        return name;
    }

    @Override // com.meta.maps.core.SdkModuleBase
    public void internalLoad() {
        ETi.loadLibrary(SdkModuleKt.SO_NAME, 16);
    }
}
