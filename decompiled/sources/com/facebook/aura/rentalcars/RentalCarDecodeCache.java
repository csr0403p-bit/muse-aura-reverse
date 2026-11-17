package com.facebook.aura.rentalcars;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.rentalcars.RentalCarDecode;

/* loaded from: classes.dex */
public final class RentalCarDecodeCache {
    public static final RentalCarDecodeCache INSTANCE = new RentalCarDecodeCache();
    public static final AuraByteLruCache<RentalCarDecodeKey, CachedRentalCarDecode> cache;

    static {
        long j = 0;
        cache = new AuraByteLruCache<>(16, 262144L, j, false, j, RentalCarDecodeCache$cache$1.INSTANCE, 28, null);
    }

    public final RentalCarDecode decode(RentalCarDecodeKey rentalCarDecodeKey, GenericListPresentation genericListPresentation) {
        AnonymousClass003.A0u(rentalCarDecodeKey, genericListPresentation);
        RentalCarResults rentalCarResults = RentalCarRateJsonKt.rentalCarResults(genericListPresentation);
        RentalCarDecode ready = rentalCarResults != null ? new RentalCarDecode.Ready(rentalCarResults) : RentalCarDecode.Failed.INSTANCE;
        cache.put(rentalCarDecodeKey, new CachedRentalCarDecode(genericListPresentation, ready));
        return ready;
    }

    public final RentalCarDecode get(RentalCarDecodeKey rentalCarDecodeKey, GenericListPresentation genericListPresentation) {
        AnonymousClass003.A0u(rentalCarDecodeKey, genericListPresentation);
        CachedRentalCarDecode cachedRentalCarDecode = cache.get(rentalCarDecodeKey);
        if (cachedRentalCarDecode == null || !C7384Etj.areEqual(cachedRentalCarDecode.list, genericListPresentation)) {
            return null;
        }
        return cachedRentalCarDecode.decode;
    }
}
