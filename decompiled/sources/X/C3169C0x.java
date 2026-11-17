package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.C0x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3169C0x implements C0S {
    public static final Comparator<C0J> A08 = C0L.A00;
    public final int A00;
    public final C3170C0y A01;
    public final C11 A02;
    public final boolean A03;
    public final C3168C0w A04;
    public final C12 A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.C0S
    public final void AS3() {
    }

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
    }

    @Override // X.C0R
    public final void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        Object key;
        Object next;
        C7384Etj.A0Y(c0j, 1);
        C3168C0w c3168C0w = this.A04;
        if (c3168C0w != null && c3168C0w.A02(c0j)) {
            synchronized (c3168C0w.A03) {
                if (c3168C0w.A06.remove(c0j)) {
                    c3168C0w.A00 = Math.max(c3168C0w.A00 - c0j.A03, 0L);
                    String strA00 = AbstractC3160C0i.A00(c0j.A06);
                    if (strA00 != null) {
                        HashMap<String, Set<C0J>> map = c3168C0w.A05;
                        Set<C0J> set = map.get(strA00);
                        if (set != null) {
                            set.remove(c0j);
                        }
                        Set<C0J> set2 = map.get(strA00);
                        if (set2 != null && set2.isEmpty()) {
                            map.remove(strA00);
                        }
                    }
                }
            }
            return;
        }
        if (this.A06) {
            Iterator itA0n = AnonymousClass002.A0n(this.A01.A02);
            do {
                next = null;
                if (!itA0n.hasNext()) {
                    break;
                } else {
                    next = itA0n.next();
                }
            } while (!((AbstractCollection) ((Map.Entry) next).getValue()).contains(c0j));
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (key = entry.getKey()) == null) {
                return;
            }
        } else {
            key = c0j.A04 <= ((long) this.A00) ? C10.A03 : C10.A02;
        }
        String strA002 = AbstractC3160C0i.A00(c0j.A06);
        if (strA002 != null) {
            C11 c11 = this.A02;
            Map<String, Long> map2 = c11.A04;
            Number numberA0b = BV4.A0b(strA002, map2);
            if (numberA0b != null) {
                long jLongValue = numberA0b.longValue() - c0j.A03;
                Long lValueOf = Long.valueOf(jLongValue);
                if (jLongValue <= 0) {
                    map2.remove(strA002);
                } else {
                    map2.put(strA002, lValueOf);
                }
            }
            Map<String, TreeSet<C0J>> map3 = c11.A05;
            TreeSet<C0J> treeSet = map3.get(strA002);
            if (treeSet != null) {
                treeSet.remove(c0j);
                if (treeSet.isEmpty()) {
                    map3.remove(strA002);
                }
            }
        }
        C3170C0y c3170C0y = this.A01;
        TreeSet<C0J> treeSet2 = c3170C0y.A02.get(key);
        if (treeSet2 != null) {
            treeSet2.remove(c0j);
        }
        Map<C10, Long> map4 = c3170C0y.A01;
        BV4.A1I(key, map4, Math.max(C60P.A01(BV4.A0b(key, map4)) - c0j.A03, 0L));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.InterfaceC3158C0g r6, X.C3169C0x r7, X.C3170C0y r8, X.C10 r9, java.lang.String r10) {
        /*
            java.util.Map<X.C10, java.lang.Float> r0 = r8.A03
            java.lang.Number r2 = X.BV4.A0b(r9, r0)
            r5 = 0
            if (r2 == 0) goto L5d
            java.util.Map<X.C10, java.lang.Long> r0 = r8.A01
            java.lang.Number r0 = X.BV4.A0b(r9, r0)
            long r0 = X.C60P.A01(r0)
            float r4 = (float) r0
            long r0 = r8.A00
            float r3 = (float) r0
            float r0 = r2.floatValue()
            float r3 = r3 * r0
            r2 = 1
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 > 0) goto L33
            X.C10 r1 = X.C10.A02
            java.util.Map<X.C10, java.util.TreeSet<X.C0J>> r0 = r8.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            if (r0 != r2) goto L5d
        L33:
            java.util.Map<X.C10, java.util.TreeSet<X.C0J>> r1 = r8.A02
            java.lang.Object r0 = r1.get(r9)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L5d
            r5 = 1
            java.lang.Object r0 = r1.get(r9)
            java.util.TreeSet r0 = (java.util.TreeSet) r0
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r0.first()
            X.C0J r1 = (X.C0J) r1
            if (r1 == 0) goto L5d
            boolean r0 = r7.A03
            if (r0 == 0) goto L5e
            X.C3157C0f.A00(r6, r1, r10)
        L5d:
            return r5
        L5e:
            r6.Aax(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3169C0x.A01(X.C0g, X.C0x, X.C0y, X.C10, java.lang.String):boolean");
    }

    @Override // X.C0S
    public final boolean AbD() {
        return false;
    }

    public C3169C0x() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.InterfaceC3158C0g r11, java.lang.String r12, long r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3169C0x.A00(X.C0g, java.lang.String, long):void");
    }

    @Override // X.C0R
    public final void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        String str;
        InterfaceC3158C0g interfaceC3158C0gA00;
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        C3168C0w c3168C0w = this.A04;
        if (c3168C0w == null || !c3168C0w.A02(c0j)) {
            c3168C0w = null;
            long j = c0j.A04;
            C10 c10 = j <= ((long) this.A00) ? C10.A03 : C10.A02;
            str = c0j.A06;
            String strA00 = AbstractC3160C0i.A00(str);
            if (strA00 != null) {
                C11 c11 = this.A02;
                Map<String, Long> map = c11.A04;
                Number numberA0b = BV4.A0b(strA00, map);
                BV4.A1I(strA00, map, numberA0b != null ? numberA0b.longValue() + c0j.A03 : c0j.A03);
                if (j > c11.A01) {
                    Comparator<C0J> comparator = c11.A03;
                    Map<String, TreeSet<C0J>> map2 = c11.A05;
                    TreeSet<C0J> treeSet = map2.get(strA00);
                    if (treeSet != null) {
                        treeSet.add(c0j);
                    } else {
                        TreeSet<C0J> treeSet2 = new TreeSet<>(comparator);
                        treeSet2.add(c0j);
                        map2.put(strA00, treeSet2);
                    }
                }
            }
            C3170C0y c3170C0y = this.A01;
            TreeSet<C0J> treeSet3 = c3170C0y.A02.get(c10);
            if (treeSet3 != null) {
                treeSet3.add(c0j);
            }
            Map<C10, Long> map3 = c3170C0y.A01;
            BV4.A1I(c10, map3, C60P.A01(BV4.A0b(c10, map3)) + c0j.A03);
        } else {
            str = c0j.A06;
            String strA002 = AbstractC3160C0i.A00(str);
            if (strA002 != null) {
                synchronized (c3168C0w.A03) {
                    c3168C0w.A06.add(c0j);
                    long j2 = c3168C0w.A00;
                    long j3 = c0j.A03;
                    c3168C0w.A00 = j2 + j3;
                    HashMap<String, Set<C0J>> map4 = c3168C0w.A05;
                    Set<C0J> setA0k = map4.get(strA002);
                    if (setA0k == null) {
                        setA0k = C3cG.A0k();
                        map4.put(strA002, setA0k);
                    }
                    setA0k.add(c0j);
                    HashMap<String, Long> map5 = c3168C0w.A04;
                    Long l = map5.get(strA002);
                    if (l != null) {
                        BV4.A1F(strA002, map5, Math.max(l.longValue() - j3, 0L));
                    }
                }
            }
        }
        A00(interfaceC3158C0g, str, 0L);
        if (c3168C0w != null) {
            if (!(interfaceC3158C0g instanceof C3157C0f)) {
                c3168C0w.A08 = interfaceC3158C0g;
            }
            long j4 = c3168C0w.A01;
            if (j4 <= 0 || j4 < 0 || (interfaceC3158C0gA00 = C3168C0w.A00(interfaceC3158C0g, c3168C0w)) == null) {
                return;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            try {
                synchronized (interfaceC3158C0gA00) {
                    synchronized (c3168C0w.A03) {
                        while (c3168C0w.A00 > j4) {
                            TreeSet<C0J> treeSet4 = c3168C0w.A06;
                            C0J c0j2 = (C0J) AbstractC0878AGe.A0C(treeSet4);
                            if (c0j2 != null) {
                                String strA003 = AbstractC3160C0i.A00(c0j2.A06);
                                if (strA003 != null && c3168C0w.A05.containsKey(strA003)) {
                                    C3171C0z c3171C0zA01 = C3168C0w.A01(interfaceC3158C0gA00, c3168C0w, strA003, "lru_policy");
                                    if (c3171C0zA01 == null) {
                                        break;
                                    } else {
                                        arrayListA0h.add(c3171C0zA01);
                                    }
                                } else {
                                    interfaceC3158C0gA00.Aax(c0j2);
                                    if (treeSet4.remove(c0j2)) {
                                        c3168C0w.A00 = Math.max(c3168C0w.A00 - c0j2.A03, 0L);
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            } finally {
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    BV7.A1M(it);
                }
            }
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

    public C3169C0x(C3168C0w c3168C0w, C12 c12, float f, float f2, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        this.A00 = i2;
        this.A03 = z;
        this.A05 = c12;
        this.A04 = c3168C0w;
        this.A07 = z2;
        this.A06 = z3;
        Comparator<C0J> comparator = A08;
        this.A02 = new C11(comparator, f, i, j);
        C3170C0y c3170C0y = new C3170C0y(comparator, j);
        this.A01 = c3170C0y;
        C10 c10 = C10.A03;
        if (c12 != null) {
            throw BV4.A0a("getMaxUtilizationPercentage");
        }
        c3170C0y.A00(c10, f2 <= 0.0f ? 0.3f : f2);
        c3170C0y.A00(C10.A04, f2 <= 0.0f ? 0.3f : f2);
    }
}
