package X;

/* renamed from: X.De9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5244De9 implements F08 {
    public InterfaceC5265DeU A00;
    public boolean A01;
    public final int A02;
    public final InterfaceC7542F0w A03;
    public volatile T A04;

    public C5244De9(InterfaceC7542F0w interfaceC7542F0w, int i) {
        this.A02 = i;
        this.A03 = interfaceC7542F0w;
        this.A01 = true;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(ILX/F0w;Landroid/content/Context;LX/DeU;)TT; */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[PHI: r0
  0x0071: PHI (r0v18 X.DeD) = (r0v17 X.DeD), (r0v24 X.DeD) binds: [B:19:0x005d, B:21:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r4, X.InterfaceC5265DeU r5, X.InterfaceC7542F0w r6, int r7) {
        /*
            if (r4 == 0) goto L3c
            X.DeM r2 = X.AbstractC5257DeM.get(r4)
        L6:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.inject.ScopeAwareInjector"
            X.C7384Etj.A0Z(r2, r0)
            X.DeU r2 = (X.InterfaceC5265DeU) r2
            X.F0C r0 = X.AbstractC5261DeQ.A01
            r0.getValue()
            boolean r0 = r6 instanceof X.CH8
            if (r0 == 0) goto L9c
            r0 = r6
            X.CH8 r0 = (X.CH8) r0
            java.util.concurrent.ConcurrentHashMap r5 = r0.AML()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r5.get(r4)
            if (r0 != 0) goto L9b
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> r1 = X.AbstractC7419EvP.A00
            java.lang.Object r0 = r1.get(r4)
            if (r0 != 0) goto L39
            java.lang.Object r0 = X.C3cG.A0T()
            java.lang.Object r3 = r1.putIfAbsent(r4, r0)
            if (r3 != 0) goto L3a
        L39:
            r3 = r0
        L3a:
            monitor-enter(r3)
            goto L41
        L3c:
            X.DeU r2 = X.AbstractC5245DeA.A00(r5)
            goto L6
        L41:
            java.lang.Object r0 = r5.get(r4)     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L9a
            X.DeH r2 = (X.AbstractC5252DeH) r2     // Catch: java.lang.Throwable -> L97
            X.DeM r0 = r2.A00     // Catch: java.lang.Throwable -> L97
            X.DeJ r2 = r0.AK2()     // Catch: java.lang.Throwable -> L97
            X.C7384Etj.A0X(r2)     // Catch: java.lang.Throwable -> L97
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.get(r1)     // Catch: java.lang.Throwable -> L97
            X.DeD r0 = (X.C5248DeD) r0     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L71
            X.F0C r0 = X.AbstractC5261DeQ.A00     // Catch: java.lang.Throwable -> L97
            r0.getValue()     // Catch: java.lang.Throwable -> L97
            X.DeD r0 = new X.DeD     // Catch: java.lang.Throwable -> L97
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r5.putIfAbsent(r1, r0)     // Catch: java.lang.Throwable -> L97
            X.DeD r2 = (X.C5248DeD) r2     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L72
        L71:
            r2 = r0
        L72:
            X.AbstractC5245DeA.A05(r2)     // Catch: java.lang.Throwable -> L97
            X.DeC r1 = r2.AAl()     // Catch: java.lang.Throwable -> L97
            X.DeM r0 = r2.A00     // Catch: java.lang.Throwable -> L8f
            X.DeJ r0 = r0.AK2()     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = X.C3bH.A00(r7, r0, r6)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L88
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L8f
        L88:
            X.AbstractC5245DeA.A04()     // Catch: java.lang.Throwable -> L97
            r2.ABA(r1)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L8f:
            r0 = move-exception
            X.AbstractC5245DeA.A04()     // Catch: java.lang.Throwable -> L97
            r2.ABA(r1)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L9a:
            monitor-exit(r3)
        L9b:
            return r0
        L9c:
            java.lang.String r0 = "The given FoaUserSession does not implement FoaUserScopeObjCache"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5244De9.A00(android.content.Context, X.DeU, X.F0w, int):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    @Override // X.F2k
    /* renamed from: get */
    public final T AMN() {
        if (this.A04 == 0) {
            synchronized (this) {
                if (this.A04 == 0) {
                    if (this.A01) {
                        int i = this.A02;
                        this.A04 = A00(C4JM.A00(), C5249DeE.A00(), this.A03, i);
                    } else {
                        int i2 = this.A02;
                        this.A04 = A00(null, this.A00, this.A03, i2);
                    }
                }
            }
        }
        return this.A04;
    }

    public C5244De9(InterfaceC5265DeU interfaceC5265DeU, InterfaceC7542F0w interfaceC7542F0w, int i) {
        this.A02 = i;
        this.A03 = interfaceC7542F0w;
        this.A00 = interfaceC5265DeU;
    }
}
