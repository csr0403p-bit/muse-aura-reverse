package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class CTZ implements Runnable {
    public static final String __redex_internal_original_name = "zzaf";
    public final CTY A00;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r9 = this;
            X.CTY r2 = r9.A00
        L2:
            monitor-enter(r2)
            int r0 = r2.A00     // Catch: java.lang.Throwable -> Laf
            r3 = 2
            if (r0 != r3) goto L13
            java.util.Queue<X.CTa<?>> r1 = r2.A04     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L16
            r2.A00()     // Catch: java.lang.Throwable -> Laf
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            goto Lae
        L16:
            java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> Laf
            X.CTa r7 = (X.CTa) r7     // Catch: java.lang.Throwable -> Laf
            android.util.SparseArray<X.CTa<?>> r0 = r2.A03     // Catch: java.lang.Throwable -> Laf
            int r8 = r7.A01     // Catch: java.lang.Throwable -> Laf
            r0.put(r8, r7)     // Catch: java.lang.Throwable -> Laf
            X.CS4 r6 = r2.A05     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.ScheduledExecutorService r9 = r6.A03     // Catch: java.lang.Throwable -> Laf
            X.CTc r5 = new X.CTc     // Catch: java.lang.Throwable -> Laf
            r5.<init>(r2, r7)     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Laf
            r0 = 30
            r9.schedule(r5, r0, r4)     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "MessengerIpcClient"
            boolean r0 = X.BV4.A1U(r5)
            if (r0 == 0) goto L4f
            java.lang.String r4 = java.lang.String.valueOf(r7)
            int r0 = X.BV5.A04(r4)
            int r0 = r0 + 8
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)
            java.lang.String r0 = "Sending "
            X.BV8.A1P(r1, r0, r4, r5)
        L4f:
            android.content.Context r6 = r6.A02
            android.os.Messenger r1 = r2.A02
            android.os.Message r5 = android.os.Message.obtain()
            int r0 = r7.A00
            r5.what = r0
            r5.arg1 = r8
            r5.replyTo = r1
            android.os.Bundle r4 = X.BV6.A0N()
            java.lang.String r1 = "oneWay"
            boolean r0 = r7 instanceof X.C3546CTf
            if (r0 == 0) goto L81
            r0 = 0
        L6a:
            r4.putBoolean(r1, r0)
            java.lang.String r1 = "pkg"
            java.lang.String r0 = r6.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "data"
            android.os.Bundle r0 = r7.A02
            r4.putBundle(r1, r0)
            r5.setData(r4)
            goto L83
        L81:
            r0 = 1
            goto L6a
        L83:
            X.CTd r1 = r2.A01     // Catch: android.os.RemoteException -> La4
            android.os.Messenger r0 = r1.A00     // Catch: android.os.RemoteException -> La4
            if (r0 != 0) goto L9f
            com.google.firebase.iid.zzm r0 = r1.A01     // Catch: android.os.RemoteException -> La4
            if (r0 == 0) goto L98
            android.os.Messenger r0 = r0.A00     // Catch: android.os.RemoteException -> La4
            if (r0 != 0) goto L9f
            java.lang.String r0 = "send"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: android.os.RemoteException -> La4
        L97:
            throw r0     // Catch: android.os.RemoteException -> La4
        L98:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: android.os.RemoteException -> La4
            goto L97
        L9f:
            r0.send(r5)     // Catch: android.os.RemoteException -> La4
            goto L2
        La4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r3, r0)
            goto L2
        Lae:
            return
        Laf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CTZ.run():void");
    }

    public CTZ(CTY cty) {
        this.A00 = cty;
    }
}
