package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CeF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3772CeF implements Map, Serializable {
    public static final C3772CeF A06 = new C3772CeF(null, new Object[0], 0);
    public transient COV A00;
    public transient CPY A01;
    public transient CPY A02;
    public final transient int A03;
    public final transient Object[] A04;
    public final transient Object A05;

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L8b
            int r0 = r8.A03
            java.lang.Object[] r3 = r8.A04
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r0 = X.BV6.A0n(r3, r0)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L8b
            java.lang.Object r0 = X.BV6.A0n(r3, r1)
        L19:
            return r0
        L1a:
            java.lang.Object r4 = r8.A05
            if (r4 == 0) goto L8b
            boolean r0 = r4 instanceof byte[]
            r6 = -1
            if (r0 == 0) goto L43
            byte[] r4 = (byte[]) r4
            int r0 = r4.length
            int r2 = r0 + (-1)
            int r0 = r9.hashCode()
            int r1 = X.CeO.A00(r0)
        L30:
            r1 = r1 & r2
            r5 = r4[r1]
            r0 = 255(0xff, float:3.57E-43)
            r5 = r5 & r0
            if (r5 == r0) goto L8b
            r0 = r3[r5]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L85
            int r1 = r1 + 1
            goto L30
        L43:
            boolean r0 = r4 instanceof short[]
            if (r0 == 0) goto L68
            short[] r4 = (short[]) r4
            int r0 = r4.length
            int r2 = r0 + (-1)
            int r0 = r9.hashCode()
            int r1 = X.CeO.A00(r0)
        L54:
            r1 = r1 & r2
            short r0 = r4[r1]
            char r5 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r5 == r0) goto L8b
            r0 = r3[r5]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L85
            int r1 = r1 + 1
            goto L54
        L68:
            int[] r4 = (int[]) r4
            int r0 = r4.length
            int r2 = r0 + (-1)
            int r0 = r9.hashCode()
            int r1 = X.CeO.A00(r0)
        L75:
            r1 = r1 & r2
            r5 = r4[r1]
            if (r5 == r6) goto L8b
            r0 = r3[r5]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L85
            int r1 = r1 + 1
            goto L75
        L85:
            r0 = r5 ^ 1
            r0 = r3[r0]
            if (r0 != 0) goto L19
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3772CeF.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        COV c3780CeN = this.A00;
        if (c3780CeN == null) {
            c3780CeN = new C3780CeN(this.A04, 1, this.A03);
            this.A00 = c3780CeN;
        }
        return c3780CeN.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        CPY cpy = this.A01;
        if (cpy != null) {
            return cpy;
        }
        C3773CeG c3773CeG = new C3773CeG(this, this.A04, this.A03);
        this.A01 = c3773CeG;
        return c3773CeG;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final int hashCode() {
        CPY c3773CeG = this.A01;
        if (c3773CeG == null) {
            c3773CeG = new C3773CeG(this, this.A04, this.A03);
            this.A01 = c3773CeG;
        }
        Iterator it = c3773CeG.iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        CPY cpy = this.A02;
        if (cpy != null) {
            return cpy;
        }
        C3774CeH c3774CeH = new C3774CeH(new C3780CeN(this.A04, 0, this.A03), this);
        this.A02 = c3774CeH;
        return c3774CeH;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        COV cov = this.A00;
        if (cov != null) {
            return cov;
        }
        C3780CeN c3780CeN = new C3780CeN(this.A04, 1, this.A03);
        this.A00 = c3780CeN;
        return c3780CeN;
    }

    public C3772CeF() {
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return AnonymousClass002.A1X(get(obj));
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw C8j3.A17();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw BV5.A0Q("size cannot be negative but was: ", size);
        }
        StringBuilder sbA11 = BV8.A11(size);
        Iterator it = entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            if (!z) {
                C8j3.A1K(sbA11);
            }
            BV8.A1R(sbA11, entryA0l);
            z = false;
        }
        return C8j3.A15(sbA11);
    }

    public C3772CeF(Object obj, Object[] objArr, int i) {
        this.A05 = obj;
        this.A04 = objArr;
        this.A03 = i;
    }
}
