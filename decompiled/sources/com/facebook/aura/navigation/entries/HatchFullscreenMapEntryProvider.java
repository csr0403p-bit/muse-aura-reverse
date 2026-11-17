package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchFullscreenMapScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchFullscreenMapEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchFullscreenMapEntryProvider INSTANCE = new HatchFullscreenMapEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.fadeTransitionMetadata;
        G0W<HatchFullscreenMapScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchFullscreenMapEntryProviderKt.lambda$1639646185;
        c5rn.A00(new G0U<HatchFullscreenMapScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.HatchFullscreenMapEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey) {
                return hatchFullscreenMapScreenKey.toString();
            }
        }, new G0U<HatchFullscreenMapScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchFullscreenMapEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(HatchFullscreenMapScreenKey.class));
    }
}
