package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.DataPrivacySettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class DataPrivacySettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final DataPrivacySettingsEntryProvider INSTANCE = new DataPrivacySettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<DataPrivacySettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$DataPrivacySettingsEntryProviderKt.lambda$362538983;
        c5rn.A00(new G0U<DataPrivacySettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.DataPrivacySettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(DataPrivacySettingsScreenKey dataPrivacySettingsScreenKey) {
                return dataPrivacySettingsScreenKey.toString();
            }
        }, new G0U<DataPrivacySettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.DataPrivacySettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(DataPrivacySettingsScreenKey dataPrivacySettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(DataPrivacySettingsScreenKey dataPrivacySettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(DataPrivacySettingsScreenKey.class));
    }
}
