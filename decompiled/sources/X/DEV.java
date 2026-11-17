package X;

import android.util.LruCache;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class DEV {
    public int A01 = 120;
    public int A00 = 12;
    public LruCache<DEC, C1J> A02 = new F42(this, 120, 0);
    public final HashMap<String, LruCache<DEC, C1J>> A03 = BV4.A0u();

    public final synchronized C1J A00(DEC dec) {
        C1J c1j;
        LruCache<DEC, C1J> lruCache;
        c1j = this.A02.get(dec);
        if (c1j != null && (lruCache = this.A03.get(dec.A02)) != null) {
            lruCache.get(dec);
        }
        return c1j;
    }

    public final synchronized void A01(C1J c1j, DEC dec) {
        HashMap<String, LruCache<DEC, C1J>> map = this.A03;
        String str = dec.A02;
        LruCache<DEC, C1J> f42 = map.get(str);
        if (f42 == null) {
            f42 = new F42(this, this.A00, 1);
            if (str != null) {
                map.put(str, f42);
            }
        }
        f42.put(dec, c1j);
        this.A02.put(dec, c1j);
    }

    public final synchronized void A02(DEC dec) {
        if (this.A02.remove(dec) != null) {
            LruCache<DEC, C1J> lruCache = this.A03.get(dec.A02);
            if (lruCache == null) {
                throw BV4.A0U();
            }
            lruCache.remove(dec);
        }
    }
}
