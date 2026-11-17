package com.facebook.aura.localbrowser;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserRuntime$openSessionOnMain$engine$1$created$1 extends C7438Evz implements G0U<BrowserEngine, Unit> {
    public LocalBrowserRuntime$openSessionOnMain$engine$1$created$1(Object obj) {
        super(1, obj, LocalBrowserBlockedPolicy.class, "detach", "detach(Lcom/facebook/aura/localbrowser/core/BrowserEngine;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BrowserEngine browserEngine) {
        ((LocalBrowserBlockedPolicy) AnonymousClass006.A0o(browserEngine, this)).detach(browserEngine);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BrowserEngine browserEngine) {
        invoke2(browserEngine);
        return Unit.INSTANCE;
    }
}
