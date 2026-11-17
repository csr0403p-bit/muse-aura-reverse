package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$ShopifyCheckoutApproval$merchantDisplayName$2 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$ShopifyCheckoutApproval$merchantDisplayName$2(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval) {
        super(0);
        this.this$0 = shopifyCheckoutApproval;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        String strA0l;
        HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant = this.this$0.merchant;
        if (checkoutMerchant != null && (str = checkoutMerchant.name) != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            return strA0l;
        }
        HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval = this.this$0;
        HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant2 = shopifyCheckoutApproval.merchant;
        return shopifyCheckoutApproval.toDisplayHost(checkoutMerchant2 != null ? checkoutMerchant2.url : null);
    }
}
