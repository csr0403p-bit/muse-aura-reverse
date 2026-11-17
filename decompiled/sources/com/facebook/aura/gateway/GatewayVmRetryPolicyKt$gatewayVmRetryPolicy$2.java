package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class GatewayVmRetryPolicyKt$gatewayVmRetryPolicy$2 extends AbstractC7559F3s implements Function0<GatewayVmRetryPolicy> {
    public static final GatewayVmRetryPolicyKt$gatewayVmRetryPolicy$2 INSTANCE = new GatewayVmRetryPolicyKt$gatewayVmRetryPolicy$2();

    public GatewayVmRetryPolicyKt$gatewayVmRetryPolicy$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GatewayVmRetryPolicy invoke() {
        return GatewayVmRetryPolicyKt.decodeGatewayVmRetryPolicy(GatewayVmRetryPolicyKt.getGatewayVmRetryPolicyJson());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ GatewayVmRetryPolicy invoke() {
        return GatewayVmRetryPolicyKt.decodeGatewayVmRetryPolicy(GatewayVmRetryPolicyKt.getGatewayVmRetryPolicyJson());
    }
}
