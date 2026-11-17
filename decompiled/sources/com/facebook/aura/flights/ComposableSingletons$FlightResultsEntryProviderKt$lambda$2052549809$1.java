package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$FlightResultsEntryProviderKt$lambda$2052549809$1 extends AbstractC7559F3s implements G0W<FlightDetailScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FlightResultsEntryProviderKt$lambda$2052549809$1 INSTANCE = new ComposableSingletons$FlightResultsEntryProviderKt$lambda$2052549809$1();

    public ComposableSingletons$FlightResultsEntryProviderKt$lambda$2052549809$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FlightDetailScreenKey flightDetailScreenKey, BFM bfm, Integer num) {
        invoke(flightDetailScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FlightDetailScreenKey flightDetailScreenKey, BFM bfm, int i) {
        FlightDetailScreenKt.FlightDetailScreen(flightDetailScreenKey, null, bfm, AnonymousClass006.A0E(flightDetailScreenKey, i), 2);
    }
}
