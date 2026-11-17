package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.shopping.viewmodel.InstacartProductAction;

/* loaded from: classes4.dex */
public final class InstacartProductCtaState extends C06G {
    public static final int $stable = 0;
    public final InstacartProductAction.AddToCart addToCart;
    public final InstacartProductAction.OpenLink link;
    public final boolean linkEmphasized;
    public final InstacartProductAction.OpenLink websiteArrow;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstacartProductCtaState) {
                InstacartProductCtaState instacartProductCtaState = (InstacartProductCtaState) obj;
                if (!C7384Etj.areEqual(this.addToCart, instacartProductCtaState.addToCart) || !C7384Etj.areEqual(this.websiteArrow, instacartProductCtaState.websiteArrow) || !C7384Etj.areEqual(this.link, instacartProductCtaState.link) || this.linkEmphasized != instacartProductCtaState.linkEmphasized) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InstacartProductCtaState copy$default(InstacartProductCtaState instacartProductCtaState, InstacartProductAction.AddToCart addToCart, InstacartProductAction.OpenLink openLink, InstacartProductAction.OpenLink openLink2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            addToCart = instacartProductCtaState.addToCart;
        }
        if ((i & 2) != 0) {
            openLink = instacartProductCtaState.websiteArrow;
        }
        if ((i & 4) != 0) {
            openLink2 = instacartProductCtaState.link;
        }
        if ((i & 8) != 0) {
            z = instacartProductCtaState.linkEmphasized;
        }
        return new InstacartProductCtaState(addToCart, openLink, openLink2, z);
    }

    public final InstacartProductAction.AddToCart component1() {
        return this.addToCart;
    }

    public final InstacartProductAction.OpenLink component2() {
        return this.websiteArrow;
    }

    public final InstacartProductAction.OpenLink component3() {
        return this.link;
    }

    public final boolean component4() {
        return this.linkEmphasized;
    }

    public final InstacartProductCtaState copy(InstacartProductAction.AddToCart addToCart, InstacartProductAction.OpenLink openLink, InstacartProductAction.OpenLink openLink2, boolean z) {
        return new InstacartProductCtaState(addToCart, openLink, openLink2, z);
    }

    public final InstacartProductAction.AddToCart getAddToCart() {
        return this.addToCart;
    }

    public final InstacartProductAction.OpenLink getLink() {
        return this.link;
    }

    public final boolean getLinkEmphasized() {
        return this.linkEmphasized;
    }

    public final InstacartProductAction.OpenLink getWebsiteArrow() {
        return this.websiteArrow;
    }

    public int hashCode() {
        return C0KA.A00(((((AnonymousClass006.A0D(this.addToCart) * 31) + AnonymousClass006.A0D(this.websiteArrow)) * 31) + C3cH.A02(this.link)) * 31, this.linkEmphasized);
    }

    public InstacartProductCtaState(InstacartProductAction.AddToCart addToCart, InstacartProductAction.OpenLink openLink, InstacartProductAction.OpenLink openLink2, boolean z) {
        this.addToCart = addToCart;
        this.websiteArrow = openLink;
        this.link = openLink2;
        this.linkEmphasized = z;
    }

    public String toString() {
        return super.toString();
    }
}
