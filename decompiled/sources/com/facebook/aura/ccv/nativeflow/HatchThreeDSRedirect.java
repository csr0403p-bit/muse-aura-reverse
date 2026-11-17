package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HatchThreeDSRedirect {

    public final class Invalid implements HatchThreeDSRedirect {
        public static final Invalid INSTANCE = new Invalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Invalid);
        }

        public String toString() {
            return "Invalid";
        }

        public int hashCode() {
            return -298519565;
        }
    }

    public final class None implements HatchThreeDSRedirect {
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 1251102396;
        }
    }

    public final class Valid extends C06G implements HatchThreeDSRedirect {
        public final HatchThreeDSHttpMethod method;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Valid) {
                    Valid valid = (Valid) obj;
                    if (!C7384Etj.areEqual(this.url, valid.url) || this.method != valid.method) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Valid copy$default(Valid valid, String str, HatchThreeDSHttpMethod hatchThreeDSHttpMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valid.url;
            }
            if ((i & 2) != 0) {
                hatchThreeDSHttpMethod = valid.method;
            }
            AnonymousClass003.A0u(str, hatchThreeDSHttpMethod);
            return new Valid(str, hatchThreeDSHttpMethod);
        }

        public final String component1() {
            return this.url;
        }

        public final HatchThreeDSHttpMethod component2() {
            return this.method;
        }

        public final HatchThreeDSHttpMethod getMethod() {
            return this.method;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.method, AnonymousClass001.A0G(this.url));
        }

        public Valid(String str, HatchThreeDSHttpMethod hatchThreeDSHttpMethod) {
            AnonymousClass003.A0u(str, hatchThreeDSHttpMethod);
            this.url = str;
            this.method = hatchThreeDSHttpMethod;
        }

        public final Valid copy(String str, HatchThreeDSHttpMethod hatchThreeDSHttpMethod) {
            AnonymousClass003.A0u(str, hatchThreeDSHttpMethod);
            return new Valid(str, hatchThreeDSHttpMethod);
        }

        public String toString() {
            return super.toString();
        }
    }
}
