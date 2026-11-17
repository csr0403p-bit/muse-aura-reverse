package X;

import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C2R {
    public final Map<String, Long> A01 = BV4.A0u();
    public final Object A00 = C3cG.A0T();

    public final boolean A00(String str) throws InterruptedException {
        Map<String, Long> map;
        Long l;
        Object obj = this.A00;
        synchronized (obj) {
            map = this.A01;
            l = map.get(str);
        }
        if (l == null) {
            l = 0L;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jLongValue = l.longValue();
        if (jLongValue == 0) {
            synchronized (obj) {
                BV4.A1I(str, map, jUptimeMillis);
            }
        }
        if (jLongValue > jUptimeMillis) {
            return true;
        }
        if (jUptimeMillis - jLongValue >= 3000) {
            return false;
        }
        long j = (jLongValue + 3000) - jUptimeMillis;
        synchronized (obj) {
            BV4.A1I(str, map, jUptimeMillis + j);
        }
        try {
            Thread.sleep(j);
            return false;
        } catch (InterruptedException e) {
            C2Q.A00().AT9("ReportSenderTrickler", e, null);
            return false;
        }
    }
}
