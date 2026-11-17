package com.facebook.aura.skills.api;

import X.AbstractC3358CGz;
import X.AnonymousClass004;
import X.AnonymousClass005;
import com.facebook.aura.email.EmailConnectorDestinationProvider;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class ConnectorDestinations {
    public static final int $stable = 0;
    public static final ConnectorDestinations INSTANCE = new ConnectorDestinations();

    public final AuraNavKey find(AbstractC3358CGz abstractC3358CGz, String str) {
        int iA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        int i = new int[]{iA1b}[iA1b];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        AuraNavKey auraNavKeyDestination = EmailConnectorDestinationProvider.INSTANCE.destination(abstractC3358CGz, str);
        if (auraNavKeyDestination == null) {
            return null;
        }
        return auraNavKeyDestination;
    }
}
