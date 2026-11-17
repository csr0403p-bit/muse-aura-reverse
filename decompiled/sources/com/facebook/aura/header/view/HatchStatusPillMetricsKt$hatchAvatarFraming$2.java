package com.facebook.aura.header.view;

import X.AWA;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AaC;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C15k;
import X.C2av;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillMetricsKt$hatchAvatarFraming$2 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AWA $content;
    public final /* synthetic */ Function0<Float> $fraction;

    /* renamed from: com.facebook.aura.header.view.HatchStatusPillMetricsKt$hatchAvatarFraming$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ AWA $content;
        public final /* synthetic */ Function0<Float> $fraction;
        public final /* synthetic */ long $viewport;

        /* renamed from: com.facebook.aura.header.view.HatchStatusPillMetricsKt$hatchAvatarFraming$2$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01841 extends AbstractC7559F3s implements G0U<C2av, Unit> {
            public final /* synthetic */ AZE $child;
            public final /* synthetic */ AWA $content;
            public final /* synthetic */ Function0<Float> $fraction;
            public final /* synthetic */ long $viewport;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C2av c2av) {
                C7384Etj.A0Y(c2av, 0);
                AWA awa = this.$content;
                AaC aaCM1013avatarContentBoundsVgWVRYQ = HatchStatusPillMetricsKt.m1013avatarContentBoundsVgWVRYQ(awa != null ? awa.A00 : this.$viewport, this.$viewport, AnonymousClass003.A04(this.$fraction));
                long jA0J = AnonymousClass005.A0J(0.0f, 0.0f);
                long j = C15k.A01;
                c2av.Af4(jA0J);
                float f = aaCM1013avatarContentBoundsVgWVRYQ.A02;
                float f2 = aaCM1013avatarContentBoundsVgWVRYQ.A01;
                float f3 = f - f2;
                AZE aze = this.$child;
                int i = aze.A01;
                if (i < 1) {
                    i = 1;
                }
                c2av.AeX(f3 / i);
                float f4 = aaCM1013avatarContentBoundsVgWVRYQ.A00;
                float f5 = aaCM1013avatarContentBoundsVgWVRYQ.A03;
                float f6 = f4 - f5;
                int i2 = aze.A00;
                if (i2 < 1) {
                    i2 = 1;
                }
                c2av.AeY(f6 / i2);
                c2av.Af5(f2);
                c2av.Af6(f5);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01841(AWA awa, long j, Function0<Float> function0, AZE aze) {
                super(1);
                this.$content = awa;
                this.$viewport = j;
                this.$fraction = function0;
                this.$child = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
                invoke2(c2av);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AZE aze = this.$child;
            ayu.A0C(aze, new C01841(this.$content, this.$viewport, this.$fraction, aze), 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, AWA awa, long j, Function0<Float> function0) {
            super(1);
            this.$child = aze;
            this.$content = awa;
            this.$viewport = j;
            this.$fraction = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillMetricsKt$hatchAvatarFraming$2(AWA awa, Function0<Float> function0) {
        super(3);
        this.$content = awa;
        this.$fraction = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1017invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1017invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        int iA01 = Constraints.A01(j);
        int iA00 = Constraints.A00(j);
        long jA0A = AnonymousClass007.A0A(iA01, iA00);
        AWA awa = this.$content;
        if (awa != null) {
            jA0A = awa.A00;
        }
        AaC aaCM1013avatarContentBoundsVgWVRYQ = HatchStatusPillMetricsKt.m1013avatarContentBoundsVgWVRYQ(jA0A, jA0A, 1.0f);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(c3tg.AQW(Constraints.A04(Ab3.A01(aaCM1013avatarContentBoundsVgWVRYQ.A02 - aaCM1013avatarContentBoundsVgWVRYQ.A01), Ab3.A01(aaCM1013avatarContentBoundsVgWVRYQ.A00 - aaCM1013avatarContentBoundsVgWVRYQ.A03))), this.$content, jA0A, this.$fraction), iA01, iA00);
    }
}
