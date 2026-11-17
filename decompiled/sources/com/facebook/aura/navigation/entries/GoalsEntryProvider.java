package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchGoalsModalScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final GoalsEntryProvider INSTANCE = new GoalsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.tabTransitionMetadata;
        G0W<HatchGoalsTabScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$GoalsEntryProviderKt.lambda$1453188955;
        c5rn.A00(new G0U<HatchGoalsTabScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.GoalsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchGoalsTabScreenKey hatchGoalsTabScreenKey) {
                return hatchGoalsTabScreenKey.toString();
            }
        }, new G0U<HatchGoalsTabScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.GoalsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchGoalsTabScreenKey hatchGoalsTabScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchGoalsTabScreenKey hatchGoalsTabScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(HatchGoalsTabScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.pushTransitionMetadata;
        G0W<HatchGoalsModalScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$GoalsEntryProviderKt.lambda$1737334428;
        c5rn.A00(new G0U<HatchGoalsModalScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.GoalsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(HatchGoalsModalScreenKey hatchGoalsModalScreenKey) {
                return hatchGoalsModalScreenKey.toString();
            }
        }, new G0U<HatchGoalsModalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.GoalsEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchGoalsModalScreenKey hatchGoalsModalScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchGoalsModalScreenKey hatchGoalsModalScreenKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(HatchGoalsModalScreenKey.class));
    }
}
