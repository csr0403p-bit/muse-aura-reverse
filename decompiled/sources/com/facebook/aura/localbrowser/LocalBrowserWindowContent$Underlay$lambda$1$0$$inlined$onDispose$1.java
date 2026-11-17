package com.facebook.aura.localbrowser;

import X.C78g;

/* loaded from: classes2.dex */
public final class LocalBrowserWindowContent$Underlay$lambda$1$0$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ AutoCloseable $host$inlined;

    public LocalBrowserWindowContent$Underlay$lambda$1$0$$inlined$onDispose$1(AutoCloseable autoCloseable) {
        this.$host$inlined = autoCloseable;
    }

    @Override // X.C78g
    public void dispose() throws Exception {
        this.$host$inlined.close();
    }
}
