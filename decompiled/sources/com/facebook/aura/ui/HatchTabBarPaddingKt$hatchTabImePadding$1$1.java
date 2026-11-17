package com.facebook.aura.ui;

import X.ATD;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C1Ny;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabBarPaddingKt$hatchTabImePadding$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ float $reservedBottom;

    /* renamed from: com.facebook.aura.ui.HatchTabBarPaddingKt$hatchTabImePadding$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$placeable = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabBarPaddingKt$hatchTabImePadding$1$1(C1Ny c1Ny, float f) {
        super(3);
        this.$imeInsets = c1Ny;
        this.$reservedBottom = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2330invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2330invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1b = AnonymousClass004.A1b(axy, c3tg);
        int iACy = this.$imeInsets.ACy(axy) - axy.Abr(this.$reservedBottom);
        if (iACy < A1b) {
            iACy = 0;
        }
        int iA02 = Constraints.A02(j);
        int i = iA02 - iACy;
        if (i < A1b) {
            i = 0;
        }
        int iA00 = Constraints.A00(j);
        int i2 = iA00 - iACy;
        if (i2 < A1b) {
            i2 = 0;
        }
        int iA03 = Constraints.A03(j);
        int iA01 = Constraints.A01(j);
        AZE azeAQW = c3tg.AQW(Constraints.A05(iA03, iA01, i, i2));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), ATD.A04(azeAQW.A01, iA03, iA01), ATD.A04(azeAQW.A00 + iACy, iA02, iA00));
    }
}
