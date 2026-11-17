package X;

/* loaded from: classes6.dex */
public abstract class GBO {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        r0 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> X.GBL<T> A00(X.HtJ<? super T> r4) {
        /*
            boolean r0 = r4 instanceof X.GBJ
            if (r0 != 0) goto Lb
            r0 = 1
        L5:
            X.GBL r3 = new X.GBL
            r3.<init>(r0, r4)
            return r3
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.GBJ.A04
        Ld:
            java.lang.Object r3 = r1.get(r4)
            if (r3 != 0) goto L1a
            X.HrH r0 = X.GBI.A00
            r1.set(r4, r0)
        L18:
            r0 = 2
            goto L5
        L1a:
            boolean r0 = r3 instanceof X.GBL
            if (r0 == 0) goto L3e
            X.HrH r0 = X.GBI.A00
            boolean r0 = X.AbstractC5217DdT.A00(r4, r3, r0, r1)
            if (r0 == 0) goto Ld
            X.GBL r3 = (X.GBL) r3
            if (r3 == 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.GBL.A04
            java.lang.Object r1 = r2.get(r3)
            boolean r0 = r1 instanceof X.GBW
            if (r0 == 0) goto L5a
            X.GBW r1 = (X.GBW) r1
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L5a
            r3.A0H()
            goto L18
        L3e:
            X.HrH r0 = X.GBI.A00
            if (r3 == r0) goto Ld
            boolean r0 = r3 instanceof java.lang.Throwable
            if (r0 != 0) goto Ld
            java.lang.String r1 = "Inconsistent state "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L5a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.GBL.A02
            r0 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r3, r0)
            X.GC0 r0 = X.GC0.A00
            r2.set(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBO.A00(X.HtJ):X.GBL");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/Hm1<-TT;>;LX/HpO;)V */
    public static final void A01(HpO hpO, Hm1 hm1) {
        if (!(hm1 instanceof GBL)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        GBL.A04(hpO, (GBL) hm1);
    }
}
