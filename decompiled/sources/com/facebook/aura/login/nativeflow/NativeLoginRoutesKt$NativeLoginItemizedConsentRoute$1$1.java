package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$1$1 extends C7438Evz implements G0V<Integer, Boolean, Unit> {
    public NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$1$1(Object obj) {
        super(2, obj, NativeLoginViewModel.class, "onItemizedConsentItemToggled", "onItemizedConsentItemToggled(IZ)V", 0);
    }

    public final void invoke(int i, boolean z) {
        ((NativeLoginViewModel) this.receiver).onItemizedConsentItemToggled(i, z);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
