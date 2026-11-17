package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;

/* loaded from: classes.dex */
public final class SecureStorageCaptureUiState extends C06G {
    public static final int $stable = 0;
    public final CredentialCaptureError captureError;
    public final SecureStorageCaptureError error;
    public final boolean isSaving;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageCaptureUiState) {
                SecureStorageCaptureUiState secureStorageCaptureUiState = (SecureStorageCaptureUiState) obj;
                if (this.isSaving != secureStorageCaptureUiState.isSaving || this.error != secureStorageCaptureUiState.error || this.captureError != secureStorageCaptureUiState.captureError) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SecureStorageCaptureUiState copy$default(SecureStorageCaptureUiState secureStorageCaptureUiState, boolean z, SecureStorageCaptureError secureStorageCaptureError, CredentialCaptureError credentialCaptureError, int i, Object obj) {
        if ((i & 1) != 0) {
            z = secureStorageCaptureUiState.isSaving;
        }
        if ((i & 2) != 0) {
            secureStorageCaptureError = secureStorageCaptureUiState.error;
        }
        if ((i & 4) != 0) {
            credentialCaptureError = secureStorageCaptureUiState.captureError;
        }
        return new SecureStorageCaptureUiState(z, secureStorageCaptureError, credentialCaptureError);
    }

    public final boolean component1() {
        return this.isSaving;
    }

    public final SecureStorageCaptureError component2() {
        return this.error;
    }

    public final CredentialCaptureError component3() {
        return this.captureError;
    }

    public final SecureStorageCaptureUiState copy(boolean z, SecureStorageCaptureError secureStorageCaptureError, CredentialCaptureError credentialCaptureError) {
        return new SecureStorageCaptureUiState(z, secureStorageCaptureError, credentialCaptureError);
    }

    public final CredentialCaptureError getCaptureError() {
        return this.captureError;
    }

    public final SecureStorageCaptureError getError() {
        return this.error;
    }

    public int hashCode() {
        return ((C0KA.A02(this.isSaving) + AnonymousClass006.A0D(this.error)) * 31) + C06G.A04(this.captureError);
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public SecureStorageCaptureUiState(boolean z, SecureStorageCaptureError secureStorageCaptureError, CredentialCaptureError credentialCaptureError) {
        this.isSaving = z;
        this.error = secureStorageCaptureError;
        this.captureError = credentialCaptureError;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SecureStorageCaptureUiState(boolean z, SecureStorageCaptureError secureStorageCaptureError, CredentialCaptureError credentialCaptureError, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : secureStorageCaptureError, (i & 4) != 0 ? null : credentialCaptureError);
    }

    public SecureStorageCaptureUiState() {
        this(false, null, null);
    }
}
