package com.facebook.aura.ui;

import X.AXN;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1Ny;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class BrowserScreenshotSizeKt$browserScreenshotSize$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ float $aspectRatio;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ int $fallbackHeight;
    public final /* synthetic */ int $fallbackWidth;
    public final /* synthetic */ C1Ny $insets;
    public final /* synthetic */ long $layoutSize;

    /* renamed from: com.facebook.aura.ui.BrowserScreenshotSizeKt$browserScreenshotSize$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$placeable, 0, 0);
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
    public BrowserScreenshotSizeKt$browserScreenshotSize$1$1(long j, int i, int i2, C1Ny c1Ny, AXN axn, float f) {
        super(3);
        this.$layoutSize = j;
        this.$fallbackWidth = i;
        this.$fallbackHeight = i2;
        this.$insets = c1Ny;
        this.$density = axn;
        this.$aspectRatio = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2312invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2312invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1a = AnonymousClass002.A1a(axy, c3tg);
        long j2 = this.$layoutSize;
        int iA01 = (int) (j2 >> 32);
        if (iA01 <= 0) {
            iA01 = this.$fallbackWidth;
        }
        int iA09 = AnonymousClass002.A09(j2);
        if (iA09 <= 0) {
            iA09 = this.$fallbackHeight;
        }
        int iALn = (iA09 - this.$insets.ALn(this.$density)) - this.$insets.ACy(this.$density);
        if (iALn < A1a) {
            iALn = 1;
        }
        if (Constraints.A0A(j)) {
            iA01 = Constraints.A01(j);
        }
        int iA02 = AYL.A02(j, iA01);
        float f = this.$aspectRatio;
        if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f) {
            f = 1.7777778f;
        }
        int iA012 = Ab3.A01(iA02 / f);
        int iA013 = Ab3.A01(iALn * 0.5f);
        if (iA012 > iA013) {
            iA012 = iA013;
        }
        int iA014 = AYL.A01(j, iA012);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(c3tg.AQW(Constraints.A04(iA02, iA014))), iA02, iA014);
    }
}
