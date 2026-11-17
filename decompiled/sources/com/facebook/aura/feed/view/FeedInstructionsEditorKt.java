package com.facebook.aura.feed.view;

import X.AKH;
import X.AKQ;
import X.AXN;
import X.AbstractC04540eo;
import X.AbstractC1103AYp;
import X.AbstractC1874Aso;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.Au3;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1518AkS;
import X.C1805ArO;
import X.C1822Arm;
import X.C1958Aux;
import X.C1BO;
import X.C1C3;
import X.C1D8;
import X.C1DI;
import X.C1EQ;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.accessibility.AuraHapticsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedInstructionsEditorKt {
    public static final float DescriptionBottomPadding = 16.0f;
    public static final float DescriptionTopPadding = 4.0f;
    public static final float DividerHeight = 1.0f;
    public static final float EditButtonHeight = 48.0f;
    public static final float EditButtonSpacing = 10.0f;
    public static final float EditCardBorderWidth = 1.0f;
    public static final float EditCardCornerRadius = 30.0f;
    public static final float EditCardShadowElevation = 12.0f;
    public static final float EditGradientMaskHeight = 20.0f;
    public static final float HeaderHorizontalPadding = 20.0f;
    public static final float HeaderTopPadding = 20.0f;
    public static final float PromptFieldHeight = 220.0f;
    public static final float PromptHorizontalPadding = 20.0f;

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsActionButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $filled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$filled = z;
            this.$enabled = z2;
            this.$onClick = function0;
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
            FeedInstructionsEditorKt.FeedInstructionsActionButton(this.$text, this.$filled, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C118832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onSave;
        public final /* synthetic */ boolean $saveEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118832(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$saveEnabled = z;
            this.$onCancel = function0;
            this.$onSave = function02;
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
            FeedInstructionsEditorKt.FeedInstructionsButtons(this.$saveEnabled, this.$onCancel, this.$onSave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsEditCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C118842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onTextChange;
        public final /* synthetic */ C1805ArO $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118842(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$text = c1805ArO;
            this.$onTextChange = g0u;
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
            FeedInstructionsEditorKt.FeedInstructionsEditCard(this.$text, this.$onTextChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C118852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118852(BRg bRg, int i, int i2) {
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
            FeedInstructionsEditorKt.FeedInstructionsHeader(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedInstructionsEditorKt$FeedInstructionsPromptField$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onTextChange;
        public final /* synthetic */ C1805ArO $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$text = c1805ArO;
            this.$onTextChange = g0u;
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
            FeedInstructionsEditorKt.FeedInstructionsPromptField(this.$text, this.$onTextChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FeedInstructionsActionButton(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AKH<AuraColors> akh;
        long j;
        long jA04;
        BRg bRgA0P = bRg;
        bfm.AgG(597476002);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            if (z) {
                bfm.AgE(-1351172902);
                akh = AuraColorsKt.LocalAuraColors;
                j = AnonymousClass001.A0f(bfm, akh).invertedButtonBackground;
            } else {
                bfm.AgE(-1351171413);
                akh = AuraColorsKt.LocalAuraColors;
                j = AnonymousClass001.A0f(bfm, akh).highlight;
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (z) {
                jA04 = AnonymousClass006.A0i(bfm, akh, -1351168873).invertedButtonContent;
            } else if (z2) {
                jA04 = AnonymousClass006.A0i(bfm, akh, -1351167027).primaryText;
            } else {
                long j2 = AnonymousClass006.A0i(bfm, akh, -1351165175).primaryText;
                jA04 = HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.3f);
            }
            BBI.A0R(bbi, false);
            BRg bRgA05 = C0v5.A05(AuraHapticsKt.m2392auraHapticZShFqVg(C1b8.A01(C11U.A03(C10G.A04(bRgA0P, EditButtonHeight), C1D8.A00), j), AuraHaptics.BUTTON_TAP, z2), null, function0, z2);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA05);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, jA04, C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, z2, function0, bRgA0P, i, i2);
        }
    }

    public static final void FeedInstructionsButtons(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(function0, 1, function02);
        bfm.AgG(-26384962);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(AcQ.A00(EditButtonSpacing), bfm);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12026a);
            BS0 bs0 = BRg.A00;
            int i4 = iA0n << 6;
            FeedInstructionsActionButton(strA01, false, true, function0, c90m.AiP(bs0, 1.0f, true), bfm, (i4 & 7168) | 432, 0);
            int i5 = iA0n << 3;
            FeedInstructionsActionButton(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12026f), z, z, function02, c90m.AiP(bs0, 1.0f, true), bfm, (i4 & 896) | (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i5 & 7168), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118832(z, function0, function02, bRg2, i, i2);
        }
    }

    public static final void FeedInstructionsEditCard(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(c1805ArO, g0u);
        bfm.AgG(-1931831752);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1805ArO) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
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
            float f = EditCardShadowElevation;
            float f2 = EditCardCornerRadius;
            BRg bRgA01 = C11U.A01(AbstractC04540eo.A00(bRg2, C1D8.A00(f2), f, 28, 0L, 0L), f2);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA02 = C1DI.A02(C1b8.A01(bRgA01, AnonymousClass001.A0f(bfm, akh).highlight), C1D8.A00(f2), EditCardBorderWidth, AnonymousClass001.A0f(bfm, akh).elevatedBorder);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            FeedInstructionsHeader(null, bfm, 0, zA1a ? 1 : 0);
            FeedInstructionsPromptField(c1805ArO, g0u, C10G.A04(C10G.A02, PromptFieldHeight), bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0d & 14) | 384, 0);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118842(c1805ArO, g0u, bRg2, i, i2);
        }
    }

    public static final void FeedInstructionsHeader(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(2137137828);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12026c);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            float f = HeaderHorizontalPadding;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bs0, f, HeaderTopPadding, f, 0.0f), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12026d);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, C3U4.A0C(bs0, f, DescriptionTopPadding, f, DescriptionBottomPadding), C06G.A0I(bfm, akh), c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            C1b8.A04(bfm, C10G.A04(c1062ATq, DividerHeight), AnonymousClass001.A0f(bfm, akh).elevatedBorder);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118852(bRgA0P, i, i2);
        }
    }

    public static final void FeedInstructionsPromptField(C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(2144951922);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1805ArO) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, objAaT, obj);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            long j = AnonymousClass002.A0c(bfm).highlight;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120269);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT2;
            float f = EditGradientMaskHeight;
            int iAbr = axnA0Y.Abr(f);
            int iAbr2 = axnA0Y.Abr(PromptFieldHeight);
            boolean zA65 = bfm.A65(c1110AYwA00);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = AnonymousClass002.A0K(bfm, null, new FeedInstructionsEditorKt$FeedInstructionsPromptField$showTopFade$2$1(c1110AYwA00));
            }
            C1BO c1bo = (C1BO) objAaT3;
            boolean zA652 = bfm.A65(c1110AYwA00);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == obj) {
                objAaT4 = AnonymousClass002.A0K(bfm, null, new FeedInstructionsEditorKt$FeedInstructionsPromptField$showBottomFade$2$1(c1110AYwA00));
            }
            C1BO c1bo2 = (C1BO) objAaT4;
            Au3 au3 = new Au3(c1805ArO.A00);
            Object value = mutableState.getValue();
            int i4 = iA0d & 14;
            boolean zA1a = AnonymousClass001.A1a(AnonymousClass002.A1W(bfm, c1110AYwA00, AnonymousClass002.A1Q(i4, 4), bfm.A63(iAbr)), bfm, iAbr2);
            Object objAaT5 = bfm.AaT();
            if (zA1a || objAaT5 == obj) {
                objAaT5 = new FeedInstructionsEditorKt$FeedInstructionsPromptField$1$1(c1805ArO, iAbr, c1110AYwA00, iAbr2, mutableState, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A1A(bfm, objAaT5, au3, value);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass007.A0U(bfm, obj);
            C1YD c1yd = new C1YD(0);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1c3, AnonymousClass004.A1I(iA0d), AnonymousClass003.A17(i4));
            Object objAaT6 = bfm.AaT();
            if (zA1W || objAaT6 == obj) {
                objAaT6 = new FeedInstructionsEditorKt$FeedInstructionsPromptField$3$1(g0u, c1805ArO, c1518AkS, c1c3);
                bfm.Ai0(objAaT6);
            }
            BRg bRgA01 = C0v5.A01(null, interfaceC1072AWd, bRgThen, c1yd, strA01, (Function0) objAaT6, true);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u2);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(AbstractC1103AYp.A02(c1110AYwA00, C10G.A01, true), PromptHorizontalPadding, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822ArmA0T, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C06G.A0L(bfm, akh), 0L, 0L, 0L);
            C1326AhD c1326AhD = new C1326AhD(AnonymousClass001.A0f(bfm, akh).link);
            BRg bRgA00 = BHJ.A00(c1062ATq, c1518AkS);
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new FeedInstructionsEditorKt$FeedInstructionsPromptField$4$1$1$1(mutableState);
                bfm.Ai0(objAaT7);
            }
            AbstractC1874Aso.A02(null, null, null, bfm, bRgA00, c1326AhD, c1822ArmA00, c1805ArO, null, g0u, (G0U) objAaT7, B1V.A00(bfm, new FeedInstructionsEditorKt$FeedInstructionsPromptField$4$1$2(c1805ArO), -2125463765), 0, 0, iA0d & 126, 196992, 12248, false, false, false);
            BBI.A0R(bbi, true);
            if (C1BO.A0F(c1bo)) {
                bfm.AgE(-1707716771);
                C1EQ.A05(bfm, C10G.A04(c0z7.A4C(C2VU.A0C, bs0).then(c1062ATq), f), new B6A(j), new B6A(B6A.A06));
            } else {
                bfm.AgE(-1707489014);
            }
            BBI.A0R(bbi, false);
            if (C1BO.A0F(c1bo2)) {
                bfm.AgE(-1707456774);
                C1EQ.A05(bfm, C10G.A04(c0z7.A4C(C2VU.A06, bs0).then(c1062ATq), f), new B6A(B6A.A06), new B6A(j));
            } else {
                bfm.AgE(-1707226134);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(c1805ArO, g0u, bRgA0Q, i, i2);
        }
    }

    public static final /* synthetic */ C1958Aux access$FeedInstructionsPromptField$lambda$2(MutableState mutableState) {
        return (C1958Aux) mutableState.getValue();
    }

    public static final String buildFeedPromptSeed(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        String strA0l = AnonymousClass002.A0l(str);
        return strA0l.length() == 0 ? AnonymousClass002.A0l(str2) : strA0l;
    }
}
