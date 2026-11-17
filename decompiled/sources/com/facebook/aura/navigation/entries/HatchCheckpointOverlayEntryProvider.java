package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.HatchCheckpointOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayPriority;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCheckpointOverlayEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchCheckpointOverlayEntryProvider INSTANCE = new HatchCheckpointOverlayEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(OverlayPriority.CHECKPOINT.ordinal());
        G0W<HatchCheckpointOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchCheckpointOverlayEntryProviderKt.lambda$380279998;
        c5rn.A00(new G0U<HatchCheckpointOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.HatchCheckpointOverlayEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchCheckpointOverlayScreenKey hatchCheckpointOverlayScreenKey) {
                return hatchCheckpointOverlayScreenKey.toString();
            }
        }, new G0U<HatchCheckpointOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchCheckpointOverlayEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchCheckpointOverlayScreenKey hatchCheckpointOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchCheckpointOverlayScreenKey hatchCheckpointOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(HatchCheckpointOverlayScreenKey.class));
    }
}
