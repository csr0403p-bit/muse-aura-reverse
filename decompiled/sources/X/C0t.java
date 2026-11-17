package X;

import java.util.HashMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class C0t implements C0S {
    public final HashMap<String, Set<String>> A00;
    public final ConcurrentHashMap<String, Set<Integer>> A01;
    public final Long A02;
    public final ConcurrentHashMap<String, C0u> A03;
    public final boolean A04;

    public C0t() {
        this(null, false);
    }

    @Override // X.C0S
    public final void AS3() {
    }

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
    }

    @Override // X.C0R
    public final void AW5(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, C0J c0j2, Integer num) {
    }

    @Override // X.C0S
    public final void AWA(InterfaceC3158C0g interfaceC3158C0g, String str, long j, long j2) {
    }

    private final void A00(String str, String str2) {
        HashMap<String, Set<String>> map = this.A00;
        if (map != null) {
            synchronized (map) {
                Set<String> setA13 = map.get(str);
                if (setA13 == null) {
                    setA13 = C60O.A13();
                    map.put(str, setA13);
                }
                setA13.add(str2);
            }
        }
    }

    @Override // X.C0R
    public final void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        String strA00;
        HashMap<String, Set<String>> map;
        boolean z;
        NavigableSet<C0J> navigableSetADD;
        C0J c0j2;
        ConcurrentHashMap<String, C0u> concurrentHashMap;
        C0u c0u;
        ConcurrentHashMap<Integer, AtomicLong> concurrentHashMap2;
        Integer numValueOf;
        AtomicLong atomicLong;
        boolean zA1Y = C60P.A1Y(interfaceC3158C0g, c0j);
        String str = c0j.A06;
        if (str == null || (strA00 = AbstractC3160C0i.A00(str)) == null) {
            return;
        }
        ConcurrentHashMap<String, Set<Integer>> concurrentHashMap3 = this.A01;
        Set<Integer> set = concurrentHashMap3.get(strA00);
        if (set != null) {
            set.remove(Integer.valueOf(str.hashCode()));
            if (set.isEmpty()) {
                concurrentHashMap3.remove(strA00);
            }
        }
        if (this.A04 && (c0u = (concurrentHashMap = this.A03).get(strA00)) != null) {
            int iHashCode = str.hashCode();
            long j = c0j.A04;
            long j2 = c0j.A03;
            if (j == 0) {
                c0u.A00.remove(Integer.valueOf(iHashCode));
            }
            if (j2 > 0 && (atomicLong = (concurrentHashMap2 = c0u.A01).get((numValueOf = Integer.valueOf(iHashCode)))) != null && atomicLong.addAndGet(-j2) <= 0) {
                concurrentHashMap2.remove(numValueOf);
            }
            if (c0u.A00.isEmpty() && c0u.A01.isEmpty()) {
                concurrentHashMap.remove(strA00, c0u);
            }
        }
        Long l = this.A02;
        if (l != null) {
            long j3 = c0j.A04;
            long jLongValue = l.longValue();
            if (j3 > jLongValue || (map = this.A00) == null) {
                return;
            }
            synchronized (map) {
                Set<String> set2 = map.get(strA00);
                if (set2 != null) {
                    z = set2.remove(str) == zA1Y;
                    if (set2.isEmpty()) {
                        map.remove(strA00);
                    }
                }
            }
            if (!z || (navigableSetADD = interfaceC3158C0g.ADD(str)) == null || (c0j2 = (C0J) AbstractC0878AGe.A0C(navigableSetADD)) == null || c0j2.A04 > jLongValue) {
                return;
            }
            A00(strA00, str);
        }
    }

    @Override // X.C0S
    public final boolean AbD() {
        return false;
    }

    @Override // X.C0R
    public final void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        String strA00;
        NavigableSet<C0J> navigableSetADD;
        C0J c0j2;
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        String str = c0j.A06;
        if (str == null || (strA00 = AbstractC3160C0i.A00(str)) == null) {
            return;
        }
        ConcurrentHashMap<String, Set<Integer>> concurrentHashMap = this.A01;
        Set<Integer> setA13 = concurrentHashMap.get(strA00);
        if (setA13 == null) {
            setA13 = C60O.A13();
            concurrentHashMap.put(strA00, setA13);
        }
        Integer numValueOf = Integer.valueOf(str.hashCode());
        setA13.add(numValueOf);
        if (this.A04) {
            C0u c0u = new C0u();
            C0u c0uPutIfAbsent = this.A03.putIfAbsent(strA00, c0u);
            if (c0uPutIfAbsent == null) {
                c0uPutIfAbsent = c0u;
            }
            long j = c0j.A04;
            long j2 = c0j.A03;
            if (j == 0) {
                c0uPutIfAbsent.A00.add(numValueOf);
            }
            if (j2 > 0) {
                AtomicLong atomicLongA14 = BV4.A14(0L);
                AtomicLong atomicLongPutIfAbsent = c0uPutIfAbsent.A01.putIfAbsent(numValueOf, atomicLongA14);
                if (atomicLongPutIfAbsent != null) {
                    atomicLongA14 = atomicLongPutIfAbsent;
                }
                atomicLongA14.addAndGet(j2);
            }
        }
        Long l = this.A02;
        if (l != null) {
            long j3 = c0j.A04;
            long jLongValue = l.longValue();
            if (j3 > jLongValue || (navigableSetADD = interfaceC3158C0g.ADD(str)) == null || (c0j2 = (C0J) AbstractC0878AGe.A0C(navigableSetADD)) == null || c0j2.A04 > jLongValue) {
                return;
            }
            A00(strA00, str);
        }
    }

    @Override // X.C0S
    public final /* synthetic */ void Acy(String str) {
    }

    public C0t(Long l, boolean z) {
        HashMap<String, Set<String>> mapA0u;
        this.A04 = z;
        this.A02 = l;
        this.A01 = C60O.A1C();
        this.A03 = C60O.A1C();
        if (l != null) {
            mapA0u = BV4.A0u();
        } else {
            mapA0u = null;
        }
        this.A00 = mapA0u;
    }
}
