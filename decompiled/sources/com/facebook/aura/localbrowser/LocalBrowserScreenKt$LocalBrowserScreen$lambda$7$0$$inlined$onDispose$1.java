package com.facebook.aura.localbrowser;

import X.C78g;

/* loaded from: classes2.dex */
public final class LocalBrowserScreenKt$LocalBrowserScreen$lambda$7$0$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ LocalBrowserComputerSurface $surface$inlined;

    public LocalBrowserScreenKt$LocalBrowserScreen$lambda$7$0$$inlined$onDispose$1(LocalBrowserComputerSurface localBrowserComputerSurface) {
        this.$surface$inlined = localBrowserComputerSurface;
    }

    @Override // X.C78g
    public void dispose() {
        this.$surface$inlined.closeViewer();
    }
}
