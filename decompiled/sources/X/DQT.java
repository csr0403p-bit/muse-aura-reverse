package X;

import com.google.common.base.Objects;
import com.google.common.collect.CompactHashMap;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DQT<K, V> extends DPA<K, V> {
    public int A00;
    public final K A01;
    public final /* synthetic */ CompactHashMap A02;

    public DQT(CompactHashMap compactHashMap, int i) {
        this.A02 = compactHashMap;
        Object[] objArr = compactHashMap.A04;
        objArr.getClass();
        this.A01 = (K) objArr[i];
        this.A00 = i;
    }

    public static void A00(DQT dqt) {
        int i = dqt.A00;
        if (i != -1) {
            CompactHashMap compactHashMap = dqt.A02;
            if (i < compactHashMap.size()) {
                K k = dqt.A01;
                int i2 = dqt.A00;
                Object[] objArr = compactHashMap.A04;
                objArr.getClass();
                if (Objects.equal(k, objArr[i2])) {
                    return;
                }
            }
        }
        dqt.A00 = CompactHashMap.A01(dqt.A02, dqt.A01);
    }
}
