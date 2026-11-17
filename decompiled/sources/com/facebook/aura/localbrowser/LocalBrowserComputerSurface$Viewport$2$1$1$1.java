package com.facebook.aura.localbrowser;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserComputerSurface$Viewport$2$1$1$1 extends C7438Evz implements G0U<String, Boolean> {
    public LocalBrowserComputerSurface$Viewport$2$1$1$1(Object obj) {
        super(1, obj, LocalBrowserTarget.class, "navigateFromUser", "navigateFromUser(Ljava/lang/String;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(String str) {
        return Boolean.valueOf(((LocalBrowserTarget) AnonymousClass006.A0o(str, this)).navigateFromUser(str));
    }
}
