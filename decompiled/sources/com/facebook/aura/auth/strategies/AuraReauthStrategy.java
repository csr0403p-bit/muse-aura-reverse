package com.facebook.aura.auth.strategies;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C3357CGy;
import X.InterfaceC3355CGq;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;

/* loaded from: classes5.dex */
public final class AuraReauthStrategy {
    public void performSoftSignOutRequest(AbstractC3358CGz abstractC3358CGz, InterfaceC3355CGq interfaceC3355CGq) {
        AnonymousClass003.A0u(abstractC3358CGz, interfaceC3355CGq);
        interfaceC3355CGq.ARt(C3357CGy.A0y(AuraMetaFRLSecureTokenStore.INSTANCE, abstractC3358CGz));
    }
}
