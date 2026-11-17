package com.facebook.aura.ui;

import X.ATD;
import X.AW9;
import X.AaI;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C16Z;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1279AgP;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPullToRefreshKt$HatchPTRLoaderMark$1$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ Function0<Float> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        float fA03 = AnonymousClass003.A03(c16z.AKb()) * ATD.A03(AnonymousClass003.A04(this.$progress), 0.0f, 1.0f);
        float fA00 = AnonymousClass004.A00(c16z.AKb());
        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.A6N(0.0f, 0.0f, fA03, fA00, 1);
            c16z.A9O();
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPTRLoaderMark$1$1$1(Function0<Float> function0) {
        super(1);
        this.$progress = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
