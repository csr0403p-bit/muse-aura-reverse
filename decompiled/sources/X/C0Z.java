package X;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class C0Z implements C0S, Comparator<C0J> {
    public final float A00;
    public final long A01;
    public final Map<String, Long> A02;
    public final int A03;
    public final Map<String, NavigableSet<C0J>> A04;
    public final NavigableSet<C0J> A05;
    public final AtomicLong A06 = BV4.A14(0);

    @Override // X.C0S
    public final void AS3() {
    }

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
    }

    @Override // X.C0R
    public final void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        C7384Etj.A0Y(c0j, 1);
        String strA00 = AbstractC3160C0i.A00(c0j.A06);
        if (strA00 != null) {
            Map<String, Long> map = this.A02;
            Number numberA0b = BV4.A0b(strA00, map);
            if (numberA0b != null) {
                long jLongValue = numberA0b.longValue() - c0j.A03;
                Long lValueOf = Long.valueOf(jLongValue);
                if (jLongValue <= 0) {
                    map.remove(strA00);
                } else {
                    map.put(strA00, lValueOf);
                }
            }
            Map<String, NavigableSet<C0J>> map2 = this.A04;
            NavigableSet<C0J> navigableSet = map2.get(strA00);
            if (navigableSet != null) {
                navigableSet.remove(c0j);
                if (navigableSet.isEmpty()) {
                    map2.remove(strA00);
                }
            }
        }
        this.A05.remove(c0j);
        this.A06.addAndGet(-c0j.A03);
    }

    private final void A00(InterfaceC3158C0g interfaceC3158C0g, String str, long j) {
        NavigableSet<C0J> navigableSet;
        try {
            C0Q.A01("perVideoLRUEvict");
            String strA00 = AbstractC3160C0i.A00(str);
            if (strA00 != null && (navigableSet = this.A04.get(strA00)) != null) {
                while (true) {
                    if (this.A02.get(strA00) == null || r0.longValue() / this.A01 < this.A00 || navigableSet.isEmpty()) {
                        break;
                    } else if (interfaceC3158C0g instanceof C3157C0f) {
                        ((C3157C0f) interfaceC3158C0g).A04(navigableSet.first(), "lru_policy");
                    } else {
                        interfaceC3158C0g.Aax(navigableSet.first());
                    }
                }
            }
            while (this.A06.get() + j > this.A01) {
                try {
                    C0J c0jFirst = this.A05.first();
                    if (c0jFirst != null) {
                        interfaceC3158C0g.Aax(c0jFirst);
                    }
                } catch (NoSuchElementException unused) {
                    AbstractC3426CMt.A02("PerVideoLruCacheEvictor", "mLeastRecentlyUsed is empty while trying global eviction");
                }
            }
        } finally {
            C0Q.A00();
        }
    }

    @Override // X.C0S
    public final boolean AbD() {
        return false;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C0J c0j, C0J c0j2) {
        C0J c0j3 = c0j;
        C0J c0j4 = c0j2;
        AnonymousClass003.A0u(c0j3, c0j4);
        long j = c0j3.A02;
        long j2 = c0j4.A02;
        return j - j2 == 0 ? c0j3.compareTo(c0j4) : j < j2 ? -1 : 1;
    }

    public C0Z(double d, int i, long j) {
        j = j <= 0 ? 104857600L : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        this.A02 = BV4.A0u();
        this.A04 = BV4.A0u();
        this.A05 = new TreeSet(this);
        this.A01 = j;
        this.A03 = i;
        this.A00 = (float) d;
    }

    @Override // X.C0R
    public final void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        this.A05.add(c0j);
        AtomicLong atomicLong = this.A06;
        long j = c0j.A03;
        atomicLong.addAndGet(j);
        String str = c0j.A06;
        String strA00 = AbstractC3160C0i.A00(str);
        Map<String, Long> map = this.A02;
        Number numberA0b = BV4.A0b(strA00, map);
        map.put(strA00, numberA0b != null ? Long.valueOf(numberA0b.longValue() + j) : Long.valueOf(j));
        if (c0j.A04 > this.A03) {
            Map<String, NavigableSet<C0J>> map2 = this.A04;
            NavigableSet<C0J> navigableSet = map2.get(strA00);
            if (navigableSet != null) {
                navigableSet.add(c0j);
            } else {
                TreeSet treeSet = new TreeSet(this);
                treeSet.add(c0j);
                map2.put(strA00, treeSet);
            }
        }
        if (str != null) {
            A00(interfaceC3158C0g, str, 0L);
        }
    }

    @Override // X.C0R
    public final void AW5(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, C0J c0j2, Integer num) {
        AnonymousClass005.A0x(interfaceC3158C0g, c0j, c0j2);
        AW4(interfaceC3158C0g, c0j);
        AW3(interfaceC3158C0g, c0j2);
    }

    @Override // X.C0S
    public final void AWA(InterfaceC3158C0g interfaceC3158C0g, String str, long j, long j2) {
        AnonymousClass003.A0u(interfaceC3158C0g, str);
        A00(interfaceC3158C0g, str, j2);
    }

    @Override // X.C0S
    public final /* synthetic */ void Acy(String str) {
    }
}
