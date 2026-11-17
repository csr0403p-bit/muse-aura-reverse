package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraImageKt$RETRY_UNLESS_404$1 extends AbstractC7559F3s implements G0U<Throwable, Boolean> {
    public static final AuraImageKt$RETRY_UNLESS_404$1 INSTANCE = new AuraImageKt$RETRY_UNLESS_404$1();

    public AuraImageKt$RETRY_UNLESS_404$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Throwable th) {
        return C3cG.A0P(AuraImageKt.is404(th));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Throwable th) {
        return C3cG.A0P(AuraImageKt.is404(th));
    }
}
