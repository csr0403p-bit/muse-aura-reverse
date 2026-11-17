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
import com.facebook.aura.navigation.key.MicPermissionDeniedOverlayScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class MicPermissionDeniedOverlayEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final MicPermissionDeniedOverlayEntryProvider INSTANCE = new MicPermissionDeniedOverlayEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(Integer.MAX_VALUE);
        G0W<MicPermissionDeniedOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$MicPermissionDeniedOverlayEntryProviderKt.lambda$256394179;
        c5rn.A00(new G0U<MicPermissionDeniedOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.MicPermissionDeniedOverlayEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(MicPermissionDeniedOverlayScreenKey micPermissionDeniedOverlayScreenKey) {
                return micPermissionDeniedOverlayScreenKey.toString();
            }
        }, new G0U<MicPermissionDeniedOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.MicPermissionDeniedOverlayEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(MicPermissionDeniedOverlayScreenKey micPermissionDeniedOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(MicPermissionDeniedOverlayScreenKey micPermissionDeniedOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(MicPermissionDeniedOverlayScreenKey.class));
    }
}
