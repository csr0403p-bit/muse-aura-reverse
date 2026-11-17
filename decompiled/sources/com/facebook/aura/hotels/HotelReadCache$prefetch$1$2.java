package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelReadCache$prefetch$1$2", f = "HotelReadCache.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelReadCache$prefetch$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HotelReadCache<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelReadCache$prefetch$1$2(HotelReadCache<K, V> hotelReadCache, HtJ<? super HotelReadCache$prefetch$1$2> htJ) {
        super(2, htJ);
        this.this$0 = hotelReadCache;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HotelReadCache$prefetch$1$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HotelReadCache$prefetch$1$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x0066
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.AbstractC8884Fsp
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L11
            if (r0 != r3) goto L8d
            java.lang.Object r2 = r7.L$0
            X.F1F r2 = (X.F1F) r2
            X.Hwg.A00(r8)     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Throwable -> L78
            goto L19
        L11:
            X.Hwg.A00(r8)
            X.F1F r2 = new X.F1F
            r2.<init>()
        L19:
            com.facebook.aura.hotels.HotelReadCache<K, V> r6 = r7.this$0     // Catch: java.lang.Throwable -> L78
            java.lang.Object r5 = r6.lock     // Catch: java.lang.Throwable -> L78
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L78
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L42
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r6.canUse     // Catch: java.lang.Throwable -> L75
            boolean r0 = X.AnonymousClass003.A1Y(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L42
            java.util.LinkedHashSet<K> r0 = r6.pending     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L42
            java.util.LinkedHashSet<K> r0 = r6.pending     // Catch: java.lang.Throwable -> L75
            java.lang.Object r1 = X.AbstractC0878AGe.A0B(r0)     // Catch: java.lang.Throwable -> L75
            java.util.LinkedHashSet<K> r0 = r6.pending     // Catch: java.lang.Throwable -> L75
            r0.remove(r1)     // Catch: java.lang.Throwable -> L75
            X.27k r1 = com.facebook.aura.hotels.HotelReadCache.access$acquire(r6, r1)     // Catch: java.lang.Throwable -> L75
            goto L4b
        L42:
            int r0 = r6.workers     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + (-1)
            r6.workers = r0     // Catch: java.lang.Throwable -> L75
            r2.element = r3     // Catch: java.lang.Throwable -> L75
            r1 = 0
        L4b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L58
            boolean r0 = r2.element
            if (r0 != 0) goto L71
            com.facebook.aura.hotels.HotelReadCache<K, V> r2 = r7.this$0
            java.lang.Object r1 = r2.lock
            monitor-enter(r1)
            goto L6a
        L58:
            r7.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Throwable -> L78
            r0 = 0
            r7.L$1 = r0     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Throwable -> L78
            r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Throwable -> L78
            java.lang.Object r0 = X.C3cG.A0W(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L66 java.lang.Throwable -> L78
            if (r0 != r4) goto L19
            goto L74
        L66:
            X.C3cG.A1H(r7)     // Catch: java.lang.Throwable -> L78
            goto L19
        L6a:
            int r0 = r2.workers     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + (-1)
            r2.workers = r0     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
        L71:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L74:
            return r4
        L75:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            boolean r0 = r2.element
            if (r0 != 0) goto L91
            com.facebook.aura.hotels.HotelReadCache<K, V> r2 = r7.this$0
            java.lang.Object r1 = r2.lock
            monitor-enter(r1)
            int r0 = r2.workers     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + (-1)
            r2.workers = r0     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
            throw r3
        L8a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L8d:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
        L91:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelReadCache$prefetch$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
