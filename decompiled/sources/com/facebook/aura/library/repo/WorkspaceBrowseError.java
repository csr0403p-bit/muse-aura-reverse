package com.facebook.aura.library.repo;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class WorkspaceBrowseError extends Exception {

    public final class ApiError extends WorkspaceBrowseError {
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

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return super.toString();
        }
    }

    public final class InvalidResponse extends WorkspaceBrowseError {
        public static final InvalidResponse INSTANCE = new InvalidResponse();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidResponse);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidResponse";
        }

        public int hashCode() {
            return 415738028;
        }
    }

    public final class MissingCredentials extends WorkspaceBrowseError {
        public static final MissingCredentials INSTANCE = new MissingCredentials();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingCredentials);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "MissingCredentials";
        }

        public int hashCode() {
            return -1822853150;
        }
    }

    public final class NetworkError extends WorkspaceBrowseError {
        public final Throwable cause;

        public NetworkError(Throwable th) {
            C7384Etj.A0Y(th, 0);
            this.cause = th;
        }

        public final NetworkError copy(Throwable th) {
            C7384Etj.A0Y(th, 0);
            return new NetworkError(th);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NetworkError) && C7384Etj.areEqual(this.cause, ((NetworkError) obj).cause));
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkError.cause;
            }
            C7384Etj.A0Y(th, 0);
            return new NetworkError(th);
        }

        public final Throwable component1() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ WorkspaceBrowseError(C06H c06h) {
    }

    public WorkspaceBrowseError() {
    }
}
