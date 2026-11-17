package com.facebook.aura.header.view;

import X.ATD;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillMetricsKt$hatchStatusPillEnvelope$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ Function0<Float> $avatarPresence;
    public final /* synthetic */ float $avatarSlot;

    /* renamed from: com.facebook.aura.header.view.HatchStatusPillMetricsKt$hatchStatusPillEnvelope$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ Function0<Float> $avatarPresence;
        public final /* synthetic */ AZE $placeable;
        public final /* synthetic */ int $top;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$placeable, 0, Ab3.A01(this.$top * AnonymousClass003.A00(AnonymousClass003.A04(this.$avatarPresence))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, int i, Function0<Float> function0) {
            super(1);
            this.$placeable = aze;
            this.$top = i;
            this.$avatarPresence = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillMetricsKt$hatchStatusPillEnvelope$1(float f, Function0<Float> function0) {
        super(3);
        this.$avatarSlot = f;
        this.$avatarPresence = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1018invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1018invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
        int iA04 = ATD.A04(axy.Abr(this.$avatarSlot), zA1b ? 1 : 0, Constraints.A00(j));
        AZE azeAQW = c3tg.AQW(AYL.A08(j, zA1b ? 1 : 0, -iA04));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, iA04, this.$avatarPresence), azeAQW.A01, iA04 + azeAQW.A00);
    }
}
