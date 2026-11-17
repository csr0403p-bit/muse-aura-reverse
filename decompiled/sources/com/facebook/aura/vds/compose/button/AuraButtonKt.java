package com.facebook.aura.vds.compose.button;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C1809ArT;
import X.C1822Arm;
import X.C1D8;
import X.C1DM;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.ext.IntExtKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraButtonDimensions;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraButtonKt {
    public static final String LOADING_TAG = "loading";
    public static final List<AuraButtonSize> SIZES_REGULAR = Arrays.asList(AuraButtonSize.SMALL, AuraButtonSize.MEDIUM, AuraButtonSize.LARGE);

    public static final C1DM toShape(AuraButtonCorner auraButtonCorner, AuraButtonSize auraButtonSize) {
        float f;
        boolean zA1a = AnonymousClass002.A1a(auraButtonCorner, auraButtonSize);
        int iOrdinal = auraButtonCorner.ordinal();
        if (iOrdinal == 0) {
            return C1D8.A00;
        }
        if (iOrdinal != zA1a) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal2 = auraButtonSize.ordinal();
        if (iOrdinal2 == 0) {
            f = 12.0f;
        } else if (iOrdinal2 == zA1a) {
            f = 16.0f;
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 18.0f;
        }
        return C1D8.A00(f);
    }

    public static final AuraLabelButtonStyle toStyle(AuraButtonStyle auraButtonStyle, AuraButtonCorner auraButtonCorner, BFM bfm, int i, int i2) {
        AuraLabelButtonStyle auraLabelButtonStylePrimary;
        C7384Etj.A0Y(auraButtonStyle, 0);
        if ((i2 & 1) != 0) {
            auraButtonCorner = AuraButtonCorner.PILL;
        }
        int iOrdinal = auraButtonStyle.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(1184837587);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(auraButtonCorner, bfm, ((i >> 3) & 14) | 48, 0);
        } else if (iOrdinal == 1) {
            bfm.AgE(1184839830);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primaryAlt(auraButtonCorner, bfm, ((i >> 3) & 14) | 48, 0);
        } else if (iOrdinal == 2) {
            bfm.AgE(1184842101);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.secondary(auraButtonCorner, bfm, ((i >> 3) & 14) | 48, 0);
        } else if (iOrdinal == 3) {
            bfm.AgE(1184844407);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.destructive(auraButtonCorner, bfm, ((i >> 3) & 14) | 48, 0);
        } else {
            if (iOrdinal != 4) {
                throw AnonymousClass005.A0k(bfm, 1184835894);
            }
            bfm.AgE(1184846676);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.elevated(auraButtonCorner, bfm, ((i >> 3) & 14) | 48, 0);
        }
        AnonymousClass001.A1D(bfm);
        return auraLabelButtonStylePrimary;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AuraButtonSize.values().length];
            try {
                AnonymousClass005.A0v(AuraButtonSize.SMALL, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonSize.MEDIUM, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonSize.LARGE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuraButtonStyle.values().length];
            try {
                AnonymousClass005.A0v(AuraButtonStyle.PRIMARY, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonStyle.PRIMARY_ALT, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonStyle.SECONDARY, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A16(AuraButtonStyle.DESTRUCTIVE, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A17(AuraButtonStyle.ELEVATED, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AuraButtonCorner.values().length];
            try {
                AnonymousClass005.A0v(AuraButtonCorner.PILL, iArr3, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonCorner.ROUNDED, iArr3, 2);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final List<AuraButtonSize> getSIZES_REGULAR() {
        return SIZES_REGULAR;
    }

    /* renamed from: ButtonText-VGr5R5M, reason: not valid java name */
    public static final void m2409ButtonTextVGr5R5M(String str, boolean z, AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, G0V<? super BFM, ? super Integer, C1822Arm> g0v, Function0<B6A> function0, AuraButtonAccessibility auraButtonAccessibility, C1YL c1yl, int i, BRg bRg, BFM bfm, int i2) {
        BRg bRgThen;
        int i3;
        long jM2544applyContentAlphaek8zF_U;
        bfm.AgG(-985775446);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, auraLabelButtonStyle);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, auraButtonSize.ordinal());
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i2) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, auraButtonAccessibility);
        }
        if ((12582912 & i2) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, c1yl);
        }
        if ((100663296 & i2) == 0) {
            iA0d |= AnonymousClass004.A0K(bfm, i);
        }
        if ((805306368 & i2) == 0) {
            iA0d |= AnonymousClass004.A0m(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(306783379 & iA0d, 306783378), bfm, iA0d)) {
            C1822Arm c1822ArmInvoke = g0v.invoke(bfm, Integer.valueOf((iA0d >> 12) & 14));
            if (c1822ArmInvoke == null) {
                if (z) {
                    bfm.AgE(1750474129);
                    C1822Arm c1822ArmTextStyle = auraLabelButtonStyle.textStyle(auraButtonSize, bfm, ((iA0d >> 9) & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                    c1822ArmInvoke = C1822Arm.A00(null, c1822ArmTextStyle, null, null, null, null, null, null, null, null, 0, 0, 0, 16777213, 0L, IntExtKt.getNonScaledSp((int) C1809ArT.A00(c1822ArmTextStyle.A02.A01), bfm, 0), 0L, 0L);
                } else {
                    bfm.AgE(1857586809);
                    c1822ArmInvoke = auraLabelButtonStyle.textStyle(auraButtonSize, bfm, ((iA0d >> 9) & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                }
                AnonymousClass002.A19(bfm);
            }
            if (str != null) {
                bfm.AgE(1750666794);
                B6A b6aInvoke = function0.invoke();
                bfm.AgE(1857592257);
                if (auraButtonAccessibility.overrideContentDescription != null) {
                    BS0 bs0 = BRg.A00;
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = AuraButtonKt$ButtonText$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    bRgThen = bRg.then(AnonymousClass001.A0X(bs0, objAaT));
                } else {
                    bRgThen = bRg;
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                if (b6aInvoke == null) {
                    bfm.AgE(1857600253);
                    i3 = 2;
                    jM2544applyContentAlphaek8zF_U = ColorExtKt.m2544applyContentAlphaek8zF_U(AuraTheme.INSTANCE.getContentColor(bfm, 6), bfm, 0);
                    BBI.A0R(bbi, false);
                } else {
                    i3 = 2;
                    bfm.AgE(1857598796);
                    BBI.A0R(bbi, false);
                    jM2544applyContentAlphaek8zF_U = b6aInvoke.A00;
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, bRgThen, jM2544applyContentAlphaek8zF_U, c1822ArmInvoke, null, null, new C1YL(c1yl != null ? c1yl.A00 : 3), false, 0, i, i3, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 1879048192), 6, 14768);
            } else {
                bfm.AgE(1751141528);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraButtonKt$ButtonText$2(str, z, auraLabelButtonStyle, auraButtonSize, g0v, function0, auraButtonAccessibility, c1yl, i, bRg, i2);
        }
    }

    public static final AuraButtonDimensions toDimension(AuraButtonSize auraButtonSize, BFM bfm, int i) {
        AuraButtonDimensions auraButtonDimensions;
        int iOrdinal = auraButtonSize.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(1586117048);
            auraButtonDimensions = AnonymousClass002.A0d(bfm).buttonSmall;
        } else if (iOrdinal == 1) {
            bfm.AgE(1586119097);
            auraButtonDimensions = AnonymousClass002.A0d(bfm).buttonMedium;
        } else {
            if (iOrdinal != 2) {
                AnonymousClass004.A1A(bfm, 1586115167);
                throw new NoWhenBranchMatchedException();
            }
            bfm.AgE(1586121144);
            auraButtonDimensions = AnonymousClass002.A0d(bfm).buttonLarge;
        }
        AnonymousClass002.A19(bfm);
        return auraButtonDimensions;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0192 A[PHI: r15
  0x0192: PHI (r15v1 int) = (r15v0 int), (r15v5 int) binds: [B:115:0x0186, B:118:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[PHI: r0 r12
  0x009d: PHI (r0v21 int) = (r0v20 int), (r0v45 int) binds: [B:30:0x0090, B:33:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v1 int) = (r12v0 int), (r12v8 int) binds: [B:30:0x0090, B:33:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[PHI: r1 r11
  0x00ba: PHI (r1v4 int) = (r1v3 int), (r1v159 int) binds: [B:40:0x00ad, B:43:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r11v1 int) = (r11v0 int), (r11v14 int) binds: [B:40:0x00ad, B:43:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112 A[PHI: r1
  0x0112: PHI (r1v26 int) = (r1v25 int), (r1v149 int) binds: [B:72:0x0106, B:75:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125 A[PHI: r1
  0x0125: PHI (r1v29 int) = (r1v28 int), (r1v146 int) binds: [B:78:0x0119, B:81:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    /* renamed from: AuraButton-nL3aKkM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2408AuraButtonnL3aKkM(java.lang.String r87, java.lang.String r88, X.C1YL r89, X.BRg r90, com.facebook.aura.vds.compose.button.AuraLabelButtonStyle r91, com.facebook.aura.vds.compose.button.AuraButtonSize r92, X.G0W<? super com.facebook.aura.vds.compose.button.IconContext, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r93, boolean r94, boolean r95, boolean r96, boolean r97, boolean r98, X.InterfaceC1072AWd r99, X.InterfaceC05011Yg r100, kotlin.jvm.functions.Function0<kotlin.Unit> r101, java.lang.String r102, kotlin.jvm.functions.Function0<kotlin.Unit> r103, kotlin.jvm.functions.Function0<X.B6A> r104, kotlin.jvm.functions.Function0<X.B6A> r105, X.G0V<? super X.BFM, ? super java.lang.Integer, X.C1822Arm> r106, kotlin.jvm.functions.Function0<X.C1DG> r107, kotlin.jvm.functions.Function0<? extends X.C3TQ> r108, com.facebook.aura.vds.compose.button.AuraButtonAccessibility r109, boolean r110, int r111, boolean r112, int r113, X.BFM r114, int r115, int r116, int r117, int r118) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.button.AuraButtonKt.m2408AuraButtonnL3aKkM(java.lang.String, java.lang.String, X.1YL, X.BRg, com.facebook.aura.vds.compose.button.AuraLabelButtonStyle, com.facebook.aura.vds.compose.button.AuraButtonSize, X.G0W, boolean, boolean, boolean, boolean, boolean, X.AWd, X.1Yg, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.vds.compose.button.AuraButtonAccessibility, boolean, int, boolean, int, X.BFM, int, int, int, int):void");
    }
}
