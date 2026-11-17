package X;

import android.util.LruCache;

/* loaded from: classes5.dex */
public final class BeK {
    public static final BeK A04 = new BeK();
    public boolean A02;
    public long A00 = 0;
    public long A01 = 0;
    public final LruCache<String, Integer> A03 = new LruCache<>(5);

    public final Integer A00(String str) {
        int iIntValue;
        if (this.A02 && str != null) {
            synchronized (this) {
                Integer num = this.A03.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            }
            long j = this.A00;
            if (j > 0 && iIntValue > j) {
                return C79.A00;
            }
            long j2 = this.A01;
            if (j2 > 0 && iIntValue > j2) {
                return C79.A01;
            }
        }
        return C79.A0C;
    }
}
