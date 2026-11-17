package com.facebook.aura.shopping.view;

import X.AT3;
import X.AW9;
import X.AaI;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1068ATy;
import X.InterfaceC1279AgP;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchStarRatingKt$RatingStar$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $emptyColor;
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ float $fillFraction;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        InterfaceC1068ATy interfaceC1068ATyM2047starPathuvyYCjk = HatchStarRatingKt.m2047starPathuvyYCjk(at3.AKb());
        long j = this.$emptyColor;
        C16a c16a = C16a.A00;
        at3.A9d(null, interfaceC1068ATyM2047starPathuvyYCjk, c16a, 1.0f, 3, j);
        float f = this.$fillFraction;
        if (f > 0.0f) {
            long jAKb = at3.AKb();
            float fA03 = AnonymousClass003.A03(jAKb) * f;
            long j2 = this.$fillColor;
            float fA00 = AnonymousClass004.A00(jAKb);
            InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
            AaI aaI = (AaI) interfaceC1279AgPAEq;
            AW9 aw9 = aaI.A02.A02;
            long jA00 = AW9.A00(aw9);
            try {
                aaI.A01.A6N(0.0f, 0.0f, fA03, fA00, 1);
                at3.A9d(null, interfaceC1068ATyM2047starPathuvyYCjk, c16a, 1.0f, 3, j2);
            } finally {
                AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStarRatingKt$RatingStar$1$1(long j, float f, long j2) {
        super(1);
        this.$emptyColor = j;
        this.$fillFraction = f;
        this.$fillColor = j2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
