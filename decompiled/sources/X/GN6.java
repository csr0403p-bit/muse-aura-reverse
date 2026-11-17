package X;

import com.facebook.aura.gateway.ApprovalRequestPreviewJsonKt;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class GN6 implements Map, Serializable {
    public static final GN6 A06 = new GN6(null, new Object[0], 0);
    public transient GN9 A00;
    public transient GN8 A01;
    public transient GNB A02;
    public final transient int A03;
    public final transient Object A04;
    public final transient Object[] A05;

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        GNB gnb = this.A02;
        if (gnb == null) {
            gnb = new GNB(this.A05, 1, this.A03);
            this.A02 = gnb;
        }
        return gnb.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        GN9 gn9 = this.A00;
        if (gn9 != null) {
            return gn9;
        }
        GN9 gn92 = new GN9(this, this.A05, this.A03);
        this.A00 = gn92;
        return gn92;
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

    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r4 = r6.A04
            java.lang.Object[] r3 = r6.A05
            int r0 = r6.A03
            r6 = 0
            if (r7 == 0) goto L8a
            r1 = 1
            if (r0 != r1) goto L1c
            r0 = 0
            java.lang.Object r0 = X.BV6.A0n(r3, r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L8a
            java.lang.Object r0 = X.BV6.A0n(r3, r1)
        L1b:
            return r0
        L1c:
            if (r4 == 0) goto L8a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L42
            byte[] r4 = (byte[]) r4
            int r0 = r4.length
            int r2 = r0 + (-1)
            int r0 = r7.hashCode()
            int r1 = X.AbstractC7611F5y.A06(r0)
        L2f:
            r1 = r1 & r2
            r5 = r4[r1]
            r0 = 255(0xff, float:3.57E-43)
            r5 = r5 & r0
            if (r5 == r0) goto L8a
            r0 = r3[r5]
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L84
            int r1 = r1 + 1
            goto L2f
        L42:
            boolean r0 = r4 instanceof short[]
            if (r0 == 0) goto L67
            short[] r4 = (short[]) r4
            int r0 = r4.length
            int r2 = r0 + (-1)
            int r0 = r7.hashCode()
            int r1 = X.AbstractC7611F5y.A06(r0)
        L53:
            r1 = r1 & r2
            short r5 = r4[r1]
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            if (r5 == r0) goto L8a
            r0 = r3[r5]
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L84
            int r1 = r1 + 1
            goto L53
        L67:
            int[] r4 = (int[]) r4
            int r2 = r4.length
            int r2 = r2 - r1
            int r0 = r7.hashCode()
            int r1 = X.AbstractC7611F5y.A06(r0)
        L73:
            r1 = r1 & r2
            r5 = r4[r1]
            r0 = -1
            if (r5 == r0) goto L8a
            r0 = r3[r5]
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L84
            int r1 = r1 + 1
            goto L73
        L84:
            r0 = r5 ^ 1
            r0 = r3[r0]
            if (r0 != 0) goto L1b
        L8a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GN6.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int hashCode() {
        GN9 gn9 = this.A00;
        if (gn9 == null) {
            gn9 = new GN9(this, this.A05, this.A03);
            this.A00 = gn9;
        }
        Iterator it = gn9.iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.Map
    public final Set keySet() {
        GN8 gn8 = this.A01;
        if (gn8 != null) {
            return gn8;
        }
        GN8 gn82 = new GN8(new GNB(this.A05, 0, this.A03), this);
        this.A01 = gn82;
        return gn82;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    public final String toString() {
        int i = this.A03;
        if (i < 0) {
            throw C60O.A0i(FGI.A0S("size", BV3.A00(14), i));
        }
        StringBuilder sbA0p = BV4.A0p((int) Math.min(i * 8, ApprovalRequestPreviewJsonKt.MAX_ATTACHMENT_SIZE_BYTES));
        sbA0p.append('{');
        Iterator it = ((AbstractCollection) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            if (!z) {
                C8j3.A1K(sbA0p);
            }
            sbA0p.append(entryA0l.getKey());
            sbA0p.append('=');
            sbA0p.append(entryA0l.getValue());
            z = false;
        }
        return C8j3.A15(sbA0p);
    }

    @Override // java.util.Map
    public final Collection values() {
        GNB gnb = this.A02;
        if (gnb != null) {
            return gnb;
        }
        GNB gnb2 = new GNB(this.A05, 1, this.A03);
        this.A02 = gnb2;
        return gnb2;
    }

    public GN6() {
    }

    @Override // java.util.Map
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
    public final Object put(Object obj, Object obj2) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw C8j3.A17();
    }

    public GN6(Object obj, Object[] objArr, int i) {
        this.A04 = obj;
        this.A05 = objArr;
        this.A03 = i;
    }
}
