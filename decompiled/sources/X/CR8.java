package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public abstract class CR8 extends CR9 {
    public static void A02(CR8 cr8, boolean z) {
        CRG crg;
        CRJ crj;
        CRJ crj2 = null;
        while (true) {
            CRF crf = CR9.A00;
            boolean z2 = crf instanceof CRA;
            if (z2) {
                CRG crg2 = CRG.A00;
                do {
                    crg = cr8.c;
                    if (crg2 == crg) {
                        break;
                    }
                } while (!crf.A04(crg, crg2, cr8));
            } else if (crf instanceof CRE) {
                CRG crg3 = CRG.A00;
                synchronized (cr8) {
                    crg = cr8.c;
                    if (crg != crg3) {
                        cr8.c = crg3;
                    }
                }
            } else {
                crg = (CRG) CRC.A02.getAndSet(cr8, CRG.A00);
            }
            while (crg != null) {
                Thread thread = crg.a;
                if (thread != null) {
                    crg.a = null;
                    LockSupport.unpark(thread);
                }
                crg = crg.b;
            }
            if (z) {
                z = false;
            }
            CRM crm = (CRM) cr8;
            ListenableFuture listenableFuture = crm.A00;
            if (AnonymousClass002.A1X(listenableFuture) & crm.isCancelled()) {
                Object obj = crm.a;
                listenableFuture.cancel((obj instanceof CRI) && ((CRI) obj).A01);
            }
            ScheduledFuture scheduledFuture = crm.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            crm.A00 = null;
            crm.A01 = null;
            if (z2) {
                CRJ crj3 = CRJ.A03;
                do {
                    crj = cr8.b;
                    if (crj3 == crj) {
                        break;
                    }
                } while (!crf.A03(crj, crj3, cr8));
            } else if (crf instanceof CRE) {
                CRJ crj4 = CRJ.A03;
                synchronized (cr8) {
                    crj = cr8.b;
                    if (crj != crj4) {
                        cr8.b = crj4;
                    }
                }
            } else {
                crj = (CRJ) CRC.A03.getAndSet(cr8, CRJ.A03);
            }
            CRJ crj5 = crj;
            CRJ crj6 = crj2;
            while (crj != null) {
                crj = crj.A00;
                crj5.A00 = crj6;
                crj6 = crj5;
                crj5 = crj;
            }
            while (crj6 != null) {
                crj2 = crj6.A00;
                Runnable runnable = crj6.A01;
                runnable.getClass();
                if (runnable instanceof CRD) {
                    CRD crd = (CRD) runnable;
                    cr8 = crd.A00;
                    if (cr8.a != crd || !crf.A05(cr8, crd, A00(crd.A01))) {
                    }
                } else {
                    Executor executor = crj6.A02;
                    executor.getClass();
                    A03(runnable, executor);
                }
                crj6 = crj2;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A00(com.google.common.util.concurrent.ListenableFuture r6) {
        /*
            java.lang.String r2 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r0 = r6 instanceof X.CRL
            r4 = 0
            if (r0 == 0) goto L23
            X.CR9 r6 = (X.CR9) r6
            java.lang.Object r5 = r6.a
            boolean r0 = r5 instanceof X.CRI
            if (r0 == 0) goto L1f
            r1 = r5
            X.CRI r1 = (X.CRI) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L1f
            java.lang.RuntimeException r0 = r1.A00
            if (r0 == 0) goto Lac
            X.CRI r5 = new X.CRI
            r5.<init>(r0, r4)
        L1f:
            r5.getClass()
        L22:
            return r5
        L23:
            boolean r0 = r6 instanceof X.CRN
            if (r0 == 0) goto L44
            r1 = r6
            X.CRN r1 = (X.CRN) r1
            X.CR9 r1 = (X.CR9) r1
            boolean r0 = r1 instanceof X.CRL
            if (r0 == 0) goto L42
            java.lang.Object r1 = r1.a
            boolean r0 = r1 instanceof X.CRH
            if (r0 == 0) goto L42
            X.CRH r1 = (X.CRH) r1
            java.lang.Throwable r0 = r1.A00
        L3a:
            if (r0 == 0) goto L44
        L3c:
            X.CRH r5 = new X.CRH
            r5.<init>(r0)
            return r5
        L42:
            r0 = 0
            goto L3a
        L44:
            boolean r3 = r6.isCancelled()
            boolean r0 = X.CR9.A03
            r0 = r0 ^ 1
            r0 = r0 & r3
            if (r0 != 0) goto Lac
            r1 = 0
        L50:
            java.lang.Object r5 = r6.get()     // Catch: java.lang.InterruptedException -> L55 java.lang.Throwable -> L73
            goto L57
        L55:
            r1 = 1
            goto L50
        L57:
            if (r1 == 0) goto L5c
            X.BV4.A1A()     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
        L5c:
            if (r3 == 0) goto L6e
            X.CRI r0 = X.CRI.A02     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
            X.CRI r5 = new X.CRI     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
            r5.<init>(r0, r4)     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
            goto Lb0
        L6e:
            if (r5 != 0) goto L22
            java.lang.Object r5 = X.CR9.A02     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1
            return r5
        L73:
            r0 = move-exception
            if (r1 == 0) goto L79
            X.BV4.A1A()     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
        L79:
            throw r0     // Catch: java.util.concurrent.CancellationException -> L7a java.util.concurrent.ExecutionException -> L8e java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
        L7a:
            r2 = move-exception
            if (r3 != 0) goto Lb8
            X.CRH r0 = X.CRH.A01
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            java.lang.IllegalArgumentException r0 = X.BV4.A0Q(r0, r2)
            goto L3c
        L8e:
            r1 = move-exception
            if (r3 == 0) goto La5
            X.CRI r0 = X.CRI.A02
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = X.FGI.A0M(r2, r0)
            java.lang.IllegalArgumentException r0 = X.BV4.A0Q(r0, r1)
            X.CRI r5 = new X.CRI
            r5.<init>(r0, r4)
            return r5
        La5:
            X.CRH r0 = X.CRH.A01
            java.lang.Throwable r0 = r1.getCause()
            goto L3c
        Lac:
            X.CRI r5 = X.CRI.A03
            goto L1f
        Lb0:
            return r5
        Lb1:
            r1 = move-exception
            X.CRH r0 = new X.CRH
            r0.<init>(r1)
            return r0
        Lb8:
            X.CRI r5 = new X.CRI
            r5.<init>(r2, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CR8.A00(com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
    }

    public static Object A01(Object obj) throws ExecutionException {
        if (obj instanceof CRI) {
            CRI cri = (CRI) obj;
            cri.getClass();
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(cri.A00);
            throw cancellationException;
        }
        if (obj instanceof CRH) {
            CRH crh = (CRH) obj;
            crh.getClass();
            throw new ExecutionException(crh.A00);
        }
        if (obj == CR9.A02) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        CRJ crj;
        CRJ crj2;
        if (runnable == null) {
            throw BV4.A0a("Runnable was null.");
        }
        if (executor == null) {
            throw BV4.A0a("Executor was null.");
        }
        if (!isDone() && (crj = this.b) != (crj2 = CRJ.A03)) {
            CRJ crj3 = new CRJ(runnable, executor);
            do {
                crj3.A00 = crj;
                if (CR9.A00.A03(crj, crj3, this)) {
                    return;
                } else {
                    crj = this.b;
                }
            } while (crj != crj2);
        }
        A03(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r6) {
        /*
            r5 = this;
            java.lang.Object r3 = r5.a
            r4 = 1
            r2 = 0
            boolean r1 = X.AnonymousClass002.A1Y(r3)
            boolean r0 = r3 instanceof X.CRD
            r1 = r1 | r0
            if (r1 == 0) goto L5c
            boolean r0 = X.CR9.A03
            if (r0 == 0) goto L4d
            X.CRI r0 = X.CRI.A02
            java.lang.String r1 = "Future.cancel() was called."
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            X.CRI r2 = new X.CRI
            r2.<init>(r0, r6)
        L1f:
            r1 = 0
        L20:
            X.CRF r0 = X.CR9.A00
            boolean r0 = r0.A05(r5, r3, r2)
            if (r0 == 0) goto L46
            A02(r5, r6)
            boolean r0 = r3 instanceof X.CRD
            if (r0 == 0) goto L5b
            X.CRD r3 = (X.CRD) r3
            com.google.common.util.concurrent.ListenableFuture r5 = r3.A01
            boolean r0 = r5 instanceof X.CRL
            if (r0 == 0) goto L58
            X.CR8 r5 = (X.CR8) r5
            java.lang.Object r3 = r5.a
            boolean r1 = X.AnonymousClass002.A1Y(r3)
            boolean r0 = r3 instanceof X.CRD
            r1 = r1 | r0
            if (r1 == 0) goto L5b
            r1 = 1
            goto L20
        L46:
            java.lang.Object r3 = r5.a
            boolean r0 = r3 instanceof X.CRD
            if (r0 != 0) goto L20
            return r1
        L4d:
            if (r6 == 0) goto L55
            X.CRI r2 = X.CRI.A02
        L51:
            r2.getClass()
            goto L1f
        L55:
            X.CRI r2 = X.CRI.A03
            goto L51
        L58:
            r5.cancel(r6)
        L5b:
            return r4
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CR8.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof CRD)) & AnonymousClass002.A1X(this.a);
    }

    public static void A03(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            CR9.A01.A00().log(Level.SEVERE, FGI.A0d("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed A[Catch: Exception -> 0x0120, CancellationException -> 0x012a, ExecutionException -> 0x012e, TRY_ENTER, TryCatch #5 {CancellationException -> 0x012a, ExecutionException -> 0x012e, Exception -> 0x0120, blocks: (B:50:0x00ed, B:51:0x00f0, B:58:0x0111, B:56:0x00fd, B:61:0x011c, B:62:0x011f), top: B:75:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CR8.toString():java.lang.String");
    }
}
