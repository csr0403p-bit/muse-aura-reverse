package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.FlightOfferDetailsSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightOfferDetailsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final FlightOfferDetailsEntryProvider INSTANCE = new FlightOfferDetailsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<FlightOfferDetailsSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$FlightOfferDetailsEntryProviderKt.f132lambda$1749391591;
        c5rn.A00(new G0U<FlightOfferDetailsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.FlightOfferDetailsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey) {
                return flightOfferDetailsSheetKey.toString();
            }
        }, new G0U<FlightOfferDetailsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.FlightOfferDetailsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(FlightOfferDetailsSheetKey.class));
    }
}
