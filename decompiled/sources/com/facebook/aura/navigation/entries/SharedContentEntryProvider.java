package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.SharedContentScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SharedContentEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final SharedContentEntryProvider INSTANCE = new SharedContentEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<SharedContentScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$SharedContentEntryProviderKt.lambda$66782682;
        c5rn.A00(new G0U<SharedContentScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SharedContentEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(SharedContentScreenKey sharedContentScreenKey) {
                return sharedContentScreenKey.toString();
            }
        }, new G0U<SharedContentScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SharedContentEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SharedContentScreenKey sharedContentScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SharedContentScreenKey sharedContentScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(SharedContentScreenKey.class));
    }
}
