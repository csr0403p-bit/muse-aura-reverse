package com.facebook.aura.bloks.plugins.core.logginglogevent;

import X.AnonymousClass003;
import X.C3cG;
import X.F6D;
import X.Hj6;
import com.facebook.aura.bloks.extensions.logging.AuraBloksLogging;

/* loaded from: classes5.dex */
public final class MWABloksLoggingLogEventImplementation {
    public static final MWABloksLoggingLogEventImplementation INSTANCE = new MWABloksLoggingLogEventImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraBloksLogging.log(f6d, hj6);
        return C3cG.A0T();
    }
}
