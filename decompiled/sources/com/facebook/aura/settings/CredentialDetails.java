package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CredentialDetails extends C06G {
    public static final int $stable = 0;
    public final CredentialAgentPermission agentPermission;
    public final boolean available;
    public final boolean isFromOnePassword;
    public final boolean passwordPresent;
    public final String username;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialDetails) {
                CredentialDetails credentialDetails = (CredentialDetails) obj;
                if (!C7384Etj.areEqual(this.username, credentialDetails.username) || this.passwordPresent != credentialDetails.passwordPresent || this.available != credentialDetails.available || this.agentPermission != credentialDetails.agentPermission || this.isFromOnePassword != credentialDetails.isFromOnePassword) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CredentialDetails copy$default(CredentialDetails credentialDetails, String str, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialDetails.username;
        }
        if ((i & 2) != 0) {
            z = credentialDetails.passwordPresent;
        }
        if ((i & 4) != 0) {
            z2 = credentialDetails.available;
        }
        if ((i & 8) != 0) {
            credentialAgentPermission = credentialDetails.agentPermission;
        }
        if ((i & 16) != 0) {
            z3 = credentialDetails.isFromOnePassword;
        }
        return credentialDetails.copy(str, z, z2, credentialAgentPermission, z3);
    }

    public final String component1() {
        return this.username;
    }

    public final boolean component2() {
        return this.passwordPresent;
    }

    public final boolean component3() {
        return this.available;
    }

    public final CredentialAgentPermission component4() {
        return this.agentPermission;
    }

    public final boolean component5() {
        return this.isFromOnePassword;
    }

    public final CredentialDetails copy(String str, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3) {
        return new CredentialDetails(str, z, z2, credentialAgentPermission, z3);
    }

    public final CredentialAgentPermission getAgentPermission() {
        return this.agentPermission;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final boolean getPasswordPresent() {
        return this.passwordPresent;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(C0KA.A01(AnonymousClass006.A0G(this.username) * 31, this.passwordPresent), this.available) + C06G.A04(this.agentPermission)) * 31, this.isFromOnePassword);
    }

    public final boolean isFromOnePassword() {
        return this.isFromOnePassword;
    }

    public CredentialDetails(String str, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3) {
        this.username = str;
        this.passwordPresent = z;
        this.available = z2;
        this.agentPermission = credentialAgentPermission;
        this.isFromOnePassword = z3;
    }

    public String toString() {
        return super.toString();
    }
}
