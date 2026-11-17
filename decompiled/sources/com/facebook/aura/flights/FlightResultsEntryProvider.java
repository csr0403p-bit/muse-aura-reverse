package com.facebook.aura.flights;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightResultsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final FlightResultsEntryProvider INSTANCE = new FlightResultsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<FlightResultsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$FlightResultsEntryProviderKt.f61lambda$238378709;
        c5rn.A00(new G0U<FlightResultsScreenKey, Object>() { // from class: com.facebook.aura.flights.FlightResultsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(FlightResultsScreenKey flightResultsScreenKey) {
                return flightResultsScreenKey.toString();
            }
        }, new G0U<FlightResultsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.flights.FlightResultsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightResultsScreenKey flightResultsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightResultsScreenKey flightResultsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(FlightResultsScreenKey.class));
        G0W<FlightDetailScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$FlightResultsEntryProviderKt.lambda$2052549809;
        c5rn.A00(new G0U<FlightDetailScreenKey, Object>() { // from class: com.facebook.aura.flights.FlightResultsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(FlightDetailScreenKey flightDetailScreenKey) {
                return flightDetailScreenKey.toString();
            }
        }, new G0U<FlightDetailScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.flights.FlightResultsEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightDetailScreenKey flightDetailScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightDetailScreenKey flightDetailScreenKey) {
                return mapA0o;
            }
        }, g0w2, C3cG.A0x(FlightDetailScreenKey.class));
    }
}
