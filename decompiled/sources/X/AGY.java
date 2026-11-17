package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AGY<K, V> implements Map<K, V>, InterfaceC0863A6k {
    public final Object A01 = C3cG.A0T();
    public final G0V<K, V, V> A02 = new BUZ(this, 13);
    public final C0918AHu<K, V> A00 = new C0918AHu<>(6);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C7384Etj.A0Y(map, 0);
        synchronized (this.A01) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                this.A00.A0E(entryA0l.getKey(), entryA0l.getValue());
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.A01) {
            this.A00.A0D();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zA07;
        synchronized (this.A01) {
            zA07 = this.A00.A07(obj);
        }
        return zA07;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zA08;
        synchronized (this.A01) {
            zA08 = this.A00.A08(obj);
        }
        return zA08;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        /*
            r16 = this;
            r13 = r16
            java.lang.Object r12 = r13.A01
            monitor-enter(r12)
            X.AHu<K, V> r1 = r13.A00     // Catch: java.lang.Throwable -> L5f
            int r0 = r1.A01     // Catch: java.lang.Throwable -> L5f
            java.util.HashSet r11 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5f
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r10 = r1.A04     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r9 = r1.A05     // Catch: java.lang.Throwable -> L5f
            long[] r8 = r1.A03     // Catch: java.lang.Throwable -> L5f
            int r0 = r8.length     // Catch: java.lang.Throwable -> L5f
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5d
            r6 = 0
        L1a:
            r15 = r8[r6]     // Catch: java.lang.Throwable -> L5f
            long r3 = X.C8j5.A0A(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            int r5 = X.C8j4.A07(r6, r7)
            r14 = 0
        L2f:
            if (r14 >= r5) goto L54
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4e
            int r0 = r6 << 3
            int r0 = r0 + r14
            r4 = r10[r0]     // Catch: java.lang.Throwable -> L5f
            r3 = r9[r0]     // Catch: java.lang.Throwable -> L5f
            r2 = 8
            X.G0V<K, V, V> r1 = r13.A02     // Catch: java.lang.Throwable -> L5f
            X.AGZ r0 = new X.AGZ     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r4, r3, r1)     // Catch: java.lang.Throwable -> L5f
            r11.add(r0)     // Catch: java.lang.Throwable -> L5f
            goto L50
        L4e:
            r2 = 8
        L50:
            long r15 = r15 >> r2
            int r14 = r14 + 1
            goto L2f
        L54:
            r0 = 8
            if (r5 != r0) goto L5d
        L58:
            if (r6 == r7) goto L5d
            int r6 = r6 + 1
            goto L1a
        L5d:
            monitor-exit(r12)
            return r11
        L5f:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGY.entrySet():java.util.Set");
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        V vA05;
        synchronized (this.A01) {
            vA05 = this.A00.A05(obj);
        }
        return vA05;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zA1M;
        synchronized (this.A01) {
            zA1M = AnonymousClass002.A1M(this.A00.A01);
        }
        return zA1M;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ java.util.Set<K> keySet() {
        /*
            r15 = this;
            java.lang.Object r11 = r15.A01
            monitor-enter(r11)
            X.AHu<K, V> r1 = r15.A00     // Catch: java.lang.Throwable -> L4e
            int r0 = r1.A01     // Catch: java.lang.Throwable -> L4e
            java.util.HashSet r13 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4e
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object[] r12 = r1.A04     // Catch: java.lang.Throwable -> L4e
            long[] r10 = r1.A03     // Catch: java.lang.Throwable -> L4e
            int r0 = r10.length     // Catch: java.lang.Throwable -> L4e
            int r9 = r0 + (-2)
            if (r9 < 0) goto L4c
            r8 = 0
        L16:
            r14 = r10[r8]     // Catch: java.lang.Throwable -> L4e
            long r3 = X.C8j5.A0A(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L2f:
            if (r5 >= r6) goto L45
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L41
            java.lang.Object r0 = X.C8j3.A11(r12, r8, r5)     // Catch: java.lang.Throwable -> L4e
            r13.add(r0)     // Catch: java.lang.Throwable -> L4e
        L41:
            long r14 = r14 >> r7
            int r5 = r5 + 1
            goto L2f
        L45:
            if (r6 != r7) goto L4c
        L47:
            if (r8 == r9) goto L4c
            int r8 = r8 + 1
            goto L16
        L4c:
            monitor-exit(r11)
            return r13
        L4e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGY.keySet():java.util.Set");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        V vA05;
        synchronized (this.A01) {
            C0918AHu<K, V> c0918AHu = this.A00;
            vA05 = c0918AHu.A05(k);
            c0918AHu.A0E(k, v);
        }
        return vA05;
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        V vA0B;
        synchronized (this.A01) {
            vA0B = this.A00.A0B(obj);
        }
        return vA0B;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        int i;
        synchronized (this.A01) {
            i = this.A00.A01;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ java.util.Collection<V> values() {
        /*
            r15 = this;
            java.lang.Object r11 = r15.A01
            monitor-enter(r11)
            X.AHu<K, V> r1 = r15.A00     // Catch: java.lang.Throwable -> L4d
            int r0 = r1.A01     // Catch: java.lang.Throwable -> L4d
            java.util.ArrayList r13 = X.C60O.A11(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r12 = r1.A05     // Catch: java.lang.Throwable -> L4d
            long[] r10 = r1.A03     // Catch: java.lang.Throwable -> L4d
            int r0 = r10.length     // Catch: java.lang.Throwable -> L4d
            int r9 = r0 + (-2)
            if (r9 < 0) goto L4b
            r8 = 0
        L15:
            r14 = r10[r8]     // Catch: java.lang.Throwable -> L4d
            long r3 = X.C8j5.A0A(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L46
            int r0 = X.C8j3.A0E(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L2e:
            if (r5 >= r6) goto L44
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L40
            java.lang.Object r0 = X.C8j3.A11(r12, r8, r5)     // Catch: java.lang.Throwable -> L4d
            r13.add(r0)     // Catch: java.lang.Throwable -> L4d
        L40:
            long r14 = r14 >> r7
            int r5 = r5 + 1
            goto L2e
        L44:
            if (r6 != r7) goto L4b
        L46:
            if (r8 == r9) goto L4b
            int r8 = r8 + 1
            goto L15
        L4b:
            monitor-exit(r11)
            return r13
        L4d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGY.values():java.util.Collection");
    }
}
