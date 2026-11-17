package com.facebook.aura.skills.api;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.messenger.skills.read.view.MessengerReconnectDestinationProvider;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public final class ConnectorReconnectDestinations {
    public static final int $stable = 0;
    public static final ConnectorReconnectDestinations INSTANCE = new ConnectorReconnectDestinations();

    public final AuraNavKey find(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        AuraNavKey auraNavKeyDestination = MessengerReconnectDestinationProvider.INSTANCE.destination(str, str2);
        if (auraNavKeyDestination == null) {
            return null;
        }
        return auraNavKeyDestination;
    }
}
