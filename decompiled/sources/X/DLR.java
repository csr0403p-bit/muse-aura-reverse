package X;

import com.facebook.aura.analytics.timespent.TimeSpentAnalyticsImpl$timeSpentBitArray$1;
import java.util.Arrays;
import java.util.Random;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DLR {
    public static final Random A09 = new Random();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public String A04;
    public Function0<String> A05;
    public int[] A06;
    public final TimeSpentAnalyticsImpl$timeSpentBitArray$1 A07;
    public final String A08;

    public DLR(TimeSpentAnalyticsImpl$timeSpentBitArray$1 timeSpentAnalyticsImpl$timeSpentBitArray$1, Function0 function0) {
        C7384Etj.A0Y(function0, 1);
        this.A07 = timeSpentAnalyticsImpl$timeSpentBitArray$1;
        String string = Integer.toString(Math.abs(A09.nextInt()), 36);
        C7384Etj.A0U(string);
        this.A08 = string;
        this.A01 = -1;
        this.A05 = null;
        this.A05 = function0;
    }

    public static final DLT A00(DLR dlr, int i, long j) {
        DLT dltAcquireEvent = null;
        if (dlr.A06 != null) {
            long j2 = dlr.A03;
            long j3 = dlr.A02;
            int iMin = (int) (j > j2 ? Math.min(64L, (j - j3) + 1) : (j2 - j3) + 1);
            dltAcquireEvent = dlr.A07.acquireEvent("time_spent_bit_array");
            dltAcquireEvent.addParameter("tos_id", dlr.A08);
            dltAcquireEvent.addParameter("start_time", dlr.A02);
            dltAcquireEvent.addParameter("tos_array", Arrays.toString(dlr.A06));
            dltAcquireEvent.addParameter("tos_len", iMin);
            dltAcquireEvent.addParameter("tos_seq", dlr.A01);
            dltAcquireEvent.addParameter("tos_cum", dlr.A00);
            dltAcquireEvent.addParameter("start_session_id", dlr.A04);
            if (i == 3) {
                dltAcquireEvent.addParameter("trigger", "clock_change");
            }
        }
        return dltAcquireEvent;
    }
}
