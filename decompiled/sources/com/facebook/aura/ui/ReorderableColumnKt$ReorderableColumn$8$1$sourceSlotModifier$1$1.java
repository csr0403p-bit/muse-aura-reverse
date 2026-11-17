package com.facebook.aura.ui;

import X.AXY;
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
public final class ReorderableColumnKt$ReorderableColumn$8$1$sourceSlotModifier$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public static final ReorderableColumnKt$ReorderableColumn$8$1$sourceSlotModifier$1$1 INSTANCE = new ReorderableColumnKt$ReorderableColumn$8$1$sourceSlotModifier$1$1();

    /* renamed from: com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$8$1$sourceSlotModifier$1$1$1, reason: invalid class name */
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

    public ReorderableColumnKt$ReorderableColumn$8$1$sourceSlotModifier$1$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2337invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2337invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A01(axy, new AnonymousClass1(azeAQW), azeAQW.A01, zA1b ? 1 : 0);
    }
}
