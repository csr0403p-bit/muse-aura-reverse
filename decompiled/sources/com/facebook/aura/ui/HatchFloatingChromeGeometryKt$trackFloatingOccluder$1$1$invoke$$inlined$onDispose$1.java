package com.facebook.aura.ui;

import X.C78g;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$trackFloatingOccluder$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry$inlined;

    public HatchFloatingChromeGeometryKt$trackFloatingOccluder$1$1$invoke$$inlined$onDispose$1(HatchFloatingChromeGeometry hatchFloatingChromeGeometry) {
        this.$geometry$inlined = hatchFloatingChromeGeometry;
    }

    @Override // X.C78g
    public void dispose() {
        this.$geometry$inlined.setFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(null);
    }
}
