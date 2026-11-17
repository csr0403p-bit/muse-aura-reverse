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
import com.facebook.aura.navigation.key.HatchPausedOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayPriority;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchPausedOverlayEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchPausedOverlayEntryProvider INSTANCE = new HatchPausedOverlayEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(OverlayPriority.HATCH_PAUSED.ordinal());
        G0W<HatchPausedOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchPausedOverlayEntryProviderKt.lambda$1781879052;
        c5rn.A00(new G0U<HatchPausedOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.HatchPausedOverlayEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchPausedOverlayScreenKey hatchPausedOverlayScreenKey) {
                return hatchPausedOverlayScreenKey.toString();
            }
        }, new G0U<HatchPausedOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchPausedOverlayEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchPausedOverlayScreenKey hatchPausedOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchPausedOverlayScreenKey hatchPausedOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(HatchPausedOverlayScreenKey.class));
    }
}
