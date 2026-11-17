package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.NotificationsSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NotificationsSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final NotificationsSettingsEntryProvider INSTANCE = new NotificationsSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<NotificationsSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$NotificationsSettingsEntryProviderKt.lambda$334514257;
        c5rn.A00(new G0U<NotificationsSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NotificationsSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(NotificationsSettingsScreenKey notificationsSettingsScreenKey) {
                return notificationsSettingsScreenKey.toString();
            }
        }, new G0U<NotificationsSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NotificationsSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NotificationsSettingsScreenKey notificationsSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NotificationsSettingsScreenKey notificationsSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(NotificationsSettingsScreenKey.class));
    }
}
