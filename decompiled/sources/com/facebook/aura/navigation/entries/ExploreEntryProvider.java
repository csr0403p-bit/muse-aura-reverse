package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ExploreModalScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ExploreEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ExploreEntryProvider INSTANCE = new ExploreEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.tabTransitionMetadata;
        G0W<ExploreScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ExploreEntryProviderKt.f128lambda$320741767;
        c5rn.A00(new G0U<ExploreScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ExploreEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ExploreScreenKey exploreScreenKey) {
                return exploreScreenKey.toString();
            }
        }, new G0U<ExploreScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ExploreEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ExploreScreenKey exploreScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ExploreScreenKey exploreScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(ExploreScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.pushTransitionMetadata;
        G0W<ExploreModalScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ExploreEntryProviderKt.lambda$2107483903;
        c5rn.A00(new G0U<ExploreModalScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ExploreEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ExploreModalScreenKey exploreModalScreenKey) {
                return exploreModalScreenKey.toString();
            }
        }, new G0U<ExploreModalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ExploreEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ExploreModalScreenKey exploreModalScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ExploreModalScreenKey exploreModalScreenKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(ExploreModalScreenKey.class));
    }
}
