package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class LodgingPriceLine extends C06G {
    public static final int $stable = 8;
    public final String amount;
    public final LodgingPriceLabel label;
    public final LodgingPriceStyle style;
    public final boolean taxesInfo;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LodgingPriceLine) {
                LodgingPriceLine lodgingPriceLine = (LodgingPriceLine) obj;
                if (!C7384Etj.areEqual(this.label, lodgingPriceLine.label) || !C7384Etj.areEqual(this.amount, lodgingPriceLine.amount) || this.style != lodgingPriceLine.style || this.taxesInfo != lodgingPriceLine.taxesInfo) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LodgingPriceLine copy$default(LodgingPriceLine lodgingPriceLine, LodgingPriceLabel lodgingPriceLabel, String str, LodgingPriceStyle lodgingPriceStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            lodgingPriceLabel = lodgingPriceLine.label;
        }
        if ((i & 2) != 0) {
            str = lodgingPriceLine.amount;
        }
        if ((i & 4) != 0) {
            lodgingPriceStyle = lodgingPriceLine.style;
        }
        if ((i & 8) != 0) {
            z = lodgingPriceLine.taxesInfo;
        }
        AnonymousClass003.A0v(lodgingPriceLabel, lodgingPriceStyle);
        return new LodgingPriceLine(lodgingPriceLabel, str, lodgingPriceStyle, z);
    }

    public final LodgingPriceLabel component1() {
        return this.label;
    }

    public final String component2() {
        return this.amount;
    }

    public final LodgingPriceStyle component3() {
        return this.style;
    }

    public final boolean component4() {
        return this.taxesInfo;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final LodgingPriceLabel getLabel() {
        return this.label;
    }

    public final LodgingPriceStyle getStyle() {
        return this.style;
    }

    public final boolean getTaxesInfo() {
        return this.taxesInfo;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.style, (AnonymousClass005.A0E(this.label) + AnonymousClass006.A0G(this.amount)) * 31), this.taxesInfo);
    }

    public LodgingPriceLine(LodgingPriceLabel lodgingPriceLabel, String str, LodgingPriceStyle lodgingPriceStyle, boolean z) {
        AnonymousClass003.A0v(lodgingPriceLabel, lodgingPriceStyle);
        this.label = lodgingPriceLabel;
        this.amount = str;
        this.style = lodgingPriceStyle;
        this.taxesInfo = z;
    }

    public final LodgingPriceLine copy(LodgingPriceLabel lodgingPriceLabel, String str, LodgingPriceStyle lodgingPriceStyle, boolean z) {
        AnonymousClass003.A0v(lodgingPriceLabel, lodgingPriceStyle);
        return new LodgingPriceLine(lodgingPriceLabel, str, lodgingPriceStyle, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LodgingPriceLine(LodgingPriceLabel lodgingPriceLabel, String str, LodgingPriceStyle lodgingPriceStyle, boolean z, int i, C06H c06h) {
        this(lodgingPriceLabel, str, lodgingPriceStyle, AnonymousClass005.A1P(i, z));
    }
}
