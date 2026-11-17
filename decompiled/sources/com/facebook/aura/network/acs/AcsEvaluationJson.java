package com.facebook.aura.network.acs;

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
public final class AcsEvaluationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String data;

    public final class Companion {
        public final C9hr<AcsEvaluationJson> serializer() {
            return AcsEvaluationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(AcsEvaluationJson acsEvaluationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(acsEvaluationJson.data)) {
            c9j5.AAV(acsEvaluationJson.data, c9iZ, 0);
        }
    }

    public final AcsEvaluationJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AcsEvaluationJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AcsEvaluationJson) && C7384Etj.areEqual(this.data, ((AcsEvaluationJson) obj).data));
    }

    public static /* synthetic */ AcsEvaluationJson copy$default(AcsEvaluationJson acsEvaluationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acsEvaluationJson.data;
        }
        C7384Etj.A0Y(str, 0);
        return new AcsEvaluationJson(str);
    }

    public final String component1() {
        return this.data;
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public /* synthetic */ AcsEvaluationJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.data = "";
        } else {
            this.data = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AcsEvaluationJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.data = str;
    }

    public /* synthetic */ AcsEvaluationJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public AcsEvaluationJson() {
        this("");
    }
}
