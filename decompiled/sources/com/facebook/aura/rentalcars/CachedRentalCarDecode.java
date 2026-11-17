package com.facebook.aura.rentalcars;

import X.AnonymousClass003;
import com.facebook.aura.model.GenericListPresentation;

/* loaded from: classes.dex */
public final class CachedRentalCarDecode {
    public final RentalCarDecode decode;
    public final GenericListPresentation list;

    public final RentalCarDecode getDecode() {
        return this.decode;
    }

    public final GenericListPresentation getList() {
        return this.list;
    }

    public CachedRentalCarDecode(GenericListPresentation genericListPresentation, RentalCarDecode rentalCarDecode) {
        AnonymousClass003.A0u(genericListPresentation, rentalCarDecode);
        this.list = genericListPresentation;
        this.decode = rentalCarDecode;
    }
}
