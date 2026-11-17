package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$2$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$2$1(Object obj) {
        super(1, obj, NativeLoginViewModel.class, "onItemizedConsentAgreeToAllToggled", "onItemizedConsentAgreeToAllToggled(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((NativeLoginViewModel) this.receiver).onItemizedConsentAgreeToAllToggled(z);
    }
}
