package com.facebook.aura.gateway;

import X.C31u;
import X.C7462Ewq;
import X.C7BY;
import X.InterfaceC7359EnW;
import com.facebook.aura.gateway.MC;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes4.dex */
public abstract class GatewayVmRetryPolicyKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(GatewayVmRetryPolicyKt.class, "gatewayVmRetryPolicyJson", "getGatewayVmRetryPolicyJson()Ljava/lang/String;", 1), new C7462Ewq(GatewayVmRetryPolicyKt.class, "gatewayVmRetryPolicy", "getGatewayVmRetryPolicy()Lcom/facebook/aura/gateway/GatewayVmRetryPolicy;", 1)};
    public static final C31u gatewayVmRetryPolicyJson$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_networking.gateway_vm_retry_policy);
    public static final C31u gatewayVmRetryPolicy$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(GatewayVmRetryPolicyKt$gatewayVmRetryPolicy$2.INSTANCE);

    public static final GatewayVmRetryPolicy getGatewayVmRetryPolicy() {
        return (GatewayVmRetryPolicy) gatewayVmRetryPolicy$delegate.getValue(null, $$delegatedProperties[1]);
    }

    public static final String getGatewayVmRetryPolicyJson() {
        return (String) gatewayVmRetryPolicyJson$delegate.getValue(null, $$delegatedProperties[0]);
    }

    public static final GatewayVmRetryPolicy decodeGatewayVmRetryPolicy(String str) {
        String string = C7BY.A0F(str).toString();
        if (string.length() == 0) {
            return GatewayVmRetryPolicy.NONE;
        }
        try {
            GatewayVmRetryPolicyJson gatewayVmRetryPolicyJson = (GatewayVmRetryPolicyJson) HatchJsonKt.HatchJson.A00(string, GatewayVmRetryPolicyJson$$serializer.INSTANCE);
            Long l = gatewayVmRetryPolicyJson.server_delay_ms;
            Long l2 = null;
            if (l == null || l.longValue() < 0) {
                l = null;
            }
            Long l3 = gatewayVmRetryPolicyJson.client_delay_ms;
            if (l3 != null && l3.longValue() >= 0) {
                l2 = l3;
            }
            return new GatewayVmRetryPolicy(l, l2);
        } catch (Exception unused) {
            return GatewayVmRetryPolicy.NONE;
        }
    }
}
