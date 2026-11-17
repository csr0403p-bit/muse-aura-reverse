package com.facebook.aura.devices.link.ordering;

import X.AHD;
import X.AHI;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchLinkSavedDetails extends C06G {
    public static final int $stable = 0;
    public final AHD<HatchLinkSavedAddress> addresses;

    public final HatchLinkSavedDetails copy(AHD<HatchLinkSavedAddress> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new HatchLinkSavedDetails(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchLinkSavedDetails) && C7384Etj.areEqual(this.addresses, ((HatchLinkSavedDetails) obj).addresses));
    }

    public /* synthetic */ HatchLinkSavedDetails(AHD ahd, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd);
    }

    public static /* synthetic */ HatchLinkSavedDetails copy$default(HatchLinkSavedDetails hatchLinkSavedDetails, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchLinkSavedDetails.addresses;
        }
        C7384Etj.A0Y(ahd, 0);
        return new HatchLinkSavedDetails(ahd);
    }

    public final AHD<HatchLinkSavedAddress> component1() {
        return this.addresses;
    }

    public final AHD<HatchLinkSavedAddress> getAddresses() {
        return this.addresses;
    }

    public int hashCode() {
        return this.addresses.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HatchLinkSavedDetails(AHD<HatchLinkSavedAddress> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.addresses = ahd;
    }

    public HatchLinkSavedDetails() {
        this(AHI.A01);
    }
}
