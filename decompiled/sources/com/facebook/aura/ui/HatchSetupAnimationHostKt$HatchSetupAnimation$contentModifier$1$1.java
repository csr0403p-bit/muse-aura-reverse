package com.facebook.aura.ui;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C2ae;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimation$contentModifier$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ Integer $logoTopPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSetupAnimationHostKt$HatchSetupAnimation$contentModifier$1$1(Integer num) {
        super(1);
        this.$logoTopPx = num;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m2327invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m2327invokeBjo55l4(AXN axn) {
        return AnonymousClass005.A0N(this.$logoTopPx.intValue());
    }
}
