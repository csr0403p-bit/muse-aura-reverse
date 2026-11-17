package com.facebook.aura.analytics.accesslibrary;

import X.AbstractC6670EOh;
import X.C3cH;
import X.C5223Ddg;
import X.EOr;
import X.EOs;
import X.Eu1;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;

/* loaded from: classes5.dex */
public final class AuraAccessLibraryLogger extends AbstractC6670EOh {
    @Override // X.AbstractC6670EOh
    public C5223Ddg getQplHelper() {
        return new C5223Ddg(AuraQuickPerformanceLogger.INSTANCE.getInstance());
    }

    @Override // X.AbstractC6670EOh
    public EOs getLogger() {
        Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("fx_access_library");
        EOr eOr = new EOr();
        eOr.A00 = eu1AcquireEvent;
        return eOr;
    }
}
