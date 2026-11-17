package com.facebook.aura.skills.connect;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface CustomConnectorAuthEffect {

    public final class DismissCancel implements CustomConnectorAuthEffect {
        public static final int $stable = 0;
        public static final DismissCancel INSTANCE = new DismissCancel();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissCancel);
        }

        public String toString() {
            return "DismissCancel";
        }

        public int hashCode() {
            return 107862251;
        }
    }

    public final class DismissSuccess implements CustomConnectorAuthEffect {
        public static final int $stable = 0;
        public static final DismissSuccess INSTANCE = new DismissSuccess();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSuccess);
        }

        public String toString() {
            return "DismissSuccess";
        }

        public int hashCode() {
            return 926344114;
        }
    }

    public final class OpenAuthorizeUrl extends C06G implements CustomConnectorAuthEffect {
        public static final int $stable = 0;
        public final String url;

        public OpenAuthorizeUrl(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final OpenAuthorizeUrl copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenAuthorizeUrl(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenAuthorizeUrl) && C7384Etj.areEqual(this.url, ((OpenAuthorizeUrl) obj).url));
        }

        public static /* synthetic */ OpenAuthorizeUrl copy$default(OpenAuthorizeUrl openAuthorizeUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openAuthorizeUrl.url;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenAuthorizeUrl(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShowRetryableError implements CustomConnectorAuthEffect {
        public static final int $stable = 0;
        public static final ShowRetryableError INSTANCE = new ShowRetryableError();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowRetryableError);
        }

        public String toString() {
            return "ShowRetryableError";
        }

        public int hashCode() {
            return -1222414180;
        }
    }
}
