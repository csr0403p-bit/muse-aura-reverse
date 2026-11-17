package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchLinkOrderStateMachine$saveAddress$addressId$1 extends AbstractC7559F3s implements G0U<Integer, Integer> {
    public static final HatchLinkOrderStateMachine$saveAddress$addressId$1 INSTANCE = new HatchLinkOrderStateMachine$saveAddress$addressId$1();

    public HatchLinkOrderStateMachine$saveAddress$addressId$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return Integer.valueOf(AnonymousClass001.A0F(num) + 1);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(i + 1);
    }
}
