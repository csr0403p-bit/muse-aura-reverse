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
/* loaded from: classes3.dex */
public final class AgentStatusDetailJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String activity_detail;

    public final class Companion {
        public final C9hr<AgentStatusDetailJson> serializer() {
            return AgentStatusDetailJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(AgentStatusDetailJson agentStatusDetailJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || agentStatusDetailJson.activity_detail != null) {
            c9j5.AAP(agentStatusDetailJson.activity_detail, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AgentStatusDetailJson) && C7384Etj.areEqual(this.activity_detail, ((AgentStatusDetailJson) obj).activity_detail));
    }

    public static /* synthetic */ AgentStatusDetailJson copy$default(AgentStatusDetailJson agentStatusDetailJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentStatusDetailJson.activity_detail;
        }
        return new AgentStatusDetailJson(str);
    }

    public final String component1() {
        return this.activity_detail;
    }

    public final AgentStatusDetailJson copy(String str) {
        return new AgentStatusDetailJson(str);
    }

    public final String getActivity_detail() {
        return this.activity_detail;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.activity_detail);
    }

    public /* synthetic */ AgentStatusDetailJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.activity_detail = null;
        } else {
            this.activity_detail = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AgentStatusDetailJson(String str) {
        this.activity_detail = str;
    }

    public /* synthetic */ AgentStatusDetailJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public AgentStatusDetailJson() {
        this(null);
    }
}
