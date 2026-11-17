package com.facebook.aura.feed.view;

import X.AKH;
import X.AKQ;
import X.AXN;
import X.AbstractC04540eo;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
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
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C06G;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1515AkP;
import X.C1809ArT;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1EQ;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedInstructionsPromptCardKt {
    public static final float ButtonSpacing = 10.0f;
    public static final float CardBorderWidth = 1.0f;
    public static final float CardCornerRadius = 30.0f;
    public static final float CardHorizontalPadding = 20.0f;
    public static final float CardShadowElevation = 8.0f;
    public static final float DividerHeight = 1.0f;
    public static final int PROMPT_MAX_LINES = 5;
    public static final float PromptVerticalPadding = 16.0f;

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsPromptCardKt$FeedInstructionsCardButtons$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onEditClick;
        public final /* synthetic */ Function0<Unit> $onGotItClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onEditClick = function0;
            this.$onGotItClick = function02;
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
            FeedInstructionsPromptCardKt.FeedInstructionsCardButtons(this.$onEditClick, this.$onGotItClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsPromptCardKt$FeedInstructionsCardHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C118862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118862(BRg bRg, int i, int i2) {
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
            FeedInstructionsPromptCardKt.FeedInstructionsCardHeader(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsPromptCardKt$FeedInstructionsCardPrompt$2, reason: invalid class name and case insensitive filesystem */
    public final class C118872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $promptText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118872(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$promptText = str;
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
            FeedInstructionsPromptCardKt.FeedInstructionsCardPrompt(this.$promptText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsPromptCardKt$FeedInstructionsPromptCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C118882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onEditClick;
        public final /* synthetic */ Function0<Unit> $onGotItClick;
        public final /* synthetic */ String $promptText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118882(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$promptText = str;
            this.$onEditClick = function0;
            this.$onGotItClick = function02;
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
            FeedInstructionsPromptCardKt.FeedInstructionsPromptCard(this.$promptText, this.$onEditClick, this.$onGotItClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FeedInstructionsCardButtons(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1910373181);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(AcQ.A00(ButtonSpacing), bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0Q, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120279);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = auraButtonStyles.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            BS0 bs0 = BRg.A00;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c90m.AiP(bs0, 1.0f, true), auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201285);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12027a), null, c90m.AiP(bs0, 1.0f, true), auraButtonStyles.primary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 9) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg2, i, i2);
        }
    }

    public static final void FeedInstructionsCardHeader(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-685324691);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRgA0P) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120282);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            float f = CardHorizontalPadding;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bs0, f, f, f, 0.0f), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12026d);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, C3U4.A0C(bs0, f, 4.0f, f, 16.0f), C06G.A0I(bfm, akh), c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            C1b8.A04(bfm, C10G.A04(c1062ATq, DividerHeight), C06G.A0E(bfm, akh));
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118862(bRgA0P, i, i2);
        }
    }

    public static final void FeedInstructionsCardPrompt(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(937660075);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).card;
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            int i4 = iA0d & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, axnA0Y, AnonymousClass002.A1Q(i4, 4));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT;
            long j2 = c1822ArmA0T.A00.A04;
            C19U.A05(j2);
            float fAgw = axnA0Y.Agw(C19U.A04(j2 & 1095216660480L, C1809ArT.A00(j2) * 5.0f));
            float f = PromptVerticalPadding;
            float fAgy = fAgw + (f * 2.0f);
            if (c00r.AGd() != 0) {
                fAgy = axnA0Y.Agy(c00r.AGd()) + (2.0f * f);
            }
            boolean zA65 = bfm.A65(c1110AYwA00);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass003.A0R(bfm, new FeedInstructionsPromptCardKt$FeedInstructionsCardPrompt$showTopFade$2$1(c1110AYwA00));
            }
            C1BO c1bo = (C1BO) objAaT2;
            boolean zA652 = bfm.A65(c1110AYwA00);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass003.A0R(bfm, new FeedInstructionsPromptCardKt$FeedInstructionsCardPrompt$showBottomFade$2$1(c1110AYwA00));
            }
            C1BO c1bo2 = (C1BO) objAaT3;
            BRg bRgA04 = C10G.A04(bRgA0Q, fAgy);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            long jA0L = C06G.A0L(bfm, akh);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(AbstractC1103AYp.A02(c1110AYwA00, c1062ATq, true), CardHorizontalPadding, f);
            boolean zA653 = bfm.A65(c00r);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == C78N.A00) {
                objAaT4 = new FeedInstructionsPromptCardKt$FeedInstructionsCardPrompt$1$1$1(c00r);
                bfm.Ai0(objAaT4);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0B, jA0L, c1822ArmA0T, null, null, null, false, 0, 0, 0, (G0U) objAaT4, null, null, bfm, i4, 0, 14320);
            if (C1BO.A0F(c1bo)) {
                bfm.AgE(-27330799);
                C1EQ.A05(bfm, C10G.A04(c0z7.A4C(C2VU.A0C, bs0).then(c1062ATq), f), new B6A(j), new B6A(B6A.A06));
            } else {
                bfm.AgE(-27104003);
            }
            BBI.A0R(bbi, false);
            if (C1BO.A0F(c1bo2)) {
                bfm.AgE(-27071794);
                C1EQ.A05(bfm, C10G.A04(c0z7.A4C(C2VU.A06, bs0).then(c1062ATq), f), new B6A(B6A.A06), new B6A(j));
            } else {
                bfm.AgE(-26842115);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118872(str, bRgA0Q, i, i2);
        }
    }

    public static final void FeedInstructionsPromptCard(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(str, function0, function02);
        bfm.AgG(-866094189);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
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
            float f = CardShadowElevation;
            float f2 = CardCornerRadius;
            C1D3 c1d3A00 = C1D8.A00(f2);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA02 = C1DI.A02(C1b8.A01(C11U.A01(AbstractC04540eo.A00(bRg2, c1d3A00, f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), f2), AnonymousClass001.A0f(bfm, akh).card), C1D8.A00(f2), CardBorderWidth, C06G.A0E(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            FeedInstructionsCardHeader(null, bfm, 0, zA1Z ? 1 : 0);
            C1062ATq c1062ATq = C10G.A02;
            FeedInstructionsCardPrompt(str, c1062ATq, bfm, (iA0d & 14) | 48, 0);
            float f3 = CardHorizontalPadding;
            BRg bRgA0C = C3U4.A0C(c1062ATq, f3, 0.0f, f3, f3);
            int i4 = iA0d >> 3;
            FeedInstructionsCardButtons(function0, function02, bRgA0C, bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 384, 0);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118882(str, function0, function02, bRg2, i, i2);
        }
    }
}
