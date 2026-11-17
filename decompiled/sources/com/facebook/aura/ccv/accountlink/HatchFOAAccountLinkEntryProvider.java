package com.facebook.aura.ccv.accountlink;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.HatchFOAAccountLinkScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchFOAAccountLinkEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchFOAAccountLinkEntryProvider INSTANCE = new HatchFOAAccountLinkEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(Integer.MAX_VALUE);
        G0W<HatchFOAAccountLinkScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchFOAAccountLinkEntryProviderKt.f13lambda$613065240;
        c5rn.A00(new G0U<HatchFOAAccountLinkScreenKey, Object>() { // from class: com.facebook.aura.ccv.accountlink.HatchFOAAccountLinkEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey) {
                return hatchFOAAccountLinkScreenKey.toString();
            }
        }, new G0U<HatchFOAAccountLinkScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.ccv.accountlink.HatchFOAAccountLinkEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchFOAAccountLinkScreenKey hatchFOAAccountLinkScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(HatchFOAAccountLinkScreenKey.class));
    }
}
