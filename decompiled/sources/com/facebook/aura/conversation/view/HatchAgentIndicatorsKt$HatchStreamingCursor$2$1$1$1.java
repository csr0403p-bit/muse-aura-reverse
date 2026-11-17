package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C1BO;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchAgentIndicatorsKt$HatchStreamingCursor$2$1$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ int $i;
    public final /* synthetic */ C1BO<Float>[] $offsets;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m527invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return AnonymousClass005.A0N(axn.Abr(C1BO.A01(this.$offsets[this.$i])));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentIndicatorsKt$HatchStreamingCursor$2$1$1$1(C1BO<Float>[] c1boArr, int i) {
        super(1);
        this.$offsets = c1boArr;
        this.$i = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m527invokeBjo55l4(axn));
    }
}
