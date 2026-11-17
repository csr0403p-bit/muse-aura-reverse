package com.facebook.aura.main;

import X.C78g;

/* loaded from: classes.dex */
public final class MainWindowPictureInPictureHostKt$MainWindowPipParamsEffect$2$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ MainWindowPipController $controller$inlined;

    public MainWindowPictureInPictureHostKt$MainWindowPipParamsEffect$2$1$invoke$$inlined$onDispose$1(MainWindowPipController mainWindowPipController) {
        this.$controller$inlined = mainWindowPipController;
    }

    @Override // X.C78g
    public void dispose() {
        this.$controller$inlined.release();
    }
}
