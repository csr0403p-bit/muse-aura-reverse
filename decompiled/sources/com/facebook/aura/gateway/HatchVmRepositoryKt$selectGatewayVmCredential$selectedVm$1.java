package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchVmRepositoryKt$selectGatewayVmCredential$selectedVm$1 extends AbstractC7559F3s implements G0U<GatewayVmCredential, Boolean> {
    public final /* synthetic */ String $normalizedCachedUrl;

    @Override // X.G0U
    public final Boolean invoke(GatewayVmCredential gatewayVmCredential) {
        C7384Etj.A0Y(gatewayVmCredential, 0);
        return C60O.A0h(gatewayVmCredential.wsUrl, this.$normalizedCachedUrl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepositoryKt$selectGatewayVmCredential$selectedVm$1(String str) {
        super(1);
        this.$normalizedCachedUrl = str;
    }
}
