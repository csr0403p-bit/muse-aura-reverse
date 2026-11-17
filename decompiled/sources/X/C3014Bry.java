package X;

import android.text.TextUtils;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Bry, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3014Bry {
    public static C3014Bry A03;
    public final LruCache<String, C5580Dky> A00;
    public final AtomicLong A01 = BV4.A14(0);
    public final AtomicLong A02 = BV4.A14(0);

    public final synchronized C5580Dky A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C5580Dky c5580Dky = this.A00.get(str);
        if (c5580Dky != null) {
            this.A01.incrementAndGet();
        } else {
            this.A02.incrementAndGet();
        }
        return c5580Dky;
    }

    public C3014Bry(int i) {
        this.A00 = new LruCache<>(i <= 0 ? 5 : i);
    }
}
