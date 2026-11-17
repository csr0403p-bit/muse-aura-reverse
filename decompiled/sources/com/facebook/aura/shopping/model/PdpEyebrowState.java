package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class PdpEyebrowState extends C06G {
    public static final int $stable = 0;
    public final String logoUrl;
    public final ShoppingProductSubtitle parts;
    public final boolean showsLogo;

    public PdpEyebrowState(ShoppingProductSubtitle shoppingProductSubtitle, boolean z, String str) {
        C7384Etj.A0Y(shoppingProductSubtitle, 0);
        this.parts = shoppingProductSubtitle;
        this.showsLogo = z;
        this.logoUrl = str;
    }

    public final PdpEyebrowState copy(ShoppingProductSubtitle shoppingProductSubtitle, boolean z, String str) {
        C7384Etj.A0Y(shoppingProductSubtitle, 0);
        return new PdpEyebrowState(shoppingProductSubtitle, z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpEyebrowState) {
                PdpEyebrowState pdpEyebrowState = (PdpEyebrowState) obj;
                if (!C7384Etj.areEqual(this.parts, pdpEyebrowState.parts) || this.showsLogo != pdpEyebrowState.showsLogo || !C7384Etj.areEqual(this.logoUrl, pdpEyebrowState.logoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpEyebrowState copy$default(PdpEyebrowState pdpEyebrowState, ShoppingProductSubtitle shoppingProductSubtitle, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingProductSubtitle = pdpEyebrowState.parts;
        }
        if ((i & 2) != 0) {
            z = pdpEyebrowState.showsLogo;
        }
        if ((i & 4) != 0) {
            str = pdpEyebrowState.logoUrl;
        }
        return pdpEyebrowState.copy(shoppingProductSubtitle, z, str);
    }

    public final ShoppingProductSubtitle component1() {
        return this.parts;
    }

    public final boolean component2() {
        return this.showsLogo;
    }

    public final String component3() {
        return this.logoUrl;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final ShoppingProductSubtitle getParts() {
        return this.parts;
    }

    public final boolean getShowsLogo() {
        return this.showsLogo;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0E(this.parts), this.showsLogo) + AnonymousClass006.A0G(this.logoUrl);
    }

    public String toString() {
        return super.toString();
    }
}
