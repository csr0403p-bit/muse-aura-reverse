package X;

import android.util.LongSparseArray;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FCH {
    public final LongSparseArray<FCM<?>> A00;
    public final Object A01;
    public final Map<String, Object> A02;
    public final Map<String, FAU> A03;
    public final Map<String, Object> A04;
    public final boolean A05;

    public FCH() {
        this(false);
    }

    public final <T> FCM<T> A00(long j) {
        FCM<T> fcm;
        synchronized (this.A01) {
            Object obj = this.A00.get(j);
            fcm = obj instanceof FCM ? (FCM) obj : null;
        }
        return fcm;
    }

    public FCH(boolean z) {
        Map<String, FAU> agy;
        this.A05 = z;
        this.A01 = C3cG.A0T();
        this.A04 = new AGY();
        this.A02 = new AGY();
        if (z) {
            agy = new AGY<>();
        } else {
            agy = Collections.EMPTY_MAP;
            C7384Etj.A0V(agy);
        }
        this.A03 = agy;
        this.A00 = new LongSparseArray<>();
    }
}
