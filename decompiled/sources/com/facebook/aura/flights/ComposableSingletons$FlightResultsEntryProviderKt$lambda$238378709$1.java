package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.flights.ComposableSingletons$FlightResultsEntryProviderKt$lambda$-238378709$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$FlightResultsEntryProviderKt$lambda$238378709$1 extends AbstractC7559F3s implements G0W<FlightResultsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FlightResultsEntryProviderKt$lambda$238378709$1 INSTANCE = new ComposableSingletons$FlightResultsEntryProviderKt$lambda$238378709$1();

    public ComposableSingletons$FlightResultsEntryProviderKt$lambda$238378709$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FlightResultsScreenKey flightResultsScreenKey, BFM bfm, Integer num) {
        invoke(flightResultsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FlightResultsScreenKey flightResultsScreenKey, BFM bfm, int i) {
        FlightResultsScreenKt.FlightResultsScreen(flightResultsScreenKey, null, bfm, AnonymousClass006.A0E(flightResultsScreenKey, i), 2);
    }
}
