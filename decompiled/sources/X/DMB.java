package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* loaded from: classes5.dex */
public final class DMB {
    public final NetworkStats.Bucket A00;
    public final NetworkStatsManager A01;

    public static void A00(DMB dmb, long[] jArr, int i, int i2) throws RemoteException, SecurityException {
        try {
            NetworkStats networkStatsQuerySummary = dmb.A01.querySummary(i, null, Long.MIN_VALUE, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
            while (true) {
                networkStatsQuerySummary.getClass();
                if (!networkStatsQuerySummary.hasNextBucket()) {
                    networkStatsQuerySummary.close();
                    return;
                }
                NetworkStats.Bucket bucket = dmb.A00;
                networkStatsQuerySummary.getNextBucket(bucket);
                int i3 = 4;
                if (bucket.getState() == 2) {
                    i3 = 0;
                }
                int i4 = i2 | i3;
                jArr[i4] = jArr[i4] + bucket.getRxBytes();
                int i5 = i3 | i2 | 1;
                jArr[i5] = jArr[i5] + bucket.getTxBytes();
            }
        } catch (IllegalStateException | SecurityException e) {
            Log.e("NetworkStatsManagerBytesCollector", "NetworkStatsManager throws exception: ", e);
        }
    }

    public DMB(Context context) {
        this.A00 = new NetworkStats.Bucket();
        this.A01 = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
    }

    public DMB() {
    }
}
