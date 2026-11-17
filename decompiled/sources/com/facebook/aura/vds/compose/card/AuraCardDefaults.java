package com.facebook.aura.vds.compose.card;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C11S;
import X.C7197Ei9;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraContentAlphaKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.typegroup.AuraIllustrationKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCardDefaults {
    public static final int $stable = 0;
    public static final AuraCardDefaults INSTANCE = new AuraCardDefaults();

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardDefaults$LeadingIllustration$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraIconSize $illustrationSize;
        public final /* synthetic */ AuraDrawableSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraDrawableSource auraDrawableSource, AuraIconSize auraIconSize) {
            super(2);
            this.$source = auraDrawableSource;
            this.$illustrationSize = auraIconSize;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraIllustrationKt.AuraIllustration(null, this.$source, AuraCardDefaultsKt.toIllustrationSize(this.$illustrationSize), false, null, bfm, 0, 25);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardDefaults$LeadingIllustration$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraIconSize $illustrationSize;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraDrawableSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, AuraDrawableSource auraDrawableSource, AuraIconSize auraIconSize, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$source = auraDrawableSource;
            this.$illustrationSize = auraIconSize;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraCardDefaults.this.LeadingIllustration(this.$modifier, this.$source, this.$illustrationSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @kotlin.Deprecated(message = "This variant is no longer supported by the design system.")
    /* renamed from: LeadingIconButton-3f6hBDE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2479LeadingIconButton3f6hBDE(X.BRg r15, X.AVy r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, java.lang.String r18, long r19, boolean r21, X.InterfaceC1072AWd r22, X.BFM r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.card.AuraCardDefaults.m2479LeadingIconButton3f6hBDE(X.BRg, X.AVy, kotlin.jvm.functions.Function0, java.lang.String, long, boolean, X.AWd, X.BFM, int, int):void");
    }

    /* renamed from: LeadingIcon-gKt5lHk, reason: not valid java name */
    public final void m2478LeadingIcongKt5lHk(BRg bRg, AVy aVy, B6A b6a, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        B6A b6a2 = b6a;
        C7384Etj.A0Y(aVy, 1);
        bfm.AgG(1128803067);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(aVy, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, b6a2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                b6a2 = null;
            }
            AuraCardDefaultsKt.LeadingContainer(bRg2, false, B1V.A00(bfm, new AuraCardDefaults$LeadingIcon$1(aVy, b6a2), -2040149871), bfm, (iA0d & 14) | 384, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraCardDefaults$LeadingIcon$2(this, bRg2, aVy, b6a2, i, i2);
        }
    }

    public final void LeadingIllustration(BRg bRg, AuraDrawableSource auraDrawableSource, AuraIconSize auraIconSize, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AuraIconSize auraIconSize2 = auraIconSize;
        C7384Etj.A0Y(auraDrawableSource, 1);
        bfm.AgG(-1949872785);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(auraIconSize2));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                auraIconSize2 = AuraIconSize.ILLUSTRATION_SMALL;
            }
            AuraCardDefaultsKt.LeadingContainer(C11S.A00(bRg2, AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha))), false, B1V.A00(bfm, new AnonymousClass1(auraDrawableSource, auraIconSize2), 1097497477), bfm, 432, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, auraDrawableSource, auraIconSize2, i, i2);
        }
    }

    /* renamed from: LeadingImage-xqIIw2o, reason: not valid java name */
    public final void m2480LeadingImagexqIIw2o(AuraDrawableSource auraDrawableSource, String str, C7197Ei9 c7197Ei9, B6A b6a, BFM bfm, int i, int i2) {
        B6A b6a2;
        boolean zA1P;
        C7197Ei9 c7197Ei9M2483createDefaultOptionsoJZG2nU;
        String str2 = str;
        C7197Ei9 c7197Ei92 = c7197Ei9;
        bfm.AgG(-509020319);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraDrawableSource, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, c7197Ei92);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, b6a);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                str2 = null;
            }
            if (i4 != 0) {
                c7197Ei92 = null;
            }
            b6a2 = i5 == 0 ? b6a : null;
            BRg bRgA07 = C10G.A07(C11S.A00(BRg.A00, AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha))), 32.0f);
            if (c7197Ei92 == null) {
                bfm.AgE(457756859);
                c7197Ei9M2483createDefaultOptionsoJZG2nU = AuraCardDefaultsKt.m2483createDefaultOptionsoJZG2nU(b6a2, bfm, (iA05 >> 9) & 14);
                zA1P = AnonymousClass001.A1V(bfm);
            } else {
                zA1P = AnonymousClass004.A1P(bfm, 457756363);
                c7197Ei9M2483createDefaultOptionsoJZG2nU = c7197Ei92;
            }
            AuraImageKt.AuraImage(auraDrawableSource, bRgA07, str2, c7197Ei9M2483createDefaultOptionsoJZG2nU, zA1P, zA1P, null, zA1P, null, bfm, (iA05 & 14) | ((iA05 << 3) & 896), 496);
        } else {
            bfm.Afo();
            b6a2 = b6a;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraCardDefaults$LeadingImage$1(this, auraDrawableSource, str2, c7197Ei92, b6a2, i, i2);
        }
    }

    /* renamed from: tint-WaAFU9c, reason: not valid java name */
    public final long m2481tintWaAFU9c(BFM bfm, int i) {
        return ColorExtKt.m2544applyContentAlphaek8zF_U(AuraTheme.INSTANCE.getContentColor(bfm, 6), bfm, 0);
    }
}
