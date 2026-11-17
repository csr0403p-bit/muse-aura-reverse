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
import com.facebook.aura.navigation.key.VmUnavailableOverlayScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VmUnavailableOverlayEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final VmUnavailableOverlayEntryProvider INSTANCE = new VmUnavailableOverlayEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(Integer.MAX_VALUE);
        G0W<VmUnavailableOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$VmUnavailableOverlayEntryProviderKt.f194lambda$919044405;
        c5rn.A00(new G0U<VmUnavailableOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.VmUnavailableOverlayEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(VmUnavailableOverlayScreenKey vmUnavailableOverlayScreenKey) {
                return vmUnavailableOverlayScreenKey.toString();
            }
        }, new G0U<VmUnavailableOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.VmUnavailableOverlayEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VmUnavailableOverlayScreenKey vmUnavailableOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VmUnavailableOverlayScreenKey vmUnavailableOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(VmUnavailableOverlayScreenKey.class));
    }
}
