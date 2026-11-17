package X;

import android.os.SystemClock;
import android.util.LruCache;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class CMu extends DXV {
    public final int A01;
    public final LruCache<Long, Dlw> A02;
    public final boolean A04;
    public final boolean A05;
    public final Set<Long> A03 = Collections.newSetFromMap(new ConcurrentHashMap(2));
    public volatile boolean A07 = false;
    public volatile boolean A06 = false;
    public long A00 = -1;

    @Override // X.DXV
    public final String toString() {
        LruCache<Long, Dlw> lruCache = this.A02;
        return (lruCache == null || lruCache.toString() == null) ? "Invalid HeroPlayerPoolLruCache" : lruCache.toString();
    }

    public CMu(DXW dxw, int i, int i2, boolean z, boolean z2) {
        this.A02 = new C3427CMv(this, dxw, i);
        this.A01 = i2;
        this.A05 = z;
        this.A04 = z2;
    }

    public static boolean A00(CMu cMu, Dlw dlw) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = cMu.A00;
        if (j > 0 && jElapsedRealtime - j < 1000) {
            return false;
        }
        cMu.A00 = jElapsedRealtime;
        cMu.A02.put(Long.valueOf(dlw.A20), dlw);
        return true;
    }
}
