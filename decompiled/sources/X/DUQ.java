package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class DUQ<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public List<DUQ<K, V>.Entry> A00 = Collections.EMPTY_LIST;
    public Map<K, V> A01;
    public boolean A02;
    public Map<K, V> A03;
    public final int A04;

    /* JADX WARN: Incorrect inner types in field signature: LX/DUQ<TK;TV;>.EntrySet; */
    public volatile DUT A05;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DUQ)) {
            return super.equals(obj);
        }
        DUQ duq = (DUQ) obj;
        int size = size();
        if (size == duq.size()) {
            int size2 = this.A00.size();
            if (size2 != duq.A00.size()) {
                return entrySet().equals(duq.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (this.A00.get(i).equals(duq.A00.get(i))) {
                }
            }
            if (size2 != size) {
                return this.A01.equals(duq.A01);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(K r5) {
        /*
            r4 = this;
            java.util.List<X.DUQ<K, V>$Entry> r0 = r4.A00
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1d
            java.util.List<X.DUQ<K, V>$Entry> r2 = r4.A00
            java.lang.Object r2 = r2.get(r1)
            X.DUR r2 = (X.DUR) r2
            java.lang.Comparable r2 = r2.A01
            int r2 = r5.compareTo(r2)
            if (r2 > 0) goto L3d
            if (r2 != 0) goto L1d
            return r1
        L1d:
            r0 = 0
        L1e:
            if (r0 > r1) goto L3d
            int r2 = r0 + r1
            int r3 = r2 / 2
            java.util.List<X.DUQ<K, V>$Entry> r2 = r4.A00
            java.lang.Object r2 = r2.get(r3)
            X.DUR r2 = (X.DUR) r2
            java.lang.Comparable r2 = r2.A01
            int r2 = r5.compareTo(r2)
            if (r2 >= 0) goto L37
            int r1 = r3 + (-1)
            goto L1e
        L37:
            if (r2 <= 0) goto L3c
            int r0 = r3 + 1
            goto L1e
        L3c:
            return r3
        L3d:
            int r0 = r0 + 1
            int r0 = -r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DUQ.A00(java.lang.Comparable):int");
    }

    public static void A03(DUQ duq) {
        if (duq.A02) {
            throw C8j3.A17();
        }
    }

    public void A05() {
        if (this.A02) {
            return;
        }
        this.A01 = this.A01.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.A01);
        this.A03 = this.A03.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.A03);
        this.A02 = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return A00(comparable) >= 0 || this.A01.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.A05 == null) {
            this.A05 = new DUT(this);
        }
        return this.A05;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA00 = A00(comparable);
        return iA00 >= 0 ? (V) this.A00.get(iA00).getValue() : this.A01.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.A00.size();
        int iA0G = 0;
        for (int i = 0; i < size; i++) {
            iA0G = AnonymousClass005.A0G(this.A00.get(i), iA0G);
        }
        return this.A01.size() > 0 ? iA0G + this.A01.hashCode() : iA0G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size() + this.A01.size();
    }

    public DUQ(int i) {
        this.A04 = i;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.A01 = map;
        this.A03 = map;
    }

    public static Object A01(DUQ duq, int i) {
        A03(duq);
        Object value = duq.A00.remove(i).getValue();
        if (!duq.A01.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = duq.A02().entrySet().iterator();
            List<DUQ<K, V>.Entry> list = duq.A00;
            Map.Entry entryA0l = C3cH.A0l(it);
            list.add(new DUR(duq, (Comparable) entryA0l.getKey(), entryA0l.getValue()));
            it.remove();
        }
        return value;
    }

    private SortedMap<K, V> A02() {
        A03(this);
        if (this.A01.isEmpty() && !(this.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.A01 = treeMap;
            this.A03 = treeMap.descendingMap();
        }
        return (SortedMap) this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        A03(this);
        int iA00 = A00(k);
        if (iA00 >= 0) {
            return (V) this.A00.get(iA00).setValue(v);
        }
        A03(this);
        if (this.A00.isEmpty() && !(this.A00 instanceof ArrayList)) {
            this.A00 = C60O.A11(this.A04);
        }
        int i = -(iA00 + 1);
        int i2 = this.A04;
        if (i >= i2) {
            return A02().put(k, v);
        }
        if (this.A00.size() == i2) {
            DUR durRemove = this.A00.remove(i2 - 1);
            A02().put(durRemove.A01, durRemove.getValue());
        }
        this.A00.add(i, new DUR(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        A03(this);
        if (!this.A00.isEmpty()) {
            this.A00.clear();
        }
        if (this.A01.isEmpty()) {
            return;
        }
        this.A01.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        A03(this);
        Comparable comparable = (Comparable) obj;
        int iA00 = A00(comparable);
        if (iA00 >= 0) {
            return (V) A01(this, iA00);
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(comparable);
    }
}
