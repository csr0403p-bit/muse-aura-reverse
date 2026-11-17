package com.facebook.aura.navigation.entries;

import X.AGH;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.ModalFlowSceneStrategy;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final SettingsEntryProvider INSTANCE = new SettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final LinkedHashMap linkedHashMapA02 = AGH.A02(C3cG.A0o(c5rn), ModalFlowSceneStrategy.Companion.modalFlow());
        G0W<HatchSettingsPushScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$SettingsEntryProviderKt.f181lambda$1939638829;
        c5rn.A00(new G0U<HatchSettingsPushScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchSettingsPushScreenKey hatchSettingsPushScreenKey) {
                return hatchSettingsPushScreenKey.toString();
            }
        }, new G0U<HatchSettingsPushScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchSettingsPushScreenKey hatchSettingsPushScreenKey) {
                return linkedHashMapA02;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchSettingsPushScreenKey hatchSettingsPushScreenKey) {
                return linkedHashMapA02;
            }
        }, g0w, C3cG.A0x(HatchSettingsPushScreenKey.class));
    }
}
