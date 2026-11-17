package com.facebook.aura.auth;

import X.AnonymousClass003;

/* loaded from: classes4.dex */
public interface RefreshAccessTokenResult {

    public final class Rejected implements RefreshAccessTokenResult {
        public static final Rejected INSTANCE = new Rejected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        public String toString() {
            return "Rejected";
        }

        public int hashCode() {
            return -232290817;
        }
    }

    public final class Success implements RefreshAccessTokenResult {
        public final String accessToken;
        public final String refreshToken;

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public Success(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.accessToken = str;
            this.refreshToken = str2;
        }
    }

    public final class Unavailable implements RefreshAccessTokenResult {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1308781359;
        }
    }
}
