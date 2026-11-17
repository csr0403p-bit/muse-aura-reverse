package com.facebook.aura.composer.dictation;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.C8j3;
import X.InterfaceC7549F2g;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class VmFallbackWindow implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final long WINDOW_MS = 300000;
    public volatile long untilMs;

    public final class Companion {
        public final VmFallbackWindow get(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VmFallbackWindow) abstractC3358CGz.A03(VmFallbackWindow.class, VmFallbackWindow$Companion$get$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.untilMs = 0L;
    }

    public final boolean isActive() {
        return C8j3.A1R((SystemClock.elapsedRealtime() > this.untilMs ? 1 : (SystemClock.elapsedRealtime() == this.untilMs ? 0 : -1)));
    }

    public final void restart() {
        this.untilMs = SystemClock.elapsedRealtime() + 300000;
    }
}
