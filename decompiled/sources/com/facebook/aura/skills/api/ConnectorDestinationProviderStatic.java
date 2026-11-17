package com.facebook.aura.skills.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.email.EmailConnectorDestinationProvider;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public class ConnectorDestinationProviderStatic {
    public static AuraNavKey destination(int i, AbstractC3358CGz abstractC3358CGz, String str) {
        if (i == 0) {
            return EmailConnectorDestinationProvider.INSTANCE.destination(abstractC3358CGz, str);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
