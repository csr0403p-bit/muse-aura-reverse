package com.facebook.aura.settings;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CredentialCandidate extends C06G {
    public static final int $stable = 0;
    public final boolean available;
    public final String displayName;
    public final String id;
    public final boolean isFromOnePassword;
    public final String label;
    public final AHD<String> origins;
    public final AHD<String> protectedFieldNames;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCandidate) {
                CredentialCandidate credentialCandidate = (CredentialCandidate) obj;
                if (!C7384Etj.areEqual(this.id, credentialCandidate.id) || !C7384Etj.areEqual(this.displayName, credentialCandidate.displayName) || !C7384Etj.areEqual(this.origins, credentialCandidate.origins) || !C7384Etj.areEqual(this.protectedFieldNames, credentialCandidate.protectedFieldNames) || !C7384Etj.areEqual(this.label, credentialCandidate.label) || this.available != credentialCandidate.available || this.isFromOnePassword != credentialCandidate.isFromOnePassword) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CredentialCandidate copy$default(CredentialCandidate credentialCandidate, String str, String str2, AHD ahd, AHD ahd2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCandidate.id;
        }
        if ((i & 2) != 0) {
            str2 = credentialCandidate.displayName;
        }
        if ((i & 4) != 0) {
            ahd = credentialCandidate.origins;
        }
        if ((i & 8) != 0) {
            ahd2 = credentialCandidate.protectedFieldNames;
        }
        if ((i & 16) != 0) {
            str3 = credentialCandidate.label;
        }
        if ((i & 32) != 0) {
            z = credentialCandidate.available;
        }
        if ((i & 64) != 0) {
            z2 = credentialCandidate.isFromOnePassword;
        }
        return credentialCandidate.copy(str, str2, ahd, ahd2, str3, z, z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final AHD<String> component3() {
        return this.origins;
    }

    public final AHD<String> component4() {
        return this.protectedFieldNames;
    }

    public final String component5() {
        return this.label;
    }

    public final boolean component6() {
        return this.available;
    }

    public final boolean component7() {
        return this.isFromOnePassword;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final AHD<String> getOrigins() {
        return this.origins;
    }

    public final AHD<String> getProtectedFieldNames() {
        return this.protectedFieldNames;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass005.A0F(this.protectedFieldNames, AnonymousClass005.A0F(this.origins, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0G(this.label)) * 31, this.available), this.isFromOnePassword);
    }

    public final boolean isFromOnePassword() {
        return this.isFromOnePassword;
    }

    public CredentialCandidate(String str, String str2, AHD<String> ahd, AHD<String> ahd2, String str3, boolean z, boolean z2) {
        AnonymousClass005.A14(str, str2, ahd, ahd2);
        this.id = str;
        this.displayName = str2;
        this.origins = ahd;
        this.protectedFieldNames = ahd2;
        this.label = str3;
        this.available = z;
        this.isFromOnePassword = z2;
    }

    public final CredentialCandidate copy(String str, String str2, AHD<String> ahd, AHD<String> ahd2, String str3, boolean z, boolean z2) {
        AnonymousClass005.A14(str, str2, ahd, ahd2);
        return new CredentialCandidate(str, str2, ahd, ahd2, str3, z, z2);
    }

    public String toString() {
        return super.toString();
    }
}
