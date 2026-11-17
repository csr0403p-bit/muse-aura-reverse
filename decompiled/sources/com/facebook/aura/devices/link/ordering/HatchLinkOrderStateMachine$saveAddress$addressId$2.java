package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.FGI;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchLinkOrderStateMachine$saveAddress$addressId$2 extends AbstractC7559F3s implements G0U<Integer, String> {
    public static final HatchLinkOrderStateMachine$saveAddress$addressId$2 INSTANCE = new HatchLinkOrderStateMachine$saveAddress$addressId$2();

    public HatchLinkOrderStateMachine$saveAddress$addressId$2() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return FGI.A0H("local-address-", AnonymousClass001.A0F(num));
    }

    public final String invoke(int i) {
        return FGI.A0H("local-address-", i);
    }
}
