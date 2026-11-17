package com.facebook.aura.common.video;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BRg;
import X.C2av;
import X.C3TG;
import X.C3UC;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchVideoAlignmentKt {

    /* renamed from: com.facebook.aura.common.video.HatchVideoAlignmentKt$alignVideoOverflow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;

        /* renamed from: com.facebook.aura.common.video.HatchVideoAlignmentKt$alignVideoOverflow$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00671 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
            public final /* synthetic */ int $centeredOffset;
            public final /* synthetic */ AZE $child;

            /* renamed from: com.facebook.aura.common.video.HatchVideoAlignmentKt$alignVideoOverflow$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00681 extends AbstractC7559F3s implements G0U<C2av, Unit> {
                public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
                public final /* synthetic */ AZE $child;

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(C2av c2av) {
                    C7384Etj.A0Y(c2av, 0);
                    AZE aze = this.$child;
                    c2av.Af6((aze.A00 - aze.A0Y()) * AnonymousClass003.A00(AnonymousClass003.A04(this.$bottomAlignmentFraction)));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00681(AZE aze, Function0<Float> function0) {
                    super(1);
                    this.$child = aze;
                    this.$bottomAlignmentFraction = function0;
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
                ayu.A0C(aze, new C00681(aze, this.$bottomAlignmentFraction), 0, -this.$centeredOffset);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00671(AZE aze, int i, Function0<Float> function0) {
                super(1);
                this.$child = aze;
                this.$centeredOffset = i;
                this.$bottomAlignmentFraction = function0;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Float> function0) {
            super(3);
            this.$bottomAlignmentFraction = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m370invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m370invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            AZE azeAQW = c3tg.AQW(j);
            int iA0Y = (azeAQW.A00 - azeAQW.A0Y()) / 2;
            return AXY.A01(axy, new C00671(azeAQW, iA0Y, this.$bottomAlignmentFraction), azeAQW.A01, azeAQW.A00);
        }
    }

    public static final BRg alignVideoOverflow(BRg bRg, Function0<Float> function0) {
        AnonymousClass003.A0u(bRg, function0);
        return C3UC.A00(bRg, new AnonymousClass1(function0));
    }
}
