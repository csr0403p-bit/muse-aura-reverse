package com.facebook.aura.status.repo;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class StatusError {

    public final class ApiError extends StatusError {
        public final String message;

        public ApiError(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final ApiError copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ApiError(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ApiError) && C7384Etj.areEqual(this.message, ((ApiError) obj).message));
        }

        public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiError.message;
            }
            C7384Etj.A0Y(str, 0);
            return new ApiError(str);
        }

        public final String component1() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class InvalidResponse extends StatusError {
        public static final InvalidResponse INSTANCE = new InvalidResponse();
    }

    public final class MissingCredentials extends StatusError {
        public static final MissingCredentials INSTANCE = new MissingCredentials();
    }

    public final class NetworkError extends StatusError {
        public final Exception exception;

        public NetworkError(Exception exc) {
            C7384Etj.A0Y(exc, 0);
            this.exception = exc;
        }

        public final NetworkError copy(Exception exc) {
            C7384Etj.A0Y(exc, 0);
            return new NetworkError(exc);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NetworkError) && C7384Etj.areEqual(this.exception, ((NetworkError) obj).exception));
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = networkError.exception;
            }
            C7384Etj.A0Y(exc, 0);
            return new NetworkError(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SaveError extends StatusError {
        public final String message;

        public SaveError(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final SaveError copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SaveError(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SaveError) && C7384Etj.areEqual(this.message, ((SaveError) obj).message));
        }

        public static /* synthetic */ SaveError copy$default(SaveError saveError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = saveError.message;
            }
            C7384Etj.A0Y(str, 0);
            return new SaveError(str);
        }

        public final String component1() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public StatusError() {
    }

    public /* synthetic */ StatusError(C06H c06h) {
    }
}
