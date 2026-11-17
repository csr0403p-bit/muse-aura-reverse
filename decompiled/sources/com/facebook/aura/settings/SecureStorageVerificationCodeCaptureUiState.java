package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;

/* loaded from: classes.dex */
public final class SecureStorageVerificationCodeCaptureUiState extends C06G {
    public static final int $stable = 0;
    public final CredentialCaptureError captureError;
    public final SecureStorageVerificationCodeCaptureError error;
    public final boolean isSubmitting;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageVerificationCodeCaptureUiState) {
                SecureStorageVerificationCodeCaptureUiState secureStorageVerificationCodeCaptureUiState = (SecureStorageVerificationCodeCaptureUiState) obj;
                if (this.isSubmitting != secureStorageVerificationCodeCaptureUiState.isSubmitting || this.error != secureStorageVerificationCodeCaptureUiState.error || this.captureError != secureStorageVerificationCodeCaptureUiState.captureError) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SecureStorageVerificationCodeCaptureUiState copy$default(SecureStorageVerificationCodeCaptureUiState secureStorageVerificationCodeCaptureUiState, boolean z, SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError, CredentialCaptureError credentialCaptureError, int i, Object obj) {
        if ((i & 1) != 0) {
            z = secureStorageVerificationCodeCaptureUiState.isSubmitting;
        }
        if ((i & 2) != 0) {
            secureStorageVerificationCodeCaptureError = secureStorageVerificationCodeCaptureUiState.error;
        }
        if ((i & 4) != 0) {
            credentialCaptureError = secureStorageVerificationCodeCaptureUiState.captureError;
        }
        return new SecureStorageVerificationCodeCaptureUiState(z, secureStorageVerificationCodeCaptureError, credentialCaptureError);
    }

    public final boolean component1() {
        return this.isSubmitting;
    }

    public final SecureStorageVerificationCodeCaptureError component2() {
        return this.error;
    }

    public final CredentialCaptureError component3() {
        return this.captureError;
    }

    public final SecureStorageVerificationCodeCaptureUiState copy(boolean z, SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError, CredentialCaptureError credentialCaptureError) {
        return new SecureStorageVerificationCodeCaptureUiState(z, secureStorageVerificationCodeCaptureError, credentialCaptureError);
    }

    public final CredentialCaptureError getCaptureError() {
        return this.captureError;
    }

    public final SecureStorageVerificationCodeCaptureError getError() {
        return this.error;
    }

    public int hashCode() {
        return ((C0KA.A02(this.isSubmitting) + AnonymousClass006.A0D(this.error)) * 31) + C06G.A04(this.captureError);
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public SecureStorageVerificationCodeCaptureUiState(boolean z, SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError, CredentialCaptureError credentialCaptureError) {
        this.isSubmitting = z;
        this.error = secureStorageVerificationCodeCaptureError;
        this.captureError = credentialCaptureError;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SecureStorageVerificationCodeCaptureUiState(boolean z, SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError, CredentialCaptureError credentialCaptureError, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : secureStorageVerificationCodeCaptureError, (i & 4) != 0 ? null : credentialCaptureError);
    }

    public SecureStorageVerificationCodeCaptureUiState() {
        this(false, null, null);
    }
}
