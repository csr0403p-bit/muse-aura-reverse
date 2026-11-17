package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C11U;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1D3;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.TextWithButtonCta;
import com.facebook.aura.model.TextWithButtonCtaStyle;
import com.facebook.aura.model.TextWithButtonHeader;
import com.facebook.aura.model.TextWithButtonHeaderIcon;
import com.facebook.aura.model.TextWithButtonHeaderTypography;
import com.facebook.aura.model.TextWithButtonPresentation;
import com.facebook.aura.model.TextWithButtonTextFormat;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchTextWithButtonCardKt {
    public static final float DISABLED_CTA_ALPHA = 0.5f;

    /* renamed from: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt$ComplimentarySubscriptionRedeemFailedDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(2);
            this.$onDismiss = function0;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA65 = bfm.A65(this.$onDismiss);
            Function0<Unit> function0 = this.$onDismiss;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchTextWithButtonCardKt$ComplimentarySubscriptionRedeemFailedDialog$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt$ComplimentarySubscriptionRedeemFailedDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTextWithButtonCardKt.ComplimentarySubscriptionRedeemFailedDialog(this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt$TextWithButtonCtaButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextWithButtonCta $cta;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TextWithButtonCta textWithButtonCta, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$cta = textWithButtonCta;
            this.$enabled = z;
            this.$loading = z2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTextWithButtonCardKt.TextWithButtonCtaButton(this.$cta, this.$enabled, this.$loading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt$TextWithButtonHeaderRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C115123 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextWithButtonHeader $header;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115123(TextWithButtonHeader textWithButtonHeader, BRg bRg, int i, int i2) {
            super(2);
            this.$header = textWithButtonHeader;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTextWithButtonCardKt.TextWithButtonHeaderRow(this.$header, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt$TextWithButtonMarkdownBody$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C115132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115132(String str, BRg bRg, String str2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$presentationId = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(this.$text, this.$modifier, C06G.A0T(bfm), false, null, FGI.A0M("text_with_button:", this.$presentationId), new B6A(C06G.A0C(bfm)), C1736ApY.A03, null, false, false, null, bfm, 12582912, 0, 3864);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt$TextWithButtonMarkdownBody$3, reason: invalid class name and case insensitive filesystem */
    public final class C115143 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115143(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$presentationId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTextWithButtonCardKt.TextWithButtonMarkdownBody(this.$text, this.$presentationId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void TextWithButtonMarkdownBody(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1649129114);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1S = AnonymousClass005.A1S(bfm, abstractC3358CGzA0h, contextA0H, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HatchTextWithButtonCardKt$TextWithButtonMarkdownBody$1$1(abstractC3358CGzA0h, contextA0H, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchAuraMarkdownProvidersKt.HatchAuraMarkdownUrlHandler((G0U) objAaT, B1V.A00(bfm, new C115132(str, bRg2, str2), 1689550469), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115143(str, str2, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TextWithButtonTextFormat.values().length];
            try {
                AnonymousClass005.A0v(TextWithButtonTextFormat.PLAIN, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(TextWithButtonTextFormat.MARKDOWN, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TextWithButtonCtaStyle.values().length];
            try {
                AnonymousClass005.A0v(TextWithButtonCtaStyle.PRIMARY, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(TextWithButtonCtaStyle.SECONDARY, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TextWithButtonHeaderIcon.values().length];
            try {
                AnonymousClass005.A0v(TextWithButtonHeaderIcon.MAIL, iArr3, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(TextWithButtonHeaderIcon.SHIELD_USER, iArr3, 2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* renamed from: HatchComplimentarySubscriptionCard-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m665HatchComplimentarySubscriptionCardfWhpE4E(com.facebook.aura.model.TextWithButtonPresentation r40, java.lang.String r41, X.BRg r42, long r43, X.C1D3 r45, X.G0V<? super java.lang.Integer, ? super com.facebook.aura.model.TextWithButtonCta, kotlin.Unit> r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt.m665HatchComplimentarySubscriptionCardfWhpE4E(com.facebook.aura.model.TextWithButtonPresentation, java.lang.String, X.BRg, long, X.1D3, X.G0V, X.BFM, int, int):void");
    }

    /* renamed from: HatchPresentationTextWithButtonCard-3f6hBDE, reason: not valid java name */
    public static final void m666HatchPresentationTextWithButtonCard3f6hBDE(String str, TextWithButtonPresentation textWithButtonPresentation, String str2, BRg bRg, long j, C1D3 c1d3, G0V<? super Integer, ? super TextWithButtonCta, Unit> g0v, BFM bfm, int i, int i2) {
        G0V<? super Integer, ? super TextWithButtonCta, Unit> g0v2 = g0v;
        BRg bRg2 = bRg;
        AnonymousClass005.A10(str, textWithButtonPresentation, str2);
        C7384Etj.A0Y(c1d3, 5);
        bfm.AgG(1552229880);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(textWithButtonPresentation, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(bfm.A64(j) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, c1d3);
        }
        int i4 = i2 & 64;
        int iA0Z = 1572864;
        if (i4 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_COMPLIMENTARY_SUBSCRIPTION)) {
                bfm.AgE(-1432154623);
                int i5 = iA0d >> 3;
                m665HatchComplimentarySubscriptionCardfWhpE4E(textWithButtonPresentation, str2, bRg2, j, c1d3, g0v2, bfm, AnonymousClass001.A08(i5, AnonymousClass003.A06(i5, TextWithButtonPresentation.$stable | (i5 & 14)) | (57344 & i5)), 0);
            } else {
                bfm.AgE(-1431886132);
                int i6 = iA0d >> 3;
                m667HatchTextWithButtonCard8r3B23s(textWithButtonPresentation, str2, bRg2, j, c1d3, null, null, g0v2, bfm, AnonymousClass003.A06(i6, TextWithButtonPresentation.$stable | (i6 & 14)) | (i6 & 57344) | (29360128 & (iA0d << 3)), 96);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchTextWithButtonCardKt$HatchPresentationTextWithButtonCard$1(str, textWithButtonPresentation, str2, bRg2, j, c1d3, g0v2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* renamed from: HatchTextWithButtonCard-8r3B23s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m667HatchTextWithButtonCard8r3B23s(com.facebook.aura.model.TextWithButtonPresentation r34, java.lang.String r35, X.BRg r36, long r37, X.C1D3 r39, java.lang.Integer r40, java.lang.Integer r41, X.G0V<? super java.lang.Integer, ? super com.facebook.aura.model.TextWithButtonCta, kotlin.Unit> r42, X.BFM r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchTextWithButtonCardKt.m667HatchTextWithButtonCard8r3B23s(com.facebook.aura.model.TextWithButtonPresentation, java.lang.String, X.BRg, long, X.1D3, java.lang.Integer, java.lang.Integer, X.G0V, X.BFM, int, int):void");
    }

    public static final void TextWithButtonCtaButton(TextWithButtonCta textWithButtonCta, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AuraLabelButtonStyle auraLabelButtonStylePrimary;
        BRg bRg2 = bRg;
        bfm.AgG(1052092436);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(textWithButtonCta, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            TextWithButtonCtaStyle textWithButtonCtaStyle = textWithButtonCta.style;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = textWithButtonCtaStyle.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(1743524861);
                auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AnonymousClass001.A1D(bfm);
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 1743522524);
                }
                bfm.AgE(1743527135);
                auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                AnonymousClass001.A1D(bfm);
            }
            long jMo2427backgroundColor0d7_KjU = auraLabelButtonStylePrimary.mo2427backgroundColor0d7_KjU();
            long jA04 = HxS.A04(HDi.A0O[(int) (jMo2427backgroundColor0d7_KjU & 63)], B6A.A03(jMo2427backgroundColor0d7_KjU), B6A.A02(jMo2427backgroundColor0d7_KjU), B6A.A01(jMo2427backgroundColor0d7_KjU), 0.5f);
            long jMo2428contentColorwmQWz5c = auraLabelButtonStylePrimary.mo2428contentColorwmQWz5c(true, false, bfm, 54);
            long jA042 = HxS.A04(HDi.A0O[(int) (jMo2428contentColorwmQWz5c & 63)], B6A.A03(jMo2428contentColorwmQWz5c), B6A.A02(jMo2428contentColorwmQWz5c), B6A.A01(jMo2428contentColorwmQWz5c), 0.5f);
            String str = textWithButtonCta.label;
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA64 = bfm.A64(jA042);
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA18 = AnonymousClass003.A18(i4) | zA64;
            Object objAaT = bfm.AaT();
            if (zA18 || objAaT == C78N.A00) {
                objAaT = new HatchTextWithButtonCardKt$TextWithButtonCtaButton$1$1(jA042, z);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            boolean zA642 = bfm.A64(jA04) | AnonymousClass003.A18(i4);
            Object objAaT2 = bfm.AaT();
            if (zA642 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchTextWithButtonCardKt$TextWithButtonCtaButton$2$1(jA04, z);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRg2, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, z2, false, null, null, function0, null, null, function02, (Function0) objAaT2, null, null, null, null, false, 0, false, 0, bfm, ((iA05 >> 3) & 7168) | 196608 | ((iA05 << 24) & 1879048192), ((iA05 >> 6) & 14) | (57344 & (iA05 << 3)), 0, 133806533);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(textWithButtonCta, z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void TextWithButtonHeaderRow(TextWithButtonHeader textWithButtonHeader, BRg bRg, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822ArmA0D;
        long jA07;
        BRg bRg2 = bRg;
        bfm.AgG(-1445833858);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(textWithButtonHeader, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchTextWithButtonCardKt$TextWithButtonHeaderRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0S);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            TextWithButtonHeaderIcon textWithButtonHeaderIcon = textWithButtonHeader.icon;
            if (textWithButtonHeaderIcon == null) {
                bfm.AgE(348961677);
            } else {
                bfm.AgE(348961678);
                AVy aVyA00 = BOf.A00(bfm, drawableRes(textWithButtonHeaderIcon), 0);
                AuraIconSize auraIconSize = AuraIconSize.SMALL;
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C1b8.A01(C11U.A03(BRg.A00, auraTheme2.getShapes(bfm, 6).small), auraTheme2.getColors(bfm, 6).secondaryButtonBackground), AuraDimensKt.SpacingXsmall), aVyA00, auraIconSize, null, C3cH.A06(bfm, auraTheme2), null, bfm, AnonymousClass001.A03(), 40);
            }
            BBI.A0R(bbi, false);
            boolean zA1Z = AnonymousClass002.A1Z(textWithButtonHeader.typography, TextWithButtonHeaderTypography.BODY);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, zA1Z ? AuraDimensKt.SpacingMicro : AuraDimensKt.SpacingNone, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = textWithButtonHeader.title;
            if (zA1Z) {
                bfm.AgE(-762146898);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            } else {
                bfm.AgE(-762145259);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0D = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), c1822ArmA0D, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String str2 = textWithButtonHeader.subtitle;
            C1822Arm c1822Arm = zA1Z ? C3cH.A0X(bfm, auraTheme, -762139185).bodyRegular : C3cH.A0X(bfm, auraTheme, -762137517).footnoteRegular;
            BBI.A0R(bbi, false);
            if (zA1Z) {
                bfm.AgE(-762135473);
                jA07 = C3cH.A06(bfm, auraTheme);
            } else {
                bfm.AgE(-762134383);
                jA07 = C3cH.A07(bfm, auraTheme);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115123(textWithButtonHeader, bRg2, i, i2);
        }
    }

    public static final int drawableRes(TextWithButtonHeaderIcon textWithButtonHeaderIcon) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = textWithButtonHeaderIcon.ordinal();
        if (iOrdinal == 1) {
            return R.drawable.email_inbox;
        }
        if (iOrdinal == 0) {
            return R.drawable.shielduser_outline_24_wght400;
        }
        throw C3cG.A0q();
    }

    public static final void ComplimentarySubscriptionRedeemFailedDialog(Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1761276035);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210bb), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210ba), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(function0), 1090812178), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0T << 18) & 3670016) | 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }
}
