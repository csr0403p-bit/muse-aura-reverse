package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmArtifact extends C06G {
    public final String iconUrl;
    public final String id;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmArtifact) {
                ConfidentialVmArtifact confidentialVmArtifact = (ConfidentialVmArtifact) obj;
                if (!C7384Etj.areEqual(this.id, confidentialVmArtifact.id) || !C7384Etj.areEqual(this.title, confidentialVmArtifact.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmArtifact.subtitle) || !C7384Etj.areEqual(this.iconUrl, confidentialVmArtifact.iconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmArtifact copy$default(ConfidentialVmArtifact confidentialVmArtifact, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmArtifact.id;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmArtifact.title;
        }
        if ((i & 4) != 0) {
            str3 = confidentialVmArtifact.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = confidentialVmArtifact.iconUrl;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new ConfidentialVmArtifact(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.iconUrl);
    }

    public ConfidentialVmArtifact(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.iconUrl = str4;
    }

    public final ConfidentialVmArtifact copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ConfidentialVmArtifact(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
