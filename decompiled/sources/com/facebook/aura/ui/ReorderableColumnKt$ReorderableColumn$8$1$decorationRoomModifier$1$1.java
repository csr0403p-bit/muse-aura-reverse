package com.facebook.aura.ui;

import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C00r;
import X.C1BO;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ReorderableColumnKt$ReorderableColumn$8$1$decorationRoomModifier$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ C00r $displayedRoomSourceHeight$delegate;
    public final /* synthetic */ C1BO<Float> $roomProgress;

    /* renamed from: com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$8$1$decorationRoomModifier$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;
        public final /* synthetic */ int $roomHeight;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$placeable, 0, this.$roomHeight);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, int i) {
            super(1);
            this.$placeable = aze;
            this.$roomHeight = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$ReorderableColumn$8$1$decorationRoomModifier$1$1(C1BO<Float> c1bo, C00r c00r) {
        super(3);
        this.$roomProgress = c1bo;
        this.$displayedRoomSourceHeight$delegate = c00r;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2335invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2335invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        int iA02 = Ab3.A02(this.$displayedRoomSourceHeight$delegate.AGd(), C1BO.A01(this.$roomProgress));
        return AXY.A01(axy, new AnonymousClass1(azeAQW, iA02), azeAQW.A01, azeAQW.A00 + iA02);
    }
}
