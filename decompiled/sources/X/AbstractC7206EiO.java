package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.EiO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7206EiO<T> implements InterfaceC7236Ej0<T> {
    public Map<String, Object> A04;
    public T A02 = null;
    public Throwable A03 = null;
    public float A00 = 0.0f;
    public boolean A05 = false;
    public Integer A01 = C79.A00;
    public final ConcurrentLinkedQueue<Pair<InterfaceC7248EjS<T>, Executor>> A06 = new ConcurrentLinkedQueue<>();

    private void A00() {
        boolean zA1Z;
        synchronized (this) {
            zA1Z = AnonymousClass002.A1Z(this.A01, C79.A0C);
        }
        boolean zA01 = A01();
        Iterator<Pair<InterfaceC7248EjS<T>, Executor>> it = this.A06.iterator();
        while (it.hasNext()) {
            Pair pairA0O = BV6.A0O(it);
            ((Executor) pairA0O.second).execute(new RunnableC7211EiX(this, (InterfaceC7248EjS) pairA0O.first, zA1Z, zA01));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean A01() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A05()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Le
            boolean r1 = r2.AOQ()     // Catch: java.lang.Throwable -> L11
            r0 = 1
            if (r1 == 0) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7206EiO.A01():boolean");
    }

    public final void A04(float f) {
        synchronized (this) {
            if (this.A05 || this.A01 != C79.A00 || f < this.A00) {
                return;
            }
            this.A00 = f;
            Iterator<Pair<InterfaceC7248EjS<T>, Executor>> it = this.A06.iterator();
            while (it.hasNext()) {
                Pair pairA0O = BV6.A0O(it);
                ((Executor) pairA0O.second).execute(new RunnableC7212EiY(this, (InterfaceC7248EjS) pairA0O.first));
            }
        }
    }

    public final synchronized boolean A05() {
        return this.A05;
    }

    public final boolean A07(Throwable th, Map<String, Object> map) {
        synchronized (this) {
            if (this.A05 || this.A01 != C79.A00) {
                return false;
            }
            this.A01 = C79.A0C;
            this.A03 = th;
            this.A04 = map;
            A00();
            return true;
        }
    }

    @Override // X.InterfaceC7236Ej0
    public boolean A6Q() {
        EfF efF;
        synchronized (this) {
            if (this.A05) {
                return false;
            }
            this.A05 = true;
            T t = this.A02;
            this.A02 = null;
            if (t != null && (this instanceof C7205EiN) && (efF = (EfF) t) != null) {
                efF.close();
            }
            if (!AOQ()) {
                A00();
            }
            synchronized (this) {
                this.A06.clear();
            }
            return true;
        }
    }

    @Override // X.InterfaceC7236Ej0
    public final synchronized Throwable AFW() {
        return this.A03;
    }

    @Override // X.InterfaceC7236Ej0
    public synchronized T AJm() {
        return this.A02;
    }

    @Override // X.InterfaceC7236Ej0
    public final synchronized boolean AOQ() {
        return AnonymousClass006.A1Z(this.A01, C79.A00);
    }

    @Override // X.InterfaceC7236Ej0
    public final synchronized float getProgress() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;ZLjava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    public boolean A06(Object obj, Map map, boolean z) {
        EfF efF;
        boolean z2;
        EfF efF2;
        EfF efF3;
        this.A04 = map;
        EfF efF4 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (this.A05 || this.A01 != C79.A00) {
                            z2 = false;
                            obj = obj;
                        } else {
                            if (z) {
                                this.A01 = C79.A01;
                                this.A00 = 1.0f;
                            }
                            T t = this.A02;
                            if (t != obj) {
                                try {
                                    this.A02 = obj;
                                    efF3 = t;
                                } catch (Throwable th) {
                                    th = th;
                                    efF4 = t;
                                    throw th;
                                }
                            } else {
                                efF3 = (T) null;
                            }
                            z2 = true;
                            obj = efF3;
                        }
                        if (obj != 0 && (this instanceof C7205EiN) && (efF2 = (??[OBJECT, ARRAY]) obj) != null) {
                            efF2.close();
                        }
                        if (z2) {
                            A00();
                        }
                        return z2;
                    } catch (Throwable th2) {
                        th = th2;
                        efF4 = obj;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (efF4 != null && (this instanceof C7205EiN) && (efF = efF4) != null) {
                efF.close();
            }
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    @Override // X.InterfaceC7236Ej0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean ANI() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C7229Eit
            if (r0 == 0) goto L17
            r0 = r2
            X.Eit r0 = (X.C7229Eit) r0
            monitor-enter(r2)
            X.Ej0<T> r0 = r0.A00     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L45
            boolean r0 = r0.ANI()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            if (r0 != 0) goto L51
            goto L45
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        L17:
            boolean r0 = r2 instanceof X.C7220Eik
            if (r0 == 0) goto L30
            r0 = r2
            X.Eik r0 = (X.C7220Eik) r0
            monitor-enter(r2)
            X.Ej0 r0 = X.C7220Eik.A00(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L45
            boolean r0 = r0.ANI()     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r0 != 0) goto L51
            goto L45
        L2d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L30:
            boolean r0 = r2 instanceof X.C7221Eil
            if (r0 == 0) goto L4a
            r0 = r2
            X.Eil r0 = (X.C7221Eil) r0
            monitor-enter(r2)
            X.Ej0 r0 = X.C7221Eil.A00(r0)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            boolean r0 = r0.ANI()     // Catch: java.lang.Throwable -> L47
            r1 = 1
            if (r0 != 0) goto L51
        L45:
            r1 = 0
            goto L51
        L47:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            throw r0
        L4a:
            monitor-enter(r2)
            T r0 = r2.A02     // Catch: java.lang.Throwable -> L53
            boolean r1 = X.AnonymousClass002.A1X(r0)
        L51:
            monitor-exit(r2)
            return r1
        L53:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7206EiO.ANI():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // X.InterfaceC7236Ej0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Agc(X.InterfaceC7248EjS<T> r4, java.util.concurrent.Executor r5) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            monitor-enter(r3)
            boolean r0 = r3.A05     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Ld
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            return
        Ld:
            java.lang.Integer r1 = r3.A01     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L4e
            if (r1 != r0) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<X.EjS<T>, java.util.concurrent.Executor>> r1 = r3.A06     // Catch: java.lang.Throwable -> L4e
            android.util.Pair r0 = android.util.Pair.create(r4, r5)     // Catch: java.lang.Throwable -> L4e
            r1.add(r0)     // Catch: java.lang.Throwable -> L4e
        L1c:
            boolean r0 = r3.ANI()     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L2f
            boolean r0 = r3.AOQ()     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L2f
            boolean r1 = r3.A01()     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            if (r1 == 0) goto L30
        L2f:
            r0 = 1
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4d
            monitor-enter(r3)
            java.lang.Integer r1 = r3.A01     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            boolean r2 = X.AnonymousClass002.A1Z(r1, r0)
            monitor-exit(r3)
            boolean r1 = r3.A01()
            X.EiX r0 = new X.EiX
            r0.<init>(r3, r4, r2, r1)
            r5.execute(r0)
        L4d:
            return
        L4e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7206EiO.Agc(X.EjS, java.util.concurrent.Executor):void");
    }
}
