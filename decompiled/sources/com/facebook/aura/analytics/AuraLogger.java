package com.facebook.aura.analytics;

import X.AbstractC3136BzG;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.BV4;
import X.C3350CFz;
import X.C60O;
import X.C7526EzK;
import X.C8ee;
import X.CGw;
import X.F0C;
import android.os.Trace;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class AuraLogger {
    public static C8ee<C7526EzK> singletonInstanceBackingField;
    public static final AuraLogger INSTANCE = new AuraLogger();
    public static final AtomicBoolean instanceInitialized = C60O.A1E();
    public static final F0C deviceInstance$delegate = AbstractC5321DgF.A03(AuraLogger$deviceInstance$2.INSTANCE);

    public final C8ee<C7526EzK> getDeviceInstance() {
        return (C8ee) deviceInstance$delegate.getValue();
    }

    public final C8ee<C7526EzK> getInstance() {
        C8ee<C7526EzK> c3350CFz;
        AuraLoggerHolder auraLoggerHolder;
        AbstractC3358CGz abstractC3358CGzA00 = ((CGw) AuraUserSessionStore.instance$delegate.getValue()).A00();
        if ((abstractC3358CGzA00 == null || (auraLoggerHolder = (AuraLoggerHolder) abstractC3358CGzA00.A03(AuraLoggerHolder.class, AuraLogger$instance$logger$1.INSTANCE)) == null || (c3350CFz = auraLoggerHolder.logger) == null) && (c3350CFz = singletonInstanceBackingField) == null) {
            AbstractC3136BzG.A00("AuraLogger");
            try {
                c3350CFz = new C3350CFz(BV4.A0C());
                Trace.endSection();
                singletonInstanceBackingField = c3350CFz;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        instanceInitialized.set(true);
        return c3350CFz;
    }

    public final boolean isInitialized() {
        return instanceInitialized.get();
    }
}
