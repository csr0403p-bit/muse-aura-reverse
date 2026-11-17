package com.facebook.aura.agentpermission;

import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CheckoutInfoTitle;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public abstract class CheckoutInfoViewModelKt {
    public static final CheckoutInfoTitle.Resource checkoutInfoFallbackTitle(String str) {
        boolean zIsShopPayPaymentMethod = CheckoutApprovalSharedKt.isShopPayPaymentMethod(str);
        int i = R.string._name_removed__res_0x7f120089;
        if (zIsShopPayPaymentMethod) {
            i = R.string._name_removed__res_0x7f120156;
        }
        return new CheckoutInfoTitle.Resource(i);
    }

    public static final String checkoutPaymentMethod(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval) {
        HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = browserCheckoutApproval.getPaymentSelection();
        if (CheckoutApprovalSharedKt.isShopPayPaymentMethod(paymentSelection != null ? paymentSelection.paymentMethod : null)) {
            return "shop_pay";
        }
        String str = paymentSelection != null ? paymentSelection.paymentMethod : null;
        if (str == null || !str.equalsIgnoreCase("stripe_link")) {
            return null;
        }
        return "stripe_link";
    }
}
