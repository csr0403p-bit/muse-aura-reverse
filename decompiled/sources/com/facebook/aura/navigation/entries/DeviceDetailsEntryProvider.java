package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.DeviceDetailsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class DeviceDetailsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final DeviceDetailsEntryProvider INSTANCE = new DeviceDetailsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<DeviceDetailsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$DeviceDetailsEntryProviderKt.lambda$12780946;
        c5rn.A00(new G0U<DeviceDetailsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.DeviceDetailsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(DeviceDetailsScreenKey deviceDetailsScreenKey) {
                return deviceDetailsScreenKey.toString();
            }
        }, new G0U<DeviceDetailsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.DeviceDetailsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(DeviceDetailsScreenKey deviceDetailsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(DeviceDetailsScreenKey deviceDetailsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(DeviceDetailsScreenKey.class));
    }
}
