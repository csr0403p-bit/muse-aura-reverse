package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.I0p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ChoreographerFrameCallbackC10645I0p implements Choreographer.FrameCallback {
    public final int $t;
    public final Object A00;

    public ChoreographerFrameCallbackC10645I0p(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        FSX fsx;
        switch (this.$t) {
            case 2:
                C8072FSa c8072FSa = (C8072FSa) this.A00;
                if (!c8072FSa.A02 || (fsx = c8072FSa.A01) == null) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                double d = jUptimeMillis - c8072FSa.A00;
                CopyOnWriteArraySet copyOnWriteArraySet = fsx.A04;
                Iterator it = copyOnWriteArraySet.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw BV4.A0a("onBeforeIntegrate");
                }
                Set<FSW> set = fsx.A03;
                for (FSW fsw : set) {
                    boolean zA03 = fsw.A03();
                    if (zA03 && fsw.A04) {
                        set.remove(fsw);
                    } else {
                        double d2 = d / 1000.0d;
                        if (!zA03 || !fsw.A04) {
                            double d3 = fsw.A01 + (d2 <= 0.064d ? d2 : 0.064d);
                            fsw.A01 = d3;
                            C8076FSf c8076FSf = fsw.A02;
                            double d4 = c8076FSf.A01;
                            double d5 = c8076FSf.A00;
                            C8077FSg c8077FSg = fsw.A05;
                            double d6 = c8077FSg.A00;
                            double d7 = c8077FSg.A01;
                            C8077FSg c8077FSg2 = fsw.A07;
                            double d8 = c8077FSg2.A00;
                            double d9 = c8077FSg2.A01;
                            while (d3 >= 0.001d) {
                                d3 -= 0.001d;
                                fsw.A01 = d3;
                                if (d3 < 0.001d) {
                                    C8077FSg c8077FSg3 = fsw.A06;
                                    c8077FSg3.A00 = d6;
                                    c8077FSg3.A01 = d7;
                                }
                                double d10 = fsw.A00;
                                double d11 = ((d10 - d8) * d4) - (d5 * d7);
                                double d12 = d7 + (d11 * 0.001d * 0.5d);
                                double d13 = ((d10 - (((d7 * 0.001d) * 0.5d) + d6)) * d4) - (d5 * d12);
                                double d14 = d7 + (d13 * 0.001d * 0.5d);
                                double d15 = ((d10 - (d6 + ((d12 * 0.001d) * 0.5d))) * d4) - (d5 * d14);
                                d8 = d6 + (d14 * 0.001d);
                                d9 = d7 + (d15 * 0.001d);
                                d6 += (d7 + ((d12 + d14) * 2.0d) + d9) * 0.16666666666666666d * 0.001d;
                                d7 += (d11 + ((d13 + d15) * 2.0d) + (((d10 - d8) * d4) - (d5 * d9))) * 0.16666666666666666d * 0.001d;
                            }
                            c8077FSg2.A00 = d8;
                            c8077FSg2.A01 = d9;
                            c8077FSg.A00 = d6;
                            c8077FSg.A01 = d7;
                            if (d3 > 0.0d) {
                                double d16 = d3 / 0.001d;
                                C8077FSg c8077FSg4 = fsw.A06;
                                double d17 = 1.0d - d16;
                                d6 = (d6 * d16) + (c8077FSg4.A00 * d17);
                                c8077FSg.A00 = d6;
                                d7 = (d7 * d16) + (c8077FSg4.A01 * d17);
                                c8077FSg.A01 = d7;
                            }
                            boolean z = true;
                            if (fsw.A03()) {
                                if (d4 > 0.0d) {
                                    c8077FSg.A00 = fsw.A00;
                                } else {
                                    fsw.A00 = d6;
                                }
                                if (0.0d != d7) {
                                    FSX fsx2 = fsw.A03;
                                    c8077FSg.A01 = 0.0d;
                                    fsx2.A01(fsw.A08);
                                }
                                zA03 = true;
                            }
                            if (fsw.A04) {
                                fsw.A04 = false;
                            }
                            if (zA03) {
                                fsw.A04 = true;
                            } else {
                                z = false;
                            }
                            Iterator it2 = fsw.A09.iterator();
                            while (it2.hasNext()) {
                                FST fst = (FST) it2.next();
                                fst.A07();
                                if (z) {
                                    FST.A03(fst);
                                    FST.A02(fst);
                                }
                            }
                        }
                    }
                }
                if (set.isEmpty()) {
                    fsx.A00 = true;
                }
                Iterator it3 = copyOnWriteArraySet.iterator();
                if (it3.hasNext()) {
                    it3.next();
                    throw BV4.A0a("onAfterIntegrate");
                }
                if (fsx.A00) {
                    C8072FSa c8072FSa2 = fsx.A01;
                    c8072FSa2.A02 = false;
                    c8072FSa2.A04.removeFrameCallback(c8072FSa2.A03);
                }
                c8072FSa.A00 = jUptimeMillis;
                c8072FSa.A04.postFrameCallback(c8072FSa.A03);
                return;
            case 3:
                C7739FCq c7739FCq = (C7739FCq) this.A00;
                ((Handler) c7739FCq.A05.getValue()).postAtFrontOfQueue(c7739FCq.A03);
                return;
            default:
                ((Runnable) this.A00).run();
                return;
        }
    }
}
