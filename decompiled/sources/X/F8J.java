package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class F8J {
    public final C7648F8p A00;
    public final Object A01;
    public final String A02;
    public final Map<String, F8J> A03;
    public final Set<String> A04;
    public final int A05;

    public final Object A02(F6D f6d, String str) {
        C7384Etj.A0Y(str, 0);
        F8K f8k = f6d.A04;
        if (f8k != null) {
            if (f8k.AfX()) {
                f8k.A3N(this.A04);
            }
            f8k.A40(this, str);
        }
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F8J) {
                F8J f8j = (F8J) obj;
                if (!this.A02.equals(f8j.A02) || !C7384Etj.areEqual(this.A01, f8j.A01) || !this.A04.equals(f8j.A04) || !this.A03.equals(f8j.A03) || this.A05 != f8j.A05 || !C7384Etj.areEqual(this.A00, f8j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final F8J A00(F6D f6d, F8L f8l) {
        int iIntValue;
        C7648F8p c7648F8pA01;
        F98 f98 = new F98();
        FBB fbb = f6d.A02;
        C7648F8p c7648F8p = ((F6L) f6d).A02;
        Map<String, F8J> map = f6d.A09;
        Htq<F6D> htq = f6d.A05;
        String str = f6d.A07;
        F9H f9h = ((F6L) f6d).A00;
        String str2 = f6d.A01;
        if (str2 == null) {
            throw AbstractC7608F5v.A0e();
        }
        Integer num = f6d.A06;
        WeakReference<FBB> weakReference = f6d.A08;
        F6D f6d2 = new F6D(f9h, fbb, weakReference != null ? weakReference.get() : null, f6d.A03, f98, htq, c7648F8p, num, str, str2, map, f6d.A0A);
        try {
            String str3 = f8l.A02;
            C7384Etj.A0T(str3);
            FDG fdgA00 = f8l.A00.A00(null, null);
            fdgA00.A01();
            Object objA01 = AbstractC7691FAk.A01(f6d2, Hj6.A02, fdgA00, C79.A00);
            Set set = f98.A01;
            if (set == null) {
                set = A3q.A00;
            }
            Map map2 = f98.A00;
            if (map2 == null) {
                map2 = C9jH.A00;
            }
            Integer num2 = f8l.A01;
            if (num2 != null) {
                iIntValue = num2.intValue();
                if (iIntValue > 0 && c7648F8p.A00 >= iIntValue) {
                    c7648F8pA01 = c7648F8p.A01(iIntValue);
                }
                return new F8J(c7648F8pA01, objA01, str3, map2, set, iIntValue);
            }
            iIntValue = 0;
            c7648F8pA01 = null;
            return new F8J(c7648F8pA01, objA01, str3, map2, set, iIntValue);
        } catch (RuntimeException e) {
            F8K f8k = f6d.A04;
            if (f8k != null) {
                Iterable<String> iterable = f98.A01;
                if (iterable == null) {
                    iterable = A3q.A00;
                }
                f8k.A3N(iterable);
            }
            Map map3 = f98.A00;
            if (map3 == null) {
                map3 = C9jH.A00;
            }
            Iterator itA0n = AnonymousClass002.A0n(map3);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                F8J f8j = (F8J) entryA0l.getValue();
                if (f8k != null) {
                    f8k.A40(f8j, strA0t);
                }
            }
            throw e;
        }
    }

    public static final String A01(F8L f8l, C7648F8p c7648F8p) {
        int iIntValue;
        Integer num = f8l.A01;
        if (num == null || (iIntValue = num.intValue()) == 0) {
            String str = f8l.A02;
            C7384Etj.A0T(str);
            return str;
        }
        String str2 = f8l.A02;
        C7384Etj.A0T(str2);
        return AbstractC7647F8o.A01(c7648F8p, C79.A00, str2, iIntValue);
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A04, (AnonymousClass001.A0G(this.A02) + AnonymousClass006.A0D(this.A01)) * 31)) + this.A05) * 31) + C3cH.A02(this.A00);
    }

    public final String toString() {
        String str = this.A02;
        Object obj = this.A01;
        Set<String> set = this.A04;
        Map<String, F8J> map = this.A03;
        int i = this.A05;
        C7648F8p c7648F8p = this.A00;
        StringBuilder sbA0x = C3cI.A0x("ValueEntry(key=", str);
        sbA0x.append(", value=");
        sbA0x.append(obj);
        sbA0x.append(", variableLog=");
        sbA0x.append(set);
        sbA0x.append(", valueLog=");
        sbA0x.append(map);
        sbA0x.append(", depth=");
        sbA0x.append(i);
        return C3cJ.A0L(c7648F8p, ", keyPath=", sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set<Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;LX/F8J;>;ILX/F8p;)V */
    public F8J(C7648F8p c7648F8p, Object obj, String str, Map map, Set set, int i) {
        this.A02 = str;
        this.A01 = obj;
        this.A04 = set;
        this.A03 = map;
        this.A05 = i;
        this.A00 = c7648F8p;
    }
}
