package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class ERD<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> A00 = new C7572F4l(34);
    public final boolean allowNullValues;
    public final Comparator<? super K> comparator;

    /* JADX WARN: Incorrect inner types in field signature: LX/ERD<TK;TV;>.EntrySet; */
    public ERF entrySet;
    public final ERE<K, V> header;

    /* JADX WARN: Incorrect inner types in field signature: LX/ERD<TK;TV;>.KeySet; */
    public ERH keySet;
    public int modCount;
    public ERE<K, V> root;
    public int size;

    public ERD(boolean z) {
        Comparator<Comparable> comparator = A00;
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator;
        this.allowNullValues = false;
        this.header = new ERE<>(false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        ERE<K, V> ere = this.header;
        ere.A04 = ere;
        ere.A02 = ere;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        ERE ereA00 = null;
        if (obj != null) {
            try {
                ereA00 = A00(this, obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (ereA00 != null) {
            return ereA00.A06;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        ERE<K, V> ereA00 = null;
        if (obj != null) {
            try {
                ereA00 = A00(this, obj, false);
                if (ereA00 != null) {
                    A05(ereA00, true);
                }
            } catch (ClassCastException unused) {
            }
        }
        if (ereA00 != null) {
            return ereA00.A06;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[PHI: r2 r5
  0x0026: PHI (r2v1 java.lang.Comparable) = (r2v0 java.lang.Comparable), (r2v3 java.lang.Comparable) binds: [B:16:0x0025, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r5v2 X.ERE<K, V>) = (r5v0 X.ERE<K, V>), (r5v5 X.ERE<K, V>) binds: [B:16:0x0025, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0020 -> B:7:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ERE A00(X.ERD r10, java.lang.Object r11, boolean r12) {
        /*
            java.util.Comparator<? super K> r3 = r10.comparator
            X.ERE<K, V> r5 = r10.root
            r4 = 0
            r8 = r11
            if (r5 == 0) goto L2d
            java.util.Comparator<java.lang.Comparable> r0 = X.ERD.A00
            if (r3 != r0) goto L25
            r2 = r8
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        Lf:
            if (r2 == 0) goto L26
            K r0 = r5.A07
            int r1 = r2.compareTo(r0)
        L17:
            if (r1 != 0) goto L1a
            return r5
        L1a:
            if (r1 >= 0) goto L22
            X.ERE<K, V> r0 = r5.A01
        L1e:
            if (r0 == 0) goto L2e
            r5 = r0
            goto Lf
        L22:
            X.ERE<K, V> r0 = r5.A05
            goto L1e
        L25:
            r2 = r4
        L26:
            K r0 = r5.A07
            int r1 = r3.compare(r11, r0)
            goto L17
        L2d:
            r1 = 0
        L2e:
            if (r12 == 0) goto L78
            X.ERE<K, V> r6 = r10.header
            r0 = 1
            if (r5 != 0) goto L4d
            java.util.Comparator<java.lang.Comparable> r0 = X.ERD.A00
            if (r3 != r0) goto L61
            boolean r0 = r11 instanceof java.lang.Comparable
            if (r0 != 0) goto L61
            java.lang.String r1 = X.C60Q.A0e(r11)
            java.lang.String r0 = " is not Comparable"
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L4d:
            boolean r9 = r10.allowNullValues
            X.ERE<K, V> r7 = r6.A04
            X.ERE r4 = new X.ERE
            r4.<init>(r5, r6, r7, r8, r9)
            if (r1 >= 0) goto L5e
            r5.A01 = r4
        L5a:
            r10.A04(r5, r0)
            goto L6c
        L5e:
            r5.A05 = r4
            goto L5a
        L61:
            boolean r9 = r10.allowNullValues
            X.ERE<K, V> r7 = r6.A04
            X.ERE r4 = new X.ERE
            r4.<init>(r5, r6, r7, r8, r9)
            r10.root = r4
        L6c:
            int r0 = r10.size
            int r0 = r0 + 1
            r10.size = r0
            int r0 = r10.modCount
            int r0 = r0 + 1
            r10.modCount = r0
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERD.A00(X.ERD, java.lang.Object, boolean):X.ERE");
    }

    private void A01(ERE<K, V> ere) {
        ERE<K, V> ere2 = ere.A01;
        ERE<K, V> ere3 = ere.A05;
        ERE<K, V> ere4 = ere3.A01;
        ERE<K, V> ere5 = ere3.A05;
        ere.A05 = ere4;
        if (ere4 != null) {
            ere4.A03 = ere;
        }
        A03(ere, ere3);
        ere3.A01 = ere;
        ere.A03 = ere3;
        int iMax = Math.max(ere2 != null ? ere2.A00 : 0, ere4 != null ? ere4.A00 : 0) + 1;
        ere.A00 = iMax;
        ere3.A00 = Math.max(iMax, ere5 != null ? ere5.A00 : 0) + 1;
    }

    private void A02(ERE<K, V> ere) {
        ERE<K, V> ere2 = ere.A01;
        ERE<K, V> ere3 = ere.A05;
        ERE<K, V> ere4 = ere2.A01;
        ERE<K, V> ere5 = ere2.A05;
        ere.A01 = ere5;
        if (ere5 != null) {
            ere5.A03 = ere;
        }
        A03(ere, ere2);
        ere2.A05 = ere;
        ere.A03 = ere2;
        int iMax = Math.max(ere3 != null ? ere3.A00 : 0, ere5 != null ? ere5.A00 : 0) + 1;
        ere.A00 = iMax;
        ere2.A00 = Math.max(iMax, ere4 != null ? ere4.A00 : 0) + 1;
    }

    private void A03(ERE<K, V> ere, ERE<K, V> ere2) {
        ERE<K, V> ere3 = ere.A03;
        ere.A03 = null;
        if (ere2 != null) {
            ere2.A03 = ere3;
        }
        if (ere3 == null) {
            this.root = ere2;
        } else if (ere3.A01 == ere) {
            ere3.A01 = ere2;
        } else {
            ere3.A05 = ere2;
        }
    }

    private void A04(ERE<K, V> ere, boolean z) {
        while (ere != null) {
            ERE<K, V> ere2 = ere.A01;
            ERE<K, V> ere3 = ere.A05;
            int i = ere2 != null ? ere2.A00 : 0;
            int i2 = ere3 != null ? ere3.A00 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                ERE<K, V> ere4 = ere3.A01;
                ERE<K, V> ere5 = ere3.A05;
                int i4 = (ere4 != null ? ere4.A00 : 0) - (ere5 != null ? ere5.A00 : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    A02(ere3);
                }
                A01(ere);
            } else if (i3 == 2) {
                ERE<K, V> ere6 = ere2.A01;
                ERE<K, V> ere7 = ere2.A05;
                int i5 = (ere6 != null ? ere6.A00 : 0) - (ere7 != null ? ere7.A00 : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    A01(ere2);
                }
                A02(ere);
            } else if (i3 == 0) {
                ere.A00 = i + 1;
            } else {
                ere.A00 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                } else {
                    ere = ere.A03;
                }
            }
            if (z) {
                return;
            } else {
                ere = ere.A03;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final void A05(ERE<K, V> ere, boolean z) {
        int i;
        if (z) {
            ERE<K, V> ere2 = ere.A04;
            ere2.A02 = ere.A02;
            ere.A02.A04 = ere2;
        }
        ERE<K, V> ere3 = ere.A01;
        ERE<K, V> ere4 = ere.A05;
        ERE<K, V> ere5 = ere.A03;
        int i2 = 0;
        if (ere3 != null) {
            if (ere4 != null) {
                if (ere3.A00 > ere4.A00) {
                    for (ERE<K, V> ere6 = ere3.A05; ere6 != null; ere6 = ere6.A05) {
                        ere3 = ere6;
                    }
                } else {
                    ere3 = ere4;
                    for (ERE<K, V> ere7 = ere4.A01; ere7 != null; ere7 = ere7.A01) {
                        ere3 = ere7;
                    }
                }
                A05(ere3, false);
                ERE<K, V> ere8 = ere.A01;
                if (ere8 != null) {
                    i = ere8.A00;
                    ere3.A01 = ere8;
                    ere8.A03 = ere3;
                    ere.A01 = null;
                } else {
                    i = 0;
                }
                ERE<K, V> ere9 = ere.A05;
                if (ere9 != null) {
                    i2 = ere9.A00;
                    ere3.A05 = ere9;
                    ere9.A03 = ere3;
                    ere.A05 = null;
                }
                ere3.A00 = Math.max(i, i2) + 1;
                A03(ere, ere3);
                return;
            }
            A03(ere, ere3);
            ere.A01 = null;
        } else if (ere4 != null) {
            A03(ere, ere4);
            ere.A05 = null;
        } else {
            A03(ere, null);
        }
        A04(ere5, false);
        this.size--;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            try {
                if (A00(this, obj, false) != null) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ERF erf = this.entrySet;
        if (erf != null) {
            return erf;
        }
        ERF erf2 = new ERF(this);
        this.entrySet = erf2;
        return erf2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        ERH erh = this.keySet;
        if (erh != null) {
            return erh;
        }
        ERH erh2 = new ERH(this);
        this.keySet = erh2;
        return erh2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw BV4.A0a("key == null");
        }
        if (v == null && !this.allowNullValues) {
            throw BV4.A0a("value == null");
        }
        ERE ereA00 = A00(this, k, true);
        V v2 = ereA00.A06;
        ereA00.A06 = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public ERD() {
        Comparator<Comparable> comparator = A00;
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator;
        this.allowNullValues = true;
        this.header = new ERE<>(true);
    }
}
