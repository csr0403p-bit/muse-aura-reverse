package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ActivationInfoSheetKey;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ActivationEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ActivationEntryProvider INSTANCE = new ActivationEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<ActivationInfoSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$ActivationEntryProviderKt.f85lambda$158314165;
        c5rn.A00(new G0U<ActivationInfoSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ActivationEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ActivationInfoSheetKey activationInfoSheetKey) {
                return activationInfoSheetKey.toString();
            }
        }, new G0U<ActivationInfoSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ActivationEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationInfoSheetKey activationInfoSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationInfoSheetKey activationInfoSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(ActivationInfoSheetKey.class));
        final Map<String, Object> map = ActivationEntryProviderKt.activationTransitionMetadata;
        G0W<ActivationScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ActivationEntryProviderKt.lambda$1697706257;
        c5rn.A00(new G0U<ActivationScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ActivationEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ActivationScreenKey activationScreenKey) {
                return activationScreenKey.toString();
            }
        }, new G0U<ActivationScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ActivationEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationScreenKey activationScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationScreenKey activationScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(ActivationScreenKey.class));
    }
}
