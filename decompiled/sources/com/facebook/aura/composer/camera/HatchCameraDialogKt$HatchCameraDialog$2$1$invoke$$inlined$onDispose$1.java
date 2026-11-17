package com.facebook.aura.composer.camera;

import X.C78g;

/* loaded from: classes2.dex */
public final class HatchCameraDialogKt$HatchCameraDialog$2$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HatchCameraSession $camera$inlined;

    public HatchCameraDialogKt$HatchCameraDialog$2$1$invoke$$inlined$onDispose$1(HatchCameraSession hatchCameraSession) {
        this.$camera$inlined = hatchCameraSession;
    }

    @Override // X.C78g
    public void dispose() {
        this.$camera$inlined.close();
    }
}
