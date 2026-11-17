package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchConnectorCatalogScreenKey;
import com.facebook.aura.navigation.key.HatchConnectorCategoryScreenKey;
import com.facebook.aura.navigation.key.HatchConnectorSearchScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ConnectorCatalogEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConnectorCatalogEntryProvider INSTANCE = new ConnectorCatalogEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<HatchConnectorCatalogScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ConnectorCatalogEntryProviderKt.f119lambda$1531941804;
        c5rn.A00(new G0U<HatchConnectorCatalogScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchConnectorCatalogScreenKey hatchConnectorCatalogScreenKey) {
                return hatchConnectorCatalogScreenKey.toString();
            }
        }, new G0U<HatchConnectorCatalogScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchConnectorCatalogScreenKey hatchConnectorCatalogScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchConnectorCatalogScreenKey hatchConnectorCatalogScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(HatchConnectorCatalogScreenKey.class));
        G0W<HatchConnectorCategoryScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ConnectorCatalogEntryProviderKt.f121lambda$717868686;
        c5rn.A00(new G0U<HatchConnectorCategoryScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(HatchConnectorCategoryScreenKey hatchConnectorCategoryScreenKey) {
                return hatchConnectorCategoryScreenKey.toString();
            }
        }, new G0U<HatchConnectorCategoryScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchConnectorCategoryScreenKey hatchConnectorCategoryScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchConnectorCategoryScreenKey hatchConnectorCategoryScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(HatchConnectorCategoryScreenKey.class));
        G0W<HatchConnectorSearchScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$ConnectorCatalogEntryProviderKt.f120lambda$1640953285;
        c5rn.A00(new G0U<HatchConnectorSearchScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey) {
                return hatchConnectorSearchScreenKey.toString();
            }
        }, new G0U<HatchConnectorSearchScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey) {
                return map;
            }
        }, g0w3, C3cG.A0x(HatchConnectorSearchScreenKey.class));
    }
}
