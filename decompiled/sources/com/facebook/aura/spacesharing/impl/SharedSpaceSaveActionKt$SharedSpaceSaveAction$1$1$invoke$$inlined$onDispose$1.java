package com.facebook.aura.spacesharing.impl;

import X.C78g;

/* loaded from: classes3.dex */
public final class SharedSpaceSaveActionKt$SharedSpaceSaveAction$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ SharedSpaceSaveViewModel $model$inlined;

    public SharedSpaceSaveActionKt$SharedSpaceSaveAction$1$1$invoke$$inlined$onDispose$1(SharedSpaceSaveViewModel sharedSpaceSaveViewModel) {
        this.$model$inlined = sharedSpaceSaveViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$model$inlined.cancelPendingWork();
    }
}
