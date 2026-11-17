package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AMn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0982AMn<K, V> extends AbstractC0877AGd<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof BOA) && !(obj instanceof A3a)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C7384Etj.areEqual(this.A00.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C0981AMm<K, V> c0981AMm = this.A00;
        return new C0988AMt(c0981AMm, AnonymousClass002.A0n(((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A01));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof BOA) || (obj instanceof A3a)) {
            return AnonymousClass002.A1X(this.A00.remove(((Map.Entry) obj).getKey()));
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        boolean z;
        Iterator<?> it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z = this.A00.remove(C3cH.A0l(it).getKey()) != null || z;
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        AK8<K, ? extends V> ak8;
        int i;
        Snapshot snapshotA00;
        boolean zA00;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(collection));
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1R(linkedHashMapA15, C3cH.A0l(it));
        }
        C0981AMm<K, V> c0981AMm = this.A00;
        boolean z = false;
        do {
            synchronized (AbstractC0991AMw.A00) {
                C0987AMs c0987AMs = (C0987AMs) BDh.A08((C0987AMs) c0981AMm.A00);
                ak8 = c0987AMs.A01;
                i = c0987AMs.A00;
            }
            C7384Etj.A0X(ak8);
            AK3<K, V> ak3A5Z = ak8.A5Z();
            Iterator<Map.Entry<K, V>> it2 = c0981AMm.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it2);
                if (!linkedHashMapA15.containsKey(entryA0l.getKey()) || !C7384Etj.areEqual(linkedHashMapA15.get(entryA0l.getKey()), entryA0l.getValue())) {
                    ak3A5Z.remove(entryA0l.getKey());
                    z = true;
                }
            }
            AK8<K, V> ak8A5O = ak3A5Z.A5O();
            if (C7384Etj.areEqual(ak8A5O, ak8)) {
                break;
            }
            AN8 an8 = c0981AMm.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA00 = C0981AMm.A00(ak8A5O, (C0987AMs) BDh.A02(snapshotA00, c0981AMm, an8), i);
            }
            BDh.A0G(snapshotA00, c0981AMm);
        } while (!zA00);
        return z;
    }
}
