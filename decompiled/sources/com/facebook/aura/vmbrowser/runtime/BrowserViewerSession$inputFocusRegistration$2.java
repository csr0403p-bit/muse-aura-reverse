package com.facebook.aura.vmbrowser.runtime;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class BrowserViewerSession$inputFocusRegistration$2 extends C7438Evz implements Function0<Unit> {
    public BrowserViewerSession$inputFocusRegistration$2(Object obj) {
        super(0, obj, BrowserViewerSession.class, "dismissKeyboard", "dismissKeyboard()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BrowserViewerSession) this.receiver).dismissKeyboard();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
