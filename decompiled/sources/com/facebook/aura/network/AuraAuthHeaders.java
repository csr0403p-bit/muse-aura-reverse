package com.facebook.aura.network;

import X.AbstractC3358CGz;
import X.C7BY;
import X.CH0;
import X.FGI;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.gateway.VmAuthTokenKt;

/* loaded from: classes3.dex */
public final class AuraAuthHeaders {
    public static final AuraAuthHeaders INSTANCE = new AuraAuthHeaders();

    public final String currentMetaBearer() {
        String str;
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null || (str = CH0.A01((CH0) currentUserSession).A04) == null) {
            str = "";
        }
        if (C7BY.A0j(str)) {
            return null;
        }
        return FGI.A0M("Bearer ", str);
    }

    public final String currentUserIdForCache() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession != null) {
            return ((CH0) currentUserSession).A01;
        }
        return null;
    }

    public final String currentVmBearer() {
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        String strVmBoundAuthToken = currentUserSession != null ? VmAuthTokenKt.vmBoundAuthToken(currentUserSession) : "";
        if (C7BY.A0j(strVmBoundAuthToken)) {
            return null;
        }
        return FGI.A0M("Bearer ", strVmBoundAuthToken);
    }
}
