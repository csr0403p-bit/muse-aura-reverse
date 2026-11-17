package com.facebook.aura.vds.compose.controls;

import X.AXN;
import X.AbstractC7559F3s;
import X.C1BO;
import X.C1DG;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class AuraSwitchKt$AuraSwitch$2$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C1BO<C1DG> $thumbOffset$delegate;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m2532invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return axn.Abr(C1BO.A00(this.$thumbOffset$delegate)) << 32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwitchKt$AuraSwitch$2$1$1(C1BO<C1DG> c1bo) {
        super(1);
        this.$thumbOffset$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m2532invokeBjo55l4(axn));
    }
}
