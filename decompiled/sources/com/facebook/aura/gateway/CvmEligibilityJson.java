package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CvmEligibilityJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String state;

    public final class Companion {
        public final C9hr<CvmEligibilityJson> serializer() {
            return CvmEligibilityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CvmEligibilityJson cvmEligibilityJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || cvmEligibilityJson.state != null) {
            c9j5.AAP(cvmEligibilityJson.state, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CvmEligibilityJson) && C7384Etj.areEqual(this.state, ((CvmEligibilityJson) obj).state));
    }

    public static /* synthetic */ CvmEligibilityJson copy$default(CvmEligibilityJson cvmEligibilityJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvmEligibilityJson.state;
        }
        return new CvmEligibilityJson(str);
    }

    public final String component1() {
        return this.state;
    }

    public final CvmEligibilityJson copy(String str) {
        return new CvmEligibilityJson(str);
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.state);
    }

    public /* synthetic */ CvmEligibilityJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.state = null;
        } else {
            this.state = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CvmEligibilityJson(String str) {
        this.state = str;
    }

    public /* synthetic */ CvmEligibilityJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public CvmEligibilityJson() {
        this(null);
    }
}
