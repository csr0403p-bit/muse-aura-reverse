package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$FlightCheckoutApproval$merchantDisplayName$2 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$FlightCheckoutApproval$merchantDisplayName$2(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval) {
        super(0);
        this.this$0 = flightCheckoutApproval;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        String strA0l;
        HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant = this.this$0.merchant;
        if (checkoutMerchant == null || (str = checkoutMerchant.name) == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }
}
