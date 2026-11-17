package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C1DG;
import X.C3TQ;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraToastDimensions extends C06G {
    public static final int $stable = 0;
    public final C3TQ contentPadding;
    public final C3TQ contentPaddingNoStartItem;
    public final float minHeight;
    public final C3TQ trailingIconItemPadding;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraToastDimensions) {
                AuraToastDimensions auraToastDimensions = (AuraToastDimensions) obj;
                if (!C7384Etj.areEqual(this.contentPadding, auraToastDimensions.contentPadding) || !C7384Etj.areEqual(this.contentPaddingNoStartItem, auraToastDimensions.contentPaddingNoStartItem) || !C7384Etj.areEqual(this.trailingIconItemPadding, auraToastDimensions.trailingIconItemPadding) || !C1DG.A08(this.minHeight, auraToastDimensions.minHeight)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-eqLRuRQ$default, reason: not valid java name */
    public static /* synthetic */ AuraToastDimensions m2954copyeqLRuRQ$default(AuraToastDimensions auraToastDimensions, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            c3tq = auraToastDimensions.contentPadding;
        }
        if ((i & 2) != 0) {
            c3tq2 = auraToastDimensions.contentPaddingNoStartItem;
        }
        if ((i & 4) != 0) {
            c3tq3 = auraToastDimensions.trailingIconItemPadding;
        }
        if ((i & 8) != 0) {
            f = auraToastDimensions.minHeight;
        }
        AnonymousClass005.A0x(c3tq, c3tq2, c3tq3);
        return new AuraToastDimensions(c3tq, c3tq2, c3tq3, f);
    }

    public final C3TQ component1() {
        return this.contentPadding;
    }

    public final C3TQ component2() {
        return this.contentPaddingNoStartItem;
    }

    public final C3TQ component3() {
        return this.trailingIconItemPadding;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m2955component4D9Ej5fM() {
        return this.minHeight;
    }

    public final C3TQ getContentPadding() {
        return this.contentPadding;
    }

    public final C3TQ getContentPaddingNoStartItem() {
        return this.contentPaddingNoStartItem;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2957getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    public final C3TQ getTrailingIconItemPadding() {
        return this.trailingIconItemPadding;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.trailingIconItemPadding, AnonymousClass005.A0F(this.contentPaddingNoStartItem, AnonymousClass005.A0E(this.contentPadding))) + Float.floatToIntBits(this.minHeight);
    }

    public /* synthetic */ AuraToastDimensions(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, float f, C06H c06h) {
        this(c3tq, c3tq2, c3tq3, f);
    }

    /* renamed from: copy-eqLRuRQ, reason: not valid java name */
    public final AuraToastDimensions m2956copyeqLRuRQ(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, float f) {
        AnonymousClass005.A0x(c3tq, c3tq2, c3tq3);
        return new AuraToastDimensions(c3tq, c3tq2, c3tq3, f);
    }

    public String toString() {
        return super.toString();
    }

    public AuraToastDimensions(C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, float f) {
        AnonymousClass005.A0x(c3tq, c3tq2, c3tq3);
        this.contentPadding = c3tq;
        this.contentPaddingNoStartItem = c3tq2;
        this.trailingIconItemPadding = c3tq3;
        this.minHeight = f;
    }
}
