package X;

import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class C5Y implements C57 {
    public final /* synthetic */ C5W A00;

    public C5Y(C5W c5w) {
        this.A00 = c5w;
    }

    @Override // X.C57
    public final void ATR(final boolean z) {
        try {
            Trace.beginSection(FGI.A0r("GlobalAppState.onForegroundChanged ", z));
            boolean z2 = C5V.A06;
            synchronized (C5V.class) {
                try {
                    if (z != C5V.A06) {
                        C5V.A06 = z;
                        final HashSet hashSetA0x = BV4.A0x(C5V.A02);
                        C5V.A03.execute(new Runnable() { // from class: X.BWe
                            public static final String __redex_internal_original_name = "GlobalAppState$$ExternalSyntheticLambda2";

                            @Override // java.lang.Runnable
                            public final void run() {
                                HashSet hashSet = hashSetA0x;
                                boolean z3 = z;
                                boolean z4 = C5V.A06;
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    BWf bWf = (BWf) it.next();
                                    if (!z3) {
                                        bWf.ARj();
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C5W c5w = this.A00;
            c5w.A04 = z;
            C5Z c5z = c5w.A01;
            boolean z3 = !z;
            synchronized (c5z) {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (c5z.A07) {
                        c5z.A06 = z3;
                        if (z3) {
                            c5z.A00 = SystemClock.elapsedRealtime();
                        } else {
                            c5z.A01 = jUptimeMillis;
                            c5z.A02 = 1L;
                        }
                        c5z.A07 = false;
                    } else {
                        if (c5z.A06) {
                            if (!z3) {
                                long j = c5z.A02;
                                if (j > 0) {
                                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c5z.A00;
                                    if (jElapsedRealtime <= 0) {
                                        c5z.A03++;
                                    }
                                    c5z.A05 += jElapsedRealtime;
                                }
                                c5z.A01 = jUptimeMillis;
                                c5z.A02 = j + 1;
                            }
                        } else if (z3) {
                            c5z.A00 = SystemClock.elapsedRealtime();
                            c5z.A04 += jUptimeMillis - c5z.A01;
                        }
                        c5z.A06 = z3;
                        synchronized (c5z.A08) {
                            try {
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
