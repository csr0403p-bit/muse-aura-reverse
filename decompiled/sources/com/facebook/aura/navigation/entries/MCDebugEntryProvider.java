package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AuraMCDebugScreenKey;
import com.facebook.aura.navigation.key.AuraOverlayConfigDebugScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class MCDebugEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final MCDebugEntryProvider INSTANCE = new MCDebugEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<AuraMCDebugScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$MCDebugEntryProviderKt.f150lambda$1212729344;
        c5rn.A00(new G0U<AuraMCDebugScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.MCDebugEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AuraMCDebugScreenKey auraMCDebugScreenKey) {
                return auraMCDebugScreenKey.toString();
            }
        }, new G0U<AuraMCDebugScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.MCDebugEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraMCDebugScreenKey auraMCDebugScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraMCDebugScreenKey auraMCDebugScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(AuraMCDebugScreenKey.class));
        G0W<AuraOverlayConfigDebugScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$MCDebugEntryProviderKt.lambda$1149678249;
        c5rn.A00(new G0U<AuraOverlayConfigDebugScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.MCDebugEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(AuraOverlayConfigDebugScreenKey auraOverlayConfigDebugScreenKey) {
                return auraOverlayConfigDebugScreenKey.toString();
            }
        }, new G0U<AuraOverlayConfigDebugScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.MCDebugEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraOverlayConfigDebugScreenKey auraOverlayConfigDebugScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraOverlayConfigDebugScreenKey auraOverlayConfigDebugScreenKey) {
                return mapA0o;
            }
        }, g0w2, C3cG.A0x(AuraOverlayConfigDebugScreenKey.class));
    }
}
