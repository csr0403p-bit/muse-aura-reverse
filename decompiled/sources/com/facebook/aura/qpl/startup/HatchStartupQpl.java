package com.facebook.aura.qpl.startup;

import X.AnonymousClass004;
import X.C06H;
import X.C3412CLd;
import X.C7384Etj;
import X.CLc;
import X.DAV;
import X.DAe;
import X.DI4;
import X.DI9;
import X.DKO;
import X.DKP;
import X.DKW;
import X.G0V;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchStartupQpl {
    public static final int $stable = 8;
    public static final int STARTUP_MARKER_ID = 0;
    public static volatile QuickPerformanceLogger realQpl;
    public volatile LightweightQuickPerformanceLogger active;
    public final CopyOnWriteArrayList<G0V<String, String, Unit>> pointListeners;
    public final DAV startupMarker;
    public static final Companion Companion = new Companion();
    public static final int STARTUP_EVENT_ID = 734857510;
    public static final HatchStartupQpl startupQpl = new HatchStartupQpl(new DKP());

    public final class Companion {
        private final void logQplCall(String str, String str2, String str3, int i) {
        }

        private final int markerIdFor(int i) {
            if (i == 2) {
                return 734861351;
            }
            if (i != 3) {
                return HatchStartupQpl.STARTUP_EVENT_ID;
            }
            return 734859171;
        }

        private final boolean usesRealQpl(int i) {
            return i == 2 || i == 3;
        }

        public final void markerAnnotate(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            if (str2 != null) {
                HatchStartupQpl hatchStartupQpl = HatchStartupQpl.startupQpl;
                hatchStartupQpl.startupMarker.AQF(str, str2);
                int i = DAe.A0A.A04;
                if (!usesRealQpl(i)) {
                    hatchStartupQpl.active.markerAnnotate(HatchStartupQpl.STARTUP_EVENT_ID, 0, str, str2);
                    return;
                }
                QuickPerformanceLogger quickPerformanceLogger = HatchStartupQpl.realQpl;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerAnnotate(markerIdFor(i), 0, str, str2);
                }
            }
        }

        public final void markerPoint(String str) {
            C7384Etj.A0Y(str, 0);
            HatchStartupQpl hatchStartupQpl = HatchStartupQpl.startupQpl;
            hatchStartupQpl.startupMarker.markerPoint(str);
            int i = DAe.A0A.A04;
            if (usesRealQpl(i)) {
                QuickPerformanceLogger quickPerformanceLogger = HatchStartupQpl.realQpl;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(markerIdFor(i), 0, str);
                }
            } else {
                hatchStartupQpl.active.markerPoint(HatchStartupQpl.STARTUP_EVENT_ID, 0, str);
            }
            Iterator<G0V<String, String, Unit>> it = hatchStartupQpl.pointListeners.iterator();
            while (it.hasNext()) {
                it.next().invoke(str, null);
            }
        }

        public final void markerPointAtTimestamp(String str, long j) {
            C7384Etj.A0Y(str, 0);
            HatchStartupQpl hatchStartupQpl = HatchStartupQpl.startupQpl;
            CLc cLc = ((C3412CLd) hatchStartupQpl.startupMarker).A00.get();
            if (cLc != null) {
                cLc.A01.markerPoint(cLc.A00, str, j, TimeUnit.MILLISECONDS);
            }
            hatchStartupQpl.active.markerPoint(HatchStartupQpl.STARTUP_EVENT_ID, 0, str, j, TimeUnit.MILLISECONDS);
            Iterator<G0V<String, String, Unit>> it = hatchStartupQpl.pointListeners.iterator();
            while (it.hasNext()) {
                it.next().invoke(str, null);
            }
        }

        public static /* synthetic */ void markerPointsForAttachBaseContext$default(Companion companion, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
            if ((i & 8) != 0) {
                j4 = -1;
            }
            if ((i & 16) != 0) {
                j5 = -1;
            }
            companion.markerPointsForAttachBaseContext(j, j2, j3, j4, j5);
        }

        public final QuickPerformanceLogger getRealQpl$fbandroid_express_aura_java_com_facebook_aura_qpl_startup_startup() {
            return HatchStartupQpl.realQpl;
        }

        public final int getSTARTUP_EVENT_ID() {
            return HatchStartupQpl.STARTUP_EVENT_ID;
        }

        public final HatchStartupQpl getStartupQpl() {
            return HatchStartupQpl.startupQpl;
        }

        public final void markerPointsForAttachBaseContext(long j, long j2, long j3, long j4, long j5) {
            markerPointAtTimestamp("os_load_start", j);
            markerPointAtTimestamp("os_load_end", j2);
            markerPointAtTimestamp("abc_start", j2);
            markerPointAtTimestamp("abc_end", j3);
            if (j4 == -1 || j5 == -1) {
                return;
            }
            markerPointAtTimestamp("exo_start", j4);
            markerPointAtTimestamp("exo_end", j5);
        }

        public final void markerStart(long j) {
            HatchStartupQpl.startupQpl.active.markerStart(HatchStartupQpl.STARTUP_EVENT_ID, 0, j, TimeUnit.MILLISECONDS);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public final void setRealQpl$fbandroid_express_aura_java_com_facebook_aura_qpl_startup_startup(QuickPerformanceLogger quickPerformanceLogger) {
            HatchStartupQpl.realQpl = quickPerformanceLogger;
        }

        public Companion() {
        }

        public final void markerAnnotate(String str, int i) {
            C7384Etj.A0Y(str, 0);
            HatchStartupQpl hatchStartupQpl = HatchStartupQpl.startupQpl;
            hatchStartupQpl.startupMarker.AQD(str, i);
            int i2 = DAe.A0A.A04;
            if (usesRealQpl(i2)) {
                QuickPerformanceLogger quickPerformanceLogger = HatchStartupQpl.realQpl;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerAnnotate(markerIdFor(i2), 0, str, i);
                    return;
                }
                return;
            }
            hatchStartupQpl.active.markerAnnotate(HatchStartupQpl.STARTUP_EVENT_ID, 0, str, i);
        }

        public final void markerPoint(String str, String str2) {
            boolean zA1b = AnonymousClass004.A1b(str, str2);
            HatchStartupQpl hatchStartupQpl = HatchStartupQpl.startupQpl;
            CLc cLc = ((C3412CLd) hatchStartupQpl.startupMarker).A00.get();
            if (cLc != null) {
                cLc.A01.markerPoint(cLc.A00, str, str2);
            }
            int i = DAe.A0A.A04;
            if (usesRealQpl(i)) {
                QuickPerformanceLogger quickPerformanceLogger = HatchStartupQpl.realQpl;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(markerIdFor(i), zA1b ? 1 : 0, str, str2);
                }
            } else {
                hatchStartupQpl.active.markerPoint(HatchStartupQpl.STARTUP_EVENT_ID, zA1b ? 1 : 0, str, str2);
            }
            Iterator<G0V<String, String, Unit>> it = hatchStartupQpl.pointListeners.iterator();
            while (it.hasNext()) {
                it.next().invoke(str, str2);
            }
        }

        public final void markerAnnotate(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            markerAnnotate(str, String.valueOf(z));
        }
    }

    public HatchStartupQpl(DKP dkp) {
        C7384Etj.A0Y(dkp, 0);
        this.startupMarker = new C3412CLd(STARTUP_EVENT_ID);
        this.active = dkp;
        this.pointListeners = new CopyOnWriteArrayList<>();
    }

    public static /* synthetic */ void getActive$annotations() {
    }

    public final void addPointListener(G0V<? super String, ? super String, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        this.pointListeners.add(g0v);
    }

    public final void onQplReady(QuickPerformanceLogger quickPerformanceLogger) {
        DKP dkp;
        Lock lock;
        AtomicReference<DKW> atomicReference;
        ConcurrentLinkedQueue<DI9> concurrentLinkedQueue;
        C7384Etj.A0Y(quickPerformanceLogger, 0);
        realQpl = quickPerformanceLogger;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.active;
        if (!(lightweightQuickPerformanceLogger instanceof DKP) || (dkp = (DKP) lightweightQuickPerformanceLogger) == null) {
            return;
        }
        DKO dko = dkp.A01;
        if (dko != null) {
            while (true) {
                lock = dko.A01;
                lock.lock();
                try {
                    atomicReference = dko.A00;
                    DKW dkw = atomicReference.get();
                    dkw.getClass();
                    if (dkw.A00 != null || (concurrentLinkedQueue = dkw.A01) == null || concurrentLinkedQueue.isEmpty()) {
                        break;
                    }
                    ConcurrentLinkedQueue<DI9> concurrentLinkedQueue2 = new ConcurrentLinkedQueue<>();
                    DKW dkw2 = new DKW();
                    dkw2.A01 = concurrentLinkedQueue2;
                    dkw2.A00 = null;
                    atomicReference.set(dkw2);
                    lock.unlock();
                    Iterator<DI9> it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        DKO.A00(quickPerformanceLogger, it.next());
                    }
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            DKW dkw3 = new DKW();
            dkw3.A01 = null;
            dkw3.A00 = quickPerformanceLogger;
            atomicReference.set(dkw3);
            lock.unlock();
            dkp.A01 = null;
        }
        dkp.A00 = quickPerformanceLogger;
    }

    public final void removePointListener(G0V<? super String, ? super String, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        this.pointListeners.remove(g0v);
    }

    public final void setActive(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C7384Etj.A0Y(lightweightQuickPerformanceLogger, 0);
        this.active = lightweightQuickPerformanceLogger;
    }

    public final LightweightQuickPerformanceLogger getActive() {
        return this.active;
    }

    public final DAV getStartupMarker() {
        return this.startupMarker;
    }

    public final void markStartupCompleted() {
        this.active = new DI4();
    }
}
