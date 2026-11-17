package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.AMr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0986AMr<K, V> implements Map.Entry<K, V>, A3a {
    public V A00;
    public final K A01;
    public final /* synthetic */ C0988AMt<K, V> A02;

    public C0986AMr(C0988AMt<K, V> c0988AMt) {
        this.A02 = c0988AMt;
        Map.Entry<? extends K, ? extends V> entry = c0988AMt.A01;
        C7384Etj.A0X(entry);
        this.A01 = entry.getKey();
        Map.Entry<? extends K, ? extends V> entry2 = c0988AMt.A01;
        C7384Etj.A0X(entry2);
        this.A00 = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        C0988AMt<K, V> c0988AMt = this.A02;
        C0981AMm<K, V> c0981AMm = c0988AMt.A03;
        if (((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A00 != c0988AMt.A00) {
            throw new ConcurrentModificationException();
        }
        V value = getValue();
        c0981AMm.put(getKey(), v);
        this.A00 = v;
        return value;
    }
}
