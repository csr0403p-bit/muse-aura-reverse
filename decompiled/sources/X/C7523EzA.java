package X;

import java.util.LinkedHashMap;

/* renamed from: X.EzA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7523EzA<K, V> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final C7543F1e<K, V> A08 = new C7543F1e<>(0);
    public final F0b A07 = new F0b();

    public final V A02(K k) {
        V vPut;
        C7384Etj.A0Y(k, 0);
        F0b f0b = this.A07;
        synchronized (f0b) {
            LinkedHashMap<K, V> linkedHashMap = this.A08.A00;
            V v = linkedHashMap.get(k);
            if (v != null) {
                this.A04++;
                return v;
            }
            this.A05++;
            V vA01 = A01(k);
            if (vA01 == null) {
                return null;
            }
            synchronized (f0b) {
                this.A02++;
                vPut = linkedHashMap.put(k, vA01);
                if (vPut != null) {
                    linkedHashMap.put(k, vPut);
                } else {
                    this.A01++;
                }
            }
            if (vPut == null) {
                A00(this, this.A00);
                return vA01;
            }
            if (this instanceof EJU) {
                EIK eik = (EIK) vA01;
                AnonymousClass003.A0x(k, eik);
                eik.close();
            }
            return vPut;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        throw X.C3cG.A0Q("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C7523EzA r6, int r7) {
        /*
        L0:
            X.F0b r3 = r6.A07
            monitor-enter(r3)
            int r1 = r6.A01     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            if (r1 < 0) goto L55
            X.F1e<K, V> r0 = r6.A08     // Catch: java.lang.Throwable -> L5c
            java.util.LinkedHashMap<K, V> r4 = r0.A00     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L14
            if (r1 != 0) goto L55
        L14:
            if (r1 <= r7) goto L53
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L53
            java.util.Set r0 = r4.entrySet()     // Catch: java.lang.Throwable -> L5c
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = X.AbstractC0878AGe.A0C(r0)     // Catch: java.lang.Throwable -> L5c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L53
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            X.C7384Etj.A0Y(r2, r0)     // Catch: java.lang.Throwable -> L5c
            r4.remove(r2)     // Catch: java.lang.Throwable -> L5c
            int r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r5
            r6.A01 = r0     // Catch: java.lang.Throwable -> L5c
            int r0 = r6.A03     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 1
            r6.A03 = r0     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)
            boolean r0 = r6 instanceof X.EJU
            if (r0 == 0) goto L0
            X.EIK r1 = (X.EIK) r1
            X.AnonymousClass003.A0x(r2, r1)
            r1.close()
            goto L0
        L53:
            monitor-exit(r3)
            return
        L55:
            java.lang.String r0 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L5c
            throw r0     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7523EzA.A00(X.EzA, int):void");
    }

    public final void A03(int i) {
        if (i <= 0) {
            throw C60O.A0i("maxSize <= 0");
        }
        synchronized (this.A07) {
            this.A00 = i;
        }
        A00(this, i);
    }

    /* JADX WARN: Incorrect return type in method signature: (TK;)TV; */
    public final void A04(Object obj) {
        synchronized (this.A07) {
            if (this.A08.A00.remove(obj) != null) {
                this.A01--;
            }
        }
    }

    public final String toString() {
        String strA0i;
        synchronized (this.A07) {
            int i = this.A04;
            int i2 = this.A05;
            int i3 = i + i2;
            strA0i = FGI.A0i("LruCache[maxSize=", ",hits=", ",misses=", ",hitRate=", "%]", this.A00, i, i2, i3 != 0 ? (i * 100) / i3 : 0);
        }
        return strA0i;
    }

    public C7523EzA(int i) {
        this.A00 = i;
    }

    public V A01(K k) {
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: (TK;TV;)TV; */
    public final void A05(Object obj, Object obj2) {
        V vPut;
        boolean zA1Y = C60P.A1Y(obj, obj2);
        synchronized (this.A07) {
            this.A06++;
            this.A01++;
            vPut = this.A08.A00.put(obj, obj2);
            if (vPut != null) {
                this.A01 -= zA1Y ? 1 : 0;
            }
        }
        if (vPut != null && (this instanceof EJU)) {
            EIK eik = (EIK) vPut;
            AnonymousClass003.A0x(obj, eik);
            eik.close();
        }
        A00(this, this.A00);
    }
}
