package com.facebook.aura.shopping.view;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ShippingInfoRow extends C06G {
    public final int iconRes;
    public final String subtitle;
    public final String title;

    public ShippingInfoRow(int i, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        this.iconRes = i;
        this.title = str;
        this.subtitle = str2;
    }

    public final ShippingInfoRow copy(int i, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        return new ShippingInfoRow(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShippingInfoRow) {
                ShippingInfoRow shippingInfoRow = (ShippingInfoRow) obj;
                if (this.iconRes != shippingInfoRow.iconRes || !C7384Etj.areEqual(this.title, shippingInfoRow.title) || !C7384Etj.areEqual(this.subtitle, shippingInfoRow.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShippingInfoRow copy$default(ShippingInfoRow shippingInfoRow, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shippingInfoRow.iconRes;
        }
        if ((i2 & 2) != 0) {
            str = shippingInfoRow.title;
        }
        if ((i2 & 4) != 0) {
            str2 = shippingInfoRow.subtitle;
        }
        return shippingInfoRow.copy(i, str, str2);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.title, this.iconRes * 31) + AnonymousClass006.A0G(this.subtitle);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShippingInfoRow(int i, String str, String str2, int i2, C06H c06h) {
        this(i, str, AnonymousClass006.A0t(i2, str2));
    }
}
