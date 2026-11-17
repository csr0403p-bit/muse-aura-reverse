package com.facebook.aura.bloks.asynccomponent;

import X.AbstractC3358CGz;
import X.C5323DgH;
import X.C7727FCd;
import X.CHA;
import X.FBN;
import com.facebook.aura.auth.store.AuraUserSessionStore;

/* loaded from: classes5.dex */
public final class AuraComponentQueryStoreProviderImpl {
    public static final AuraComponentQueryStoreProviderImpl INSTANCE = new AuraComponentQueryStoreProviderImpl();
    public static AuraComponentQueryStoreProvider loggedOutProvider;

    public static final FBN getInstance(C7727FCd c7727FCd) {
        AuraComponentQueryStoreProvider auraComponentQueryStoreProvider;
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            auraComponentQueryStoreProvider = loggedOutProvider;
            if (auraComponentQueryStoreProvider == null) {
                auraComponentQueryStoreProvider = new AuraComponentQueryStoreProvider();
                loggedOutProvider = auraComponentQueryStoreProvider;
            }
        } else {
            AuraComponentQueryStoreProvider auraComponentQueryStoreProvider2 = loggedOutProvider;
            if (auraComponentQueryStoreProvider2 != null) {
                auraComponentQueryStoreProvider2.clearUserData();
            }
            loggedOutProvider = null;
            auraComponentQueryStoreProvider = (AuraComponentQueryStoreProvider) currentUserSession.A03(AuraComponentQueryStoreProvider.class, AuraComponentQueryStoreProviderImpl$getInstance$provider$1.INSTANCE);
            if (auraComponentQueryStoreProvider == null) {
                auraComponentQueryStoreProvider = new AuraComponentQueryStoreProvider();
                CHA.A00.put(AuraComponentQueryStoreProvider.class, new C5323DgH(auraComponentQueryStoreProvider));
            }
        }
        return auraComponentQueryStoreProvider.getBloksComponentQueryStore();
    }
}
