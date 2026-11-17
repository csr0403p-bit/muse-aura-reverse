package X;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* renamed from: X.EhU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7159EhU implements InterfaceC7275Ek1 {
    public EfF<InterfaceC7064EfB> A00;
    public final SparseArray<EfF<InterfaceC7064EfB>> A01 = BV4.A0B();
    public final C7164EhZ A02;
    public final boolean A03;

    @Override // X.InterfaceC7275Ek1
    public final synchronized boolean A72(int i) {
        boolean zContainsKey;
        C7164EhZ c7164EhZ = this.A02;
        InterfaceC7127Egh<CCV, InterfaceC7064EfB> interfaceC7127Egh = c7164EhZ.A02;
        Object c7165Eha = new C7165Eha(c7164EhZ.A00, i);
        C7158EhT c7158EhT = (C7158EhT) interfaceC7127Egh;
        synchronized (c7158EhT) {
            C7157EhS<K, C7161EhW<K, V>> c7157EhS = c7158EhT.A02;
            synchronized (c7157EhS) {
                zContainsKey = c7157EhS.A02.containsKey(c7165Eha);
            }
        }
        return zContainsKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        throw X.BV4.A0S();
     */
    @Override // X.InterfaceC7275Ek1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.EfF ACq() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A03     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L8
            monitor-exit(r5)
            r0 = 0
            return r0
        L8:
            X.EhZ r4 = r5.A02     // Catch: java.lang.Throwable -> L69
        La:
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashSet<X.CCV> r0 = r4.A03     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L63
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L21
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L63
            X.CCV r1 = (X.CCV) r1     // Catch: java.lang.Throwable -> L63
            r2.remove()     // Catch: java.lang.Throwable -> L63
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L27
            r1 = 0
            goto L5d
        L27:
            X.Egh<X.CCV, X.EfB> r3 = r4.A02     // Catch: java.lang.Throwable -> L69
            X.EhT r3 = (X.C7158EhT) r3     // Catch: java.lang.Throwable -> L69
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L69
            X.EhS<K, X.EhW<K, V>> r0 = r3.A03     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = r0.A02(r1)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L46
            X.EhS<K, X.EhW<K, V>> r0 = r3.A02     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r0.A02(r1)     // Catch: java.lang.Throwable -> L66
            X.EhW r1 = (X.C7161EhW) r1     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L53
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L58
            X.EfF<V> r1 = r1.A02     // Catch: java.lang.Throwable -> L66
            r0 = 1
            goto L48
        L46:
            r1 = 0
            r0 = 0
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L50
            X.EhW r2 = (X.C7161EhW) r2     // Catch: java.lang.Throwable -> L69
            X.C7158EhT.A04(r2)     // Catch: java.lang.Throwable -> L69
        L50:
            if (r1 == 0) goto La
            goto L5d
        L53:
            java.lang.IllegalStateException r0 = X.BV4.A0U()     // Catch: java.lang.Throwable -> L66
            goto L5c
        L58:
            java.lang.IllegalStateException r0 = X.BV4.A0S()     // Catch: java.lang.Throwable -> L66
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L66
        L5d:
            X.EfF r0 = A00(r1)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r5)
            return r0
        L63:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L63
            goto L68
        L66:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
        L68:
            throw r0     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7159EhU.ACq():X.EfF");
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized EfF<Bitmap> ADC(int i) {
        C7164EhZ c7164EhZ;
        c7164EhZ = this.A02;
        return A00(c7164EhZ.A02.AC3(new C7165Eha(c7164EhZ.A00, i)));
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized EfF AFX() {
        EfF<InterfaceC7064EfB> efF;
        efF = this.A00;
        return A00(efF != null ? efF.A03() : null);
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized void ATT(EfF efF, int i) {
        C7384Etj.A0Y(efF, 1);
        EfF efFA00 = null;
        try {
            efFA00 = EfF.A00(new C7066EfD(efF, C7070EfR.A03, 0, 0));
            C7164EhZ c7164EhZ = this.A02;
            EfF<InterfaceC7064EfB> efFA5d = c7164EhZ.A02.A5d(efFA00, c7164EhZ.A01, new C7165Eha(c7164EhZ.A00, i));
            if (EfF.A01(efFA5d)) {
                SparseArray<EfF<InterfaceC7064EfB>> sparseArray = this.A01;
                EfF<InterfaceC7064EfB> efF2 = sparseArray.get(i);
                if (efF2 != null) {
                    efF2.close();
                }
                sparseArray.put(i, efFA5d);
            }
            efFA00.close();
        } catch (Throwable th) {
            if (efFA00 != null) {
                efFA00.close();
            }
            throw th;
        }
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized void ATU(EfF efF, int i) {
        C7384Etj.A0Y(efF, 1);
        try {
            SparseArray<EfF<InterfaceC7064EfB>> sparseArray = this.A01;
            EfF<InterfaceC7064EfB> efF2 = sparseArray.get(i);
            if (efF2 != null) {
                sparseArray.delete(i);
                efF2.close();
            }
            EfF efFA00 = null;
            try {
                efFA00 = EfF.A00(new C7066EfD(efF, C7070EfR.A03, 0, 0));
                EfF<InterfaceC7064EfB> efF3 = this.A00;
                if (efF3 != null) {
                    efF3.close();
                }
                C7164EhZ c7164EhZ = this.A02;
                this.A00 = c7164EhZ.A02.A5d(efFA00, c7164EhZ.A01, new C7165Eha(c7164EhZ.A00, i));
                efFA00.close();
            } catch (Throwable th) {
                if (efFA00 == null) {
                    throw th;
                }
                efFA00.close();
                throw th;
            }
        } catch (Throwable th2) {
        }
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized void clear() {
        EfF<InterfaceC7064EfB> efF = this.A00;
        if (efF != null) {
            efF.close();
        }
        this.A00 = null;
        SparseArray<EfF<InterfaceC7064EfB>> sparseArray = this.A01;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            EfF<InterfaceC7064EfB> efFValueAt = sparseArray.valueAt(i);
            if (efFValueAt != null) {
                efFValueAt.close();
            }
        }
        sparseArray.clear();
    }

    public C7159EhU(C7164EhZ c7164EhZ, boolean z) {
        this.A02 = c7164EhZ;
        this.A03 = z;
    }

    public static final EfF<Bitmap> A00(EfF<InterfaceC7064EfB> efF) {
        EfF<Bitmap> efFA03;
        try {
            if (EfF.A01(efF)) {
                C7384Etj.A0X(efF);
                if (efF.A04() instanceof AbstractC7067EfE) {
                    AbstractC7067EfE abstractC7067EfE = (AbstractC7067EfE) efF.A04();
                    synchronized (abstractC7067EfE) {
                        EfF<Bitmap> efF2 = abstractC7067EfE.A00;
                        efFA03 = efF2 != null ? efF2.A03() : null;
                    }
                    efF.close();
                    return efFA03;
                }
            } else if (efF == null) {
                return null;
            }
            return null;
        } finally {
            if (efF != null) {
                efF.close();
            }
        }
    }
}
