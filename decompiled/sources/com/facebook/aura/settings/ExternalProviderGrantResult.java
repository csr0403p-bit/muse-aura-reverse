package com.facebook.aura.settings;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface ExternalProviderGrantResult {

    /* loaded from: classes3.dex */
    public final class Expired implements ExternalProviderGrantResult {
        public static final int $stable = 0;
        public static final Expired INSTANCE = new Expired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Expired);
        }

        public String toString() {
            return "Expired";
        }

        public int hashCode() {
            return 1473244057;
        }
    }

    /* loaded from: classes3.dex */
    public final class Failed implements ExternalProviderGrantResult {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 470348105;
        }
    }

    /* loaded from: classes3.dex */
    public final class Requested extends C06G implements ExternalProviderGrantResult {
        public static final int $stable = 0;
        public final String grantRequest;

        public Requested(String str) {
            C7384Etj.A0Y(str, 0);
            this.grantRequest = str;
        }

        public final Requested copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Requested(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Requested) && C7384Etj.areEqual(this.grantRequest, ((Requested) obj).grantRequest));
        }

        public static /* synthetic */ Requested copy$default(Requested requested, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requested.grantRequest;
            }
            C7384Etj.A0Y(str, 0);
            return new Requested(str);
        }

        public final String component1() {
            return this.grantRequest;
        }

        public final String getGrantRequest() {
            return this.grantRequest;
        }

        public int hashCode() {
            return this.grantRequest.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
