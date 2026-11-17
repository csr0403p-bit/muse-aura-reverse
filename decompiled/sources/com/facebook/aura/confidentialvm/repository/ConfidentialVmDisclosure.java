package com.facebook.aura.confidentialvm.repository;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmDisclosure extends C06G {
    public final AHD<ConfidentialVmValuePropLink> links;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDisclosure) {
                ConfidentialVmDisclosure confidentialVmDisclosure = (ConfidentialVmDisclosure) obj;
                if (!C7384Etj.areEqual(this.text, confidentialVmDisclosure.text) || !C7384Etj.areEqual(this.links, confidentialVmDisclosure.links)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDisclosure copy$default(ConfidentialVmDisclosure confidentialVmDisclosure, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDisclosure.text;
        }
        if ((i & 2) != 0) {
            ahd = confidentialVmDisclosure.links;
        }
        AnonymousClass003.A0u(str, ahd);
        return new ConfidentialVmDisclosure(str, ahd);
    }

    public final String component1() {
        return this.text;
    }

    public final AHD<ConfidentialVmValuePropLink> component2() {
        return this.links;
    }

    public final AHD<ConfidentialVmValuePropLink> getLinks() {
        return this.links;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.links, AnonymousClass001.A0G(this.text));
    }

    public ConfidentialVmDisclosure(String str, AHD<ConfidentialVmValuePropLink> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.text = str;
        this.links = ahd;
    }

    public final ConfidentialVmDisclosure copy(String str, AHD<ConfidentialVmValuePropLink> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new ConfidentialVmDisclosure(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
