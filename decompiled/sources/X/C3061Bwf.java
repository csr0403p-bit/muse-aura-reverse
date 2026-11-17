package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Bwf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3061Bwf<T> implements Iterator<T> {
    public final AtomicInteger A00 = BV5.A17();
    public final /* synthetic */ C3062Bwg A01;

    public C3061Bwf(C3062Bwg c3062Bwg) {
        this.A01 = c3062Bwg;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00.get(), this.A01.size());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0074
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.util.Iterator
    public final T next() {
        /*
            r9 = this;
            java.lang.String r8 = "Exception thrown while injecting bindingId "
            X.Bwg r7 = r9.A01
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A00
            int r6 = r0.getAndIncrement()
            int r0 = r7.size()
            if (r6 >= r0) goto La1
            java.lang.Object[] r5 = r7.A01
            monitor-enter(r5)
            int r1 = r7.A00     // Catch: java.lang.Throwable -> L9e
            if (r6 < r1) goto L77
            java.lang.Object r0 = X.C3062Bwg.A07     // Catch: java.lang.Throwable -> L9e
            r5[r6] = r0     // Catch: java.lang.Throwable -> L9e
            int r0 = r1 + 1
            r7.A00 = r0     // Catch: java.lang.Throwable -> L9e
            java.lang.ThreadLocal<java.lang.Boolean> r4 = r7.A03     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L9e
            r4.set(r0)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            X.Bwk r1 = r7.A05     // Catch: java.lang.Throwable -> L40 java.lang.IllegalArgumentException -> L42
            int[] r0 = r7.A04     // Catch: java.lang.Throwable -> L40 java.lang.IllegalArgumentException -> L42
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L40 java.lang.IllegalArgumentException -> L42
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L40 java.lang.IllegalArgumentException -> L42
            monitor-enter(r5)
            r4.set(r3)     // Catch: java.lang.Throwable -> L3d
            r5[r6] = r1     // Catch: java.lang.Throwable -> L3d
            r5.notifyAll()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            return r1
        L3d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r0
        L40:
            r2 = move-exception
            goto L5a
        L42:
            r2 = move-exception
            java.lang.String r1 = "Invalid binding id %d"
            int[] r0 = r7.A04     // Catch: java.lang.Throwable -> L68
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> L68
            java.lang.IllegalArgumentException r0 = X.BV4.A0Q(r0, r2)     // Catch: java.lang.Throwable -> L68
            goto L67
        L5a:
            int[] r0 = r7.A04     // Catch: java.lang.Throwable -> L68
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = X.FGI.A0H(r8, r0)     // Catch: java.lang.Throwable -> L68
            com.facebook.inject.UltralightMultiBind$UltralightMultiBindException r0 = new com.facebook.inject.UltralightMultiBind$UltralightMultiBindException     // Catch: java.lang.Throwable -> L68
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L68
        L67:
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            monitor-enter(r5)
            r4.set(r3)     // Catch: java.lang.Throwable -> L74
            r5[r6] = r3     // Catch: java.lang.Throwable -> L74
            r5.notifyAll()     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L72
        L76:
            throw r0
        L77:
            r1 = r5[r6]     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = X.C3062Bwg.A07     // Catch: java.lang.Throwable -> L9e
            if (r1 != r0) goto L9c
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r7.A03     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L9e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L9e
            if (r1 == r0) goto L8d
            r5.wait()     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9e
            goto L77
        L8b:
            r0 = move-exception
            goto L94
        L8d:
            java.lang.String r0 = "Circular dependency detected while injecting an ultralight set."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L9e
            goto L9b
        L94:
            X.BV4.A1A()     // Catch: java.lang.Throwable -> L9e
            java.lang.RuntimeException r0 = X.BV4.A0e(r0)     // Catch: java.lang.Throwable -> L9e
        L9b:
            throw r0     // Catch: java.lang.Throwable -> L9e
        L9c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9e
            return r1
        L9e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9e
            throw r0
        La1:
            java.util.NoSuchElementException r0 = X.C8j3.A1D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3061Bwf.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
