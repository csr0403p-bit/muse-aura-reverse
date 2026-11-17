package com.facebook.aura.partners.voice.screen;

import X.ATD;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BLU;
import X.BRg;
import X.C2av;
import X.C3TG;
import X.C3UC;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import android.os.Build;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchSystemPipGeometryKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchSystemPipGeometryKt$systemPipAvatarLayout$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ HatchSystemPipGeometry $geometry;

        /* renamed from: com.facebook.aura.partners.voice.screen.HatchSystemPipGeometryKt$systemPipAvatarLayout$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02971 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ BLU $bounds;
            public final /* synthetic */ AZE $child;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AZE aze = this.$child;
                BLU blu = this.$bounds;
                ayu.A0C(aze, C02981.INSTANCE, blu.A01, blu.A03);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02971(AZE aze, BLU blu) {
                super(1);
                this.$child = aze;
                this.$bounds = blu;
            }

            /* renamed from: com.facebook.aura.partners.voice.screen.HatchSystemPipGeometryKt$systemPipAvatarLayout$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02981 extends AbstractC7559F3s implements G0U<C2av, Unit> {
                public static final C02981 INSTANCE = new C02981();

                public C02981() {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(C2av c2av) {
                    C7384Etj.A0Y(c2av, 0);
                    c2av.Ad2(true);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
                    invoke2(c2av);
                    return Unit.INSTANCE;
                }
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchSystemPipGeometry hatchSystemPipGeometry) {
            super(3);
            this.$geometry = hatchSystemPipGeometry;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m1738invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m1738invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            BLU blu;
            AnonymousClass003.A0u(axy, c3tg);
            int iA01 = Constraints.A01(j);
            int iA00 = Constraints.A00(j);
            HatchSystemPipGeometry hatchSystemPipGeometry = this.$geometry;
            if (hatchSystemPipGeometry == null || hatchSystemPipGeometry.windowSize != AnonymousClass007.A0C(iA01, iA00)) {
                int iMin = Math.min(iA01, iA00);
                int i = (iA01 - iMin) / 2;
                int i2 = (iA00 - iMin) / 2;
                blu = new BLU(i, i2, i + iMin, iMin + i2);
            } else {
                blu = hatchSystemPipGeometry.avatarBounds;
            }
            return AXY.A01(axy, new C02971(c3tg.AQW(Constraints.A04(blu.A02 - blu.A01, blu.A00 - blu.A03)), blu), iA01, iA00);
        }
    }

    /* renamed from: pipSourceSquare-JVtK1S4, reason: not valid java name */
    public static final BLU m1736pipSourceSquareJVtK1S4(BLU blu, long j, float f) {
        C7384Etj.A0Y(blu, 0);
        int i = (int) (j >> 32);
        int iA09 = AnonymousClass002.A09(j);
        int iMin = Math.min(i, iA09);
        int iMax = Math.max(blu.A02 - blu.A01, Math.max(blu.A00 - blu.A03, Math.max((int) (180.0f * f), iMin / 2)));
        if (iMax <= iMin) {
            iMin = iMax;
        }
        long jA00 = blu.A00();
        int i2 = iMin / 2;
        int iA04 = ATD.A04(((int) (jA00 >> 32)) - i2, 0, i - iMin);
        int iA042 = ATD.A04(AnonymousClass002.A09(jA00) - i2, 0, iA09 - iMin);
        return new BLU(iA04, iA042, iA04 + iMin, iMin + iA042);
    }

    /* renamed from: pogPipSourceSquare--HDNwks, reason: not valid java name */
    public static final BLU m1737pogPipSourceSquareHDNwks(BLU blu, long j, float f, int i, boolean z) {
        C7384Etj.A0Y(blu, 0);
        BLU bluM1736pipSourceSquareJVtK1S4 = m1736pipSourceSquareJVtK1S4(blu, j, f);
        int iMax = Math.max(bluM1736pipSourceSquareJVtK1S4.A02 - bluM1736pipSourceSquareJVtK1S4.A01, i + Ab3.A01(4.0f * f));
        int i2 = (int) (j >> 32);
        int iA09 = AnonymousClass002.A09(j);
        int iMin = Math.min(i2, iA09);
        if (iMax <= iMin) {
            iMin = iMax;
        }
        if (z) {
            return new BLU(0, 0, iMin, iMin);
        }
        long jA00 = blu.A00();
        int i3 = iMin / 2;
        int iA04 = ATD.A04(((int) (jA00 >> 32)) - i3, 0, i2 - iMin);
        int iA042 = ATD.A04(AnonymousClass002.A09(jA00) - i3, 0, iA09 - iMin);
        return new BLU(iA04, iA042, iA04 + iMin, iMin + iA042);
    }

    public static final BRg systemPipAvatarLayout(BRg bRg, HatchSystemPipGeometry hatchSystemPipGeometry) {
        C7384Etj.A0Y(bRg, 0);
        return C3UC.A00(bRg, new AnonymousClass1(hatchSystemPipGeometry));
    }

    /* renamed from: centeredPipGeometry-ozmzZPI, reason: not valid java name */
    public static final HatchSystemPipGeometry m1735centeredPipGeometryozmzZPI(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        int iMin = Math.min(i, i2) / 2;
        if (iMin <= 0) {
            return null;
        }
        int i3 = (i - iMin) / 2;
        int i4 = (i2 - iMin) / 2;
        BLU blu = new BLU(i3, i4, i3 + iMin, iMin + i4);
        return new HatchSystemPipGeometry(j, blu, Build.VERSION.SDK_INT < 34 ? blu : null, false);
    }
}
