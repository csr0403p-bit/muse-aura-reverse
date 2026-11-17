package com.facebook.aura.confidentialvm.repository;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmValuePropBullet extends C06G {
    public final ConfidentialVmValuePropIcon icon;
    public final AHD<ConfidentialVmValuePropLink> links;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropBullet) {
                ConfidentialVmValuePropBullet confidentialVmValuePropBullet = (ConfidentialVmValuePropBullet) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmValuePropBullet.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmValuePropBullet.subtitle) || !C7384Etj.areEqual(this.links, confidentialVmValuePropBullet.links) || this.icon != confidentialVmValuePropBullet.icon) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfidentialVmValuePropBullet copy$default(ConfidentialVmValuePropBullet confidentialVmValuePropBullet, String str, String str2, AHD ahd, ConfidentialVmValuePropIcon confidentialVmValuePropIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmValuePropBullet.title;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmValuePropBullet.subtitle;
        }
        if ((i & 4) != 0) {
            ahd = confidentialVmValuePropBullet.links;
        }
        if ((i & 8) != 0) {
            confidentialVmValuePropIcon = confidentialVmValuePropBullet.icon;
        }
        return confidentialVmValuePropBullet.copy(str, str2, ahd, confidentialVmValuePropIcon);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AHD<ConfidentialVmValuePropLink> component3() {
        return this.links;
    }

    public final ConfidentialVmValuePropIcon component4() {
        return this.icon;
    }

    public final ConfidentialVmValuePropIcon getIcon() {
        return this.icon;
    }

    public final AHD<ConfidentialVmValuePropLink> getLinks() {
        return this.links;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.icon, AnonymousClass005.A0F(this.links, AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title))));
    }

    public ConfidentialVmValuePropBullet(String str, String str2, AHD<ConfidentialVmValuePropLink> ahd, ConfidentialVmValuePropIcon confidentialVmValuePropIcon) {
        AnonymousClass005.A14(str, str2, ahd, confidentialVmValuePropIcon);
        this.title = str;
        this.subtitle = str2;
        this.links = ahd;
        this.icon = confidentialVmValuePropIcon;
    }

    public final ConfidentialVmValuePropBullet copy(String str, String str2, AHD<ConfidentialVmValuePropLink> ahd, ConfidentialVmValuePropIcon confidentialVmValuePropIcon) {
        AnonymousClass005.A14(str, str2, ahd, confidentialVmValuePropIcon);
        return new ConfidentialVmValuePropBullet(str, str2, ahd, confidentialVmValuePropIcon);
    }

    public String toString() {
        return super.toString();
    }
}
