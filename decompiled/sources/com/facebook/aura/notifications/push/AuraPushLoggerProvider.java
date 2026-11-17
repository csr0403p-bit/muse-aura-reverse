package com.facebook.aura.notifications.push;

import X.AnonymousClass003;
import X.C3cH;
import X.C7384Etj;
import X.C7526EzK;
import X.C8ee;
import X.Eu1;

/* loaded from: classes5.dex */
public final class AuraPushLoggerProvider {
    public static final AuraPushLoggerProvider INSTANCE = new AuraPushLoggerProvider();
    public static final AuraPushLoggerProvider$sessionAwareLogger$1 sessionAwareLogger = new C8ee<C7526EzK>() { // from class: com.facebook.aura.notifications.push.AuraPushLoggerProvider$sessionAwareLogger$1
        @Override // X.C8ee
        public Eu1<?> acquireEvent(String str) {
            C7384Etj.A0Y(str, 0);
            Eu1<?> eu1AcquireEvent = C3cH.A0I().acquireEvent(str);
            C7384Etj.A0U(eu1AcquireEvent);
            return eu1AcquireEvent;
        }

        @Override // X.C8ee
        public Eu1<?> acquireEvent(String str, C7526EzK c7526EzK) {
            AnonymousClass003.A0u(str, c7526EzK);
            Eu1<?> eu1AcquireEvent = C3cH.A0I().acquireEvent(str, c7526EzK);
            C7384Etj.A0U(eu1AcquireEvent);
            return eu1AcquireEvent;
        }
    };

    public final C8ee<C7526EzK> getLogger() {
        return sessionAwareLogger;
    }
}
