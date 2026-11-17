package com.facebook.aura.sharesheet;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchShareSheetData extends C06G {
    public static final int $stable = 0;
    public final AHD<HatchShareDestination> destinations;
    public final AHD<HatchShareRecipient> recipients;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchShareSheetData) {
                HatchShareSheetData hatchShareSheetData = (HatchShareSheetData) obj;
                if (!C7384Etj.areEqual(this.recipients, hatchShareSheetData.recipients) || !C7384Etj.areEqual(this.destinations, hatchShareSheetData.destinations)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchShareSheetData copy$default(HatchShareSheetData hatchShareSheetData, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchShareSheetData.recipients;
        }
        if ((i & 2) != 0) {
            ahd2 = hatchShareSheetData.destinations;
        }
        AnonymousClass003.A0u(ahd, ahd2);
        return new HatchShareSheetData(ahd, ahd2);
    }

    public final AHD<HatchShareRecipient> component1() {
        return this.recipients;
    }

    public final AHD<HatchShareDestination> component2() {
        return this.destinations;
    }

    public final AHD<HatchShareDestination> getDestinations() {
        return this.destinations;
    }

    public final AHD<HatchShareRecipient> getRecipients() {
        return this.recipients;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.destinations, AnonymousClass005.A0E(this.recipients));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchShareSheetData(AHD<HatchShareRecipient> ahd, AHD<? extends HatchShareDestination> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.recipients = ahd;
        this.destinations = ahd2;
    }

    public final HatchShareSheetData copy(AHD<HatchShareRecipient> ahd, AHD<? extends HatchShareDestination> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        return new HatchShareSheetData(ahd, ahd2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchShareSheetData(AHD ahd, AHD ahd2, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, ahd2);
    }
}
