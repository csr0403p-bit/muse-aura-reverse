package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class BrowserViewerSession$inputFocusRegistration$1 extends C7438Evz implements G0U<BrowserInputFocusEvent, Unit> {
    public BrowserViewerSession$inputFocusRegistration$1(Object obj) {
        super(1, obj, BrowserViewerSession.class, "onBrowserInputFocus", "onBrowserInputFocus(Lcom/facebook/aura/vmbrowser/runtime/BrowserInputFocusEvent;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BrowserInputFocusEvent browserInputFocusEvent) {
        ((BrowserViewerSession) AnonymousClass006.A0o(browserInputFocusEvent, this)).onBrowserInputFocus(browserInputFocusEvent);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BrowserInputFocusEvent browserInputFocusEvent) {
        invoke2(browserInputFocusEvent);
        return Unit.INSTANCE;
    }
}
