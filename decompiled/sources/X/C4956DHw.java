package X;

import android.os.Trace;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import com.facebook.quicklog.RealtimeQuickEventListener;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.DHw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4956DHw extends DIB {
    public DGY A00;
    public long A01;
    public final boolean A02;
    public final AwakeTimeSinceBootClock A03;

    @Override // X.DIB
    public final int A04(DI6 di6) {
        C7384Etj.A0Y(di6, 0);
        CP9 listenerFlags = di6.getListenerFlags();
        if (listenerFlags != null) {
            return listenerFlags.A00;
        }
        return 0;
    }

    @Override // X.DIB
    public final int[] A05(DI6 di6) {
        C7384Etj.A0Y(di6, 0);
        CP0 listenerMarkers = di6.getListenerMarkers();
        if (listenerMarkers == null) {
            return null;
        }
        return listenerMarkers.A01;
    }

    public static final void A00(COt cOt, C4956DHw c4956DHw, ADq aDq, ADq aDq2, int i, int i2, int i3) {
        DGY dgy;
        QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
        DJJ djj = quickEventImpl.A0B;
        long jA03 = djj == null ? i != 6 ? c4956DHw.A03(cOt.getMarkerId(), quickEventImpl.A01) : c4956DHw.A02(cOt.getMarkerId()) : i != 6 ? c4956DHw.A03(djj.A01, quickEventImpl.A01) | c4956DHw.A03(djj.A00, quickEventImpl.A01) : c4956DHw.A02(djj.A00) | c4956DHw.A02(djj.A01);
        if (jA03 == 0 || ((DIB) c4956DHw).A02 == null) {
            return;
        }
        long j = c4956DHw.A01;
        long j2 = j & jA03;
        if (j2 != 0) {
            A01(cOt, c4956DHw, aDq, aDq2, i, i2, j2);
        }
        long j3 = (j ^ (-1)) & jA03;
        if (j3 != 0) {
            if (!c4956DHw.A02 || (dgy = c4956DHw.A00) == null) {
                A01(cOt, c4956DHw, aDq, aDq2, i, i2, j3);
            } else {
                dgy.execute(new DIH(cOt, c4956DHw, aDq, aDq2, i, i2, i3, j3));
            }
        }
    }

    public static final void A01(COt cOt, C4956DHw c4956DHw, ADq aDq, ADq aDq2, int i, int i2, long j) {
        DI6[] di6Arr;
        int i3;
        int i4;
        int i5;
        int i6;
        if (j == 0 || (di6Arr = ((DIB) c4956DHw).A02) == null) {
            return;
        }
        try {
            if (i == 8) {
                DI8.A01("qpl.QuickEventListenersList.notifyBatch");
                if (aDq != null && (i5 = aDq.A00) <= (i6 = aDq.A01)) {
                    while (true) {
                        A01(cOt, c4956DHw, null, null, 5, i5, j);
                        if (i5 == i6) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                if (aDq2 != null && (i3 = aDq2.A00) <= (i4 = aDq2.A01)) {
                    while (true) {
                        A01(cOt, c4956DHw, null, null, 7, i3, j);
                        if (i3 == i4) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            } else {
                DI8.A01("qpl.QuickEventListenersList.notify");
                long j2 = 1;
                int i7 = 0;
                while (i7 < di6Arr.length) {
                    if ((j & j2) != 0) {
                        try {
                            String name = di6Arr[i7].getName();
                            DI8.A02("qpl.listener.notify(%s)", name);
                            Integer numValueOf = Integer.valueOf(cOt.getMarkerId());
                            Integer numValueOf2 = Integer.valueOf(i);
                            if (DI8.A00 && Trace.isEnabled()) {
                                Trace.beginSection(String.format(Locale.US, "qpl.quickEventListenersList.notify.%s.%d.%d", Arrays.copyOf(new Object[]{name, numValueOf, numValueOf2}, 3)));
                            }
                        } catch (Exception unused) {
                        } finally {
                            DI8.A00();
                        }
                        switch (i) {
                            case 1:
                                di6Arr[i7].onMarkerStart(cOt);
                                DI8.A00();
                                DI8.A00();
                                break;
                            case 2:
                                di6Arr[i7].onMarkerStop(cOt);
                                DI8.A00();
                                DI8.A00();
                                break;
                            case 3:
                                di6Arr[i7].onMarkerRestart(cOt);
                                DI8.A00();
                                DI8.A00();
                                break;
                            case 4:
                                di6Arr[i7].onMarkerDrop(cOt);
                                DI8.A00();
                                DI8.A00();
                                break;
                            case 5:
                                di6Arr[i7].onMarkerAnnotate(cOt, i2);
                                DI8.A00();
                                DI8.A00();
                                break;
                            case 6:
                                di6Arr[i7].onMarkEvent(cOt);
                                DI8.A00();
                                DI8.A00();
                                break;
                            default:
                                try {
                                    QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
                                    DHo dHo = quickEventImpl.A0A;
                                    if (dHo == null) {
                                        dHo = new DHo();
                                        quickEventImpl.A0A = dHo;
                                    }
                                    di6Arr[i7].onMarkerPoint(cOt, i2, dHo.A03[i2] + quickEventImpl.A07, dHo.A07[i2]);
                                    DI8.A00();
                                    DI8.A00();
                                    break;
                                } catch (Throwable th) {
                                    throw th;
                                    break;
                                }
                        }
                    }
                    i7++;
                    j2 <<= 1;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C4956DHw(AwakeTimeSinceBootClock awakeTimeSinceBootClock, DGY dgy, QuickPerformanceLoggerGKs quickPerformanceLoggerGKs, InterfaceC4945DGj interfaceC4945DGj, DI6[] di6Arr) {
        super(interfaceC4945DGj, di6Arr);
        this.A03 = awakeTimeSinceBootClock;
        if (quickPerformanceLoggerGKs != null) {
            boolean zShouldOffloadListeners = quickPerformanceLoggerGKs.shouldOffloadListeners();
            this.A02 = zShouldOffloadListeners;
            if (zShouldOffloadListeners) {
                this.A00 = dgy;
                if (di6Arr == null || dgy == null) {
                    return;
                }
                long j = 1;
                for (DI6 di6 : di6Arr) {
                    if (di6.getClass().isAnnotationPresent(RealtimeQuickEventListener.class)) {
                        this.A01 |= j;
                    }
                    j <<= 1;
                }
            }
        }
    }
}
