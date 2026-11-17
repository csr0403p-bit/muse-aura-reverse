package com.facebook.aura.status.repo;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class ActivityError {

    public final class ApiError extends ActivityError {
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

    public final class InvalidResponse extends ActivityError {
        public static final InvalidResponse INSTANCE = new InvalidResponse();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidResponse);
        }

        public String toString() {
            return "InvalidResponse";
        }

        public int hashCode() {
            return -985773741;
        }
    }

    public final class MissingCredentials extends ActivityError {
        public static final MissingCredentials INSTANCE = new MissingCredentials();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingCredentials);
        }

        public String toString() {
            return "MissingCredentials";
        }

        public int hashCode() {
            return 1412088283;
        }
    }

    public final class NetworkError extends ActivityError {
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

    public /* synthetic */ ActivityError(C06H c06h) {
    }

    public ActivityError() {
    }
}
