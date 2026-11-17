package X;

@Deprecated
/* renamed from: X.Fe3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8439Fe3 {
    public InterfaceC8471Fea A00;
    public boolean A01;
    public boolean A02;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0030
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void A00() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A02     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            return
        L7:
            r0 = 1
            r4.A02 = r0     // Catch: java.lang.Throwable -> L3e
            r4.A01 = r0     // Catch: java.lang.Throwable -> L3e
            X.Fea r0 = r4.A00     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            if (r0 == 0) goto L33
            X.FeB r0 = (X.C8447FeB) r0     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r2 = r0.A01     // Catch: java.lang.Throwable -> L27
            X.Fds r1 = r0.A00     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r0 = r0.A02     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L23
            r1.A0F()     // Catch: java.lang.Throwable -> L27
            r0.run()     // Catch: java.lang.Throwable -> L27
            goto L33
        L23:
            r2.run()     // Catch: java.lang.Throwable -> L27
            goto L33
        L27:
            r0 = move-exception
            monitor-enter(r4)
            r4.A01 = r3     // Catch: java.lang.Throwable -> L30
            r4.notifyAll()     // Catch: java.lang.Throwable -> L30
        L2e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r0 = move-exception
            goto L2e
        L32:
            throw r0
        L33:
            monitor-enter(r4)
            r4.A01 = r3     // Catch: java.lang.Throwable -> L3b
            r4.notifyAll()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8439Fe3.A00():void");
    }
}
