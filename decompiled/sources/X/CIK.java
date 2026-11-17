package X;

import com.facebook.perf.background.BackgroundStartupDetector;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class CIK {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.perf.background.BackgroundStartupDetector A02(android.app.Application r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            com.facebook.perf.background.BackgroundStartupDetector r0 = com.facebook.perf.background.BackgroundStartupDetector.backgroundStartupDetector
            if (r0 == 0) goto Lb
            com.facebook.perf.background.BackgroundStartupDetector r3 = com.facebook.perf.background.BackgroundStartupDetector.backgroundStartupDetector
            return r3
        Lb:
            com.facebook.perf.background.BackgroundStartupDetector.skipManualActivityOnCreate = r8
            android.os.Looper r2 = r4.getMainLooper()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L1a
            r0 = 2
            if (r6 != 0) goto L1b
        L1a:
            r0 = 1
        L1b:
            X.C7384Etj.A0X(r2)
            com.facebook.perf.background.BackgroundStartupDetector r3 = new com.facebook.perf.background.BackgroundStartupDetector
            r3.<init>(r2, r0, r7)
            com.facebook.perf.background.BackgroundStartupDetector.backgroundStartupDetector = r3
            com.facebook.perf.background.BackgroundStartupDetector$activityLifecycleCallbacks$1 r0 = r3.activityLifecycleCallbacks
            r4.registerActivityLifecycleCallbacks(r0)
            X.BXv r1 = X.BXv.A00()
            X.C7384Etj.A0U(r1)
            X.BXu r0 = X.BXu.A01
            X.BXu r1 = r1.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            java.lang.String r0 = "BackgroundStartupDetector"
        L3d:
            com.facebook.perf.background.BackgroundStartupDetector.tag = r0
            if (r9 == 0) goto L54
            r0 = 1
            com.facebook.perf.background.BackgroundStartupDetector.deferredColdStartQueueDrainPost = r0
            com.facebook.perf.background.BackgroundStartupDetector.deferredColdStartQueueDrainIdleHandlerStrategy = r5
            return r3
        L47:
            if (r1 == 0) goto L52
            java.lang.String r1 = r1.A00
        L4b:
            java.lang.String r0 = "BackgroundStartupDetector/"
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            goto L3d
        L52:
            r1 = 0
            goto L4b
        L54:
            A00(r3, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CIK.A02(android.app.Application, boolean, boolean, boolean, boolean, boolean):com.facebook.perf.background.BackgroundStartupDetector");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.CIP r3) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            java.lang.Class<com.facebook.perf.background.BackgroundStartupDetector> r1 = com.facebook.perf.background.BackgroundStartupDetector.class
            monitor-enter(r1)
            int r2 = com.facebook.perf.background.BackgroundStartupDetector._coldStartMode     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L10
            java.util.ArrayList<X.CIP> r0 = com.facebook.perf.background.BackgroundStartupDetector.getColdStartModeCallbacks     // Catch: java.lang.Throwable -> L1f
            r0.add(r3)     // Catch: java.lang.Throwable -> L1f
        L10:
            monitor-exit(r1)
            if (r2 == 0) goto L1e
            r0 = 3
            if (r2 == r0) goto L1a
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L1b
        L1a:
            r0 = 1
        L1b:
            r3.onColdStartMode(r2, r0)
        L1e:
            return
        L1f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CIK.A04(X.CIP):void");
    }

    public static final void A00(BackgroundStartupDetector backgroundStartupDetector, boolean z) {
        if (z) {
            backgroundStartupDetector.handler.getLooper().getQueue().addIdleHandler(new CIO(backgroundStartupDetector));
        } else {
            backgroundStartupDetector.handler.sendEmptyMessage(BackgroundStartupDetector.COLDSTART_QUEUE_DRAINED);
        }
    }

    public static final void A01(boolean z) {
        Boolean bool = BackgroundStartupDetector.isBackgroundState;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf.equals(bool)) {
            return;
        }
        CFK.A0H(BackgroundStartupDetector.tag, "bgMode=%s reason=%s", z ? "BACKGROUND" : "FOREGROUND", BackgroundStartupDetector.backgroundStateReason);
        BackgroundStartupDetector.isBackgroundState = boolValueOf;
        Iterator itA0N = C7384Etj.A0N(BackgroundStartupDetector.listeners);
        while (itA0N.hasNext()) {
            itA0N.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = "coldStartMode="
            java.lang.String r0 = X.FGI.A0H(r0, r4)
            X.AbstractC3191C2p.A00(r0)
            java.lang.Class<com.facebook.perf.background.BackgroundStartupDetector> r3 = com.facebook.perf.background.BackgroundStartupDetector.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L7b
            com.facebook.perf.background.BackgroundStartupDetector._coldStartMode = r4     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = com.facebook.perf.background.BackgroundStartupDetector.tag     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "coldStartMode=%s"
            r0 = 1
            if (r4 == r0) goto L21
            r0 = 2
            if (r4 == r0) goto L1e
            r0 = 3
            if (r4 == r0) goto L24
            java.lang.String r0 = "PROBABLY_FOREGROUND"
            goto L26
        L1e:
            java.lang.String r0 = "PROBABLY_BACKGROUND"
            goto L26
        L21:
            java.lang.String r0 = "DEFINITELY_BACKGROUND"
            goto L26
        L24:
            java.lang.String r0 = "DEFINITELY_FOREGROUND"
        L26:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L78
            X.CFK.A0H(r2, r1, r0)     // Catch: java.lang.Throwable -> L78
            java.util.ArrayList<X.CIP> r1 = com.facebook.perf.background.BackgroundStartupDetector.getColdStartModeCallbacks     // Catch: java.lang.Throwable -> L78
            java.util.ArrayList r0 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L78
            com.facebook.perf.background.BackgroundStartupDetector.getColdStartModeCallbacks = r0     // Catch: java.lang.Throwable -> L78
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L57
            java.util.Iterator r3 = X.C7384Etj.A0N(r1)     // Catch: java.lang.Throwable -> L7b
        L3c:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L57
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L7b
            X.C7384Etj.A0U(r2)     // Catch: java.lang.Throwable -> L7b
            X.CIP r2 = (X.CIP) r2     // Catch: java.lang.Throwable -> L7b
            r0 = 3
            if (r4 == r0) goto L52
            r1 = 4
            r0 = 0
            if (r4 != r1) goto L53
        L52:
            r0 = 1
        L53:
            r2.onColdStartMode(r4, r0)     // Catch: java.lang.Throwable -> L7b
            goto L3c
        L57:
            X.CIQ r0 = com.facebook.perf.background.BackgroundStartupDetector.reliabilityListener     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L5e
            r0.ASH()     // Catch: java.lang.Throwable -> L7b
        L5e:
            java.util.concurrent.CopyOnWriteArraySet<X.CIQ> r0 = com.facebook.perf.background.BackgroundStartupDetector.listeners     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = X.C7384Etj.A0N(r0)     // Catch: java.lang.Throwable -> L7b
        L64:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L7b
            X.CIQ r0 = (X.CIQ) r0     // Catch: java.lang.Throwable -> L7b
            r0.ASH()     // Catch: java.lang.Throwable -> L7b
            goto L64
        L74:
            android.os.Trace.endSection()
            return
        L78:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CIK.A03(int):void");
    }
}
