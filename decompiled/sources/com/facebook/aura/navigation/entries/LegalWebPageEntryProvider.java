package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.LegalWebPageOverlayKey;
import com.facebook.aura.navigation.key.LegalWebPageScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LegalWebPageEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final LegalWebPageEntryProvider INSTANCE = new LegalWebPageEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<LegalWebPageScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$LegalWebPageEntryProviderKt.f141lambda$606222972;
        c5rn.A00(new G0U<LegalWebPageScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LegalWebPageEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LegalWebPageScreenKey legalWebPageScreenKey) {
                return legalWebPageScreenKey.toString();
            }
        }, new G0U<LegalWebPageScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LegalWebPageEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LegalWebPageScreenKey legalWebPageScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LegalWebPageScreenKey legalWebPageScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(LegalWebPageScreenKey.class));
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(Integer.MAX_VALUE);
        G0W<LegalWebPageOverlayKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$LegalWebPageEntryProviderKt.f142lambda$96501337;
        c5rn.A00(new G0U<LegalWebPageOverlayKey, Object>() { // from class: com.facebook.aura.navigation.entries.LegalWebPageEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(LegalWebPageOverlayKey legalWebPageOverlayKey) {
                return legalWebPageOverlayKey.toString();
            }
        }, new G0U<LegalWebPageOverlayKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LegalWebPageEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LegalWebPageOverlayKey legalWebPageOverlayKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LegalWebPageOverlayKey legalWebPageOverlayKey) {
                return mapOverlay;
            }
        }, g0w2, C3cG.A0x(LegalWebPageOverlayKey.class));
    }
}
