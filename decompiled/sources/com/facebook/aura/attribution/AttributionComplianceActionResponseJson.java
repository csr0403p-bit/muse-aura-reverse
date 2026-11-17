package com.facebook.aura.attribution;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AttributionComplianceActionResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;

    public final class Companion {
        public final C9hr<AttributionComplianceActionResponseJson> serializer() {
            return AttributionComplianceActionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_attribution_attribution(AttributionComplianceActionResponseJson attributionComplianceActionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(attributionComplianceActionResponseJson.action)) {
            c9j5.AAV(attributionComplianceActionResponseJson.action, c9iZ, 0);
        }
    }

    public final AttributionComplianceActionResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AttributionComplianceActionResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AttributionComplianceActionResponseJson) && C7384Etj.areEqual(this.action, ((AttributionComplianceActionResponseJson) obj).action));
    }

    public static /* synthetic */ AttributionComplianceActionResponseJson copy$default(AttributionComplianceActionResponseJson attributionComplianceActionResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attributionComplianceActionResponseJson.action;
        }
        C7384Etj.A0Y(str, 0);
        return new AttributionComplianceActionResponseJson(str);
    }

    public final String component1() {
        return this.action;
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public /* synthetic */ AttributionComplianceActionResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.action = "";
        } else {
            this.action = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AttributionComplianceActionResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.action = str;
    }

    public /* synthetic */ AttributionComplianceActionResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public AttributionComplianceActionResponseJson() {
        this("");
    }
}
