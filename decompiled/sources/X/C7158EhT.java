package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EhT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7158EhT implements InterfaceC7121Egb, InterfaceC7127Egh {
    public C7167Ehc A00;
    public long A01;
    public final C7157EhS<K, C7161EhW<K, V>> A02;
    public final C7157EhS<K, C7161EhW<K, V>> A03;
    public final Map<Bitmap, Object> A04;
    public final InterfaceC7005EeA<C7167Ehc> A05;
    public final ECV A06;
    public final Eh0<V> A07;

    private final synchronized int A00() {
        return this.A02.A01() - this.A03.A01();
    }

    private final synchronized EfF<V> A01(C7161EhW<K, V> c7161EhW) {
        if (c7161EhW.A01) {
            throw BV4.A0S();
        }
        c7161EhW.A00++;
        return new EfF<>(EfF.A04, new C7160EhV(c7161EhW, this), c7161EhW.A02.A04());
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 X.EhT) */
    public static final synchronized EfF A02(C7161EhW c7161EhW, C7158EhT c7158EhT) {
        EfF efF;
        synchronized (c7158EhT) {
            if (c7161EhW == null) {
                throw BV4.A0U();
            }
            efF = (c7161EhW.A01 && c7161EhW.A00 == 0) ? c7161EhW.A02 : null;
        }
        return efF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        throw X.BV5.A0W("key is null, but exclusiveEntries count: %d, size: %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(r4.A00()), java.lang.Integer.valueOf(r4.A01())}, 2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.util.ArrayList<X.C7161EhW<K, V>> A03(int r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            int r5 = java.lang.Math.max(r7, r0)     // Catch: java.lang.Throwable -> L78
            int r3 = java.lang.Math.max(r8, r0)     // Catch: java.lang.Throwable -> L78
            X.EhS<K, X.EhW<K, V>> r4 = r6.A03     // Catch: java.lang.Throwable -> L78
            int r0 = r4.A00()     // Catch: java.lang.Throwable -> L78
            if (r0 > r5) goto L1b
            int r0 = r4.A01()     // Catch: java.lang.Throwable -> L78
            if (r0 > r3) goto L1b
            monitor-exit(r6)
            r2 = 0
            return r2
        L1b:
            java.util.ArrayList r2 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L78
        L1f:
            int r0 = r4.A00()     // Catch: java.lang.Throwable -> L78
            if (r0 > r5) goto L2c
            int r0 = r4.A01()     // Catch: java.lang.Throwable -> L78
            if (r0 > r3) goto L2c
            goto L53
        L2c:
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L78
            java.util.LinkedHashMap<K, V> r1 = r4.A02     // Catch: java.lang.Throwable -> L55
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L37
            r1 = 0
            goto L3f
        L37:
            java.util.Iterator r0 = X.BV5.A0y(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L55
        L3f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L43
            goto L58
        L43:
            r4.A02(r1)     // Catch: java.lang.Throwable -> L78
            X.EhS<K, X.EhW<K, V>> r0 = r6.A02     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.A02(r1)     // Catch: java.lang.Throwable -> L78
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> L78
            r2.add(r0)     // Catch: java.lang.Throwable -> L78
            goto L1f
        L53:
            monitor-exit(r6)
            return r2
        L55:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
            goto L77
        L58:
            java.lang.String r3 = "key is null, but exclusiveEntries count: %d, size: %d"
            int r0 = r4.A00()     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r4.A01()     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L78
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> L78
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L78
            java.lang.IllegalStateException r0 = X.BV5.A0W(r3, r0)     // Catch: java.lang.Throwable -> L78
        L77:
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L78
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7158EhT.A03(int, int):java.util.ArrayList");
    }

    private final synchronized void A05(C7161EhW<K, V> c7161EhW) {
        if (c7161EhW == 0) {
            throw BV4.A0U();
        }
        if (c7161EhW.A01) {
            throw BV4.A0S();
        }
        c7161EhW.A01 = true;
    }

    public static final void A06(C7158EhT c7158EhT) {
        ArrayList arrayListA03;
        synchronized (c7158EhT) {
            int iA0F = C8j3.A0F(c7158EhT.A00.A00, c7158EhT.A02.A00() - c7158EhT.A03.A00(), Integer.MAX_VALUE);
            C7167Ehc c7167Ehc = c7158EhT.A00;
            arrayListA03 = c7158EhT.A03(iA0F, C8j3.A0F(c7167Ehc.A02, c7158EhT.A00(), c7167Ehc.A03));
            c7158EhT.A0A(arrayListA03);
        }
        c7158EhT.A08(arrayListA03);
        A09(arrayListA03);
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r5v0 X.EhT) */
    public static final synchronized void A07(C7158EhT c7158EhT) {
        synchronized (c7158EhT) {
            if (c7158EhT.A01 + 300000 <= SystemClock.uptimeMillis()) {
                c7158EhT.A01 = SystemClock.uptimeMillis();
                C7167Ehc c7167Ehc = c7158EhT.A05.get();
                if (c7167Ehc == null) {
                    throw C3cG.A0Q("mMemoryCacheParamsSupplier returned null");
                }
                c7158EhT.A00 = c7167Ehc;
            }
        }
    }

    private final synchronized void A0A(ArrayList<C7161EhW<K, V>> arrayList) {
        if (arrayList != 0) {
            Iterator itA0N = C7384Etj.A0N(arrayList);
            while (itA0N.hasNext()) {
                A05((C7161EhW) C7384Etj.A0F(itA0N));
            }
        }
    }

    @Override // X.InterfaceC7121Egb
    public final EfF<V> AC3(K k) {
        Object objA02;
        Object obj;
        EfF efFA01;
        C7384Etj.A0Y(k, 0);
        synchronized (this) {
            objA02 = this.A03.A02(k);
            C7157EhS<K, C7161EhW<K, V>> c7157EhS = this.A02;
            synchronized (c7157EhS) {
                obj = c7157EhS.A02.get(k);
            }
            C7161EhW c7161EhW = (C7161EhW) obj;
            efFA01 = c7161EhW != null ? A01(c7161EhW) : null;
        }
        A04((C7161EhW) objA02);
        A07(this);
        A06(this);
        return efFA01;
    }

    @Override // X.InterfaceC7121Egb
    public final int Aaf(InterfaceC7168Ehd<K> interfaceC7168Ehd) {
        ArrayList arrayListA03;
        ArrayList arrayListA032;
        C7384Etj.A0Y(interfaceC7168Ehd, 0);
        synchronized (this) {
            arrayListA03 = this.A03.A03(interfaceC7168Ehd);
            arrayListA032 = this.A02.A03(interfaceC7168Ehd);
            A0A(arrayListA032);
        }
        A08(arrayListA032);
        A09(arrayListA03);
        A07(this);
        A06(this);
        return arrayListA032.size();
    }

    @Override // X.ECU
    public final void AhS(ECR ecr) {
        ArrayList arrayListA03;
        C7384Etj.A0Y(ecr, 0);
        double dAM6 = this.A06.AM6(ecr);
        synchronized (this) {
            arrayListA03 = A03(Integer.MAX_VALUE, Math.max(0, ((int) (this.A02.A01() * (1.0d - dAM6))) - A00()));
            A0A(arrayListA03);
        }
        A08(arrayListA03);
        A09(arrayListA03);
        A07(this);
        A06(this);
    }

    public static final <K, V> void A04(C7161EhW<K, V> c7161EhW) {
        C7166Ehb c7166Ehb;
        if (c7161EhW == null || (c7166Ehb = c7161EhW.A03) == null) {
            return;
        }
        K k = c7161EhW.A04;
        C7164EhZ c7164EhZ = c7166Ehb.A00;
        synchronized (c7164EhZ) {
            c7164EhZ.A03.remove(k);
        }
    }

    private final void A08(ArrayList<C7161EhW<K, V>> arrayList) {
        if (arrayList != 0) {
            Iterator itA0N = C7384Etj.A0N(arrayList);
            while (itA0N.hasNext()) {
                EfF efFA02 = A02((C7161EhW) C7384Etj.A0F(itA0N), this);
                if (efFA02 != null) {
                    efFA02.close();
                }
            }
        }
    }

    public static final void A09(ArrayList<C7161EhW<K, V>> arrayList) {
        if (arrayList != 0) {
            Iterator itA0N = C7384Etj.A0N(arrayList);
            while (itA0N.hasNext()) {
                A04((C7161EhW) C7384Etj.A0F(itA0N));
            }
        }
    }

    public C7158EhT(InterfaceC7005EeA interfaceC7005EeA, ECV ecv, Eh0 eh0) {
        AnonymousClass003.A0x(ecv, interfaceC7005EeA);
        this.A07 = eh0;
        this.A03 = new C7157EhS<>(new C7162EhX(this, eh0));
        this.A02 = new C7157EhS<>(new C7162EhX(this, eh0));
        this.A04 = BV4.A11();
        this.A06 = ecv;
        this.A05 = interfaceC7005EeA;
        Object obj = interfaceC7005EeA.get();
        if (obj == null) {
            throw C3cG.A0Q("mMemoryCacheParamsSupplier returned null");
        }
        this.A00 = (C7167Ehc) obj;
        this.A01 = SystemClock.uptimeMillis();
    }

    @Override // X.InterfaceC7127Egh
    public final EfF A5d(EfF efF, C7166Ehb c7166Ehb, Object obj) {
        Object objA02;
        EfF efFA01;
        EfF efFA02;
        A07(this);
        synchronized (this) {
            C7157EhS<K, C7161EhW<K, V>> c7157EhS = this.A03;
            objA02 = c7157EhS.A02(obj);
            C7157EhS<K, C7161EhW<K, V>> c7157EhS2 = this.A02;
            C7161EhW c7161EhW = (C7161EhW) c7157EhS2.A02(obj);
            efFA01 = null;
            if (c7161EhW != null) {
                A05(c7161EhW);
                efFA02 = A02(c7161EhW, this);
            } else {
                efFA02 = null;
            }
            int iAKf = this.A07.AKf(efF.A04());
            if (iAKf <= this.A00.A01) {
                if (c7157EhS2.A00() - c7157EhS.A00() <= this.A00.A00 - 1 && A00() <= this.A00.A02 - iAKf) {
                    C7161EhW c7161EhW2 = new C7161EhW(efF, c7166Ehb, obj);
                    c7157EhS2.A04(obj, c7161EhW2);
                    efFA01 = A01(c7161EhW2);
                }
            }
        }
        if (efFA02 != null) {
            efFA02.close();
        }
        A04((C7161EhW) objA02);
        A06(this);
        return efFA01;
    }

    /* JADX WARN: Incorrect types in method signature: (TK;LX/EfF<TV;>;)LX/EfF<TV;>; */
    @Override // X.InterfaceC7121Egb
    public final EfF A5e(EfF efF, Object obj) {
        AnonymousClass003.A0u(obj, efF);
        return A5d(efF, null, obj);
    }
}
