package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.rentalcars.ComposableSingletons$RentalCarEntryProviderKt$lambda$-1461238870$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$RentalCarEntryProviderKt$lambda$1461238870$1 extends AbstractC7559F3s implements G0W<RentalCarDetailsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$RentalCarEntryProviderKt$lambda$1461238870$1 INSTANCE = new ComposableSingletons$RentalCarEntryProviderKt$lambda$1461238870$1();

    public ComposableSingletons$RentalCarEntryProviderKt$lambda$1461238870$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, BFM bfm, Integer num) {
        invoke(rentalCarDetailsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, BFM bfm, int i) {
        RentalCarDetailsScreenKt.RentalCarDetailsScreen(rentalCarDetailsScreenKey, null, bfm, AnonymousClass006.A0E(rentalCarDetailsScreenKey, i), 2);
    }
}
