package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AMo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0983AMo<K, V> extends AbstractC0877AGd<K, V, V> {
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.A00.containsValue(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        C0981AMm<K, V> c0981AMm = this.A00;
        return new C0990AMv(c0981AMm, AnonymousClass002.A0n(((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A01));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry<K, V> next;
        C0981AMm<K, V> c0981AMm = this.A00;
        Iterator<Map.Entry<K, V>> it = c0981AMm.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getValue(), obj)) {
                break;
            }
        }
        Map.Entry<K, V> entry = next;
        if (entry == null) {
            return false;
        }
        c0981AMm.remove(entry.getKey());
        return true;
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
        AK8<K, ? extends V> ak8;
        int i;
        Snapshot snapshotA00;
        boolean zA00;
        Set setA0g = AbstractC0878AGe.A0g(collection);
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
            Iterator<Map.Entry<K, V>> it = c0981AMm.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                if (setA0g.contains(entryA0l.getValue())) {
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        AK8<K, ? extends V> ak8;
        int i;
        Snapshot snapshotA00;
        boolean zA00;
        Set setA0g = AbstractC0878AGe.A0g(collection);
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
            Iterator<Map.Entry<K, V>> it = c0981AMm.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                if (!setA0g.contains(entryA0l.getValue())) {
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
