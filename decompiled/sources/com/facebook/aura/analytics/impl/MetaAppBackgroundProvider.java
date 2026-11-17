package com.facebook.aura.analytics.impl;

import X.AbstractC3136BzG;
import X.InterfaceC4081ClT;
import android.os.Trace;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* loaded from: classes5.dex */
public final class MetaAppBackgroundProvider {
    public final InterfaceC4081ClT instance;

    public final InterfaceC4081ClT getInstance() {
        return this.instance;
    }

    public MetaAppBackgroundProvider() {
        AbstractC3136BzG.A00("MetaAppBackgroundProvider");
        try {
            MetaAppBackgroundProvider$instance$1$1 metaAppBackgroundProvider$instance$1$1 = new InterfaceC4081ClT() { // from class: com.facebook.aura.analytics.impl.MetaAppBackgroundProvider$instance$1$1
                public final boolean get() {
                    return !AuraAppLifecycleManager.INSTANCE.isAppInForeground();
                }
            };
            Trace.endSection();
            this.instance = metaAppBackgroundProvider$instance$1$1;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
