package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.WhatsAppSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class WhatsAppSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final WhatsAppSettingsEntryProvider INSTANCE = new WhatsAppSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<WhatsAppSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$WhatsAppSettingsEntryProviderKt.f197lambda$1363167099;
        c5rn.A00(new G0U<WhatsAppSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.WhatsAppSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey) {
                return whatsAppSettingsScreenKey.toString();
            }
        }, new G0U<WhatsAppSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.WhatsAppSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(WhatsAppSettingsScreenKey.class));
    }
}
