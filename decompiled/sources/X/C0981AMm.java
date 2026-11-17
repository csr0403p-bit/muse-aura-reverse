package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AMm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0981AMm<K, V> implements BDs, Map<K, V>, InterfaceC0863A6k {
    public AN8 A00;
    public final Collection<V> A01;
    public final Set<Map.Entry<K, V>> A02;
    public final Set<K> A03;

    /* JADX WARN: Incorrect types in method signature: (LX/AMs<TK;TV;>;ILX/AK8<TK;+TV;>;)Z */
    public static final boolean A00(AK8 ak8, C0987AMs c0987AMs, int i) {
        boolean z;
        synchronized (AbstractC0991AMw.A00) {
            int i2 = c0987AMs.A00;
            if (i2 == i) {
                c0987AMs.A01 = ak8;
                z = true;
                c0987AMs.A00 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.A00 = an8;
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot snapshotA00;
        C0987AMs c0987AMs = (C0987AMs) BDh.A08(this.A00);
        C0959AJm c0959AJm = C0959AJm.A02;
        if (c0959AJm != c0987AMs.A01) {
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                C0987AMs c0987AMs2 = (C0987AMs) BDh.A02(snapshotA00, this, an8);
                synchronized (AbstractC0991AMw.A00) {
                    c0987AMs2.A01 = c0959AJm;
                    c0987AMs2.A00++;
                }
            }
            BDh.A0G(snapshotA00, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ((C0987AMs) BDh.A07(this, this.A00)).A01.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((C0987AMs) BDh.A07(this, this.A00)).A01.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return this.A02;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) ((C0987AMs) BDh.A07(this, this.A00)).A01.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C0987AMs) BDh.A07(this, this.A00)).A01.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return this.A03;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        AK8<K, ? extends V> ak8;
        int i;
        V vPut;
        Snapshot snapshotA00;
        boolean zA00;
        do {
            synchronized (AbstractC0991AMw.A00) {
                C0987AMs c0987AMs = (C0987AMs) BDh.A08((C0987AMs) this.A00);
                ak8 = c0987AMs.A01;
                i = c0987AMs.A00;
            }
            C7384Etj.A0X(ak8);
            AK3<K, V> ak3A5Z = ak8.A5Z();
            vPut = ak3A5Z.put(k, v);
            AK8<K, V> ak8A5O = ak3A5Z.A5O();
            if (C7384Etj.areEqual(ak8A5O, ak8)) {
                break;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA00 = A00(ak8A5O, (C0987AMs) BDh.A02(snapshotA00, this, an8), i);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA00);
        return vPut;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        AK8<K, ? extends V> ak8;
        int i;
        Snapshot snapshotA00;
        boolean zA00;
        do {
            synchronized (AbstractC0991AMw.A00) {
                C0987AMs c0987AMs = (C0987AMs) BDh.A08((C0987AMs) this.A00);
                ak8 = c0987AMs.A01;
                i = c0987AMs.A00;
            }
            C7384Etj.A0X(ak8);
            AK3<K, V> ak3A5Z = ak8.A5Z();
            ak3A5Z.putAll(map);
            AK8<K, V> ak8A5O = ak3A5Z.A5O();
            if (C7384Etj.areEqual(ak8A5O, ak8)) {
                return;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA00 = A00(ak8A5O, (C0987AMs) BDh.A02(snapshotA00, this, an8), i);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA00);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        AK8<K, ? extends V> ak8;
        int i;
        V vRemove;
        Snapshot snapshotA00;
        boolean zA00;
        do {
            synchronized (AbstractC0991AMw.A00) {
                C0987AMs c0987AMs = (C0987AMs) BDh.A08((C0987AMs) this.A00);
                ak8 = c0987AMs.A01;
                i = c0987AMs.A00;
            }
            C7384Etj.A0X(ak8);
            AK3<K, V> ak3A5Z = ak8.A5Z();
            vRemove = ak3A5Z.remove(obj);
            AK8<K, V> ak8A5O = ak3A5Z.A5O();
            if (C7384Etj.areEqual(ak8A5O, ak8)) {
                break;
            }
            AN8 an8 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA00 = A00(ak8A5O, (C0987AMs) BDh.A02(snapshotA00, this, an8), i);
            }
            BDh.A0G(snapshotA00, this);
        } while (!zA00);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return ((C0987AMs) BDh.A07(this, this.A00)).A01.size();
    }

    public final String toString() {
        C0987AMs c0987AMs = (C0987AMs) BDh.A08(this.A00);
        StringBuilder sbA0x = C60O.A0x("SnapshotStateMap(value=");
        sbA0x.append(c0987AMs.A01);
        return C8j5.A0V(this, sbA0x);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return this.A01;
    }

    public C0981AMm() {
        C0959AJm c0959AJm = C0959AJm.A02;
        Snapshot snapshotA00 = BDh.A00();
        long jA09 = snapshotA00.A09();
        C0987AMs c0987AMs = new C0987AMs();
        ((AN8) c0987AMs).A00 = jA09;
        c0987AMs.A01 = c0959AJm;
        if (!(snapshotA00 instanceof BDo)) {
            C0987AMs c0987AMs2 = new C0987AMs();
            ((AN8) c0987AMs2).A00 = 1L;
            c0987AMs2.A01 = c0959AJm;
            ((AN8) c0987AMs).A01 = c0987AMs2;
        }
        this.A00 = c0987AMs;
        this.A02 = new C0982AMn(this);
        this.A03 = new C0984AMp(this);
        this.A01 = new C0983AMo(this);
    }

    @Override // X.BDs
    public final /* synthetic */ AN8 AQi(AN8 an8, AN8 an82, AN8 an83) {
        return null;
    }
}
