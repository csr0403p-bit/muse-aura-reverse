package com.facebook.aura.shopping.view;

import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$horizontalBleed$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ float $bleed;

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$horizontalBleed$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ int $bleedPx;
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, -this.$bleedPx, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, int i) {
            super(1);
            this.$placeable = aze;
            this.$bleedPx = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsBodyKt$horizontalBleed$1(float f) {
        super(3);
        this.$bleed = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2073invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2073invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
        int iAbr = axy.Abr(this.$bleed);
        int i = iAbr * 2;
        AZE azeAQW = c3tg.AQW(AYL.A08(j, i, zA1b ? 1 : 0));
        return AXY.A01(axy, new AnonymousClass1(azeAQW, iAbr), azeAQW.A01 - i, azeAQW.A00);
    }
}
