package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0A8;
import X.C0lh;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1DM;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchInternalLinkActionCardKt {
    public static final float CardFallbackGlyphSize = 28.0f;
    public static final float CardIconSize = 44.0f;
    public static final float CardMinWidth = 240.0f;
    public static final float CardPadding = 16.0f;
    public static final float CardSpacing = 12.0f;
    public static final int GenericIconRes = 2131231115;
    public static final float TitleSpacing = 4.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchInternalLinkActionCardKt$InternalLinkCardHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$icon = g0v;
            this.$subtitle = g0v2;
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
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(this.$title, this.$icon, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInternalLinkActionCardKt$InternalLinkCardSubtitleText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            HatchInternalLinkActionCardKt.InternalLinkCardSubtitleText(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* renamed from: HatchInternalLinkActionCard-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m627HatchInternalLinkActionCardT042LqI(com.facebook.aura.model.InternalLinkActionCardPresentation r16, X.BRg r17, long r18, X.C1D3 r20, java.lang.String r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchInternalLinkActionCardKt.m627HatchInternalLinkActionCardT042LqI(com.facebook.aura.model.InternalLinkActionCardPresentation, X.BRg, long, X.1D3, java.lang.String, X.BFM, int, int):void");
    }

    /* renamed from: InternalLinkCardButton-PIknLig, reason: not valid java name */
    public static final void m628InternalLinkCardButtonPIknLig(String str, String str2, Function0<Unit> function0, BRg bRg, boolean z, String str3, B6A b6a, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        String str4 = str3;
        B6A b6a2 = b6a;
        AnonymousClass005.A1Z(str, str2, function0);
        bfm.AgG(1817017037);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
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
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str4);
            iA0d |= iA0i;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, b6a2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                str4 = null;
            }
            if (i6 != 0) {
                b6a2 = null;
            }
            AuraLabelButtonStyle auraLabelButtonStyleA0g = AnonymousClass006.A0g(bfm);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), FGI.A0M("hatch-internal-link-action-", str));
            boolean zA1K = AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new HatchInternalLinkActionCardKt$InternalLinkCardButton$1$1(function0);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            boolean zA1Y = AnonymousClass006.A1Y(3670016, iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1Y || objAaT2 == C78N.A00) {
                objAaT2 = new HatchInternalLinkActionCardKt$InternalLinkCardButton$2$1(b6a2);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str2, null, bRgA00, auraLabelButtonStyleA0g, auraButtonSize, null, false, false, z2, false, false, null, null, function02, str4, null, (Function0) objAaT2, null, null, null, null, null, false, 0, false, 0, bfm, AnonymousClass001.A06(iA0d << 15, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608), iA0d & 458752, 0, 134036933);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchInternalLinkActionCardKt$InternalLinkCardButton$3(str, str2, function0, bRg2, z2, str4, b6a2, i, i2);
        }
    }

    /* renamed from: InternalLinkCardContainer-euL9pac, reason: not valid java name */
    public static final void m629InternalLinkCardContainereuL9pac(long j, C1D3 c1d3, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BBI bbi;
        C1DM c1dmA0R;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0w, 3);
        bfm.AgG(-1415290758);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, c1d3);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0M |= 384;
        } else if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0M |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0M), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = BGR.A01(C0lh.A02, C10G.A0D(bRg2, CardMinWidth, Float.NaN));
            if (c1d3 == null) {
                bfm.AgE(1410226302);
                c1dmA0R = C06G.A0R(bfm);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1410225217);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                c1dmA0R = c1d3;
            }
            BRg bRgA09 = C3U4.A09(C11U.A04(bRgA01, c1dmA0R, j), CardPadding);
            int i4 = (iA0M & 7168) | 48;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(CardSpacing), bfm, C2VU.A02, 6);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA012, iA0J);
            AnonymousClass004.A1B(bbi, C90l.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchInternalLinkActionCardKt$InternalLinkCardContainer$1(j, c1d3, bRg2, g0w, i, i2);
        }
    }

    public static final void InternalLinkCardHeader(String str, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, g0v);
        bfm.AgG(-804174389);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(CardSpacing), bfm, g0v2 == null ? C2VU.A04 : C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AnonymousClass003.A13(bfm, g0v, iA0d >> 3);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, TitleSpacing, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14834);
            if (g0v2 == null) {
                bfm.AgE(1157669940);
            } else {
                bfm.AgE(1561364845);
                AnonymousClass003.A13(bfm, g0v2, iA0d >> 6);
            }
            AnonymousClass002.A10(bbi, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, g0v, g0v2, bRg2, i, i2);
        }
    }

    /* renamed from: InternalLinkCardIcon-xqIIw2o, reason: not valid java name */
    public static final void m630InternalLinkCardIconxqIIw2o(String str, int i, BRg bRg, B6A b6a, BFM bfm, int i2, int i3) {
        B6A b6a2 = b6a;
        BRg bRg2 = bRg;
        bfm.AgG(-1814014195);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, b6a2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                b6a2 = null;
            }
            int i6 = (iA0d & 14) | 1575984 | (iA0d & 896);
            int i7 = iA0d << 12;
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(str, null, bRg2, CardIconSize, 0.0f, i, CardFallbackGlyphSize, b6a2, null, bfm, AnonymousClass001.A0C(i7, AnonymousClass001.A07(i7, i6)), 272);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchInternalLinkActionCardKt$InternalLinkCardIcon$1(str, i, bRg2, b6a2, i2, i3);
        }
    }

    public static final void InternalLinkCardSubtitleText(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-35527243);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final float getCardFallbackGlyphSize() {
        return CardFallbackGlyphSize;
    }

    public static final float getCardIconSize() {
        return CardIconSize;
    }

    public static final float getCardSpacing() {
        return CardSpacing;
    }

    public static final int getGenericIconRes() {
        return GenericIconRes;
    }
}
