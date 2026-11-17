package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.DevicePermissionsSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class DevicePermissionsSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final DevicePermissionsSettingsEntryProvider INSTANCE = new DevicePermissionsSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<DevicePermissionsSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$DevicePermissionsSettingsEntryProviderKt.lambda$783097463;
        c5rn.A00(new G0U<DevicePermissionsSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.DevicePermissionsSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey) {
                return devicePermissionsSettingsScreenKey.toString();
            }
        }, new G0U<DevicePermissionsSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.DevicePermissionsSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(DevicePermissionsSettingsScreenKey.class));
    }
}
