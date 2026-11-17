package com.facebook.aura.skills.api;

import X.AnonymousClass005;
import com.facebook.aura.messenger.skills.read.view.MessengerReconnectDestinationProvider;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public class ConnectorReconnectDestinationProviderStatic {
    public static AuraNavKey destination(int i, String str, String str2) {
        if (i == 0) {
            return MessengerReconnectDestinationProvider.INSTANCE.destination(str, str2);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
