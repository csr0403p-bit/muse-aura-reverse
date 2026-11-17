package com.facebook.aura.vds.compose.card;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.ApQ;
import X.B6A;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCardContent extends C06G {
    public static final int $stable = 0;
    public final ApQ boxedText;
    public final long boxedTextBackgroundColor;
    public final long boxedTextColor;
    public final C1822Arm boxedTextStyle;
    public final String contentDescription;
    public final String label;
    public final int labelMaxLines;
    public final C1822Arm labelStyle;
    public final boolean mergeContentDescription;
    public final ApQ subtitle;
    public final B6A subtitleColor;
    public final int subtitleMaxLines;
    public final G0U<String, Unit> subtitleOnUrlClick;
    public final AuraIconAndBodyStyle subtitleStyle;
    public final C1YL textAlign;
    public final ApQ title;
    public final B6A titleColor;
    public final BO6<String, C14P> titleInlineContent;
    public final boolean titleIsHeading;
    public final int titleMaxLines;
    public final AuraIconAndHeadlineStyle titleStyle;

    /* renamed from: copy-wtHFcuo, reason: not valid java name */
    public final AuraCardContent m2472copywtHFcuo(ApQ apQ, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6<String, C14P> bo6, B6A b6a, ApQ apQ2, G0U<? super String, Unit> g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str, C1822Arm c1822Arm, int i, int i2, int i3, String str2, boolean z, boolean z2, ApQ apQ3, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl) {
        C7384Etj.A0Y(bo6, 2);
        return new AuraCardContent(apQ, auraIconAndHeadlineStyle, bo6, b6a, apQ2, g0u, auraIconAndBodyStyle, b6a2, str, c1822Arm, i, i2, i3, str2, z, z2, apQ3, c1822Arm2, j, j2, c1yl);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCardContent) {
                AuraCardContent auraCardContent = (AuraCardContent) obj;
                if (C7384Etj.areEqual(this.title, auraCardContent.title) && this.titleStyle == auraCardContent.titleStyle && C7384Etj.areEqual(this.titleInlineContent, auraCardContent.titleInlineContent) && C7384Etj.areEqual(this.titleColor, auraCardContent.titleColor) && C7384Etj.areEqual(this.subtitle, auraCardContent.subtitle) && C7384Etj.areEqual(this.subtitleOnUrlClick, auraCardContent.subtitleOnUrlClick) && this.subtitleStyle == auraCardContent.subtitleStyle && C7384Etj.areEqual(this.subtitleColor, auraCardContent.subtitleColor) && C7384Etj.areEqual(this.label, auraCardContent.label) && C7384Etj.areEqual(this.labelStyle, auraCardContent.labelStyle) && this.labelMaxLines == auraCardContent.labelMaxLines && this.titleMaxLines == auraCardContent.titleMaxLines && this.subtitleMaxLines == auraCardContent.subtitleMaxLines && C7384Etj.areEqual(this.contentDescription, auraCardContent.contentDescription) && this.mergeContentDescription == auraCardContent.mergeContentDescription && this.titleIsHeading == auraCardContent.titleIsHeading && C7384Etj.areEqual(this.boxedText, auraCardContent.boxedText) && C7384Etj.areEqual(this.boxedTextStyle, auraCardContent.boxedTextStyle)) {
                    long j = this.boxedTextColor;
                    long j2 = auraCardContent.boxedTextColor;
                    long j3 = B6A.A01;
                    if (j != j2 || this.boxedTextBackgroundColor != auraCardContent.boxedTextBackgroundColor || !C7384Etj.areEqual(this.textAlign, auraCardContent.textAlign)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final ApQ component1() {
        return this.title;
    }

    public final C1822Arm component10() {
        return this.labelStyle;
    }

    public final int component11() {
        return this.labelMaxLines;
    }

    public final int component12() {
        return this.titleMaxLines;
    }

    public final int component13() {
        return this.subtitleMaxLines;
    }

    public final String component14() {
        return this.contentDescription;
    }

    public final boolean component15() {
        return this.mergeContentDescription;
    }

    public final boolean component16() {
        return this.titleIsHeading;
    }

    public final ApQ component17() {
        return this.boxedText;
    }

    public final C1822Arm component18() {
        return this.boxedTextStyle;
    }

    /* renamed from: component19-0d7_KjU, reason: not valid java name */
    public final long m2467component190d7_KjU() {
        return this.boxedTextColor;
    }

    public final AuraIconAndHeadlineStyle component2() {
        return this.titleStyle;
    }

    /* renamed from: component20-0d7_KjU, reason: not valid java name */
    public final long m2468component200d7_KjU() {
        return this.boxedTextBackgroundColor;
    }

    /* renamed from: component21-buA522U, reason: not valid java name */
    public final C1YL m2469component21buA522U() {
        return this.textAlign;
    }

    public final BO6<String, C14P> component3() {
        return this.titleInlineContent;
    }

    /* renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final B6A m2470component4QN2ZGVo() {
        return this.titleColor;
    }

    public final ApQ component5() {
        return this.subtitle;
    }

    public final G0U<String, Unit> component6() {
        return this.subtitleOnUrlClick;
    }

    public final AuraIconAndBodyStyle component7() {
        return this.subtitleStyle;
    }

    /* renamed from: component8-QN2ZGVo, reason: not valid java name */
    public final B6A m2471component8QN2ZGVo() {
        return this.subtitleColor;
    }

    public final String component9() {
        return this.label;
    }

    public final ApQ getBoxedText() {
        return this.boxedText;
    }

    /* renamed from: getBoxedTextBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m2473getBoxedTextBackgroundColor0d7_KjU() {
        return this.boxedTextBackgroundColor;
    }

    /* renamed from: getBoxedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2474getBoxedTextColor0d7_KjU() {
        return this.boxedTextColor;
    }

    public final C1822Arm getBoxedTextStyle() {
        return this.boxedTextStyle;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getLabelMaxLines() {
        return this.labelMaxLines;
    }

    public final C1822Arm getLabelStyle() {
        return this.labelStyle;
    }

    public final boolean getMergeContentDescription() {
        return this.mergeContentDescription;
    }

    public final ApQ getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: getSubtitleColor-QN2ZGVo, reason: not valid java name */
    public final B6A m2475getSubtitleColorQN2ZGVo() {
        return this.subtitleColor;
    }

    public final int getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    public final G0U<String, Unit> getSubtitleOnUrlClick() {
        return this.subtitleOnUrlClick;
    }

    public final AuraIconAndBodyStyle getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final C1YL m2476getTextAlignbuA522U() {
        return this.textAlign;
    }

    public final ApQ getTitle() {
        return this.title;
    }

    /* renamed from: getTitleColor-QN2ZGVo, reason: not valid java name */
    public final B6A m2477getTitleColorQN2ZGVo() {
        return this.titleColor;
    }

    public final BO6<String, C14P> getTitleInlineContent() {
        return this.titleInlineContent;
    }

    public final boolean getTitleIsHeading() {
        return this.titleIsHeading;
    }

    public final int getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public final AuraIconAndHeadlineStyle getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        int iA01 = (((C0KA.A01(C0KA.A01((((((((((((((((((((((AnonymousClass005.A0F(this.titleInlineContent, ((AnonymousClass006.A0D(this.title) * 31) + AnonymousClass006.A0D(this.titleStyle)) * 31) + AnonymousClass007.A07(this.titleColor)) * 31) + AnonymousClass006.A0D(this.subtitle)) * 31) + AnonymousClass006.A0D(this.subtitleOnUrlClick)) * 31) + AnonymousClass006.A0D(this.subtitleStyle)) * 31) + AnonymousClass007.A07(this.subtitleColor)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0D(this.labelStyle)) * 31) + this.labelMaxLines) * 31) + this.titleMaxLines) * 31) + this.subtitleMaxLines) * 31) + AnonymousClass006.A0G(this.contentDescription)) * 31, this.mergeContentDescription), this.titleIsHeading) + AnonymousClass006.A0D(this.boxedText)) * 31) + AnonymousClass006.A0D(this.boxedTextStyle)) * 31;
        long j = this.boxedTextColor;
        long j2 = B6A.A01;
        int iA06 = AnonymousClass006.A06(this.boxedTextBackgroundColor, AnonymousClass006.A06(j, iA01));
        C1YL c1yl = this.textAlign;
        return iA06 + (c1yl != null ? c1yl.A00 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCardContent() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        this((ApQ) null, (AuraIconAndHeadlineStyle) objArr, (BO6) objArr2, (B6A) objArr3, (ApQ) objArr4, (G0U) objArr5, (AuraIconAndBodyStyle) objArr6, (B6A) objArr7, (String) objArr8, (C1822Arm) objArr9, 0, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) objArr10, (boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (ApQ) objArr11, (C1822Arm) objArr12, j, j, (C1YL) objArr13, 2097151, (C06H) objArr14);
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: copy-wtHFcuo$default, reason: not valid java name */
    public static /* synthetic */ AuraCardContent m2466copywtHFcuo$default(AuraCardContent auraCardContent, ApQ apQ, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6 bo6, B6A b6a, ApQ apQ2, G0U g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str, C1822Arm c1822Arm, int i, int i2, int i3, String str2, boolean z, boolean z2, ApQ apQ3, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl, int i4, Object obj) {
        AuraIconAndHeadlineStyle auraIconAndHeadlineStyle2 = auraIconAndHeadlineStyle;
        BO6 bo62 = bo6;
        B6A b6a3 = b6a;
        ApQ apQ4 = apQ;
        ApQ apQ5 = apQ2;
        G0U g0u2 = g0u;
        AuraIconAndBodyStyle auraIconAndBodyStyle2 = auraIconAndBodyStyle;
        B6A b6a4 = b6a2;
        String str3 = str;
        C1822Arm c1822Arm3 = c1822Arm;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        String str4 = str2;
        boolean z3 = z;
        boolean z4 = z2;
        long j3 = j;
        long j4 = j2;
        ApQ apQ6 = apQ3;
        C1822Arm c1822Arm4 = c1822Arm2;
        C1YL c1yl2 = c1yl;
        if ((i4 & 1) != 0) {
            apQ4 = auraCardContent.title;
        }
        if ((i4 & 2) != 0) {
            auraIconAndHeadlineStyle2 = auraCardContent.titleStyle;
        }
        if ((i4 & 4) != 0) {
            bo62 = auraCardContent.titleInlineContent;
        }
        if ((i4 & 8) != 0) {
            b6a3 = auraCardContent.titleColor;
        }
        if ((i4 & 16) != 0) {
            apQ5 = auraCardContent.subtitle;
        }
        if ((i4 & 32) != 0) {
            g0u2 = auraCardContent.subtitleOnUrlClick;
        }
        if ((i4 & 64) != 0) {
            auraIconAndBodyStyle2 = auraCardContent.subtitleStyle;
        }
        if ((i4 & 128) != 0) {
            b6a4 = auraCardContent.subtitleColor;
        }
        if ((i4 & 256) != 0) {
            str3 = auraCardContent.label;
        }
        if ((i4 & 512) != 0) {
            c1822Arm3 = auraCardContent.labelStyle;
        }
        if ((i4 & 1024) != 0) {
            i5 = auraCardContent.labelMaxLines;
        }
        if ((i4 & 2048) != 0) {
            i6 = auraCardContent.titleMaxLines;
        }
        if ((i4 & 4096) != 0) {
            i7 = auraCardContent.subtitleMaxLines;
        }
        if ((i4 & 8192) != 0) {
            str4 = auraCardContent.contentDescription;
        }
        if ((i4 & 16384) != 0) {
            z3 = auraCardContent.mergeContentDescription;
        }
        if ((i4 & 32768) != 0) {
            z4 = auraCardContent.titleIsHeading;
        }
        if ((i4 & 65536) != 0) {
            apQ6 = auraCardContent.boxedText;
        }
        if ((i4 & 131072) != 0) {
            c1822Arm4 = auraCardContent.boxedTextStyle;
        }
        if ((i4 & 262144) != 0) {
            j3 = auraCardContent.boxedTextColor;
        }
        if ((i4 & 524288) != 0) {
            j4 = auraCardContent.boxedTextBackgroundColor;
        }
        if ((i4 & 1048576) != 0) {
            c1yl2 = auraCardContent.textAlign;
        }
        int i8 = i6;
        int i9 = i7;
        String str5 = str4;
        return auraCardContent.m2472copywtHFcuo(apQ4, auraIconAndHeadlineStyle2, bo62, b6a3, apQ5, g0u2, auraIconAndBodyStyle2, b6a4, str3, c1822Arm3, i5, i8, i9, str5, z3, z4, apQ6, c1822Arm4, j3, j4, c1yl2);
    }

    public /* synthetic */ AuraCardContent(ApQ apQ, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6 bo6, B6A b6a, ApQ apQ2, G0U g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str, C1822Arm c1822Arm, int i, int i2, int i3, String str2, boolean z, boolean z2, ApQ apQ3, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl, int i4, C06H c06h) {
        this((i4 & 1) != 0 ? null : apQ, (i4 & 2) != 0 ? null : auraIconAndHeadlineStyle, (BO6<String, C14P>) ((i4 & 4) != 0 ? C0953AJg.A00() : bo6), (i4 & 8) != 0 ? null : b6a, (i4 & 16) != 0 ? null : apQ2, (G0U<? super String, Unit>) ((i4 & 32) != 0 ? null : g0u), (i4 & 64) != 0 ? null : auraIconAndBodyStyle, (i4 & 128) != 0 ? null : b6a2, (i4 & 256) != 0 ? null : str, (i4 & 512) != 0 ? null : c1822Arm, (i4 & 1024) != 0 ? Integer.MAX_VALUE : i, (i4 & 2048) != 0 ? Integer.MAX_VALUE : i2, (i4 & 4096) == 0 ? i3 : Integer.MAX_VALUE, (i4 & 8192) != 0 ? null : str2, (i4 & 16384) != 0 ? true : z, (i4 & 32768) == 0 ? z2 : true, (i4 & 65536) != 0 ? null : apQ3, (i4 & 131072) != 0 ? null : c1822Arm2, (i4 & 262144) != 0 ? B6A.A07 : j, (i4 & 524288) != 0 ? B6A.A07 : j2, (i4 & 1048576) != 0 ? null : c1yl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraCardContent(ApQ apQ, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6<String, C14P> bo6, B6A b6a, ApQ apQ2, G0U<? super String, Unit> g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str, C1822Arm c1822Arm, int i, int i2, int i3, String str2, boolean z, boolean z2, ApQ apQ3, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl) {
        C7384Etj.A0Y(bo6, 2);
        this.title = apQ;
        this.titleStyle = auraIconAndHeadlineStyle;
        this.titleInlineContent = bo6;
        this.titleColor = b6a;
        this.subtitle = apQ2;
        this.subtitleOnUrlClick = g0u;
        this.subtitleStyle = auraIconAndBodyStyle;
        this.subtitleColor = b6a2;
        this.label = str;
        this.labelStyle = c1822Arm;
        this.labelMaxLines = i;
        this.titleMaxLines = i2;
        this.subtitleMaxLines = i3;
        this.contentDescription = str2;
        this.mergeContentDescription = z;
        this.titleIsHeading = z2;
        this.boxedText = apQ3;
        this.boxedTextStyle = c1822Arm2;
        this.boxedTextColor = j;
        this.boxedTextBackgroundColor = j2;
        this.textAlign = c1yl;
    }

    public /* synthetic */ AuraCardContent(String str, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6 bo6, B6A b6a, ApQ apQ, G0U g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str2, C1822Arm c1822Arm, int i, int i2, int i3, String str3, boolean z, boolean z2, String str4, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl, int i4, C06H c06h) {
        this(str, (i4 & 2) != 0 ? null : auraIconAndHeadlineStyle, (BO6<String, C14P>) ((i4 & 4) != 0 ? C0953AJg.A00() : bo6), (i4 & 8) != 0 ? null : b6a, (i4 & 16) != 0 ? null : apQ, (G0U<? super String, Unit>) ((i4 & 32) != 0 ? null : g0u), (i4 & 64) != 0 ? null : auraIconAndBodyStyle, (i4 & 128) != 0 ? null : b6a2, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : c1822Arm, (i4 & 1024) != 0 ? Integer.MAX_VALUE : i, (i4 & 2048) != 0 ? Integer.MAX_VALUE : i2, (i4 & 4096) != 0 ? Integer.MAX_VALUE : i3, (i4 & 8192) != 0 ? null : str3, (i4 & 16384) != 0 ? true : z, (32768 & i4) != 0 ? true : z2, (65536 & i4) != 0 ? null : str4, (131072 & i4) != 0 ? null : c1822Arm2, (262144 & i4) != 0 ? B6A.A07 : j, (524288 & i4) != 0 ? B6A.A07 : j2, (i4 & 1048576) != 0 ? null : c1yl);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuraCardContent(String str, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6<String, C14P> bo6, B6A b6a, ApQ apQ, G0U<? super String, Unit> g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str2, C1822Arm c1822Arm, int i, int i2, int i3, String str3, boolean z, boolean z2, String str4, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl) {
        ApQ apQA0X;
        C7384Etj.A0Y(bo6, 2);
        if (str != null) {
            apQA0X = AnonymousClass005.A0X(str);
        } else {
            apQA0X = null;
        }
        this(apQA0X, auraIconAndHeadlineStyle, bo6, b6a, apQ, g0u, auraIconAndBodyStyle, b6a2, str2, c1822Arm, i, i2, i3, str3, z, z2, str4 != null ? AnonymousClass005.A0X(str4) : null, c1822Arm2, j, j2, c1yl);
    }

    public /* synthetic */ AuraCardContent(ApQ apQ, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6 bo6, B6A b6a, ApQ apQ2, G0U g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str, C1822Arm c1822Arm, int i, int i2, int i3, String str2, boolean z, boolean z2, ApQ apQ3, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl, C06H c06h) {
        this(apQ, auraIconAndHeadlineStyle, (BO6<String, C14P>) bo6, b6a, apQ2, (G0U<? super String, Unit>) g0u, auraIconAndBodyStyle, b6a2, str, c1822Arm, i, i2, i3, str2, z, z2, apQ3, c1822Arm2, j, j2, c1yl);
    }

    public /* synthetic */ AuraCardContent(String str, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BO6 bo6, B6A b6a, ApQ apQ, G0U g0u, AuraIconAndBodyStyle auraIconAndBodyStyle, B6A b6a2, String str2, C1822Arm c1822Arm, int i, int i2, int i3, String str3, boolean z, boolean z2, String str4, C1822Arm c1822Arm2, long j, long j2, C1YL c1yl, C06H c06h) {
        this(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) bo6, b6a, apQ, (G0U<? super String, Unit>) g0u, auraIconAndBodyStyle, b6a2, str2, c1822Arm, i, i2, i3, str3, z, z2, str4, c1822Arm2, j, j2, c1yl);
    }
}
