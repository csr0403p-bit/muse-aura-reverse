package com.facebook.aura.ccv.relay;

import X.AnonymousClass001;
import X.C10533Hqc;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hxb;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class HatchCcvPresentationScope {
    public static final int $stable = 0;
    public static final String TAG = "HatchCcvPresentationScope";
    public static Presentation current;
    public static final HatchCcvPresentationScope INSTANCE = new HatchCcvPresentationScope();
    public static final Object lock = C3cG.A0T();

    public final class Presentation {
        public static final int $stable = 8;
        public final CoroutineExceptionHandler exceptionHandler;
        public final Object lock = C3cG.A0T();
        public boolean released;
        public final C3UX scope;

        public final HoC launch(G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v) {
            C10533Hqc c10533HqcA11;
            C7384Etj.A0Y(g0v, 0);
            synchronized (this.lock) {
                c10533HqcA11 = this.released ? null : AnonymousClass001.A11(g0v, this.scope);
            }
            return c10533HqcA11;
        }

        public final void runIfActive(Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 0);
            synchronized (this.lock) {
                if (!this.released) {
                    function0.invoke();
                }
            }
        }

        public final boolean isActive() {
            boolean z;
            synchronized (this.lock) {
                z = !this.released;
            }
            return z;
        }

        public final void release$fbandroid_express_aura_java_com_facebook_aura_ccv_relay_relay() {
            boolean z;
            synchronized (this.lock) {
                z = true;
                if (this.released) {
                    z = false;
                } else {
                    this.released = true;
                }
            }
            if (z) {
                Hxb.A03(null, this.scope);
            }
        }

        public Presentation() {
            HatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1 hatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1 = new HatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
            this.exceptionHandler = hatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1;
            this.scope = Hxb.A02(C78W.A02(new C8eO(null), C3cG.A0v()).plus(hatchCcvPresentationScope$Presentation$special$$inlined$CoroutineExceptionHandler$1));
        }
    }

    public final void release(Presentation presentation) {
        C7384Etj.A0Y(presentation, 0);
        synchronized (lock) {
            presentation.release$fbandroid_express_aura_java_com_facebook_aura_ccv_relay_relay();
            if (current == presentation) {
                current = null;
            }
        }
    }

    public final Presentation bind() {
        Presentation presentation;
        synchronized (lock) {
            Presentation presentation2 = current;
            if (presentation2 != null) {
                presentation2.release$fbandroid_express_aura_java_com_facebook_aura_ccv_relay_relay();
            }
            presentation = new Presentation();
            current = presentation;
        }
        return presentation;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.ccv.relay.HatchCcvPresentationScope.Presentation current() {
        /*
            r3 = this;
            java.lang.Object r3 = com.facebook.aura.ccv.relay.HatchCcvPresentationScope.lock
            monitor-enter(r3)
            com.facebook.aura.ccv.relay.HatchCcvPresentationScope$Presentation r2 = com.facebook.aura.ccv.relay.HatchCcvPresentationScope.current     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r2 == 0) goto Lf
            boolean r0 = r2.isActive()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            monitor-exit(r3)
            return r2
        L12:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.relay.HatchCcvPresentationScope.current():com.facebook.aura.ccv.relay.HatchCcvPresentationScope$Presentation");
    }
}
