package X;

import com.google.common.base.Objects;
import com.google.common.collect.CompactHashMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DQP<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ CompactHashMap A00;

    public DQP(final CompactHashMap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        CompactHashMap compactHashMap = this.A00;
        Map<K, V> mapA06 = compactHashMap.A06();
        if (mapA06 != null) {
            return mapA06.entrySet().contains(o);
        }
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            int iA01 = CompactHashMap.A01(compactHashMap, entry.getKey());
            if (iA01 != -1) {
                Object[] objArr = compactHashMap.A05;
                objArr.getClass();
                if (Objects.equal(objArr[iA01], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        CompactHashMap compactHashMap = this.A00;
        Map<K, V> mapA06 = compactHashMap.A06();
        return mapA06 != null ? AnonymousClass002.A0n(mapA06) : new DQX(compactHashMap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        CompactHashMap compactHashMap = this.A00;
        Map<K, V> mapA06 = compactHashMap.A06();
        if (mapA06 != null) {
            return mapA06.entrySet().remove(o);
        }
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            if (compactHashMap.A02 != null) {
                int i = (1 << (compactHashMap.A00 & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj = compactHashMap.A02;
                obj.getClass();
                int[] iArr = compactHashMap.A03;
                iArr.getClass();
                Object[] objArr = compactHashMap.A04;
                objArr.getClass();
                Object[] objArr2 = compactHashMap.A05;
                objArr2.getClass();
                int iA01 = DQR.A01(key, value, obj, iArr, objArr, objArr2, i);
                if (iA01 != -1) {
                    compactHashMap.A0A(iA01, i);
                    compactHashMap.A01--;
                    compactHashMap.A00 += 32;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
