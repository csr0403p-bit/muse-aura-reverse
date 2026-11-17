package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Ein, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7223Ein<T> implements InterfaceC7248EjS<T> {
    public int A00;
    public final /* synthetic */ C7220Eik A01;

    public C7223Ein(C7220Eik c7220Eik, int i) {
        this.A01 = c7220Eik;
        this.A00 = i;
    }

    @Override // X.InterfaceC7248EjS
    public final void onFailure(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        C7220Eik.A02(interfaceC7236Ej0, this.A01, this.A00);
    }

    @Override // X.InterfaceC7248EjS
    public final void onProgressUpdate(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        if (this.A00 == 0) {
            this.A01.A04(interfaceC7236Ej0.getProgress());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    @Override // X.InterfaceC7248EjS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewResult(X.InterfaceC7236Ej0<T> r7) {
        /*
            r6 = this;
            boolean r0 = r7.ANI()
            if (r0 == 0) goto L78
            X.Eik r3 = r6.A01
            int r4 = r6.A00
            boolean r1 = r7.AOQ()
            r6 = r4
            monitor-enter(r3)
            int r5 = r3.A00     // Catch: java.lang.Throwable -> L75
            X.Ej0 r0 = X.C7220Eik.A01(r3, r4)     // Catch: java.lang.Throwable -> L75
            if (r7 != r0) goto L51
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L75
            if (r4 == r0) goto L51
            X.Ej0 r0 = X.C7220Eik.A00(r3)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L28
            if (r1 == 0) goto L2c
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L75
            if (r4 >= r0) goto L2c
        L28:
            r3.A00 = r4     // Catch: java.lang.Throwable -> L75
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            goto L2e
        L2c:
            r6 = r5
            goto L2a
        L2e:
            if (r5 <= r6) goto L52
            monitor-enter(r3)
            java.util.ArrayList<X.Ej0<T>> r2 = r3.A02     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            if (r2 == 0) goto L42
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L4e
            if (r5 >= r1) goto L42
            java.lang.Object r0 = r2.set(r5, r0)     // Catch: java.lang.Throwable -> L4e
            X.Ej0 r0 = (X.InterfaceC7236Ej0) r0     // Catch: java.lang.Throwable -> L4e
        L42:
            monitor-exit(r3)
            if (r0 == 0) goto L4b
            r0.A6Q()
            X.C7220Eik.A03(r3, r5)
        L4b:
            int r5 = r5 + (-1)
            goto L2e
        L4e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            throw r0
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
        L52:
            X.Ej0 r0 = X.C7220Eik.A00(r3)
            if (r7 != r0) goto L6b
            if (r4 != 0) goto L61
            boolean r0 = r7.AOQ()
            r2 = 1
            if (r0 != 0) goto L62
        L61:
            r2 = 0
        L62:
            r0 = r7
            X.EiO r0 = (X.AbstractC7206EiO) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.A04
            r0 = 0
            r3.A06(r0, r1, r2)
        L6b:
            boolean r0 = r7.AOQ()
            if (r0 == 0) goto L85
            X.C7220Eik.A03(r3, r4)
            return
        L75:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            throw r0
        L78:
            boolean r0 = r7.AOQ()
            if (r0 == 0) goto L85
            X.Eik r1 = r6.A01
            int r0 = r6.A00
            X.C7220Eik.A02(r7, r1, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7223Ein.onNewResult(X.Ej0):void");
    }
}
