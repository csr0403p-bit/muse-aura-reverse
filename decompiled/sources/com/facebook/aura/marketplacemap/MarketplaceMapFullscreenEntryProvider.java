package com.facebook.aura.marketplacemap;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.entries.AuraTransitionsKt;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class MarketplaceMapFullscreenEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final MarketplaceMapFullscreenEntryProvider INSTANCE = new MarketplaceMapFullscreenEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.fadeTransitionMetadata;
        G0W<MarketplaceMapFullscreenScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$MarketplaceMapFullscreenEntryProviderKt.lambda$640593829;
        c5rn.A00(new G0U<MarketplaceMapFullscreenScreenKey, Object>() { // from class: com.facebook.aura.marketplacemap.MarketplaceMapFullscreenEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey) {
                return marketplaceMapFullscreenScreenKey.toString();
            }
        }, new G0U<MarketplaceMapFullscreenScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.marketplacemap.MarketplaceMapFullscreenEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(MarketplaceMapFullscreenScreenKey.class));
    }
}
