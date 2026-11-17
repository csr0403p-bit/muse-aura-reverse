package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C5rn;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectedDevicesScreenKey;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ConnectedDevicesEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConnectedDevicesEntryProvider INSTANCE = new ConnectedDevicesEntryProvider();

    /* renamed from: com.facebook.aura.navigation.entries.ConnectedDevicesEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ConnectedDevicesScreenKey, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ConnectedDevicesScreenKey connectedDevicesScreenKey) {
            return ConnectedDevicesEntryProviderKt.CONNECTED_DEVICES_CONTENT_KEY;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(ConnectedDevicesScreenKey connectedDevicesScreenKey) {
            return ConnectedDevicesEntryProviderKt.CONNECTED_DEVICES_CONTENT_KEY;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        c5rn.A00(AnonymousClass1.INSTANCE, new G0U<ConnectedDevicesScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConnectedDevicesEntryProvider$provideEntry$$inlined$entry$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectedDevicesScreenKey connectedDevicesScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectedDevicesScreenKey connectedDevicesScreenKey) {
                return mapA0o;
            }
        }, ComposableSingletons$ConnectedDevicesEntryProviderKt.lambda$1805623074, C3cG.A0x(ConnectedDevicesScreenKey.class));
    }
}
