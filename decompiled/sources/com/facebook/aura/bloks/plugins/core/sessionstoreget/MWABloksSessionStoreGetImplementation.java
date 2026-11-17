package com.facebook.aura.bloks.plugins.core.sessionstoreget;

import X.F6D;
import X.Hj6;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.bloks.session.AuraBloksLocalSessionStore;

/* loaded from: classes5.dex */
public final class MWABloksSessionStoreGetImplementation {
    public static final MWABloksSessionStoreGetImplementation INSTANCE = new MWABloksSessionStoreGetImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        return AuraBloksLocalSessionStore.Companion.getInstance(AuraUserSessionStore.INSTANCE.getCurrentUserSession()).map;
    }
}
