package com.facebook.aura.header.view;

import X.AHD;
import X.AHI;
import X.AKQ;
import X.ASj;
import X.AT5;
import X.AT8;
import X.AVy;
import X.AbstractC04661Bq;
import X.AbstractC07539Wl;
import X.AbstractC1011APs;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0v5;
import X.C1003AOr;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YD;
import X.C28s;
import X.C2HU;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.header.api.HeaderActionIcon;
import com.facebook.aura.header.api.HeaderButtonDecoration;
import com.facebook.aura.header.api.HeaderButtonDecorations;
import com.facebook.aura.header.view.HeaderButtonContent;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.accessibility.AuraHapticsKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HeaderButtonKt {
    public static final float BadgeCornerInset = 3.0f;
    public static final int HEADER_SCRIM_PADDING_DP = 20;
    public static final int HEADER_TITLE_BAR_MIN_HEIGHT_DP = 72;
    public static final int HeaderIconFadeDurationMillis = 220;
    public static final float HeaderPillButtonSize = 44.0f;
    public static final int MIN_HEADER_HEIGHT_DP = 60;
    public static final float PillIconTouchTarget = 48.0f;
    public static final float HeaderPillContentInset = AuraDimensKt.SpacingXsmall;
    public static final AuraToolbarAgent.Config HatchHeaderConfig = new AuraToolbarAgent.Config(false, AuraToolbarAgent.NavIconType.Back.INSTANCE, null, true, null, false, C0881AGi.A00, false, null, null, false, null, false, null, true, null, false, true);

    /* renamed from: com.facebook.aura.header.view.HeaderButtonKt$LeavingHeaderActionIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HeaderAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HeaderAction headerAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = headerAction;
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
            HeaderButtonKt.LeavingHeaderActionIcon(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: HeaderActionIconImage-3IgeMak, reason: not valid java name */
    public static final void m1026HeaderActionIconImage3IgeMak(HeaderActionIcon headerActionIcon, long j, BRg bRg, BFM bfm, int i, int i2) {
        long j2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(headerActionIcon, 0);
        bfm.AgG(-830560932);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, headerActionIcon) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AVy aVyA00 = BOf.A00(bfm, headerActionIcon.res, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            if (headerActionIcon.enabled && headerActionIcon.destructive) {
                j2 = AnonymousClass003.A0c(bfm, 694871491).destructiveIcon.enabled;
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 694871904);
                j2 = j;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, aVyA00, auraIconSize, null, j2, null, bfm, ((iA0d >> 6) & 14) | 3456 | (AVy.$stable << 3), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HeaderButtonKt$HeaderActionIconImage$1(headerActionIcon, j, bRg2, i, i2);
        }
    }

    public static final <T> C1003AOr<T> headerPillSpring() {
        return new C1003AOr<>(null, 0.7f, 224.0f);
    }

    /* renamed from: HatchHeaderButtonRow-_6dBP3U, reason: not valid java name */
    public static final void m1025HatchHeaderButtonRow_6dBP3U(AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, BRg bRg, B6A b6a, HeaderButton headerButton, AHD<HeaderAction> ahd2, G0U<? super HeaderAction, Unit> g0u2, boolean z, boolean z2, BFM bfm, int i, int i2) {
        OnScreenState onScreenStateRememberOnScreenState;
        B6A b6a2 = b6a;
        HeaderButton headerButton2 = headerButton;
        boolean z3 = z;
        boolean z4 = z2;
        BRg bRg2 = bRg;
        AHD<HeaderAction> ahd3 = ahd2;
        G0U<? super HeaderAction, Unit> g0u3 = g0u2;
        boolean zA1b = AnonymousClass004.A1b(ahd, g0u);
        bfm.AgG(1648465115);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, b6a2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, AnonymousClass003.A0K(headerButton2));
        }
        int i6 = i2 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, ahd3);
            iA0d |= iA0i;
        }
        int i7 = i2 & 64;
        int iA0Z = 1572864;
        if (i7 != 0) {
            iA0d |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0u3);
            iA0d |= iA0Z;
        }
        int i8 = i2 & 128;
        int iA0u = 12582912;
        if (i8 != 0) {
            iA0d |= iA0u;
        } else if ((i & 12582912) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z3);
            iA0d |= iA0u;
        }
        int i9 = i2 & 256;
        int iA0v = 100663296;
        if (i9 != 0) {
            iA0d |= iA0v;
        } else if ((i & 100663296) == 0) {
            i9 = 0;
            iA0v = AnonymousClass004.A0v(bfm, z4);
            iA0d |= iA0v;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                b6a2 = null;
            }
            if (i5 != 0) {
                headerButton2 = null;
            }
            if (i6 != 0) {
                ahd3 = AHI.A01;
            }
            if (i7 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HeaderButtonKt$HatchHeaderButtonRow$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0u3 = (G0U) objAaT;
            }
            if (i8 != 0) {
                z3 = false;
            }
            if (i9 != 0) {
                z4 = true;
            }
            if (z3) {
                bfm.AgE(-667941070);
                onScreenStateRememberOnScreenState = rememberOnScreenState(bfm, zA1b ? 1 : 0);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 768691490);
                onScreenStateRememberOnScreenState = null;
            }
            C28s c28s = C2HU.A01;
            AbstractC04661Bq.A08(AnonymousClass003.A0P(c28s, 220, zA1b ? 1 : 0), AbstractC1011APs.A0E(new ASj(c28s, 220, zA1b ? 1 : 0)), bfm, bRg2, null, B1V.A00(bfm, new HeaderButtonKt$HatchHeaderButtonRow$2(ahd, z4, ahd3, g0u, g0u3, b6a2, headerButton2, onScreenStateRememberOnScreenState), 1642104067), ((iA0d >> 24) & 14) | 200064 | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 16, z4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HeaderButtonKt$HatchHeaderButtonRow$3(ahd, g0u, bRg2, b6a2, headerButton2, ahd3, g0u3, z3, z4, i, i2);
        }
    }

    /* renamed from: HeaderIconButton-rglY58k, reason: not valid java name */
    public static final void m1027HeaderIconButtonrglY58k(HeaderActionIcon headerActionIcon, Function0<Unit> function0, String str, BRg bRg, B6A b6a, boolean z, boolean z2, G2j<? super B6A, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, BFM bfm, int i, int i2) {
        long j;
        BRg bRg2 = bRg;
        B6A b6a2 = b6a;
        boolean z3 = z;
        boolean z4 = z2;
        G2j<? super B6A, ? super BRg, ? super BFM, ? super Integer, Unit> g2j2 = g2j;
        AnonymousClass005.A10(headerActionIcon, function0, str);
        bfm.AgG(-1739175869);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, headerActionIcon) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, b6a2);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z3);
            iA0d |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0t = 1572864;
        if (i6 != 0) {
            iA0d |= iA0t;
        } else if ((i & 1572864) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z4);
            iA0d |= iA0t;
        }
        int i7 = i2 & 128;
        int iA0a = 12582912;
        if (i7 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g2j2);
            iA0d |= iA0a;
        }
        boolean z5 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                b6a2 = null;
            }
            if (i5 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                z4 = false;
            }
            if (i7 != 0) {
                g2j2 = null;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, headerActionIcon.description);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121118);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            if (headerActionIcon.enabled) {
                bfm.AgE(-1597245005);
                if (b6a2 == null) {
                    j = AnonymousClass003.A0c(bfm, -605712214).primaryIcon.enabled;
                    AnonymousClass001.A1D(bfm);
                } else {
                    AnonymousClass003.A0l(bfm, -605713361);
                    j = b6a2.A00;
                }
            } else {
                j = AnonymousClass003.A0c(bfm, -605710677).primaryIcon.disabled;
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgA07 = C10G.A07(bRg2, PillIconTouchTarget);
            int i8 = AuraHaptics.BUTTON_TAP;
            if (headerActionIcon.enabled && !z3) {
                z5 = true;
            }
            float f = 0.0f;
            BRg bRgA01 = C0v5.A01(new AuraBouncyIndication(f, f, f, f, f, 31, null), interfaceC1072AWd, AuraHapticsKt.m2392auraHapticZShFqVg(bRgA07, i8, z5), new C1YD(0), null, function0, headerActionIcon.enabled);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA012, bfm.A65(strA01), AnonymousClass005.A1C(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new HeaderButtonKt$HeaderIconButton$buttonModifier$1$1(strA01, z4, strA012);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0Y(bRgA01, objAaT2, false), str);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            if (g2j2 != null) {
                bfm.AgE(51900712);
                g2j2.invoke(new B6A(j), BRg.A00, bfm, Integer.valueOf(((iA0d >> 15) & 896) | 48));
            } else {
                bfm.AgE(51955892);
                m1026HeaderActionIconImage3IgeMak(headerActionIcon, j, null, bfm, iA0d & 14, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HeaderButtonKt$HeaderIconButton$2(headerActionIcon, function0, str, bRg2, b6a2, z3, z4, g2j2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0191 A[EDGE_INSN: B:114:0x0191->B:80:0x0191 BREAK  A[LOOP:0: B:85:0x01b6->B:116:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* renamed from: HeaderIconButtons-IqSm-MA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1028HeaderIconButtonsIqSmMA(X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r30, boolean r31, X.AHD<com.facebook.aura.header.api.HeaderAction> r32, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r33, X.G0U<? super com.facebook.aura.header.api.HeaderAction, kotlin.Unit> r34, X.B6A r35, com.facebook.aura.header.view.HeaderButton r36, com.facebook.aura.header.view.OnScreenState r37, X.BRg r38, X.BFM r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HeaderButtonKt.m1028HeaderIconButtonsIqSmMA(X.AHD, boolean, X.AHD, X.G0U, X.G0U, X.B6A, com.facebook.aura.header.view.HeaderButton, com.facebook.aura.header.view.OnScreenState, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: HeaderTextButton-jM_yU8I, reason: not valid java name */
    public static final void m1029HeaderTextButtonjM_yU8I(int i, Function0<Unit> function0, String str, BRg bRg, B6A b6a, boolean z, BFM bfm, int i2, int i3) {
        boolean zA1W;
        long j;
        B6A b6a2 = b6a;
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(657777097);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, b6a2);
        }
        int i6 = i3 & 32;
        int iA0s = 196608;
        if (i6 != 0) {
            iA0D |= iA0s;
        } else if ((196608 & i2) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z2);
            iA0D |= iA0s;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0D, 74898), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C06H c06h = null;
            if (i5 != 0) {
                b6a2 = null;
            }
            if (i6 != 0) {
                z2 = false;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121118);
            String strA012 = AbstractC2271BQs.A01(bfm, i);
            if (b6a2 == null) {
                j = AnonymousClass003.A0c(bfm, 763610004).primaryText;
                zA1W = AnonymousClass001.A1W(bfm);
            } else {
                bfm.AgE(763609229);
                zA1W = AnonymousClass001.A1W(bfm);
                j = b6a2.A00;
            }
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            float f = PillIconTouchTarget;
            BRg bRgM2392auraHapticZShFqVg = AuraHapticsKt.m2392auraHapticZShFqVg(C10G.A09(bRg2, f, f), AuraHaptics.BUTTON_TAP, true);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            float f2 = 0.0f;
            BRg bRgA00 = AbstractC07539Wl.A00(C0v5.A01(new AuraBouncyIndication(f2, f2, f2, f2, f2, 31, c06h), (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj), bRgM2392auraHapticZShFqVg, new C1YD(0), null, function0, true), str);
            boolean zA65 = bfm.A65(strA01) | ((iA0D & 458752) == 131072);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HeaderButtonKt$HeaderTextButton$2$1(z2, strA01);
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, C3U4.A0B(C10G.A02(C2VU.A09, AnonymousClass001.A0Y(bRgA00, objAaT2, zA1W), zA1W), AuraDimensKt.SpacingMedium, 0.0f), j, c1822ArmA0W, null, null, null, zA1W, zA1W ? 1 : 0, zA1W ? 1 : 0, zA1W ? 1 : 0, null, null, null, bfm, zA1W ? 1 : 0, zA1W ? 1 : 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HeaderButtonKt$HeaderTextButton$3(i, function0, str, bRg2, b6a2, z2, i2, i3);
        }
    }

    public static final void LeavingHeaderActionIcon(HeaderAction headerAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1533358051);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, headerAction) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long j = headerAction.icon.enabled ? AnonymousClass003.A0c(bfm, -383299484).primaryIcon.enabled : AnonymousClass003.A0c(bfm, -383297947).primaryIcon.disabled;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            G2j<B6A, BRg, BFM, Integer, Unit> g2j = headerAction.iconContent;
            BRg bRgA07 = C10G.A07(bRg2, HeaderPillButtonSize);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            if (g2j != null) {
                bfm.AgE(1248794646);
                AnonymousClass001.A1F(new B6A(j), BRg.A00, bfm, g2j, 48);
            } else {
                bfm.AgE(1248842107);
                m1026HeaderActionIconImage3IgeMak(headerAction.icon, j, null, bfm, 0, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(headerAction, bRg2, i, i2);
        }
    }

    /* renamed from: PillHeaderButtonIcon-dgCr-O4, reason: not valid java name */
    public static final void m1030PillHeaderButtonIcondgCrO4(HeaderButton headerButton, G0U<? super HeaderButton, Unit> g0u, B6A b6a, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z3 = z;
        boolean z4 = z2;
        bfm.AgG(1196148178);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, headerButton) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, b6a);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0r(bfm, z3);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA08 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z4);
            iA08 |= iA0s;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA08, 74898), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            if (i5 != 0) {
                z4 = true;
            }
            boolean zA1O = AnonymousClass002.A1O(iA08 & 14);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = HeaderButtonDecorations.INSTANCE.find(headerButton.getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view());
                bfm.Ai0(objAaT);
            }
            HeaderButtonDecoration headerButtonDecoration = (HeaderButtonDecoration) objAaT;
            if (headerButtonDecoration != null) {
                bfm.AgE(-892916576);
                headerButtonDecoration.content.invoke(Boolean.valueOf(z4), BRg.A00, B1V.A00(bfm, new HeaderButtonKt$PillHeaderButtonIcon$1(headerButton, g0u, b6a, bRg2, z3), 2095346738), bfm, Integer.valueOf(((iA08 >> 15) & 14) | 432));
            } else {
                bfm.AgE(-892584845);
                m1031PillHeaderButtonIconContentet4HrQ(headerButton, g0u, b6a, bRg2, z3, bfm, iA08 & 65534, 0);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HeaderButtonKt$PillHeaderButtonIcon$2(headerButton, g0u, b6a, bRg2, z3, z4, i, i2);
        }
    }

    /* renamed from: PillHeaderButtonIconContent-et4H-rQ, reason: not valid java name */
    public static final void m1031PillHeaderButtonIconContentet4HrQ(HeaderButton headerButton, G0U<? super HeaderButton, Unit> g0u, B6A b6a, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> headerButtonKt$PillHeaderButtonIconContent$2;
        HeaderButtonContent.Icon icon;
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(1188398513);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, headerButton) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, b6a);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            HeaderButtonContent content$fbandroid_express_aura_java_com_facebook_aura_header_view_view = headerButton.getContent$fbandroid_express_aura_java_com_facebook_aura_header_view_view();
            if (!(content$fbandroid_express_aura_java_com_facebook_aura_header_view_view instanceof HeaderButtonContent.Icon) || (icon = (HeaderButtonContent.Icon) content$fbandroid_express_aura_java_com_facebook_aura_header_view_view) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    headerButtonKt$PillHeaderButtonIconContent$2 = new HeaderButtonKt$PillHeaderButtonIconContent$icon$1(headerButton, g0u, b6a, bRg2, z2, i, i2);
                    bBbAAc.A06 = headerButtonKt$PillHeaderButtonIconContent$2;
                }
                return;
            }
            HeaderActionIcon headerActionIconAsHeaderActionIcon = asHeaderActionIcon(icon);
            boolean zA1C = AnonymousClass003.A1C(iA08) | AnonymousClass001.A1L(iA08);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HeaderButtonKt$PillHeaderButtonIconContent$1$1(g0u, headerButton);
                bfm.Ai0(objAaT);
            }
            int i5 = iA08 & 7168;
            int i6 = iA08 << 6;
            m1027HeaderIconButtonrglY58k(headerActionIconAsHeaderActionIcon, (Function0) objAaT, headerButton.getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view(), bRg2, b6a, icon.suppressPressHaptic, z2, null, bfm, AnonymousClass001.A05(i6, AnonymousClass001.A0A(i6, i5)), 128);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            headerButtonKt$PillHeaderButtonIconContent$2 = new HeaderButtonKt$PillHeaderButtonIconContent$2(headerButton, g0u, b6a, bRg2, z2, i, i2);
            bBbAAc.A06 = headerButtonKt$PillHeaderButtonIconContent$2;
        }
    }

    public static final HeaderActionIcon asHeaderActionIcon(HeaderButtonContent.Icon icon) {
        return new HeaderActionIcon(icon.res, icon.description, icon.destructive, icon.enabled);
    }

    public static final AuraToolbarAgent.Config getHatchHeaderConfig() {
        return HatchHeaderConfig;
    }

    public static final float getHeaderPillButtonSize() {
        return HeaderPillButtonSize;
    }

    public static final float getHeaderPillContentInset() {
        return HeaderPillContentInset;
    }

    public static final float getPillIconTouchTarget() {
        return PillIconTouchTarget;
    }

    public static final BRg headerButtonEntrance(BRg bRg, OnScreenState onScreenState, BFM bfm, int i) {
        Object objA0p = AnonymousClass001.A0p(bfm, -359331892);
        Object obj = C78N.A00;
        if (objA0p == obj) {
            objA0p = AT8.A00(0.0f);
            if (onScreenState == null || !onScreenState.value) {
                objA0p = null;
            }
            bfm.Ai0(objA0p);
        }
        AT5 at5 = (AT5) objA0p;
        if (at5 != null) {
            boolean zA67 = bfm.A67(at5);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == obj) {
                objAaT = new HeaderButtonKt$headerButtonEntrance$1$1(at5, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, at5);
            boolean zA672 = bfm.A67(at5);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == obj) {
                objAaT2 = new HeaderButtonKt$headerButtonEntrance$2$1(at5);
                bfm.Ai0(objAaT2);
            }
            bRg = AnonymousClass001.A0W(bRg, objAaT2);
        }
        AnonymousClass002.A19(bfm);
        return bRg;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.header.api.HeaderAction> rememberLeavingHeaderActions(X.AHD<com.facebook.aura.header.api.HeaderAction> r12, X.BFM r13, int r14) {
        /*
            java.lang.Object r3 = r13.AaT()
            java.lang.Object r5 = X.C78N.A00
            if (r3 != r5) goto L10
            com.facebook.aura.header.view.ComposedHeaderActions r3 = new com.facebook.aura.header.view.ComposedHeaderActions
            r3.<init>(r12)
            r13.Ai0(r3)
        L10:
            com.facebook.aura.header.view.ComposedHeaderActions r3 = (com.facebook.aura.header.view.ComposedHeaderActions) r3
            r0 = r14 & 14
            r8 = r0 ^ 6
            r11 = 1
            r6 = 4
            if (r8 <= r6) goto L20
            boolean r0 = r13.A65(r12)
            if (r0 != 0) goto L25
        L20:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r6) goto L26
        L25:
            r0 = 1
        L26:
            java.lang.Object r4 = r13.AaT()
            if (r0 != 0) goto L2e
            if (r4 != r5) goto L72
        L2e:
            java.util.List<com.facebook.aura.header.api.HeaderAction> r0 = r3.value
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r0.iterator()
        L39:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r9 = r10.next()
            r7 = r9
            com.facebook.aura.header.api.HeaderAction r7 = (com.facebook.aura.header.api.HeaderAction) r7
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L54
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L54
        L50:
            r4.add(r9)
            goto L39
        L54:
            java.util.Iterator r2 = r12.iterator()
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r2.next()
            com.facebook.aura.header.api.HeaderAction r0 = (com.facebook.aura.header.api.HeaderAction) r0
            java.lang.Object r1 = r0.key
            java.lang.Object r0 = r7.key
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L58
            goto L39
        L6f:
            r13.Ai0(r4)
        L72:
            java.util.List r4 = (java.util.List) r4
            boolean r1 = r13.A67(r3)
            if (r8 <= r6) goto L80
            boolean r0 = r13.A65(r12)
            if (r0 != 0) goto L85
        L80:
            r0 = r14 & 6
            if (r0 == r6) goto L85
            r11 = 0
        L85:
            r1 = r1 | r11
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto L8e
            if (r0 != r5) goto L96
        L8e:
            com.facebook.aura.header.view.HeaderButtonKt$rememberLeavingHeaderActions$1$1 r0 = new com.facebook.aura.header.view.HeaderButtonKt$rememberLeavingHeaderActions$1$1
            r0.<init>(r3, r12)
            r13.Ai0(r0)
        L96:
            X.AnonymousClass001.A15(r13, r0)
            boolean r0 = r13.A65(r4)
            java.lang.Object r3 = r13.AaT()
            r2 = 0
            if (r0 != 0) goto La6
            if (r3 != r5) goto Laa
        La6:
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass004.A11(r13, r4)
        Laa:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r1 = X.AnonymousClass003.A1N(r13, r4, r3)
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto Lb8
            if (r0 != r5) goto Lc0
        Lb8:
            com.facebook.aura.header.view.HeaderButtonKt$rememberLeavingHeaderActions$2$1 r0 = new com.facebook.aura.header.view.HeaderButtonKt$rememberLeavingHeaderActions$2$1
            r0.<init>(r4, r3, r2)
            r13.Ai0(r0)
        Lc0:
            X.AnonymousClass001.A18(r13, r0, r4)
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HeaderButtonKt.rememberLeavingHeaderActions(X.AHD, X.BFM, int):java.util.List");
    }

    public static final OnScreenState rememberOnScreenState(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new OnScreenState();
            bfm.Ai0(objAaT);
        }
        OnScreenState onScreenState = (OnScreenState) objAaT;
        boolean zA67 = bfm.A67(onScreenState);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj) {
            objAaT2 = new HeaderButtonKt$rememberOnScreenState$1$1(onScreenState);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, onScreenState);
        return onScreenState;
    }
}
