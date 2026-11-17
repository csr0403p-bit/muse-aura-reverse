package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface CredentialCaptureResult {

    public final class Error extends C06G implements CredentialCaptureResult {
        public static final int $stable = 0;
        public final CredentialCaptureError error;
        public final boolean retryable;

        public Error(CredentialCaptureError credentialCaptureError, boolean z) {
            C7384Etj.A0Y(credentialCaptureError, 0);
            this.error = credentialCaptureError;
            this.retryable = z;
        }

        public final Error copy(CredentialCaptureError credentialCaptureError, boolean z) {
            C7384Etj.A0Y(credentialCaptureError, 0);
            return new Error(credentialCaptureError, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (this.error != error.error || this.retryable != error.retryable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, CredentialCaptureError credentialCaptureError, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialCaptureError = error.error;
            }
            if ((i & 2) != 0) {
                z = error.retryable;
            }
            C7384Etj.A0Y(credentialCaptureError, 0);
            return new Error(credentialCaptureError, z);
        }

        public final CredentialCaptureError component1() {
            return this.error;
        }

        public final boolean component2() {
            return this.retryable;
        }

        public final CredentialCaptureError getError() {
            return this.error;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.error), this.retryable);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends C06G implements CredentialCaptureResult {
        public static final int $stable = 0;
        public final String id;

        public Success(String str) {
            C7384Etj.A0Y(str, 0);
            this.id = str;
        }

        public final Success copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Success(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.id, ((Success) obj).id));
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.id;
            }
            C7384Etj.A0Y(str, 0);
            return new Success(str);
        }

        public final String component1() {
            return this.id;
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
