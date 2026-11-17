package com.facebook.aura.permissions.defaults;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmSettings extends C06G {
    public final String heading;
    public final AHD<ConfidentialVmToggle> toggles;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmSettings) {
                ConfidentialVmSettings confidentialVmSettings = (ConfidentialVmSettings) obj;
                if (!C7384Etj.areEqual(this.heading, confidentialVmSettings.heading) || !C7384Etj.areEqual(this.toggles, confidentialVmSettings.toggles)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmSettings copy$default(ConfidentialVmSettings confidentialVmSettings, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmSettings.heading;
        }
        if ((i & 2) != 0) {
            ahd = confidentialVmSettings.toggles;
        }
        AnonymousClass003.A0u(str, ahd);
        return new ConfidentialVmSettings(str, ahd);
    }

    public final String component1() {
        return this.heading;
    }

    public final AHD<ConfidentialVmToggle> component2() {
        return this.toggles;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final AHD<ConfidentialVmToggle> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.toggles, AnonymousClass001.A0G(this.heading));
    }

    public ConfidentialVmSettings(String str, AHD<ConfidentialVmToggle> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.heading = str;
        this.toggles = ahd;
    }

    public final ConfidentialVmSettings copy(String str, AHD<ConfidentialVmToggle> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new ConfidentialVmSettings(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
