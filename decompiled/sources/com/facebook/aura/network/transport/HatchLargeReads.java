package com.facebook.aura.network.transport;

import X.AIG;
import X.BV4;
import X.BV7;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class HatchLargeReads {
    public static final int CAPACITY = 20;
    public static final HatchLargeReads INSTANCE = new HatchLargeReads();
    public static final long MIN_BYTES = 1048576;
    public static final AIG<String> entries;

    public final void record(HatchRequestCategory hatchRequestCategory, long j) {
        C7384Etj.A0Y(hatchRequestCategory, 0);
        if (j >= 1048576) {
            long jA04 = BV4.A04(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
            AIG<String> aig = entries;
            synchronized (aig) {
                if (aig.size() == 20) {
                    aig.removeFirst();
                }
                StringBuilder sbA0g = C3cG.A0g(hatchRequestCategory.name());
                sbA0g.append(":");
                sbA0g.append(j);
                aig.addLast(BV7.A0z("@", sbA0g, jA04));
            }
        }
    }

    static {
        AIG<String> aig = new AIG<>();
        aig.A01 = new Object[20];
        entries = aig;
    }

    public final String snapshot() {
        String strA0e;
        AIG<String> aig = entries;
        synchronized (aig) {
            strA0e = C3cH.A0e(",", aig);
        }
        return strA0e;
    }
}
