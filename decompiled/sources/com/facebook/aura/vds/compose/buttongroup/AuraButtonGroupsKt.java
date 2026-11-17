package com.facebook.aura.vds.compose.buttongroup;

import X.AKH;
import X.AKQ;
import X.AQC;
import X.AbstractC0885AGm;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.AxM;
import X.B0A;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06H;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.theme.AuraInteractions;
import com.facebook.aura.vds.compose.theme.AuraInteractionsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraButtonGroupsKt {
    public static final String DEFAULT_DESTRUCTIVE_BUTTON_ID = "destructive_button";
    public static final String DEFAULT_ELEVATED_BUTTON_ID = "elevated_button";
    public static final String DEFAULT_PRIMARY_ALT_BUTTON_ID = "primary_alt_button";
    public static final String DEFAULT_PRIMARY_BUTTON_ID = "primary_button";
    public static final String DEFAULT_SECONDARY_BUTTON_ID = "secondary_button";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AuraButtonGroupSize.values().length];
            try {
                AnonymousClass005.A0v(AuraButtonGroupSize.MEDIUM, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonGroupSize.LARGE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuraButtonStyle.values().length];
            try {
                AnonymousClass005.A0v(AuraButtonStyle.PRIMARY, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(AuraButtonStyle.PRIMARY_ALT, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(AuraButtonStyle.SECONDARY, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(AuraButtonStyle.DESTRUCTIVE, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(AuraButtonStyle.ELEVATED, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: AuraButtonGroup-FLdL6rA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2454AuraButtonGroupFLdL6rA(X.BRg r16, X.ApQ r17, X.C1YL r18, X.G0U<? super java.lang.String, kotlin.Unit> r19, X.ApQ r20, X.C1YL r21, com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupSize r22, boolean r23, X.G0U<? super com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope, kotlin.Unit> r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(X.BRg, X.ApQ, X.1YL, X.G0U, X.ApQ, X.1YL, com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupSize, boolean, X.G0U, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: AuraButtonGroupStyleExplicit-FLdL6rA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2455AuraButtonGroupStyleExplicitFLdL6rA(X.BRg r16, X.ApQ r17, X.C1YL r18, X.G0U<? super java.lang.String, kotlin.Unit> r19, X.ApQ r20, X.C1YL r21, com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupSize r22, boolean r23, X.G0U<? super com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope, kotlin.Unit> r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(X.BRg, X.ApQ, X.1YL, X.G0U, X.ApQ, X.1YL, com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupSize, boolean, X.G0U, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Header-B9Ufvwk, reason: not valid java name */
    public static final void m2456HeaderB9Ufvwk(BRg bRg, ApQ apQ, C1YL c1yl, G0U<? super String, Unit> g0u, BFM bfm, int i, int i2) {
        C1YL c1yl2 = c1yl;
        G0U<? super String, Unit> g0u2 = g0u;
        bfm.AgG(-188678575);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, apQ);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1yl2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            ApQ apQ2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            if (i3 != 0) {
                c1yl2 = null;
            }
            if (i4 != 0) {
                g0u2 = null;
            }
            long j = 0;
            AuraCardKt.m2484AuraCardjQVUvHA(AnonymousClass001.A0R(bRg), AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, null, bfm, 3072, 7), new AuraCardContent(apQ2, (AuraIconAndHeadlineStyle) (objArr11 == true ? 1 : 0), (BO6) (objArr10 == true ? 1 : 0), (B6A) (objArr9 == true ? 1 : 0), apQ, (G0U) g0u2, (AuraIconAndBodyStyle) (objArr8 == true ? 1 : 0), (B6A) (objArr7 == true ? 1 : 0), (String) (objArr6 == true ? 1 : 0), (C1822Arm) (objArr5 == true ? 1 : 0), 0, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (objArr4 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (ApQ) (objArr3 == true ? 1 : 0), (C1822Arm) (objArr2 == true ? 1 : 0), j, j, c1yl2, 1048527, (C06H) (objArr == true ? 1 : 0)), AuraCardType.None.INSTANCE, null, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 262128);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraButtonGroupsKt$Header$1(bRg, apQ, c1yl2, g0u2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v1, types: [X.ApY] */
    /* JADX WARN: Type inference failed for: r31v3, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r37v1, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r38v1, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r39v0, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.ArU] */
    /* JADX WARN: Type inference failed for: r41v0, types: [X.BO6] */
    /* JADX WARN: Type inference failed for: r41v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r42v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r43v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r44v1, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r45v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r46v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.facebook.aura.vds.compose.button.AuraButtonCorner] */
    /* JADX WARN: Type inference failed for: r64v0, types: [X.BFM] */
    /* renamed from: LayoutButtons-FLdL6rA, reason: not valid java name */
    public static final void m2457LayoutButtonsFLdL6rA(BRg bRg, ApQ apQ, C1YL c1yl, G0U<? super String, Unit> g0u, ApQ apQ2, C1YL c1yl2, AuraButtonGroupSize auraButtonGroupSize, boolean z, List<ButtonContent> list, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> auraButtonGroupsKt$LayoutButtons$4;
        B0A b0a;
        ?? r31;
        ApQ apQ3 = apQ;
        C1YL c1yl3 = c1yl;
        G0U<? super String, Unit> g0u2 = g0u;
        ApQ apQ4 = apQ2;
        C1YL c1yl4 = c1yl2;
        bfm.AgG(285671441);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, apQ3);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1yl3);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, apQ4);
        }
        int i7 = i2 & 32;
        int iA0i = 196608;
        if (i7 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c1yl4);
            iA0d |= iA0i;
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0I(bfm, auraButtonGroupSize.ordinal());
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0u(bfm, z);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass002.A03(AnonymousClass004.A1R(bfm, list, 134217728, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA0d, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                apQ3 = null;
            }
            if (i4 != 0) {
                c1yl3 = null;
            }
            if (i5 != 0) {
                g0u2 = null;
            }
            if (i6 != 0) {
                apQ4 = null;
            }
            if (i7 != 0) {
                c1yl4 = null;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    auraButtonGroupsKt$LayoutButtons$4 = new AuraButtonGroupsKt$LayoutButtons$1(bRg, apQ3, c1yl3, g0u2, apQ4, c1yl4, auraButtonGroupSize, z, list, i, i2);
                    bBbAAc.A06 = auraButtonGroupsKt$LayoutButtons$4;
                }
                return;
            }
            bfm.AgE(-347636635);
            BRg bRgA0D = BRg.A00;
            if (!z) {
                bRgA0D = C3U4.A0D(bRgA0D, AnonymousClass002.A0d(bfm).buttonGroupPadding);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgThen = bRgA0D.then(bRg);
            float f = AuraDimensKt.SpacingXsmall;
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            long j = bbi.A06;
            int i8 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i8);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
            if (apQ3 == null) {
                bfm.AgE(924305299);
                BBI.A0R(bbi, false);
                b0a = null;
            } else {
                bfm.AgE(924305300);
                bfm.AgE(-2048391511);
                BRg bRgA0D2 = bRgA0D;
                if (!z) {
                    bRgA0D2 = C3U4.A0D(bRgA0D, AnonymousClass002.A0d(bfm).buttonGroupHeaderPadding);
                }
                BBI.A0R(bbi, false);
                C3TH c3th2 = C2VU.A00;
                b0a = null;
                m2456HeaderB9Ufvwk(C10G.A00(c3th2, bRgA0D2.then(new AQC(c3th2)), false), apQ3, c1yl3, g0u2, bfm, iA0d & 8064, 0);
                BBI.A0R(bbi, false);
            }
            bfm.AgE(-2048378238);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen2 = c1062ATq;
            if (!z) {
                bRgThen2 = c1062ATq.then(C3U4.A0D(bRgA0D, AnonymousClass002.A0d(bfm).buttonGroupButtonBlockPadding));
            }
            BBI.A0R(bbi, false);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AnonymousClass002.A0d(bfm).buttonGroupButtonsSpacedBy, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1810255720);
            while (itA0w.hasNext()) {
                ButtonContent buttonContent = (ButtonContent) itA0w.next();
                BRg bRg2 = buttonContent.modifier;
                if (bRg2 == null) {
                    bRg2 = bRgA0D;
                }
                bfm.AgE(1810260628);
                BRg bRgThen3 = c1062ATq;
                if (buttonContent.contentDescription != null) {
                    boolean zA67 = bfm.A67(buttonContent);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new AuraButtonGroupsKt$LayoutButtons$3$3$1$1$1$1(buttonContent);
                        bfm.Ai0(objAaT);
                    }
                    bRgThen3 = c1062ATq.then(AnonymousClass001.A0X(bRgA0D, objAaT));
                }
                BBI.A0R(bbi, false);
                BRg bRgThen4 = bRgThen3.then(bRg2);
                String str = buttonContent.id;
                String text = buttonContent.textHolder.getText(AnonymousClass002.A0H(bfm));
                C1YL c1yl5 = buttonContent.textAlign;
                AuraButtonSize buttonSize = toButtonSize(auraButtonGroupSize, bfm, (iA0d >> 18) & 14);
                AuraLabelButtonStyle style = AuraButtonKt.toStyle(buttonContent.style, b0a, bfm, 0, 1);
                Drawable drawable = buttonContent.icon;
                if (drawable == null) {
                    bfm.AgE(-2134756990);
                    BBI.A0R(bbi, false);
                    r31 = b0a;
                } else {
                    bfm.AgE(-2134756989);
                    B1U b1uA00 = B1V.A00(bfm, new AuraButtonGroupsKt$LayoutButtons$3$3$1$2$c$1(drawable), 27362011);
                    BBI.A0R(bbi, false);
                    r31 = b1uA00;
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(str, text, c1yl5, bRgThen4, style, buttonSize, r31, false, false, ((AuraInteractions) bfm.A6v(AuraInteractionsKt.LocalAuraInteractions)).buttonGroupDisabled ? false : buttonContent.enabled, buttonContent.loading, false, b0a, b0a, buttonContent.onClick, buttonContent.onClickLabel, b0a, b0a, b0a, b0a, b0a, b0a, b0a, false, buttonContent.maxLines, false, buttonContent.clickHaptic, bfm, 0, 0, 0, 50280832);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            if (apQ4 == null) {
                bfm.AgE(926748781);
            } else {
                bfm.AgE(926748782);
                AuraTextKt.m2640AuraTextVmYn7U0(apQ4, C3U4.A06(c1062ATq, f), C06G.A08(bfm), C06G.A0Y(bfm), b0a, b0a, c1yl4, 0L, false, 0, 0, 0, b0a, b0a, b0a, bfm, (iA0d << 3) & 3670016, 0, 32688);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1V);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            auraButtonGroupsKt$LayoutButtons$4 = new AuraButtonGroupsKt$LayoutButtons$4(bRg, apQ3, c1yl3, g0u2, apQ4, c1yl4, auraButtonGroupSize, z, list, i, i2);
            bBbAAc.A06 = auraButtonGroupsKt$LayoutButtons$4;
        }
    }

    public static final AuraButtonStyle getStyleByOrder(int i) {
        if (i == 0) {
            return AuraButtonStyle.PRIMARY;
        }
        if (i == 1) {
            return AuraButtonStyle.SECONDARY;
        }
        throw new IllegalStateException("Max of 2 buttons supported in implicit mode.");
    }

    public static final AuraButtonSize toButtonSize(AuraButtonGroupSize auraButtonGroupSize, BFM bfm, int i) {
        AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
        AuraButtonSize auraButtonSize = ((AuraDimensions) bfm.A6v(akh)).buttonGroupButtonSizeOverride;
        if (auraButtonSize == null) {
            int iA0B = AnonymousClass005.A0B(bfm, auraButtonGroupSize, -1559641715);
            if (iA0B == 0) {
                bfm.AgE(88238537);
                auraButtonSize = ((AuraDimensions) bfm.A6v(akh)).buttonGroupButtonMediumSize;
            } else {
                if (iA0B != 1) {
                    throw AnonymousClass005.A0k(bfm, 88236309);
                }
                bfm.AgE(88241352);
                auraButtonSize = ((AuraDimensions) bfm.A6v(akh)).buttonGroupButtonLargeSize;
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.AgE(88234387);
        }
        AnonymousClass002.A19(bfm);
        return auraButtonSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.BRg] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.facebook.aura.vds.compose.button.AuraButtonStyle] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function0] */
    public static final ButtonContent withDefaultIds(ButtonContent buttonContent) {
        int i;
        TextHolder textHolder;
        String str;
        if (buttonContent.id != null) {
            return buttonContent;
        }
        int iOrdinal = buttonContent.style.ordinal();
        if (iOrdinal == 0) {
            i = 8189;
            textHolder = null;
            str = DEFAULT_PRIMARY_BUTTON_ID;
        } else if (iOrdinal == 1) {
            i = 8189;
            textHolder = null;
            str = DEFAULT_PRIMARY_ALT_BUTTON_ID;
        } else if (iOrdinal == 2) {
            i = 8189;
            textHolder = null;
            str = DEFAULT_SECONDARY_BUTTON_ID;
        } else if (iOrdinal == 3) {
            i = 8189;
            textHolder = null;
            str = DEFAULT_DESTRUCTIVE_BUTTON_ID;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8189;
            textHolder = null;
            str = DEFAULT_ELEVATED_BUTTON_ID;
        }
        return ButtonContent.m2460copyqqXSYzA$default(buttonContent, textHolder, str, textHolder, false, false, textHolder, textHolder, textHolder, textHolder, textHolder, textHolder, 0, 0, i, textHolder);
    }

    public static final <T> MutableState<T> rememberMutableStateOf(T t, BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = AnonymousClass004.A11(bfm, t);
        }
        MutableState<T> mutableState = (MutableState) objAaT;
        mutableState.Af8(t);
        return mutableState;
    }

    public static final List<ButtonContent> styleByOrderMapping(List<ButtonContent> list) {
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        int i = 0;
        for (ButtonContent buttonContent : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            ButtonContent buttonContent2 = buttonContent;
            buttonContent2.setStyle(getStyleByOrder(i));
            arrayListA0m.add(buttonContent2);
            i = i2;
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0m);
        Iterator it = arrayListA0m.iterator();
        while (it.hasNext()) {
            arrayListA0m2.add(withDefaultIds((ButtonContent) it.next()));
        }
        return arrayListA0m2;
    }
}
