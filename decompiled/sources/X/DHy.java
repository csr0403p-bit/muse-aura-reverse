package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class DHy {
    public QuickPerformanceLogger A00;
    public final List<DI6> A01;
    public volatile DI1 A02;

    public final synchronized void A00(DI6... di6Arr) {
        InterfaceC4945DGj interfaceC4945DGj;
        DI6[] di6Arr2;
        C7384Etj.A0Y(di6Arr, 0);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger == null) {
            for (DI6 di6 : (DI6[]) Arrays.copyOf(di6Arr, di6Arr.length)) {
                List<DI6> list = this.A01;
                if ((list instanceof Collection) && list.isEmpty()) {
                    list.add(di6);
                } else {
                    for (DI6 di62 : list) {
                        C7384Etj.A0X(di62);
                        if (di62.getClass().equals(di6.getClass())) {
                            break;
                        }
                    }
                    list.add(di6);
                }
            }
        } else {
            DI6[] di6Arr3 = (DI6[]) Arrays.copyOf(di6Arr, di6Arr.length);
            int length = di6Arr3.length;
            for (DI6 di63 : di6Arr3) {
                try {
                    di63.setQuickPerformanceLogger(quickPerformanceLogger);
                } catch (Exception unused) {
                }
            }
            DI1 di1 = this.A02;
            DI6[] di6Arr4 = (DI6[]) Arrays.copyOf(di6Arr3, length);
            C7384Etj.A0Y(di6Arr4, 0);
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = di1.A00;
            if (awakeTimeSinceBootClock != null && (interfaceC4945DGj = di1.A05) != null) {
                DI6[] di6Arr5 = di1.A06;
                if (di6Arr5 == null) {
                    di6Arr2 = (DI6[]) Arrays.copyOf(di6Arr4, di6Arr4.length);
                } else {
                    int length2 = di6Arr5.length;
                    int length3 = di6Arr4.length;
                    di6Arr2 = (DI6[]) C8j3.A1a(di6Arr5, length2 + length3);
                    System.arraycopy(di6Arr4, 0, di6Arr2, length2, length3);
                }
                di1 = new DI1(awakeTimeSinceBootClock, di1.A01, di1.A04, interfaceC4945DGj, di6Arr2);
            }
            this.A02 = di1;
        }
    }

    public DHy(List<? extends DI6> list) {
        List<DI6> listSynchronizedList = Collections.synchronizedList(C3cG.A0h());
        C7384Etj.A0U(listSynchronizedList);
        this.A01 = listSynchronizedList;
        this.A02 = new DI1();
        listSynchronizedList.addAll(list);
    }

    public DHy() {
        List<DI6> listSynchronizedList = Collections.synchronizedList(C3cG.A0h());
        C7384Etj.A0U(listSynchronizedList);
        this.A01 = listSynchronizedList;
        this.A02 = new DI1();
    }
}
