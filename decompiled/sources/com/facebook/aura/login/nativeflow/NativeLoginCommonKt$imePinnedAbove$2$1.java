package com.facebook.aura.login.nativeflow;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C1Ny;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$imePinnedAbove$2$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ C1Ny $navigationBarInsets;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1290invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        int iACy = this.$imeInsets.ACy(axn) - this.$navigationBarInsets.ACy(axn);
        if (iACy < 0) {
            iACy = 0;
        }
        return AnonymousClass005.A0N(-iACy);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$imePinnedAbove$2$1(C1Ny c1Ny, C1Ny c1Ny2) {
        super(1);
        this.$imeInsets = c1Ny;
        this.$navigationBarInsets = c1Ny2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1290invokeBjo55l4(axn));
    }
}
