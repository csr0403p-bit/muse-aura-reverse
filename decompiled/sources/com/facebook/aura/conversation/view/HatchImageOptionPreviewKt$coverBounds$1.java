package com.facebook.aura.conversation.view;

import X.AWA;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C2av;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$coverBounds$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ long $size;

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$coverBounds$1$1, reason: invalid class name */
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

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$coverBounds$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ long $constraints;
        public final /* synthetic */ AZE $placeable;
        public final /* synthetic */ long $size;

        /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$coverBounds$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
            public final /* synthetic */ float $scale;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C2av c2av) {
                C7384Etj.A0Y(c2av, 0);
                float f = this.$scale;
                c2av.AeX(f);
                c2av.AeY(f);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(float f) {
                super(1);
                this.$scale = f;
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
            long j = this.$constraints;
            int iA01 = Constraints.A01(j);
            long j2 = this.$size;
            float fA03 = iA01 / AnonymousClass003.A03(j2);
            int iA00 = Constraints.A00(j);
            float fMax = Math.max(fA03, iA00 / AnonymousClass004.A00(j2));
            AZE aze = this.$placeable;
            ayu.A0C(aze, new AnonymousClass1(fMax), (iA01 - aze.A01) / 2, (iA00 - aze.A00) / 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, long j2, AZE aze) {
            super(1);
            this.$constraints = j;
            this.$size = j2;
            this.$placeable = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$coverBounds$1(long j) {
        super(3);
        this.$size = j;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m617invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m617invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        int iA01;
        int iA00;
        G0U anonymousClass2;
        AnonymousClass003.A0u(axy, c3tg);
        long j2 = this.$size;
        if (AWA.A06(j2)) {
            AZE azeAQW = c3tg.AQW(j);
            iA01 = azeAQW.A01;
            iA00 = azeAQW.A00;
            anonymousClass2 = new AnonymousClass1(azeAQW);
        } else {
            AZE azeAQW2 = c3tg.AQW(Constraints.A04(Ab3.A01(AnonymousClass003.A03(j2)), Ab3.A01(AnonymousClass004.A00(j2))));
            iA01 = Constraints.A01(j);
            iA00 = Constraints.A00(j);
            anonymousClass2 = new AnonymousClass2(j, this.$size, azeAQW2);
        }
        return AnonymousClass002.A0X(axy, anonymousClass2, iA01, iA00);
    }
}
