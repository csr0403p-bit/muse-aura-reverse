package com.meta.maps.fancypins;

import X.C3cG;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinPresentationEpoch {
    public final Object lock = C3cG.A0T();
    public boolean valid = true;
    public long value;

    public final void advance(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        synchronized (this.lock) {
            if (this.value == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                throw C3cG.A0Q("FancyPin presentation epoch overflow");
            }
            function0.invoke();
            this.value++;
            this.valid = true;
        }
    }

    public final <T> T capture(G0U<? super Long, ? extends T> g0u) {
        T t;
        C7384Etj.A0Y(g0u, 0);
        synchronized (this.lock) {
            t = (T) G0U.A00(g0u, this.value);
        }
        return t;
    }

    private final void increment() {
        long j = this.value;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("FancyPin presentation epoch overflow");
        }
        this.value = j + 1;
    }

    public final void invalidate() {
        synchronized (this.lock) {
            increment();
            this.valid = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCurrent(long r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.lock
            monitor-enter(r4)
            boolean r0 = r5.valid     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Le
            long r2 = r5.value     // Catch: java.lang.Throwable -> L11
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r4)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinPresentationEpoch.isCurrent(long):boolean");
    }
}
