package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;

/* loaded from: classes5.dex */
public final class DI1 {
    public static final DI1 A07 = new DI1();
    public final AwakeTimeSinceBootClock A00;
    public final DGY A01;
    public final DIJ A02;
    public final C4956DHw A03;
    public final QuickPerformanceLoggerGKs A04;
    public final InterfaceC4945DGj A05;
    public final DI6[] A06;

    public final void A00(COt cOt) {
        C4956DHw c4956DHw = this.A03;
        if (c4956DHw != null) {
            C4956DHw.A00(cOt, c4956DHw, null, null, 6, -1, 0);
        }
    }

    public final void A01(COt cOt, int i) {
        C4956DHw c4956DHw = this.A03;
        if (c4956DHw != null) {
            C4956DHw.A00(cOt, c4956DHw, null, null, 5, i, 0);
        }
    }

    public final void A02(COt cOt, int i) {
        C4956DHw c4956DHw = this.A03;
        if (c4956DHw != null) {
            C4956DHw.A00(cOt, c4956DHw, null, null, 2, -1, i);
        }
    }

    public final void A03(COt cOt, int i) {
        C4956DHw c4956DHw = this.A03;
        if (c4956DHw != null) {
            C4956DHw.A00(cOt, c4956DHw, null, null, 1, -1, i);
        }
    }

    public final void A04(COt cOt, int i, int i2) {
        C4956DHw c4956DHw = this.A03;
        if (c4956DHw != null) {
            C4956DHw.A00(cOt, c4956DHw, null, null, 7, i, i2);
        }
    }

    public final boolean A05(DJJ djj, int i) {
        DIJ dij = this.A02;
        if (dij != null) {
            return (dij.A03(i, 0) == 0 && (djj == null || dij.A03(djj.A00, 0) == 0)) ? false : true;
        }
        return false;
    }

    public final boolean A06(DJJ djj, int i, int i2) {
        DIJ dij;
        C4956DHw c4956DHw = this.A03;
        if (c4956DHw == null || (dij = this.A02) == null) {
            return false;
        }
        return (c4956DHw.A03(i, i2) == 0 && (djj == null || c4956DHw.A03(djj.A00, i2) == 0) && dij.A03(i, 0) == 0 && (djj == null || dij.A03(djj.A00, 0) == 0)) ? false : true;
    }

    public DI1() {
        this.A00 = null;
        this.A06 = null;
        this.A05 = null;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
    }

    public DI1(AwakeTimeSinceBootClock awakeTimeSinceBootClock, DGY dgy, QuickPerformanceLoggerGKs quickPerformanceLoggerGKs, InterfaceC4945DGj interfaceC4945DGj, DI6[] di6Arr) {
        C7384Etj.A0Y(interfaceC4945DGj, 5);
        this.A00 = awakeTimeSinceBootClock;
        this.A06 = di6Arr;
        this.A05 = interfaceC4945DGj;
        this.A04 = quickPerformanceLoggerGKs;
        this.A01 = dgy;
        this.A03 = new C4956DHw(awakeTimeSinceBootClock, dgy, quickPerformanceLoggerGKs, interfaceC4945DGj, di6Arr);
        this.A02 = new DIJ(interfaceC4945DGj, di6Arr);
    }
}
