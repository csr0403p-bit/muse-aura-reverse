package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.LegalSafetySettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class LegalSafetySettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final LegalSafetySettingsEntryProvider INSTANCE = new LegalSafetySettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<LegalSafetySettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$LegalSafetySettingsEntryProviderKt.lambda$282677876;
        c5rn.A00(new G0U<LegalSafetySettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LegalSafetySettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LegalSafetySettingsScreenKey legalSafetySettingsScreenKey) {
                return legalSafetySettingsScreenKey.toString();
            }
        }, new G0U<LegalSafetySettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LegalSafetySettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LegalSafetySettingsScreenKey legalSafetySettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LegalSafetySettingsScreenKey legalSafetySettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(LegalSafetySettingsScreenKey.class));
    }
}
