package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengersSheetKt$flightCheckout$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightCheckoutPassengersSheetKt$flightCheckout$1$1(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, AuraNavigator auraNavigator) {
        super(1);
        this.$checkout = flightCheckoutApproval;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$checkout == null) {
            this.$navigator.back();
        }
        return new C78g() { // from class: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$flightCheckout$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
