package com.facebook.aura.settings;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SecureStorageCatalogUiState extends C06G {
    public static final int $stable = 0;
    public final AHD<CredentialCandidate> candidates;
    public final AHD<CustomConnectorCandidate> customConnectors;
    public final boolean hasError;
    public final boolean isLoading;
    public final AHD<CredentialCandidate> onePasswordLogins;
    public final PasswordsEntryPoint passwordsEntryPoint;
    public final AHD<CredentialCandidate> storedCandidates;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageCatalogUiState) {
                SecureStorageCatalogUiState secureStorageCatalogUiState = (SecureStorageCatalogUiState) obj;
                if (!C7384Etj.areEqual(this.candidates, secureStorageCatalogUiState.candidates) || !C7384Etj.areEqual(this.storedCandidates, secureStorageCatalogUiState.storedCandidates) || !C7384Etj.areEqual(this.onePasswordLogins, secureStorageCatalogUiState.onePasswordLogins) || this.passwordsEntryPoint != secureStorageCatalogUiState.passwordsEntryPoint || !C7384Etj.areEqual(this.customConnectors, secureStorageCatalogUiState.customConnectors) || this.isLoading != secureStorageCatalogUiState.isLoading || this.hasError != secureStorageCatalogUiState.hasError) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public SecureStorageCatalogUiState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecureStorageCatalogUiState copy$default(SecureStorageCatalogUiState secureStorageCatalogUiState, AHD ahd, AHD ahd2, AHD ahd3, PasswordsEntryPoint passwordsEntryPoint, AHD ahd4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = secureStorageCatalogUiState.candidates;
        }
        if ((i & 2) != 0) {
            ahd2 = secureStorageCatalogUiState.storedCandidates;
        }
        if ((i & 4) != 0) {
            ahd3 = secureStorageCatalogUiState.onePasswordLogins;
        }
        if ((i & 8) != 0) {
            passwordsEntryPoint = secureStorageCatalogUiState.passwordsEntryPoint;
        }
        if ((i & 16) != 0) {
            ahd4 = secureStorageCatalogUiState.customConnectors;
        }
        if ((i & 32) != 0) {
            z = secureStorageCatalogUiState.isLoading;
        }
        if ((i & 64) != 0) {
            z2 = secureStorageCatalogUiState.hasError;
        }
        return secureStorageCatalogUiState.copy(ahd, ahd2, ahd3, passwordsEntryPoint, ahd4, z, z2);
    }

    public final AHD<CredentialCandidate> component1() {
        return this.candidates;
    }

    public final AHD<CredentialCandidate> component2() {
        return this.storedCandidates;
    }

    public final AHD<CredentialCandidate> component3() {
        return this.onePasswordLogins;
    }

    public final PasswordsEntryPoint component4() {
        return this.passwordsEntryPoint;
    }

    public final AHD<CustomConnectorCandidate> component5() {
        return this.customConnectors;
    }

    public final boolean component6() {
        return this.isLoading;
    }

    public final boolean component7() {
        return this.hasError;
    }

    public final AHD<CredentialCandidate> getCandidates() {
        return this.candidates;
    }

    public final AHD<CustomConnectorCandidate> getCustomConnectors() {
        return this.customConnectors;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final AHD<CredentialCandidate> getOnePasswordLogins() {
        return this.onePasswordLogins;
    }

    public final PasswordsEntryPoint getPasswordsEntryPoint() {
        return this.passwordsEntryPoint;
    }

    public final AHD<CredentialCandidate> getStoredCandidates() {
        return this.storedCandidates;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.customConnectors, AnonymousClass005.A0F(this.passwordsEntryPoint, AnonymousClass005.A0F(this.onePasswordLogins, AnonymousClass005.A0F(this.storedCandidates, AnonymousClass005.A0E(this.candidates))))), this.isLoading), this.hasError);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final SecureStorageCatalogUiState copy(AHD<CredentialCandidate> ahd, AHD<CredentialCandidate> ahd2, AHD<CredentialCandidate> ahd3, PasswordsEntryPoint passwordsEntryPoint, AHD<CustomConnectorCandidate> ahd4, boolean z, boolean z2) {
        AnonymousClass005.A17(ahd, ahd2, ahd3, passwordsEntryPoint, ahd4);
        return new SecureStorageCatalogUiState(ahd, ahd2, ahd3, passwordsEntryPoint, ahd4, z, z2);
    }

    public String toString() {
        return super.toString();
    }

    public SecureStorageCatalogUiState(AHD<CredentialCandidate> ahd, AHD<CredentialCandidate> ahd2, AHD<CredentialCandidate> ahd3, PasswordsEntryPoint passwordsEntryPoint, AHD<CustomConnectorCandidate> ahd4, boolean z, boolean z2) {
        AnonymousClass005.A17(ahd, ahd2, ahd3, passwordsEntryPoint, ahd4);
        this.candidates = ahd;
        this.storedCandidates = ahd2;
        this.onePasswordLogins = ahd3;
        this.passwordsEntryPoint = passwordsEntryPoint;
        this.customConnectors = ahd4;
        this.isLoading = z;
        this.hasError = z2;
    }

    public /* synthetic */ SecureStorageCatalogUiState(AHD ahd, AHD ahd2, AHD ahd3, PasswordsEntryPoint passwordsEntryPoint, AHD ahd4, boolean z, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, (i & 4) != 0 ? AHI.A01 : ahd3, (i & 8) != 0 ? PasswordsEntryPoint.SECURE_STORE : passwordsEntryPoint, (i & 16) != 0 ? AHI.A01 : ahd4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }
}
