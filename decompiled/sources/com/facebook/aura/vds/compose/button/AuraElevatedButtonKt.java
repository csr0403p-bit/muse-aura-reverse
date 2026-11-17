package com.facebook.aura.vds.compose.button;

import X.AKQ;
import X.ARD;
import X.AVy;
import X.AXN;
import X.AYD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1b8;
import X.C2VU;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.accessibility.AuraHapticsKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.surface.AuraElevatedColors;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraElevatedButtonKt {
    public static final int BADGE_SIZE_DP = 8;
    public static final float PILL_MIN_HEIGHT = 44.0f;
    public static final float SIN_45 = 0.70711f;

    /* renamed from: com.facebook.aura.vds.compose.button.AuraElevatedButtonKt$AuraButtonBadge$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraElevatedButtonKt.AuraButtonBadge(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* renamed from: AuraElevatedIconButton-Xjqr6CI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2417AuraElevatedIconButtonXjqr6CI(X.AVy r39, java.lang.String r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.BRg r42, boolean r43, float r44, com.facebook.aura.vds.compose.icons.AuraIconSize r45, X.B6A r46, X.BRg r47, boolean r48, boolean r49, X.BFM r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.button.AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(X.AVy, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, boolean, float, com.facebook.aura.vds.compose.icons.AuraIconSize, X.B6A, X.BRg, boolean, boolean, X.BFM, int, int, int):void");
    }

    /* renamed from: AuraElevatedIconSurface-7poYlZM, reason: not valid java name */
    public static final void m2418AuraElevatedIconSurface7poYlZM(AVy aVy, String str, Function0<Unit> function0, BRg bRg, boolean z, float f, AuraIconSize auraIconSize, B6A b6a, BRg bRg2, boolean z2, BFM bfm, int i, int i2) {
        Function0<Unit> function02;
        BRg bRg3 = bRg;
        boolean z3 = z;
        float f2 = f;
        AuraIconSize auraIconSize2 = auraIconSize;
        B6A b6a2 = b6a;
        BRg bRg4 = bRg2;
        boolean z4 = z2;
        bfm.AgG(-532761465);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aVy, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg3);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z3);
        }
        int i5 = i2 & 32;
        int iA09 = 196608;
        if (i5 != 0) {
            iA05 |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f2);
            iA05 |= iA09;
        }
        int i6 = i2 & 64;
        int iA0I = 1572864;
        if (i6 != 0) {
            iA05 |= iA0I;
        } else if ((i & 1572864) == 0) {
            iA0I = AnonymousClass004.A0I(bfm, AnonymousClass003.A0M(auraIconSize2));
            iA05 |= iA0I;
        }
        int i7 = i2 & 128;
        int iA0k = 12582912;
        if (i7 != 0) {
            iA05 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, b6a2);
            iA05 |= iA0k;
        }
        int i8 = i2 & 256;
        int iA0l = 100663296;
        if (i8 != 0) {
            iA05 |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg4);
            iA05 |= iA0l;
        }
        int i9 = i2 & 512;
        int iA0w = 805306368;
        if (i9 != 0) {
            iA05 |= iA0w;
        } else if ((i & 805306368) == 0) {
            i9 = 0;
            iA0w = AnonymousClass004.A0w(bfm, z4);
            iA05 |= iA0w;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 306783379, 306783378), bfm, iA05)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                f2 = 48.0f;
            }
            if (i6 != 0) {
                auraIconSize2 = AuraIconSize.SMALL;
            }
            if (i7 != 0) {
                b6a2 = null;
            }
            if (i8 != 0) {
                bRg4 = BRg.A00;
            }
            if (i9 != 0) {
                z4 = true;
            }
            AuraElevatedColors auraElevatedColorsRememberAuraElevatedColors = AuraElevatedSurfaceKt.rememberAuraElevatedColors(bfm, 0);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            boolean zA1L = AnonymousClass005.A1L(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1L || objAaT2 == obj) {
                objAaT2 = new AuraElevatedButtonKt$AuraElevatedIconSurface$1$1(z3);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA07 = C10G.A07(ARD.A01(bRg3, (G0U) objAaT2, true), f2);
            if (z3 && z4) {
                function02 = null;
                bRgA07 = bRgA07.then(AuraHapticsKt.m2392auraHapticZShFqVg(BRg.A00, AuraHaptics.BUTTON_TAP, true));
            } else {
                function02 = null;
            }
            C1D3 c1d3 = C1D8.A00;
            if (z3) {
                function02 = function0;
            }
            BRg bRgAuraElevatedSurface = AuraElevatedSurfaceKt.auraElevatedSurface(bRgA07, auraElevatedColorsRememberAuraElevatedColors, c1d3, interfaceC1072AWd, function02);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i10 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgAuraElevatedSurface);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, i10);
            AuraIconKt.m2567AuraIconFHprtrg(bRg4, aVy, auraIconSize2, str, !z3 ? auraColorsA0c.primaryIcon.disabled : b6a2 != null ? b6a2.A00 : auraColorsA0c.primaryIcon.enabled, null, bfm, ((iA05 >> 24) & 14) | (AVy.$stable << 3) | ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 12) & 896) | ((iA05 << 6) & 7168), 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraElevatedButtonKt$AuraElevatedIconSurface$4(aVy, str, function0, bRg3, z3, f2, auraIconSize2, b6a2, bRg4, z4, i, i2);
        }
    }

    /* renamed from: AuraMultiIconButtonPill-942rkJo, reason: not valid java name */
    public static final void m2419AuraMultiIconButtonPill942rkJo(List<AuraMultiIconButtonPillEntry> list, BRg bRg, float f, AuraIconSize auraIconSize, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> auraElevatedButtonKt$AuraMultiIconButtonPill$3;
        float f2 = f;
        BRg bRg2 = bRg;
        AuraIconSize auraIconSize2 = auraIconSize;
        C7384Etj.A0Y(list, 0);
        bfm.AgG(-303733646);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(auraIconSize2));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 44.0f;
            }
            if (i5 != 0) {
                auraIconSize2 = AuraIconSize.SMALL;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    auraElevatedButtonKt$AuraMultiIconButtonPill$3 = new AuraElevatedButtonKt$AuraMultiIconButtonPill$1(list, bRg2, f2, auraIconSize2, i, i2);
                    bBbAAc.A06 = auraElevatedButtonKt$AuraMultiIconButtonPill$3;
                }
                return;
            }
            m2420AuraPillButtonq88KkHs(null, bRg2, false, 2.0f, 8.0f, 0.0f, false, B1V.A00(bfm, new AuraElevatedButtonKt$AuraMultiIconButtonPill$2(list, f2, AnonymousClass002.A0c(bfm), auraIconSize2), -55968624), bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 12610950, 96);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            auraElevatedButtonKt$AuraMultiIconButtonPill$3 = new AuraElevatedButtonKt$AuraMultiIconButtonPill$3(list, bRg2, f2, auraIconSize2, i, i2);
            bBbAAc.A06 = auraElevatedButtonKt$AuraMultiIconButtonPill$3;
        }
    }

    /* renamed from: AuraPillButton-q88KkHs, reason: not valid java name */
    public static final void m2420AuraPillButtonq88KkHs(Function0<Unit> function0, BRg bRg, boolean z, float f, float f2, float f3, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> auraElevatedButtonKt$AuraPillButton$3;
        BRg bRg2 = bRg;
        boolean z3 = z;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        boolean z4 = z2;
        C7384Etj.A0Y(g0v, 7);
        bfm.AgG(-1108044788);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z3);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f4);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A08(bfm, f5);
        }
        int i7 = i2 & 32;
        int iA09 = 196608;
        if (i7 != 0) {
            iA0T |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f6);
            iA0T |= iA09;
        }
        int i8 = i2 & 64;
        int iA0t = 1572864;
        if (i8 != 0) {
            iA0T |= iA0t;
        } else if ((1572864 & i) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z4);
            iA0T |= iA0t;
        }
        if ((12582912 & i) == 0) {
            iA0T |= AnonymousClass004.A0a(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                f4 = 12.0f;
            }
            if (i6 != 0) {
                f5 = 12.0f;
            }
            if (i7 != 0) {
                f6 = 100.0f;
            }
            if (i8 != 0) {
                z4 = false;
            }
            if (!z4) {
                bfm.AgE(1356678662);
                m2421AuraPillSurfaceeiMxS0Y(function0, bRg2, z3, f4, f5, f6, g0v, bfm, (524286 & iA0T) | ((iA0T >> 3) & 3670016), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    auraElevatedButtonKt$AuraPillButton$3 = new AuraElevatedButtonKt$AuraPillButton$1(function0, bRg2, z3, f4, f5, f6, false, g0v, i, i2);
                    bBbAAc.A06 = auraElevatedButtonKt$AuraPillButton$3;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1356970806);
            int i9 = iA0T >> 3;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, new C1DG(PILL_MIN_HEIGHT));
            }
            MutableState mutableState = (MutableState) objAaT;
            BS0 bs0 = BRg.A00;
            boolean zA65 = bfm.A65(axnA0Y);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new AuraElevatedButtonKt$AuraPillButton$2$1$1(axnA0Y, mutableState);
                bfm.Ai0(objAaT2);
            }
            m2421AuraPillSurfaceeiMxS0Y(function0, BIj.A00(bs0, (G0U) objAaT2), z3, f4, f5, f6, g0v, bfm, (iA0T & 524174) | (i9 & 3670016), 0);
            C1DG c1dg = new C1DG(f6);
            C1DG c1dg2 = new C1DG(AuraPillButton_q88KkHs$lambda$0$1(mutableState) / 2.0f);
            if (c1dg.compareTo(c1dg2) <= 0) {
                c1dg2 = c1dg;
            }
            m2422CornerBadgeziNgDLE(c0z7, c1dg2.A00, bfm, 6);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            auraElevatedButtonKt$AuraPillButton$3 = new AuraElevatedButtonKt$AuraPillButton$3(function0, bRg2, z3, f4, f5, f6, z4, g0v, i, i2);
            bBbAAc.A06 = auraElevatedButtonKt$AuraPillButton$3;
        }
    }

    /* renamed from: AuraPillSurface-eiMxS0Y, reason: not valid java name */
    public static final void m2421AuraPillSurfaceeiMxS0Y(Function0<Unit> function0, BRg bRg, boolean z, float f, float f2, float f3, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        boolean z2 = z;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        BRg bRg2 = bRg;
        bfm.AgG(-876050655);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f4);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A08(bfm, f5);
        }
        int i7 = i2 & 32;
        int iA09 = 196608;
        if (i7 != 0) {
            iA0T |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f6);
            iA0T |= iA09;
        }
        if ((i & 1572864) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                f4 = 12.0f;
            }
            if (i6 != 0) {
                f5 = 12.0f;
            }
            if (i7 != 0) {
                f6 = 100.0f;
            }
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(bRg2, f6, function0, B1V.A00(bfm, new AuraElevatedButtonKt$AuraPillSurface$1(z2, f5, f4, g0v), -141806113), bfm, AnonymousClass003.A08(iA0T >> 12, ((iA0T >> 3) & 14) | 3072, iA0T), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraElevatedButtonKt$AuraPillSurface$2(function0, bRg2, z2, f4, f5, f6, g0v, i, i2);
        }
    }

    public static final void AuraButtonBadge(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1431409043);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C3Ue.A04(C1b8.A03(C10G.A07(bRg, 8.0f), C1D8.A00, C06G.A0D(bfm)), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final float AuraPillButton_q88KkHs$lambda$0$1(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }

    /* renamed from: CornerBadge-ziNgDLE, reason: not valid java name */
    public static final void m2422CornerBadgeziNgDLE(InterfaceC05151eP interfaceC05151eP, float f, BFM bfm, int i) {
        bfm.AgG(-1991569201);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            float f2 = (0.29289f * f) - (8.0f / 2.0f);
            AuraButtonBadge(AYD.A01(interfaceC05151eP.A4C(C2VU.A0D, BRg.A00), -f2, f2), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraElevatedButtonKt$CornerBadge$1(interfaceC05151eP, f, i);
        }
    }
}
