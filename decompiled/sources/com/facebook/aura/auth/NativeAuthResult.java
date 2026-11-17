package com.facebook.aura.auth;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public abstract class NativeAuthResult {

    public final class Cancelled extends NativeAuthResult {
        public static final Cancelled INSTANCE = new Cancelled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public String toString() {
            return "Cancelled";
        }

        public int hashCode() {
            return 4378933;
        }
    }

    public final class Error extends NativeAuthResult {
        public final int httpResponseCode;
        public final String message;

        public Error(String str, int i) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
            this.httpResponseCode = i;
        }

        public final Error copy(String str, int i) {
            C7384Etj.A0Y(str, 0);
            return new Error(str, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (!C7384Etj.areEqual(this.message, error.message) || this.httpResponseCode != error.httpResponseCode) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.httpResponseCode;
            }
            C7384Etj.A0Y(str, 0);
            return new Error(str, i);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.httpResponseCode;
        }

        public final int getHttpResponseCode() {
            return this.httpResponseCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.message) + this.httpResponseCode;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends NativeAuthResult {
        public final String accessToken;
        public final String refreshToken;
        public final String userId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (!C7384Etj.areEqual(this.accessToken, success.accessToken) || !C7384Etj.areEqual(this.userId, success.userId) || !C7384Etj.areEqual(this.refreshToken, success.refreshToken)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Success(String str, String str2, String str3, int i, C06H c06h) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.accessToken;
            }
            if ((i & 2) != 0) {
                str2 = success.userId;
            }
            if ((i & 4) != 0) {
                str3 = success.refreshToken;
            }
            return success.copy(str, str2, str3);
        }

        public final String component1() {
            return this.accessToken;
        }

        public final String component2() {
            return this.userId;
        }

        public final String component3() {
            return this.refreshToken;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.userId, AnonymousClass001.A0G(this.accessToken)) + AnonymousClass006.A0G(this.refreshToken);
        }

        public final Success copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new Success(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }

        public Success(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.accessToken = str;
            this.userId = str2;
            this.refreshToken = str3;
        }
    }

    public /* synthetic */ NativeAuthResult(C06H c06h) {
    }

    public NativeAuthResult() {
    }
}
