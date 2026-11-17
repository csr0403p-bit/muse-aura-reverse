package com.facebook.aura.settings;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SecureStorageCredentialDetailsUiState extends C06G {
    public static final int $stable = 0;
    public final CredentialAgentPermission agentPermission;
    public final boolean available;
    public final boolean canEditCredentialFields;
    public final String credentialId;
    public final boolean hasError;
    public final boolean isDeleted;
    public final boolean isDeleting;
    public final boolean isFromOnePassword;
    public final boolean isLoaded;
    public final boolean isLoading;
    public final boolean isUpdating;
    public final boolean passwordPresent;
    public final String username;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageCredentialDetailsUiState) {
                SecureStorageCredentialDetailsUiState secureStorageCredentialDetailsUiState = (SecureStorageCredentialDetailsUiState) obj;
                if (!C7384Etj.areEqual(this.credentialId, secureStorageCredentialDetailsUiState.credentialId) || !C7384Etj.areEqual(this.username, secureStorageCredentialDetailsUiState.username) || this.passwordPresent != secureStorageCredentialDetailsUiState.passwordPresent || this.available != secureStorageCredentialDetailsUiState.available || this.agentPermission != secureStorageCredentialDetailsUiState.agentPermission || this.isFromOnePassword != secureStorageCredentialDetailsUiState.isFromOnePassword || this.canEditCredentialFields != secureStorageCredentialDetailsUiState.canEditCredentialFields || this.isLoading != secureStorageCredentialDetailsUiState.isLoading || this.isLoaded != secureStorageCredentialDetailsUiState.isLoaded || this.hasError != secureStorageCredentialDetailsUiState.hasError || this.isDeleting != secureStorageCredentialDetailsUiState.isDeleting || this.isDeleted != secureStorageCredentialDetailsUiState.isDeleted || this.isUpdating != secureStorageCredentialDetailsUiState.isUpdating) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SecureStorageCredentialDetailsUiState(String str, String str2, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) == 0 ? credentialAgentPermission : null, AnonymousClass002.A1R(i, z3), (i & 64) == 0 ? z4 : true, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? false : z8, (i & 2048) != 0 ? false : z9, (i & 4096) != 0 ? false : z10);
    }

    public static /* synthetic */ SecureStorageCredentialDetailsUiState copy$default(SecureStorageCredentialDetailsUiState secureStorageCredentialDetailsUiState, String str, String str2, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        boolean z11 = z;
        boolean z12 = z2;
        CredentialAgentPermission credentialAgentPermission2 = credentialAgentPermission;
        boolean z13 = z3;
        boolean z14 = z4;
        boolean z15 = z5;
        boolean z16 = z6;
        boolean z17 = z7;
        boolean z18 = z8;
        boolean z19 = z9;
        boolean z20 = z10;
        if ((i & 1) != 0) {
            str3 = secureStorageCredentialDetailsUiState.credentialId;
        }
        if ((i & 2) != 0) {
            str4 = secureStorageCredentialDetailsUiState.username;
        }
        if ((i & 4) != 0) {
            z11 = secureStorageCredentialDetailsUiState.passwordPresent;
        }
        if ((i & 8) != 0) {
            z12 = secureStorageCredentialDetailsUiState.available;
        }
        if ((i & 16) != 0) {
            credentialAgentPermission2 = secureStorageCredentialDetailsUiState.agentPermission;
        }
        if ((i & 32) != 0) {
            z13 = secureStorageCredentialDetailsUiState.isFromOnePassword;
        }
        if ((i & 64) != 0) {
            z14 = secureStorageCredentialDetailsUiState.canEditCredentialFields;
        }
        if ((i & 128) != 0) {
            z15 = secureStorageCredentialDetailsUiState.isLoading;
        }
        if ((i & 256) != 0) {
            z16 = secureStorageCredentialDetailsUiState.isLoaded;
        }
        if ((i & 512) != 0) {
            z17 = secureStorageCredentialDetailsUiState.hasError;
        }
        if ((i & 1024) != 0) {
            z18 = secureStorageCredentialDetailsUiState.isDeleting;
        }
        if ((i & 2048) != 0) {
            z19 = secureStorageCredentialDetailsUiState.isDeleted;
        }
        if ((i & 4096) != 0) {
            z20 = secureStorageCredentialDetailsUiState.isUpdating;
        }
        return new SecureStorageCredentialDetailsUiState(str3, str4, z11, z12, credentialAgentPermission2, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public final String component1() {
        return this.credentialId;
    }

    public final boolean component10() {
        return this.hasError;
    }

    public final boolean component11() {
        return this.isDeleting;
    }

    public final boolean component12() {
        return this.isDeleted;
    }

    public final boolean component13() {
        return this.isUpdating;
    }

    public final String component2() {
        return this.username;
    }

    public final boolean component3() {
        return this.passwordPresent;
    }

    public final boolean component4() {
        return this.available;
    }

    public final CredentialAgentPermission component5() {
        return this.agentPermission;
    }

    public final boolean component6() {
        return this.isFromOnePassword;
    }

    public final boolean component7() {
        return this.canEditCredentialFields;
    }

    public final boolean component8() {
        return this.isLoading;
    }

    public final boolean component9() {
        return this.isLoaded;
    }

    public final SecureStorageCredentialDetailsUiState copy(String str, String str2, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return new SecureStorageCredentialDetailsUiState(str, str2, z, z2, credentialAgentPermission, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    public final CredentialAgentPermission getAgentPermission() {
        return this.agentPermission;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final boolean getCanEditCredentialFields() {
        return this.canEditCredentialFields;
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean getPasswordPresent() {
        return this.passwordPresent;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(((AnonymousClass006.A0G(this.credentialId) * 31) + AnonymousClass006.A0G(this.username)) * 31, this.passwordPresent), this.available) + C06G.A04(this.agentPermission)) * 31, this.isFromOnePassword), this.canEditCredentialFields), this.isLoading), this.isLoaded), this.hasError), this.isDeleting), this.isDeleted), this.isUpdating);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isDeleting() {
        return this.isDeleting;
    }

    public final boolean isFromOnePassword() {
        return this.isFromOnePassword;
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public String toString() {
        return super.toString();
    }

    public SecureStorageCredentialDetailsUiState(String str, String str2, boolean z, boolean z2, CredentialAgentPermission credentialAgentPermission, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.credentialId = str;
        this.username = str2;
        this.passwordPresent = z;
        this.available = z2;
        this.agentPermission = credentialAgentPermission;
        this.isFromOnePassword = z3;
        this.canEditCredentialFields = z4;
        this.isLoading = z5;
        this.isLoaded = z6;
        this.hasError = z7;
        this.isDeleting = z8;
        this.isDeleted = z9;
        this.isUpdating = z10;
    }

    public SecureStorageCredentialDetailsUiState() {
        this(null, null, false, true, null, false, true, false, false, false, false, false, false);
    }
}
