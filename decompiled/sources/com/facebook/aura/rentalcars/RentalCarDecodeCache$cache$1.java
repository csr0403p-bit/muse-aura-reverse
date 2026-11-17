package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes.dex */
public final class RentalCarDecodeCache$cache$1 extends AbstractC7559F3s implements G0V<RentalCarDecodeKey, CachedRentalCarDecode, Long> {
    public static final RentalCarDecodeCache$cache$1 INSTANCE = new RentalCarDecodeCache$cache$1();

    public RentalCarDecodeCache$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(RentalCarDecodeKey rentalCarDecodeKey, CachedRentalCarDecode cachedRentalCarDecode) {
        C7384Etj.A0Y(cachedRentalCarDecode, 1);
        return Long.valueOf((cachedRentalCarDecode.list.items.size() * 2048) + 256);
    }
}
