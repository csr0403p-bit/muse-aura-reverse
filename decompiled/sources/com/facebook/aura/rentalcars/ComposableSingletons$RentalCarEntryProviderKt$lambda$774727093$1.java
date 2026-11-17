package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$RentalCarEntryProviderKt$lambda$774727093$1 extends AbstractC7559F3s implements G0W<RentalCarResultsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$RentalCarEntryProviderKt$lambda$774727093$1 INSTANCE = new ComposableSingletons$RentalCarEntryProviderKt$lambda$774727093$1();

    public ComposableSingletons$RentalCarEntryProviderKt$lambda$774727093$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RentalCarResultsScreenKey rentalCarResultsScreenKey, BFM bfm, Integer num) {
        invoke(rentalCarResultsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(RentalCarResultsScreenKey rentalCarResultsScreenKey, BFM bfm, int i) {
        RentalCarResultsScreenKt.RentalCarResultsScreen(rentalCarResultsScreenKey, null, bfm, AnonymousClass006.A0E(rentalCarResultsScreenKey, i), 2);
    }
}
