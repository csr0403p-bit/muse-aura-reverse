package com.facebook.aura.skills.connect.config;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface CustomConnectorApiKeyPlacement {

    public final class BearerHeader implements CustomConnectorApiKeyPlacement {
        public static final BearerHeader INSTANCE = new BearerHeader();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BearerHeader);
        }

        public String toString() {
            return "BearerHeader";
        }

        public int hashCode() {
            return -1964482580;
        }
    }

    public final class CustomHeader extends C06G implements CustomConnectorApiKeyPlacement {
        public final String value;

        public CustomHeader(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final CustomHeader copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new CustomHeader(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CustomHeader) && C7384Etj.areEqual(this.value, ((CustomHeader) obj).value));
        }

        public static /* synthetic */ CustomHeader copy$default(CustomHeader customHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customHeader.value;
            }
            C7384Etj.A0Y(str, 0);
            return new CustomHeader(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Invalid implements CustomConnectorApiKeyPlacement {
        public static final Invalid INSTANCE = new Invalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Invalid);
        }

        public String toString() {
            return "Invalid";
        }

        public int hashCode() {
            return -1209733991;
        }
    }

    public final class QueryParam extends C06G implements CustomConnectorApiKeyPlacement {
        public final String value;

        public QueryParam(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final QueryParam copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new QueryParam(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof QueryParam) && C7384Etj.areEqual(this.value, ((QueryParam) obj).value));
        }

        public static /* synthetic */ QueryParam copy$default(QueryParam queryParam, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = queryParam.value;
            }
            C7384Etj.A0Y(str, 0);
            return new QueryParam(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UrlPathSegment extends C06G implements CustomConnectorApiKeyPlacement {
        public final String value;

        public UrlPathSegment(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final UrlPathSegment copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new UrlPathSegment(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof UrlPathSegment) && C7384Etj.areEqual(this.value, ((UrlPathSegment) obj).value));
        }

        public static /* synthetic */ UrlPathSegment copy$default(UrlPathSegment urlPathSegment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = urlPathSegment.value;
            }
            C7384Etj.A0Y(str, 0);
            return new UrlPathSegment(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
