package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gkn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9907Gkn {
    public C10040GoK A00;
    public HashSet<String> A01;
    public LinkedHashMap<Object, AbstractC9970Gmj> A02;
    public LinkedHashMap<String, C9908Gko> A03;
    public LinkedList<AbstractC9970Gmj> A04;
    public LinkedList<AbstractC9970Gmj> A05;
    public LinkedList<AbstractC9970Gmj> A06;
    public LinkedList<C9934Glc> A07;
    public LinkedList<AbstractC9970Gmj> A08;
    public LinkedList<AbstractC9970Gmj> A09;
    public List<C9908Gko> A0A;
    public boolean A0B;
    public C9894GkV A0C;
    public final AbstractC9910Gks A0D;
    public final AbstractC9870GjI A0E;
    public final AbstractC9901Gkh<?> A0F;
    public final AbstractC10164GqZ A0G;
    public final C9909Gkr A0H;
    public final InterfaceC10176Gql<?> A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static final boolean A09(List<AbstractC9970Gmj> list) {
        do {
            AbstractC9970Gmj abstractC9970Gmj = list.get(0);
            AbstractC9970Gmj abstractC9970Gmj2 = list.get(1);
            if (abstractC9970Gmj instanceof C9943Glv) {
                if (!(abstractC9970Gmj2 instanceof C9934Glc)) {
                    return false;
                }
                list.remove(0);
            } else {
                if (!(abstractC9970Gmj instanceof C9934Glc) || !(abstractC9970Gmj2 instanceof C9943Glv)) {
                    return false;
                }
                list.remove(1);
            }
        } while (list.size() > 1);
        return true;
    }

    private final void A02(C10085Gp8 c10085Gp8, AbstractC9970Gmj abstractC9970Gmj) {
        if (c10085Gp8 != null) {
            Object obj = c10085Gp8._id;
            LinkedHashMap<Object, AbstractC9970Gmj> linkedHashMapA0j = this.A02;
            if (linkedHashMapA0j == null) {
                linkedHashMapA0j = C3cG.A0j();
                this.A02 = linkedHashMapA0j;
            }
            AbstractC9970Gmj abstractC9970GmjPut = linkedHashMapA0j.put(obj, abstractC9970Gmj);
            if (abstractC9970GmjPut == null || abstractC9970GmjPut.getClass() != abstractC9970Gmj.getClass()) {
                return;
            }
            A05(this, "Duplicate injectable value with id '%s' (of type %s)", obj, AbstractC9855Gj3.A07(obj));
            throw F60.createAndThrow();
        }
    }

    public static void A03(C9907Gkn c9907Gkn) {
        if (c9907Gkn.A0B) {
            return;
        }
        A04(c9907Gkn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05fc A[PHI: r5 r21
  0x05fc: PHI (r5v46 X.Gko) = (r5v49 X.Gko), (r5v52 X.Gko) binds: [B:353:0x05fa, B:350:0x05e4] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r21v2 boolean) = (r21v4 boolean), (r21v6 boolean) binds: [B:353:0x05fa, B:350:0x05e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113 A[PHI: r8
  0x0113: PHI (r8v27 boolean) = (r8v26 boolean), (r8v29 boolean) binds: [B:44:0x00cb, B:46:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0b03 A[LOOP:24: B:652:0x0afd->B:654:0x0b03, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0b90 A[LOOP:27: B:685:0x0b8a->B:687:0x0b90, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x057a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:857:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0c83 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [X.Gkn] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractMap, java.util.LinkedHashMap, java.util.LinkedHashMap<java.lang.String, X.Gko>, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C9907Gkn r28) {
        /*
            Method dump skipped, instructions count: 3212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9907Gkn.A04(X.Gkn):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(X.C10040GoK r12, java.util.List<X.C9955GmN> r13, java.util.Map<java.lang.String, X.C9908Gko> r14, boolean r15) {
        /*
            r11 = this;
            X.Gkh<?> r4 = r11.A0F
            X.GqC r3 = r4.A04()
            java.util.Iterator r10 = r13.iterator()
        La:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lf1
            java.lang.Object r2 = r10.next()
            X.GmN r2 = (X.C9955GmN) r2
            boolean r0 = r2.A05
            if (r0 == 0) goto La
            r10.remove()
            X.Fsl r0 = r2.A00
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L65
            r0 = 2
            if (r1 == r0) goto L95
            X.Gnx r6 = r2.A04
            int r0 = r6.A0G()
            r5 = 0
            r8 = 1
            if (r0 != r8) goto L4b
            X.Fsm r0 = r3._singleArgMode
            int r1 = r0.ordinal()
            if (r1 == r5) goto L65
            if (r1 == r8) goto L95
            r0 = 3
            if (r1 != r0) goto L4b
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "Single-argument constructor (%s) is annotated but no 'mode' defined; `ConstructorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`"
            java.lang.IllegalArgumentException r0 = X.BV5.A0T(r0, r1)
            throw r0
        L4b:
            r2.A00(r4)
            X.Gnh[] r9 = r2.A02
            int r7 = r9.length
            r1 = 0
        L52:
            if (r1 >= r7) goto L5b
            r0 = r9[r1]
            if (r0 != 0) goto L95
            int r1 = r1 + 1
            goto L52
        L5b:
            java.util.LinkedList<X.Gmj> r0 = r11.A09
            if (r0 == 0) goto L73
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L73
        L65:
            java.util.List<X.GmN> r0 = r12.A01
            if (r0 != 0) goto L6f
            java.util.ArrayList r0 = X.C3cG.A0h()
            r12.A01 = r0
        L6f:
            r0.add(r2)
            goto La
        L73:
            int r0 = r6.A0G()
            if (r0 != r8) goto Lea
            X.Gnh[] r0 = r2.A03
            r1 = r0[r5]
            if (r1 == 0) goto Ldb
            java.lang.String r0 = r1._simpleName
            java.lang.Object r7 = r14.get(r0)
            X.Gko r7 = (X.C9908Gko) r7
            if (r7 == 0) goto L9e
            boolean r0 = r7.A0Q()
            if (r0 == 0) goto Ldb
            boolean r0 = r7.A0P()
            if (r0 != 0) goto Ldb
        L95:
            if (r15 != 0) goto La
            java.lang.String r0 = "explicit"
            r12.A00(r4, r2, r0)
            goto La
        L9e:
            java.util.Iterator r8 = X.BV5.A10(r14)
        La2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r7 = r8.next()
            X.Gko r7 = (X.C9908Gko) r7
            boolean r0 = r7.A0Q()
            if (r0 == 0) goto La2
            boolean r0 = r7.A0P()
            if (r0 != 0) goto La2
            X.Gml<X.Glv> r0 = r7.A01
            boolean r0 = X.C9908Gko.A07(r1, r0)
            if (r0 != 0) goto L95
            X.Gml<X.Glc> r0 = r7.A02
            boolean r0 = X.C9908Gko.A07(r1, r0)
            if (r0 != 0) goto L95
            X.Gml<X.Glc> r0 = r7.A03
            boolean r0 = X.C9908Gko.A07(r1, r0)
            if (r0 != 0) goto L95
            X.Gml<X.GmU> r0 = r7.A00
            boolean r0 = X.C9908Gko.A07(r1, r0)
            if (r0 == 0) goto La2
            goto L95
        Ldb:
            X.Gks r1 = r11.A0D
            if (r1 == 0) goto L65
            X.GmU r0 = r6.A0I(r5)
            X.Gp8 r0 = r1.A06(r0)
            if (r0 == 0) goto L65
            goto L95
        Lea:
            boolean r0 = r2.A01(r4)
            if (r0 == 0) goto L65
            goto L95
        Lf1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9907Gkn.A06(X.GoK, java.util.List, java.util.Map, boolean):void");
    }

    private final void A0B(String str) {
        if (this.A0J || str == null) {
            return;
        }
        HashSet<String> hashSetA13 = this.A01;
        if (hashSetA13 == null) {
            hashSetA13 = C60O.A13();
            this.A01 = hashSetA13;
        }
        hashSetA13.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9894GkV A0A() {
        /*
            r3 = this;
            X.GkV r2 = r3.A0C
            if (r2 != 0) goto L27
            X.Gks r1 = r3.A0D
            if (r1 == 0) goto L28
            X.Gkr r0 = r3.A0H
            X.GkV r2 = r1.A08(r0)
        Le:
            X.Gkh<?> r1 = r3.A0F
            X.GjI r0 = r3.A0E
            java.lang.Class<?> r0 = r0._class
            X.GkV r0 = r1.A00(r0)
            if (r0 == 0) goto L20
            if (r2 == 0) goto L24
            X.GkV r2 = r2.A00(r0)
        L20:
            if (r2 != 0) goto L25
            X.GkV r0 = X.C9894GkV.A01
        L24:
            r2 = r0
        L25:
            r3.A0C = r2
        L27:
            return r2
        L28:
            r2 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9907Gkn.A0A():X.GkV");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;ZLX/GjI;LX/Gkr;LX/GqZ;)V */
    public C9907Gkn(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, AbstractC10164GqZ abstractC10164GqZ, C9909Gkr c9909Gkr, boolean z) {
        AbstractC9910Gks abstractC9910GksA02;
        this.A0F = abstractC9901Gkh;
        this.A0J = z;
        this.A0E = abstractC9870GjI;
        this.A0H = c9909Gkr;
        this.A0K = abstractC9870GjI.A0T();
        if (abstractC9901Gkh.A08()) {
            this.A0L = true;
            abstractC9910GksA02 = abstractC9901Gkh.A02();
        } else {
            abstractC9910GksA02 = AbstractC10174Gqj.A00;
        }
        this.A0D = abstractC9910GksA02;
        this.A0I = abstractC9901Gkh.A06(c9909Gkr, abstractC9870GjI._class);
        this.A0G = abstractC10164GqZ;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;LX/Gko;>;Ljava/lang/String;)LX/Gko; */
    private final C9908Gko A00(String str, Map map) {
        C9908Gko c9908Gko = (C9908Gko) map.get(str);
        if (c9908Gko != null) {
            return c9908Gko;
        }
        AbstractC9901Gkh<?> abstractC9901Gkh = this.A0F;
        AbstractC9910Gks abstractC9910Gks = this.A0D;
        boolean z = this.A0J;
        C10009Gnh c10009GnhA00 = C10009Gnh.A00(str);
        C9908Gko c9908Gko2 = new C9908Gko(abstractC9910Gks, c10009GnhA00, c10009GnhA00, abstractC9901Gkh, z);
        map.put(str, c9908Gko2);
        return c9908Gko2;
    }

    private List<C9955GmN> A01(List<? extends AbstractC10024Gnx> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (AbstractC10024Gnx abstractC10024Gnx : list) {
            arrayListA0h.add(new C9955GmN(this.A0L ? this.A0D.A07(abstractC10024Gnx) : null, abstractC10024Gnx));
        }
        return arrayListA0h;
    }

    public static final void A05(C9907Gkn c9907Gkn, String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        StringBuilder sbA0x = C60O.A0x("Problem with definition of ");
        sbA0x.append(c9907Gkn.A0H);
        sbA0x.append(": ");
        throw C8j3.A0w(str2, sbA0x);
    }

    private void A07(List<C9955GmN> list) {
        Iterator<C9955GmN> it = list.iterator();
        while (it.hasNext()) {
            C9955GmN next = it.next();
            InterfaceC10176Gql<?> interfaceC10176Gql = this.A0I;
            if (!((C10044GoO) interfaceC10176Gql)._creatorMinLevel.A00(next.A04.A0F())) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Gko;>;LX/Gko;)Z */
    public static final boolean A08(C9908Gko c9908Gko, List list) {
        C9959GmU c9959GmUA0I = c9908Gko.A0I();
        if (list != null && c9959GmUA0I != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC9958GmS abstractC9958GmS = (AbstractC9958GmS) list.get(i);
                if (abstractC9958GmS != null && abstractC9958GmS.A0I() == c9959GmUA0I) {
                    list.set(i, c9908Gko);
                    return true;
                }
            }
        }
        return false;
    }
}
