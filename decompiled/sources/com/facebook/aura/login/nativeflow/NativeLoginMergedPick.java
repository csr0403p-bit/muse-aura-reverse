package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType;

/* loaded from: classes2.dex */
public interface NativeLoginMergedPick {

    public final class Dismissed implements NativeLoginMergedPick {
        public static final int $stable = 0;
        public static final Dismissed INSTANCE = new Dismissed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public String toString() {
            return "Dismissed";
        }

        public int hashCode() {
            return 1552268134;
        }
    }

    public final class Failed extends C06G implements NativeLoginMergedPick {
        public static final int $stable = 0;
        public final HatchPasskeyErrorType errorType;

        public Failed(HatchPasskeyErrorType hatchPasskeyErrorType) {
            C7384Etj.A0Y(hatchPasskeyErrorType, 0);
            this.errorType = hatchPasskeyErrorType;
        }

        public final Failed copy(HatchPasskeyErrorType hatchPasskeyErrorType) {
            C7384Etj.A0Y(hatchPasskeyErrorType, 0);
            return new Failed(hatchPasskeyErrorType);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, HatchPasskeyErrorType hatchPasskeyErrorType, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchPasskeyErrorType = failed.errorType;
            }
            C7384Etj.A0Y(hatchPasskeyErrorType, 0);
            return new Failed(hatchPasskeyErrorType);
        }

        public final HatchPasskeyErrorType component1() {
            return this.errorType;
        }

        public final HatchPasskeyErrorType getErrorType() {
            return this.errorType;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Google extends C06G implements NativeLoginMergedPick {
        public static final int $stable = NativeLoginGoogleCredential.$stable;
        public final NativeLoginGoogleCredential credential;

        public Google(NativeLoginGoogleCredential nativeLoginGoogleCredential) {
            C7384Etj.A0Y(nativeLoginGoogleCredential, 0);
            this.credential = nativeLoginGoogleCredential;
        }

        public final Google copy(NativeLoginGoogleCredential nativeLoginGoogleCredential) {
            C7384Etj.A0Y(nativeLoginGoogleCredential, 0);
            return new Google(nativeLoginGoogleCredential);
        }

        public static /* synthetic */ Google copy$default(Google google, NativeLoginGoogleCredential nativeLoginGoogleCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                nativeLoginGoogleCredential = google.credential;
            }
            C7384Etj.A0Y(nativeLoginGoogleCredential, 0);
            return new Google(nativeLoginGoogleCredential);
        }

        public final NativeLoginGoogleCredential component1() {
            return this.credential;
        }

        public final NativeLoginGoogleCredential getCredential() {
            return this.credential;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NoCredential implements NativeLoginMergedPick {
        public static final int $stable = 0;
        public static final NoCredential INSTANCE = new NoCredential();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NoCredential);
        }

        public String toString() {
            return "NoCredential";
        }

        public int hashCode() {
            return 657691;
        }
    }

    public final class Passkey extends C06G implements NativeLoginMergedPick {
        public static final int $stable = 0;
        public final String authenticationResponseJson;

        public Passkey(String str) {
            C7384Etj.A0Y(str, 0);
            this.authenticationResponseJson = str;
        }

        public final Passkey copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Passkey(str);
        }

        public static /* synthetic */ Passkey copy$default(Passkey passkey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = passkey.authenticationResponseJson;
            }
            C7384Etj.A0Y(str, 0);
            return new Passkey(str);
        }

        public final String component1() {
            return this.authenticationResponseJson;
        }

        public final String getAuthenticationResponseJson() {
            return this.authenticationResponseJson;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
