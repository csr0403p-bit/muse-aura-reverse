package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.FeedModalScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class FeedEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final FeedEntryProvider INSTANCE = new FeedEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.tabTransitionMetadata;
        G0W<FeedScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$FeedEntryProviderKt.lambda$1373717312;
        c5rn.A00(new G0U<FeedScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.FeedEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(FeedScreenKey feedScreenKey) {
                return feedScreenKey.toString();
            }
        }, new G0U<FeedScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.FeedEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FeedScreenKey feedScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FeedScreenKey feedScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(FeedScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.pushTransitionMetadata;
        G0W<FeedModalScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$FeedEntryProviderKt.f130lambda$958823580;
        c5rn.A00(new G0U<FeedModalScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.FeedEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(FeedModalScreenKey feedModalScreenKey) {
                return feedModalScreenKey.toString();
            }
        }, new G0U<FeedModalScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.FeedEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FeedModalScreenKey feedModalScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FeedModalScreenKey feedModalScreenKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(FeedModalScreenKey.class));
    }
}
