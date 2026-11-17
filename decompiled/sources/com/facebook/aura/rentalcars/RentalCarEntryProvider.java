package com.facebook.aura.rentalcars;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.entries.AuraTransitionsKt;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class RentalCarEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final RentalCarEntryProvider INSTANCE = new RentalCarEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<RentalCarResultsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$RentalCarEntryProviderKt.lambda$774727093;
        c5rn.A00(new G0U<RentalCarResultsScreenKey, Object>() { // from class: com.facebook.aura.rentalcars.RentalCarEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(RentalCarResultsScreenKey rentalCarResultsScreenKey) {
                return rentalCarResultsScreenKey.toString();
            }
        }, new G0U<RentalCarResultsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.rentalcars.RentalCarEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(RentalCarResultsScreenKey rentalCarResultsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(RentalCarResultsScreenKey rentalCarResultsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(RentalCarResultsScreenKey.class));
        final Map<String, Object> map = AuraTransitionsKt.cardMorphTransitionMetadata;
        G0W<RentalCarDetailsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$RentalCarEntryProviderKt.f228lambda$1461238870;
        c5rn.A00(new G0U<RentalCarDetailsScreenKey, Object>() { // from class: com.facebook.aura.rentalcars.RentalCarEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(RentalCarDetailsScreenKey rentalCarDetailsScreenKey) {
                return rentalCarDetailsScreenKey.toString();
            }
        }, new G0U<RentalCarDetailsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.rentalcars.RentalCarEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(RentalCarDetailsScreenKey rentalCarDetailsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(RentalCarDetailsScreenKey rentalCarDetailsScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(RentalCarDetailsScreenKey.class));
    }
}
