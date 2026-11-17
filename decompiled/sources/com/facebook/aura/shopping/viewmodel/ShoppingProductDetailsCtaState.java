package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpAction;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsCtaState extends C06G {
    public static final int $stable = 0;
    public final boolean hasActions;
    public final boolean linksEmphasized;
    public final AHD<PdpAction> others;
    public final PdpAction primary;
    public final String websiteArrowLabel;
    public final String websiteArrowUrl;

    public ShoppingProductDetailsCtaState(PdpAction pdpAction, String str, String str2, AHD<PdpAction> ahd, boolean z, boolean z2) {
        C7384Etj.A0Y(ahd, 3);
        this.primary = pdpAction;
        this.websiteArrowUrl = str;
        this.websiteArrowLabel = str2;
        this.others = ahd;
        this.linksEmphasized = z;
        this.hasActions = z2;
    }

    public final ShoppingProductDetailsCtaState copy(PdpAction pdpAction, String str, String str2, AHD<PdpAction> ahd, boolean z, boolean z2) {
        C7384Etj.A0Y(ahd, 3);
        return new ShoppingProductDetailsCtaState(pdpAction, str, str2, ahd, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsCtaState) {
                ShoppingProductDetailsCtaState shoppingProductDetailsCtaState = (ShoppingProductDetailsCtaState) obj;
                if (!C7384Etj.areEqual(this.primary, shoppingProductDetailsCtaState.primary) || !C7384Etj.areEqual(this.websiteArrowUrl, shoppingProductDetailsCtaState.websiteArrowUrl) || !C7384Etj.areEqual(this.websiteArrowLabel, shoppingProductDetailsCtaState.websiteArrowLabel) || !C7384Etj.areEqual(this.others, shoppingProductDetailsCtaState.others) || this.linksEmphasized != shoppingProductDetailsCtaState.linksEmphasized || this.hasActions != shoppingProductDetailsCtaState.hasActions) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingProductDetailsCtaState copy$default(ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, PdpAction pdpAction, String str, String str2, AHD ahd, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            pdpAction = shoppingProductDetailsCtaState.primary;
        }
        if ((i & 2) != 0) {
            str = shoppingProductDetailsCtaState.websiteArrowUrl;
        }
        if ((i & 4) != 0) {
            str2 = shoppingProductDetailsCtaState.websiteArrowLabel;
        }
        if ((i & 8) != 0) {
            ahd = shoppingProductDetailsCtaState.others;
        }
        if ((i & 16) != 0) {
            z = shoppingProductDetailsCtaState.linksEmphasized;
        }
        if ((i & 32) != 0) {
            z2 = shoppingProductDetailsCtaState.hasActions;
        }
        return shoppingProductDetailsCtaState.copy(pdpAction, str, str2, ahd, z, z2);
    }

    public final PdpAction component1() {
        return this.primary;
    }

    public final String component2() {
        return this.websiteArrowUrl;
    }

    public final String component3() {
        return this.websiteArrowLabel;
    }

    public final AHD<PdpAction> component4() {
        return this.others;
    }

    public final boolean component5() {
        return this.linksEmphasized;
    }

    public final boolean component6() {
        return this.hasActions;
    }

    public final boolean getHasActions() {
        return this.hasActions;
    }

    public final boolean getLinksEmphasized() {
        return this.linksEmphasized;
    }

    public final AHD<PdpAction> getOthers() {
        return this.others;
    }

    public final PdpAction getPrimary() {
        return this.primary;
    }

    public final String getWebsiteArrowLabel() {
        return this.websiteArrowLabel;
    }

    public final String getWebsiteArrowUrl() {
        return this.websiteArrowUrl;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.others, ((((AnonymousClass006.A0D(this.primary) * 31) + AnonymousClass006.A0G(this.websiteArrowUrl)) * 31) + AnonymousClass005.A0H(this.websiteArrowLabel)) * 31), this.linksEmphasized), this.hasActions);
    }

    public String toString() {
        return super.toString();
    }
}
