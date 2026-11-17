package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C1DG;
import X.C3TQ;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraCardDimensions extends C06G {
    public static final int $stable = 0;
    public final C1DG backgroundBorderWidth;
    public final C3TQ contentPadding;
    public final C3TQ contentPaddingNoStartItem;
    public final C1DG minHeight;
    public final C3TQ trailingItemPadding;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCardDimensions) {
                AuraCardDimensions auraCardDimensions = (AuraCardDimensions) obj;
                if (!C7384Etj.areEqual(this.contentPadding, auraCardDimensions.contentPadding) || !C7384Etj.areEqual(this.contentPaddingNoStartItem, auraCardDimensions.contentPaddingNoStartItem) || !C7384Etj.areEqual(this.trailingItemPadding, auraCardDimensions.trailingItemPadding) || !C7384Etj.areEqual(this.backgroundBorderWidth, auraCardDimensions.backgroundBorderWidth) || !C7384Etj.areEqual(this.minHeight, auraCardDimensions.minHeight)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-XG1SiQA$default, reason: not valid java name */
    public static /* synthetic */ AuraCardDimensions m2657copyXG1SiQA$default(AuraCardDimensions auraCardDimensions, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, C1DG c1dg, C1DG c1dg2, int i, Object obj) {
        if ((i & 1) != 0) {
            c3tq = auraCardDimensions.contentPadding;
        }
        if ((i & 2) != 0) {
            c3tq2 = auraCardDimensions.contentPaddingNoStartItem;
        }
        if ((i & 4) != 0) {
            c3tq3 = auraCardDimensions.trailingItemPadding;
        }
        if ((i & 8) != 0) {
            c1dg = auraCardDimensions.backgroundBorderWidth;
        }
        if ((i & 16) != 0) {
            c1dg2 = auraCardDimensions.minHeight;
        }
        return auraCardDimensions.m2660copyXG1SiQA(c3tq, c3tq2, c3tq3, c1dg, c1dg2);
    }

    public final C3TQ component1() {
        return this.contentPadding;
    }

    public final C3TQ component2() {
        return this.contentPaddingNoStartItem;
    }

    public final C3TQ component3() {
        return this.trailingItemPadding;
    }

    /* renamed from: component4-lTKBWiU, reason: not valid java name */
    public final C1DG m2658component4lTKBWiU() {
        return this.backgroundBorderWidth;
    }

    /* renamed from: component5-lTKBWiU, reason: not valid java name */
    public final C1DG m2659component5lTKBWiU() {
        return this.minHeight;
    }

    /* renamed from: getBackgroundBorderWidth-lTKBWiU, reason: not valid java name */
    public final C1DG m2661getBackgroundBorderWidthlTKBWiU() {
        return this.backgroundBorderWidth;
    }

    public final C3TQ getContentPadding() {
        return this.contentPadding;
    }

    public final C3TQ getContentPaddingNoStartItem() {
        return this.contentPaddingNoStartItem;
    }

    /* renamed from: getMinHeight-lTKBWiU, reason: not valid java name */
    public final C1DG m2662getMinHeightlTKBWiU() {
        return this.minHeight;
    }

    public final C3TQ getTrailingItemPadding() {
        return this.trailingItemPadding;
    }

    public int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.trailingItemPadding, AnonymousClass005.A0F(this.contentPaddingNoStartItem, AnonymousClass005.A0E(this.contentPadding)));
        C1DG c1dg = this.backgroundBorderWidth;
        int iFloatToIntBits = (iA0F + (c1dg == null ? 0 : Float.floatToIntBits(c1dg.A00))) * 31;
        C1DG c1dg2 = this.minHeight;
        return iFloatToIntBits + (c1dg2 != null ? Float.floatToIntBits(c1dg2.A00) : 0);
    }

    public AuraCardDimensions(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, C1DG c1dg, C1DG c1dg2) {
        AnonymousClass005.A0x(c3tq, c3tq2, c3tq3);
        this.contentPadding = c3tq;
        this.contentPaddingNoStartItem = c3tq2;
        this.trailingItemPadding = c3tq3;
        this.backgroundBorderWidth = c1dg;
        this.minHeight = c1dg2;
    }

    /* renamed from: copy-XG1SiQA, reason: not valid java name */
    public final AuraCardDimensions m2660copyXG1SiQA(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, C1DG c1dg, C1DG c1dg2) {
        AnonymousClass005.A0x(c3tq, c3tq2, c3tq3);
        return new AuraCardDimensions(c3tq, c3tq2, c3tq3, c1dg, c1dg2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraCardDimensions(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, C1DG c1dg, C1DG c1dg2, int i, C06H c06h) {
        this(c3tq, c3tq2, c3tq3, c1dg, (i & 16) != 0 ? null : c1dg2);
    }

    public /* synthetic */ AuraCardDimensions(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, C1DG c1dg, C1DG c1dg2, C06H c06h) {
        this(c3tq, c3tq2, c3tq3, c1dg, c1dg2);
    }
}
