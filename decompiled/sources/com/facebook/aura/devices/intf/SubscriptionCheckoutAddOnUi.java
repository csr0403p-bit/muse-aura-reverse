package com.facebook.aura.devices.intf;

import X.BFM;
import X.BRg;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public interface SubscriptionCheckoutAddOnUi {
    void Offer(String str, String str2, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i);

    AuraNavKey purchaseSuccessDestination();
}
