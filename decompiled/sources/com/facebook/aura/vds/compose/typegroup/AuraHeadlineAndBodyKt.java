package com.facebook.aura.vds.compose.typegroup;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C14P;
import X.C1822Arm;
import X.C2VU;
import X.C3TH;
import X.G0U;
import X.G0V;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraHeadlineAndBodyKt {

    /* renamed from: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt$AuraHeadlineAndBody$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Icon $bodyIcon;
        public final /* synthetic */ AuraJustified $bodyJustified;
        public final /* synthetic */ int $bodyMaxLines;
        public final /* synthetic */ ApQ $bodyText;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ C1822Arm $bodyTextStyle;
        public final /* synthetic */ AuraHeadlineAndBodyColors $colors;
        public final /* synthetic */ Icon $headlineIcon;
        public final /* synthetic */ BO6<String, C14P> $headlineInlineContent;
        public final /* synthetic */ String $headlineText;
        public final /* synthetic */ C1822Arm $headlineTextStyle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ AuraJustified $justified;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $pretext;
        public final /* synthetic */ AuraHeadlineAndBodyStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle, BRg bRg, String str, AuraJustified auraJustified, String str2, ApQ apQ, AuraJustified auraJustified2, G0U<? super String, Unit> g0u, int i, G0V<? super BFM, ? super Integer, Unit> g0v, Icon icon, Icon icon2, AuraHeadlineAndBodyColors auraHeadlineAndBodyColors, BO6<String, C14P> bo6, C1822Arm c1822Arm, C1822Arm c1822Arm2, int i2, int i3, int i4) {
            super(2);
            this.$style = auraHeadlineAndBodyStyle;
            this.$modifier = bRg;
            this.$headlineText = str;
            this.$justified = auraJustified;
            this.$pretext = str2;
            this.$bodyText = apQ;
            this.$bodyJustified = auraJustified2;
            this.$bodyTextOnUrlClick = g0u;
            this.$bodyMaxLines = i;
            this.$illustration = g0v;
            this.$headlineIcon = icon;
            this.$bodyIcon = icon2;
            this.$colors = auraHeadlineAndBodyColors;
            this.$headlineInlineContent = bo6;
            this.$headlineTextStyle = c1822Arm;
            this.$bodyTextStyle = c1822Arm2;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraHeadlineAndBodyKt.AuraHeadlineAndBody(this.$style, this.$modifier, this.$headlineText, this.$justified, this.$pretext, this.$bodyText, this.$bodyJustified, this.$bodyTextOnUrlClick, this.$bodyMaxLines, this.$illustration, this.$headlineIcon, this.$bodyIcon, this.$colors, this.$headlineInlineContent, this.$headlineTextStyle, this.$bodyTextStyle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt$AuraHeadlineAndBody$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Icon $bodyIcon;
        public final /* synthetic */ AuraJustified $bodyJustified;
        public final /* synthetic */ int $bodyMaxLines;
        public final /* synthetic */ int $bodyMinLines;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ C1822Arm $bodyTextStyle;
        public final /* synthetic */ AHD<ApQ> $bodyTexts;
        public final /* synthetic */ AuraHeadlineAndBodyColors $colors;
        public final /* synthetic */ float $headingBodySpacing;
        public final /* synthetic */ Icon $headlineIcon;
        public final /* synthetic */ BO6<String, C14P> $headlineInlineContent;
        public final /* synthetic */ String $headlineText;
        public final /* synthetic */ C1822Arm $headlineTextStyle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ AuraJustified $justified;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $pretext;
        public final /* synthetic */ AuraHeadlineAndBodyStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(BRg bRg, AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle, String str, AuraJustified auraJustified, String str2, AHD<ApQ> ahd, AuraJustified auraJustified2, G0U<? super String, Unit> g0u, int i, int i2, G0V<? super BFM, ? super Integer, Unit> g0v, Icon icon, Icon icon2, AuraHeadlineAndBodyColors auraHeadlineAndBodyColors, BO6<String, C14P> bo6, float f, C1822Arm c1822Arm, C1822Arm c1822Arm2, int i3, int i4, int i5) {
            super(2);
            this.$modifier = bRg;
            this.$style = auraHeadlineAndBodyStyle;
            this.$headlineText = str;
            this.$justified = auraJustified;
            this.$pretext = str2;
            this.$bodyTexts = ahd;
            this.$bodyJustified = auraJustified2;
            this.$bodyTextOnUrlClick = g0u;
            this.$bodyMaxLines = i;
            this.$bodyMinLines = i2;
            this.$illustration = g0v;
            this.$headlineIcon = icon;
            this.$bodyIcon = icon2;
            this.$colors = auraHeadlineAndBodyColors;
            this.$headlineInlineContent = bo6;
            this.$headingBodySpacing = f;
            this.$headlineTextStyle = c1822Arm;
            this.$bodyTextStyle = c1822Arm2;
            this.$$changed = i3;
            this.$$changed1 = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraHeadlineAndBodyKt.m3097AuraHeadlineAndBodyZSrRDQQ(this.$modifier, this.$style, this.$headlineText, this.$justified, this.$pretext, this.$bodyTexts, this.$bodyJustified, this.$bodyTextOnUrlClick, this.$bodyMaxLines, this.$bodyMinLines, this.$illustration, this.$headlineIcon, this.$bodyIcon, this.$colors, this.$headlineInlineContent, this.$headingBodySpacing, this.$headlineTextStyle, this.$bodyTextStyle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt$AuraHeadlineAndBody$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Icon $bodyIcon;
        public final /* synthetic */ AuraJustified $bodyJustified;
        public final /* synthetic */ int $bodyMaxLines;
        public final /* synthetic */ int $bodyMinLines;
        public final /* synthetic */ ApQ $bodyText;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ C1822Arm $bodyTextStyle;
        public final /* synthetic */ AuraHeadlineAndBodyColors $colors;
        public final /* synthetic */ Icon $headlineIcon;
        public final /* synthetic */ BO6<String, C14P> $headlineInlineContent;
        public final /* synthetic */ ApQ $headlineText;
        public final /* synthetic */ C1822Arm $headlineTextStyle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ AuraJustified $justified;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $pretext;
        public final /* synthetic */ AuraHeadlineAndBodyStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(BRg bRg, AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle, ApQ apQ, AuraJustified auraJustified, String str, ApQ apQ2, AuraJustified auraJustified2, G0U<? super String, Unit> g0u, int i, int i2, G0V<? super BFM, ? super Integer, Unit> g0v, Icon icon, Icon icon2, AuraHeadlineAndBodyColors auraHeadlineAndBodyColors, BO6<String, C14P> bo6, C1822Arm c1822Arm, C1822Arm c1822Arm2, int i3, int i4, int i5) {
            super(2);
            this.$modifier = bRg;
            this.$style = auraHeadlineAndBodyStyle;
            this.$headlineText = apQ;
            this.$justified = auraJustified;
            this.$pretext = str;
            this.$bodyText = apQ2;
            this.$bodyJustified = auraJustified2;
            this.$bodyTextOnUrlClick = g0u;
            this.$bodyMaxLines = i;
            this.$bodyMinLines = i2;
            this.$illustration = g0v;
            this.$headlineIcon = icon;
            this.$bodyIcon = icon2;
            this.$colors = auraHeadlineAndBodyColors;
            this.$headlineInlineContent = bo6;
            this.$headlineTextStyle = c1822Arm;
            this.$bodyTextStyle = c1822Arm2;
            this.$$changed = i3;
            this.$$changed1 = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraHeadlineAndBodyKt.AuraHeadlineAndBody(this.$modifier, this.$style, this.$headlineText, this.$justified, this.$pretext, this.$bodyText, this.$bodyJustified, this.$bodyTextOnUrlClick, this.$bodyMaxLines, this.$bodyMinLines, this.$illustration, this.$headlineIcon, this.$bodyIcon, this.$colors, this.$headlineInlineContent, this.$headlineTextStyle, this.$bodyTextStyle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt$AuraHeadlineAndBody$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Icon $bodyIcon;
        public final /* synthetic */ AuraJustified $bodyJustified;
        public final /* synthetic */ int $bodyMaxLines;
        public final /* synthetic */ int $bodyMinLines;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ C1822Arm $bodyTextStyle;
        public final /* synthetic */ AHD<ApQ> $bodyTexts;
        public final /* synthetic */ AuraHeadlineAndBodyColors $colors;
        public final /* synthetic */ float $headingBodySpacing;
        public final /* synthetic */ float $headlineHorizontalPadding;
        public final /* synthetic */ Icon $headlineIcon;
        public final /* synthetic */ BO6<String, C14P> $headlineInlineContent;
        public final /* synthetic */ ApQ $headlineText;
        public final /* synthetic */ C1822Arm $headlineTextStyle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ AuraJustified $justified;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $pretext;
        public final /* synthetic */ AuraHeadlineAndBodyStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(BRg bRg, AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle, ApQ apQ, AuraJustified auraJustified, AuraJustified auraJustified2, String str, AHD<ApQ> ahd, G0U<? super String, Unit> g0u, int i, int i2, G0V<? super BFM, ? super Integer, Unit> g0v, Icon icon, Icon icon2, AuraHeadlineAndBodyColors auraHeadlineAndBodyColors, BO6<String, C14P> bo6, float f, float f2, C1822Arm c1822Arm, C1822Arm c1822Arm2, int i3, int i4, int i5) {
            super(2);
            this.$modifier = bRg;
            this.$style = auraHeadlineAndBodyStyle;
            this.$headlineText = apQ;
            this.$justified = auraJustified;
            this.$bodyJustified = auraJustified2;
            this.$pretext = str;
            this.$bodyTexts = ahd;
            this.$bodyTextOnUrlClick = g0u;
            this.$bodyMaxLines = i;
            this.$bodyMinLines = i2;
            this.$illustration = g0v;
            this.$headlineIcon = icon;
            this.$bodyIcon = icon2;
            this.$colors = auraHeadlineAndBodyColors;
            this.$headlineInlineContent = bo6;
            this.$headingBodySpacing = f;
            this.$headlineHorizontalPadding = f2;
            this.$headlineTextStyle = c1822Arm;
            this.$bodyTextStyle = c1822Arm2;
            this.$$changed = i3;
            this.$$changed1 = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraHeadlineAndBodyKt.m3096AuraHeadlineAndBodyS4pUbqE(this.$modifier, this.$style, this.$headlineText, this.$justified, this.$bodyJustified, this.$pretext, this.$bodyTexts, this.$bodyTextOnUrlClick, this.$bodyMaxLines, this.$bodyMinLines, this.$illustration, this.$headlineIcon, this.$bodyIcon, this.$colors, this.$headlineInlineContent, this.$headingBodySpacing, this.$headlineHorizontalPadding, this.$headlineTextStyle, this.$bodyTextStyle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AuraJustified.values().length];
            try {
                AnonymousClass005.A0v(AuraJustified.LEFT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AuraJustified.CENTER, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuraHeadlineAndBodyStyle.values().length];
            try {
                AnonymousClass005.A0v(AuraHeadlineAndBodyStyle.HEADLINE2_BODY1, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(AuraHeadlineAndBodyStyle.H2_EMPHASIZED_B1, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(AuraHeadlineAndBodyStyle.TITLE1_EMPHASIZED_B1, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(AuraHeadlineAndBodyStyle.TITLE1_EMPHASIZED_B2, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(AuraHeadlineAndBodyStyle.B1_EMPHASIZED_B2, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A18(AuraHeadlineAndBodyStyle.B2_B2, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1G(AuraHeadlineAndBodyStyle.TITLE2_EMPHASIZED_SUBHEADLINE_REGULAR, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1H(AuraHeadlineAndBodyStyle.TITLE2_MEDIUM_SUBHEADLINE_REGULAR, iArr2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1I(AuraHeadlineAndBodyStyle.TITLE3_MEDIUM_SUBHEADLINE_REGULAR, iArr2);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraHeadlineAndBody(com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle r43, X.BRg r44, java.lang.String r45, com.facebook.aura.vds.compose.typegroup.AuraJustified r46, java.lang.String r47, X.ApQ r48, com.facebook.aura.vds.compose.typegroup.AuraJustified r49, X.G0U<? super java.lang.String, kotlin.Unit> r50, int r51, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r52, com.facebook.aura.vds.compose.typegroup.Icon r53, com.facebook.aura.vds.compose.typegroup.Icon r54, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors r55, X.BO6<java.lang.String, X.C14P> r56, X.C1822Arm r57, X.C1822Arm r58, X.BFM r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt.AuraHeadlineAndBody(com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle, X.BRg, java.lang.String, com.facebook.aura.vds.compose.typegroup.AuraJustified, java.lang.String, X.ApQ, com.facebook.aura.vds.compose.typegroup.AuraJustified, X.G0U, int, X.G0V, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors, X.BO6, X.Arm, X.Arm, X.BFM, int, int, int):void");
    }

    public static final C3TH getAlignment(AuraJustified auraJustified) {
        int iOrdinal = auraJustified.ordinal();
        if (iOrdinal == 1) {
            return C2VU.A02;
        }
        if (iOrdinal == 0) {
            return C2VU.A00;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuraIconAndBodyStyle getBodyText(AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle, BFM bfm, int i) {
        switch (auraHeadlineAndBodyStyle.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
                return AuraIconAndBodyStyle.B1;
            case 3:
            case 4:
            case 5:
                return AuraIconAndBodyStyle.B2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AuraIconAndHeadlineStyle getHeadlineText(AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle, BFM bfm, int i) {
        switch (auraHeadlineAndBodyStyle.ordinal()) {
            case 0:
                return AuraIconAndHeadlineStyle.HEADLINE2;
            case 1:
                return AuraIconAndHeadlineStyle.HEADLINE2_EMPHASIZED;
            case 2:
            case 3:
                return AuraIconAndHeadlineStyle.TITLE1_EMPHASIZED;
            case 4:
                return AuraIconAndHeadlineStyle.B1_EMPHASIZED;
            case 5:
                return AuraIconAndHeadlineStyle.B2;
            case 6:
                return AuraIconAndHeadlineStyle.TITLE2_EMPHASIZED;
            case 7:
                return AuraIconAndHeadlineStyle.TITLE2_MEDIUM;
            case 8:
                return AuraIconAndHeadlineStyle.TITLE3_MEDIUM;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getTextAlignment(AuraJustified auraJustified) {
        int iOrdinal = auraJustified.ordinal();
        if (iOrdinal == 1) {
            return 5;
        }
        if (iOrdinal == 0) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /* JADX WARN: Type inference failed for: r50v1, types: [X.BRg] */
    /* JADX WARN: Type inference failed for: r62v3, types: [X.Arm] */
    /* renamed from: AuraHeadlineAndBody-S4pUbqE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3096AuraHeadlineAndBodyS4pUbqE(X.BRg r56, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle r57, X.ApQ r58, com.facebook.aura.vds.compose.typegroup.AuraJustified r59, com.facebook.aura.vds.compose.typegroup.AuraJustified r60, java.lang.String r61, X.AHD<X.ApQ> r62, X.G0U<? super java.lang.String, kotlin.Unit> r63, int r64, int r65, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r66, com.facebook.aura.vds.compose.typegroup.Icon r67, com.facebook.aura.vds.compose.typegroup.Icon r68, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors r69, X.BO6<java.lang.String, X.C14P> r70, float r71, float r72, X.C1822Arm r73, X.C1822Arm r74, X.BFM r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt.m3096AuraHeadlineAndBodyS4pUbqE(X.BRg, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle, X.ApQ, com.facebook.aura.vds.compose.typegroup.AuraJustified, com.facebook.aura.vds.compose.typegroup.AuraJustified, java.lang.String, X.AHD, X.G0U, int, int, X.G0V, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors, X.BO6, float, float, X.Arm, X.Arm, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* renamed from: AuraHeadlineAndBody-ZSrRDQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3097AuraHeadlineAndBodyZSrRDQQ(X.BRg r45, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle r46, java.lang.String r47, com.facebook.aura.vds.compose.typegroup.AuraJustified r48, java.lang.String r49, X.AHD<X.ApQ> r50, com.facebook.aura.vds.compose.typegroup.AuraJustified r51, X.G0U<? super java.lang.String, kotlin.Unit> r52, int r53, int r54, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r55, com.facebook.aura.vds.compose.typegroup.Icon r56, com.facebook.aura.vds.compose.typegroup.Icon r57, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors r58, X.BO6<java.lang.String, X.C14P> r59, float r60, X.C1822Arm r61, X.C1822Arm r62, X.BFM r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt.m3097AuraHeadlineAndBodyZSrRDQQ(X.BRg, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle, java.lang.String, com.facebook.aura.vds.compose.typegroup.AuraJustified, java.lang.String, X.AHD, com.facebook.aura.vds.compose.typegroup.AuraJustified, X.G0U, int, int, X.G0V, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors, X.BO6, float, X.Arm, X.Arm, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraHeadlineAndBody(X.BRg r44, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle r45, X.ApQ r46, com.facebook.aura.vds.compose.typegroup.AuraJustified r47, java.lang.String r48, X.ApQ r49, com.facebook.aura.vds.compose.typegroup.AuraJustified r50, X.G0U<? super java.lang.String, kotlin.Unit> r51, int r52, int r53, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r54, com.facebook.aura.vds.compose.typegroup.Icon r55, com.facebook.aura.vds.compose.typegroup.Icon r56, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors r57, X.BO6<java.lang.String, X.C14P> r58, X.C1822Arm r59, X.C1822Arm r60, X.BFM r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt.AuraHeadlineAndBody(X.BRg, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle, X.ApQ, com.facebook.aura.vds.compose.typegroup.AuraJustified, java.lang.String, X.ApQ, com.facebook.aura.vds.compose.typegroup.AuraJustified, X.G0U, int, int, X.G0V, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.Icon, com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors, X.BO6, X.Arm, X.Arm, X.BFM, int, int, int):void");
    }
}
