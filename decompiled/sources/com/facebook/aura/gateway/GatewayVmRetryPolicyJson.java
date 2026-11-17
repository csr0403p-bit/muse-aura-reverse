package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GatewayVmRetryPolicyJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long client_delay_ms;
    public final Long server_delay_ms;

    public final class Companion {
        public final C9hr<GatewayVmRetryPolicyJson> serializer() {
            return GatewayVmRetryPolicyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(GatewayVmRetryPolicyJson gatewayVmRetryPolicyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || gatewayVmRetryPolicyJson.server_delay_ms != null) {
            c9j5.AAP(gatewayVmRetryPolicyJson.server_delay_ms, C9j1.A00, c9iZ, 0);
        }
        if (zAfR || gatewayVmRetryPolicyJson.client_delay_ms != null) {
            c9j5.AAP(gatewayVmRetryPolicyJson.client_delay_ms, C9j1.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GatewayVmRetryPolicyJson) {
                GatewayVmRetryPolicyJson gatewayVmRetryPolicyJson = (GatewayVmRetryPolicyJson) obj;
                if (!C7384Etj.areEqual(this.server_delay_ms, gatewayVmRetryPolicyJson.server_delay_ms) || !C7384Etj.areEqual(this.client_delay_ms, gatewayVmRetryPolicyJson.client_delay_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GatewayVmRetryPolicyJson copy$default(GatewayVmRetryPolicyJson gatewayVmRetryPolicyJson, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = gatewayVmRetryPolicyJson.server_delay_ms;
        }
        if ((i & 2) != 0) {
            l2 = gatewayVmRetryPolicyJson.client_delay_ms;
        }
        return new GatewayVmRetryPolicyJson(l, l2);
    }

    public final Long component1() {
        return this.server_delay_ms;
    }

    public final Long component2() {
        return this.client_delay_ms;
    }

    public final GatewayVmRetryPolicyJson copy(Long l, Long l2) {
        return new GatewayVmRetryPolicyJson(l, l2);
    }

    public final Long getClient_delay_ms() {
        return this.client_delay_ms;
    }

    public final Long getServer_delay_ms() {
        return this.server_delay_ms;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.server_delay_ms) * 31) + C3cH.A02(this.client_delay_ms);
    }

    public GatewayVmRetryPolicyJson(Long l, Long l2) {
        this.server_delay_ms = l;
        this.client_delay_ms = l2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GatewayVmRetryPolicyJson(int i, Long l, Long l2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.server_delay_ms = null;
        } else {
            this.server_delay_ms = l;
        }
        if ((i & 2) == 0) {
            this.client_delay_ms = null;
        } else {
            this.client_delay_ms = l2;
        }
    }

    public /* synthetic */ GatewayVmRetryPolicyJson(Long l, Long l2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }

    public GatewayVmRetryPolicyJson() {
        this(null, null);
    }
}
