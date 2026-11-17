package com.meta.maps.display.fancypins;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import android.os.Process;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.renderer.MapRenderer;

/* loaded from: classes6.dex */
public final class FancyPinsMapFrameSyncExecutor implements Executor, AutoCloseable, MapRenderer.ViewAnnotationFrameListener {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String MAIN_DISPATCH_TRACE_SECTION = "FancyPins#mainDispatch";

    @Deprecated
    public static final long NO_FRAME = 0;

    @Deprecated
    public static final String TAG = "FancyPinsFrameSync";

    @Deprecated
    public static final String UNSYNCHRONIZED_DELIVERY_TRACE_SECTION = "FancyPins#unsynchronizedDelivery";

    @Deprecated
    public static final long UNSYNCHRONIZED_LOG_INTERVAL = 600;

    @Deprecated
    public static final String WORKER_UPDATE_TRACE_SECTION = "FancyPins#workerUpdate";
    public final Choreographer choreographer;
    public boolean closed;
    public long committedDisplayFrameIdentity;
    public final ViewTreeObserver.OnDrawListener displayDrawListener;
    public final FancyPinsMapFrameSyncExecutor$displayFrameCallback$1 displayFrameCallback;
    public boolean displayFrameScheduled;
    public long drawnDisplayFrameIdentity;
    public final ExecutorService frameWorker;
    public final View host;
    public long lastObservedSwapIdentity;
    public final Object lock;
    public boolean mainDispatchSignaled;
    public boolean mapFrameReady;
    public final G0U<Long, Unit> onDisplayFrame;
    public PendingFrame pending;
    public boolean pinFrameAppliedSinceCommit;
    public boolean pinFrameReady;
    public final G0U<Runnable, Unit> postToMainThread;
    public final Runnable releaseTextureSwapGate;
    public final FancyPinsFrameSyncRenderer renderer;
    public long synchronizedFrameIdentity;
    public final boolean synchronizing;
    public final AtomicLong unsynchronizedFrames;
    public final G0U<Long, Unit> updateForRenderedFrame;
    public final ThreadLocal<Long> workerFrameIdentity;

    /* renamed from: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            l.longValue();
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
        }
    }

    /* renamed from: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<Runnable, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, FancyPinsMapFrameSyncExecutorKt.class, "postToMainThreadAsynchronously", "postToMainThreadAsynchronously(Ljava/lang/Runnable;)V", 1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Runnable runnable) {
            invoke2(runnable);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Runnable runnable) {
            C7384Etj.A0Y(runnable, 0);
            FancyPinsMapFrameSyncExecutorKt.postToMainThreadAsynchronously(runnable);
        }
    }

    /* renamed from: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            l.longValue();
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
        }
    }

    public final class PendingFrame {
        public boolean applied;
        public final Runnable command;
        public long identity;

        public PendingFrame(long j, Runnable runnable, boolean z) {
            C7384Etj.A0Y(runnable, 1);
            this.identity = j;
            this.command = runnable;
            this.applied = z;
        }

        public final boolean getApplied() {
            return this.applied;
        }

        public final Runnable getCommand() {
            return this.command;
        }

        public final long getIdentity() {
            return this.identity;
        }

        public final void setApplied(boolean z) {
            this.applied = z;
        }

        public final void setIdentity(long j) {
            this.identity = j;
        }

        public /* synthetic */ PendingFrame(long j, Runnable runnable, boolean z, int i, C06H c06h) {
            this(j, runnable, AnonymousClass005.A1O(i, z));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FancyPinsMapFrameSyncExecutor(MapView mapView, G0U<? super Long, Unit> g0u, G0U<? super Long, Unit> g0u2) {
        AnonymousClass005.A0x(mapView, g0u, g0u2);
        MapRenderer mapRenderer = mapView.getMapRenderer();
        C7384Etj.A0U(mapRenderer);
        this((FancyPinsFrameSyncRenderer) new MapLibreFrameSyncRenderer(mapRenderer), (View) mapView, g0u, g0u2, (G0U<? super Runnable, Unit>) AnonymousClass2.INSTANCE);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        boolean z;
        C7384Etj.A0Y(runnable, 0);
        Long l = this.workerFrameIdentity.get();
        if (l == null) {
            this.postToMainThread.invoke(runnable);
            return;
        }
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            long jLongValue = l.longValue();
            if (jLongValue == this.synchronizedFrameIdentity && this.renderer.isRenderingFrame() && this.renderer.getCurrentRenderFrameIdentity() == jLongValue) {
                z = true;
                this.pending = new PendingFrame(jLongValue, runnable, false);
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            deliverUnsynchronized(runnable, "map frame not parked");
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final void abandonFrame(PendingFrame pendingFrame) {
        synchronized (this.lock) {
            if (this.pending == pendingFrame) {
                this.pending = null;
            }
        }
        releaseFrame(pendingFrame.identity);
    }

    private final void clearSynchronizedFrame(long j) {
        synchronized (this.lock) {
            clearSynchronizedFrameLocked(j);
        }
    }

    private final void clearSynchronizedFrameLocked(long j) {
        if (this.synchronizedFrameIdentity == j) {
            this.synchronizedFrameIdentity = 0L;
            this.pinFrameReady = false;
            this.mapFrameReady = false;
            this.mainDispatchSignaled = false;
        }
    }

    private final void commitFrame(PendingFrame pendingFrame) {
        synchronized (this.lock) {
            if (this.pending == pendingFrame && this.mapFrameReady) {
                this.pending = null;
                releaseFrame(pendingFrame.identity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverPendingFrameUnsynchronized(long j) {
        synchronized (this.lock) {
            PendingFrame pendingFrame = this.pending;
            if (pendingFrame == null || pendingFrame.applied || pendingFrame.identity == j) {
                return;
            }
            this.pending = null;
            deliverUnsynchronized(pendingFrame.command, "pin frame outlived its map frame");
        }
    }

    private final void deliverUnsynchronized(final Runnable runnable, String str) {
        long jIncrementAndGet = this.unsynchronizedFrames.incrementAndGet();
        if (jIncrementAndGet == 1 || jIncrementAndGet % 600 == 0) {
            Log.w(TAG, C3cJ.A0N(" FancyPins frames without frame sync (latest: ", str, C60O.A0z("Delivered ", jIncrementAndGet)));
        }
        this.postToMainThread.invoke(new Runnable() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.deliverUnsynchronized.1
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
                FancyPinsMapFrameSyncExecutor fancyPinsMapFrameSyncExecutor = FancyPinsMapFrameSyncExecutor.this;
                fancyPinsMapFrameSyncExecutor.pinFrameAppliedSinceCommit = true;
                fancyPinsMapFrameSyncExecutor.scheduleDisplayFrame();
            }
        });
    }

    private final void markMapFrameReady(long j) {
        boolean zShouldSignalMainThreadLocked;
        synchronized (this.lock) {
            if (this.closed || j != this.synchronizedFrameIdentity) {
                return;
            }
            this.mapFrameReady = true;
            PendingFrame pendingFrame = this.pending;
            if (pendingFrame == null || !pendingFrame.applied) {
                zShouldSignalMainThreadLocked = shouldSignalMainThreadLocked();
                pendingFrame = null;
            } else {
                zShouldSignalMainThreadLocked = false;
            }
            if (pendingFrame != null) {
                commitFrame(pendingFrame);
            } else if (zShouldSignalMainThreadLocked) {
                postMainThreadDispatch(j);
            }
        }
    }

    private final void markPinFrameReady(long j) {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            Boolean boolValueOf = null;
            if (j == this.synchronizedFrameIdentity) {
                this.pinFrameReady = true;
                boolValueOf = Boolean.valueOf(shouldSignalMainThreadLocked());
            }
            if (boolValueOf == null) {
                deliverPendingFrameUnsynchronized(0L);
                releaseFrame(j);
            } else if (boolValueOf.equals(true)) {
                postMainThreadDispatch(j);
            } else if (!boolValueOf.equals(AnonymousClass001.A0h())) {
                throw C3cG.A0q();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onPinFrameProduced(long r7) {
        /*
            r6 = this;
            java.lang.Object r3 = r6.lock
            monitor-enter(r3)
            com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$PendingFrame r4 = r6.pending     // Catch: java.lang.Throwable -> L47
            r5 = 1
            if (r4 == 0) goto L38
            boolean r0 = r4.applied     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L2d
            long r1 = r4.identity     // Catch: java.lang.Throwable -> L47
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L2d
            long r1 = r6.synchronizedFrameIdentity     // Catch: java.lang.Throwable -> L47
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L2d
            com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer r0 = r6.renderer     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.isRenderingFrame()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L2d
            com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer r0 = r6.renderer     // Catch: java.lang.Throwable -> L47
            long r1 = r0.getCurrentRenderFrameIdentity()     // Catch: java.lang.Throwable -> L47
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L2d
            r4.identity = r7     // Catch: java.lang.Throwable -> L47
            goto L39
        L2d:
            long r1 = r4.identity     // Catch: java.lang.Throwable -> L47
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L38
            boolean r0 = r4.applied     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L38
            goto L39
        L38:
            r5 = 0
        L39:
            monitor-exit(r3)
            if (r5 == 0) goto L40
            r6.markPinFrameReady(r7)
            return
        L40:
            r6.deliverPendingFrameUnsynchronized(r7)
            r6.releaseFrame(r7)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.onPinFrameProduced(long):void");
    }

    private final void postMainThreadDispatch(final long j) {
        this.postToMainThread.invoke(new Runnable() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.postMainThreadDispatch.1
            @Override // java.lang.Runnable
            public final void run() {
                FancyPinsMapFrameSyncExecutor.this.onMainThreadFastDispatch(j);
            }
        });
    }

    private final void releaseFrame(long j) {
        this.renderer.acknowledgeViewAnnotationSync(j);
        clearSynchronizedFrame(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleDisplayFrame() {
        boolean z;
        if (!this.synchronizing || this.displayFrameScheduled) {
            return;
        }
        synchronized (this.lock) {
            z = this.closed;
        }
        if (z) {
            return;
        }
        this.displayFrameScheduled = true;
        this.choreographer.postFrameCallback(this.displayFrameCallback);
    }

    private final boolean shouldSignalMainThreadLocked() {
        PendingFrame pendingFrame = this.pending;
        if (pendingFrame == null || this.mainDispatchSignaled || !this.pinFrameReady || (pendingFrame.applied && !this.mapFrameReady)) {
            return false;
        }
        this.mainDispatchSignaled = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePinsForRenderedFrame(long j) {
        if (!this.renderer.beginFrameUpdate(j)) {
            deliverPendingFrameUnsynchronized(j);
            releaseFrame(j);
            return;
        }
        try {
            ThreadLocal<Long> threadLocal = this.workerFrameIdentity;
            Long lValueOf = Long.valueOf(j);
            threadLocal.set(lValueOf);
            this.updateForRenderedFrame.invoke(lValueOf);
            onPinFrameProduced(j);
        } finally {
        }
    }

    public final long getUnsynchronizedFrameCount() {
        return this.unsynchronizedFrames.get();
    }

    public void onRenderThreadFramePresented(final long j) {
        boolean z;
        boolean zRequestViewAnnotationSync = this.renderer.requestViewAnnotationSync(j);
        synchronized (this.lock) {
            z = this.closed;
            if (!z) {
                this.synchronizedFrameIdentity = zRequestViewAnnotationSync ? j : 0L;
                this.pinFrameReady = false;
                this.mapFrameReady = false;
                this.mainDispatchSignaled = false;
            }
        }
        if (z) {
            if (zRequestViewAnnotationSync) {
                this.renderer.acknowledgeViewAnnotationSync(j);
                return;
            }
            return;
        }
        try {
            ExecutorService executorService = this.frameWorker;
            if (executorService == null) {
                throw BV4.A0U();
            }
            executorService.execute(new Runnable() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.onRenderThreadFramePresented.1
                @Override // java.lang.Runnable
                public final void run() {
                    FancyPinsMapFrameSyncExecutor.this.updatePinsForRenderedFrame(j);
                }
            });
        } catch (RejectedExecutionException unused) {
            deliverPendingFrameUnsynchronized(j);
            releaseFrame(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMainThreadFastDispatch(long j) {
        PendingFrame pendingFrame;
        boolean z;
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        Object obj = this.lock;
        synchronized (obj) {
            if (!this.closed) {
                pendingFrame = this.pending;
            }
            return;
        }
        if (pendingFrame == null) {
            releaseFrame(j);
            return;
        }
        if (pendingFrame.identity == j) {
            if (!pendingFrame.applied) {
                try {
                    pendingFrame.command.run();
                    this.pinFrameAppliedSinceCommit = true;
                    scheduleDisplayFrame();
                    obj = this.lock;
                    synchronized (obj) {
                        if (this.pending == pendingFrame) {
                            pendingFrame.applied = true;
                            this.mainDispatchSignaled = false;
                            z = this.mapFrameReady;
                        }
                        return;
                    }
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    abandonFrame(pendingFrame);
                    throw th;
                }
            }
            commitFrame(pendingFrame);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.pending = null;
            boolean z = false;
            if (this.synchronizing) {
                this.choreographer.removeFrameCallback(this.displayFrameCallback);
                this.displayFrameScheduled = false;
                this.host.removeCallbacks(this.releaseTextureSwapGate);
                if (this.host.getViewTreeObserver().isAlive()) {
                    this.host.getViewTreeObserver().removeOnDrawListener(this.displayDrawListener);
                }
                this.renderer.setFrameListener(null);
            }
            ExecutorService executorService = this.frameWorker;
            if (executorService != null) {
                executorService.shutdownNow();
                while (!executorService.awaitTermination(LinkEncryptedPairingKt.LINK_COUNTER_MAX, TimeUnit.NANOSECONDS)) {
                    try {
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    BV4.A1A();
                }
            }
        }
    }

    public void onRenderThreadMapFrameReady(long j) {
        markMapFrameReady(j);
    }

    public /* synthetic */ FancyPinsMapFrameSyncExecutor(MapView mapView, G0U g0u, G0U g0u2, int i, C06H c06h) {
        this(mapView, g0u, (i & 4) != 0 ? AnonymousClass3.INSTANCE : g0u2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$displayFrameCallback$1] */
    public FancyPinsMapFrameSyncExecutor(final FancyPinsFrameSyncRenderer fancyPinsFrameSyncRenderer, View view, G0U<? super Long, Unit> g0u, G0U<? super Long, Unit> g0u2, G0U<? super Runnable, Unit> g0u3) {
        ExecutorService executorServiceNewSingleThreadExecutor;
        AnonymousClass005.A17(fancyPinsFrameSyncRenderer, view, g0u, g0u2, g0u3);
        this.renderer = fancyPinsFrameSyncRenderer;
        this.host = view;
        this.updateForRenderedFrame = g0u;
        this.onDisplayFrame = g0u2;
        this.postToMainThread = g0u3;
        boolean supportsFrameSync = fancyPinsFrameSyncRenderer.getSupportsFrameSync();
        this.synchronizing = supportsFrameSync;
        this.unsynchronizedFrames = new AtomicLong();
        this.lock = C3cG.A0T();
        if (supportsFrameSync) {
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$frameWorker$1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(final Runnable runnable) {
                    return new Thread(new Runnable() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$frameWorker$1.1
                        @Override // java.lang.Runnable
                        public final void run() throws SecurityException, IllegalArgumentException {
                            Process.setThreadPriority(-8);
                            runnable.run();
                        }
                    }, "FancyPinsFrame");
                }
            });
        } else {
            executorServiceNewSingleThreadExecutor = null;
        }
        this.frameWorker = executorServiceNewSingleThreadExecutor;
        this.workerFrameIdentity = new ThreadLocal<>();
        this.releaseTextureSwapGate = new Runnable() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$releaseTextureSwapGate$1
            @Override // java.lang.Runnable
            public final void run() {
                fancyPinsFrameSyncRenderer.releaseTextureSwapGate();
            }
        };
        this.choreographer = Choreographer.getInstance();
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$displayDrawListener$1
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                FancyPinsMapFrameSyncExecutor fancyPinsMapFrameSyncExecutor = this.this$0;
                fancyPinsMapFrameSyncExecutor.drawnDisplayFrameIdentity = fancyPinsMapFrameSyncExecutor.committedDisplayFrameIdentity;
                fancyPinsMapFrameSyncExecutor.scheduleDisplayFrame();
            }
        };
        this.displayDrawListener = onDrawListener;
        this.displayFrameCallback = new Choreographer.FrameCallback() { // from class: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$displayFrameCallback$1
            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            @Override // android.view.Choreographer.FrameCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void doFrame(long r12) {
                /*
                    r11 = this;
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r0 = r11.this$0
                    r7 = 0
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$setDisplayFrameScheduled$p(r0, r7)
                    java.lang.Object r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getLock$p(r0)
                    monitor-enter(r1)
                    boolean r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getClosed$p(r0)     // Catch: java.lang.Throwable -> Lb3
                    monitor-exit(r1)
                    if (r0 != 0) goto Lb2
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r0 = r11.this$0
                    com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getRenderer$p(r0)
                    long r4 = r0.freezeTextureSwapsAndGetLastSwappedFrameIdentity()
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r8 = r11.this$0     // Catch: java.lang.Throwable -> L84
                    long r9 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getCommittedDisplayFrameIdentity$p(r8)     // Catch: java.lang.Throwable -> L84
                    int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                    boolean r6 = X.AnonymousClass002.A1N(r0)
                    boolean r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getPinFrameAppliedSinceCommit$p(r8)     // Catch: java.lang.Throwable -> L84
                    if (r0 == 0) goto L39
                    int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                    if (r0 != 0) goto L39
                    r2 = 0
                    int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    r0 = 1
                    if (r1 > 0) goto L3a
                L39:
                    r0 = 0
                L3a:
                    if (r6 != 0) goto L3e
                    if (r0 == 0) goto L59
                L3e:
                    long r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getDrawnDisplayFrameIdentity$p(r8)     // Catch: java.lang.Throwable -> L84
                    int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                    if (r0 < 0) goto L59
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$setPinFrameAppliedSinceCommit$p(r8, r7)     // Catch: java.lang.Throwable -> L84
                    X.G0U r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getOnDisplayFrame$p(r8)     // Catch: java.lang.Throwable -> L84
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L84
                    r1.invoke(r0)     // Catch: java.lang.Throwable -> L84
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r8 = r11.this$0     // Catch: java.lang.Throwable -> L84
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$setCommittedDisplayFrameIdentity$p(r8, r4)     // Catch: java.lang.Throwable -> L84
                L59:
                    android.view.View r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getHost$p(r8)
                    java.lang.Runnable r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getReleaseTextureSwapGate$p(r8)
                    boolean r0 = r1.post(r0)
                    if (r0 != 0) goto L70
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r0 = r11.this$0
                    com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getRenderer$p(r0)
                    r0.releaseTextureSwapGate()
                L70:
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r3 = r11.this$0
                    long r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getLastObservedSwapIdentity$p(r3)
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 == 0) goto L7b
                    r7 = 1
                L7b:
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$setLastObservedSwapIdentity$p(r3, r4)
                    if (r7 == 0) goto Lb2
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$scheduleDisplayFrame(r3)
                    return
                L84:
                    r6 = move-exception
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r0 = r11.this$0
                    android.view.View r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getHost$p(r0)
                    java.lang.Runnable r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getReleaseTextureSwapGate$p(r0)
                    boolean r0 = r1.post(r0)
                    if (r0 != 0) goto L9e
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r0 = r11.this$0
                    com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer r0 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getRenderer$p(r0)
                    r0.releaseTextureSwapGate()
                L9e:
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor r3 = r11.this$0
                    long r1 = com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$getLastObservedSwapIdentity$p(r3)
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 == 0) goto La9
                    r7 = 1
                La9:
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$setLastObservedSwapIdentity$p(r3, r4)
                    if (r7 == 0) goto Lb1
                    com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor.access$scheduleDisplayFrame(r3)
                Lb1:
                    throw r6
                Lb2:
                    return
                Lb3:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor$displayFrameCallback$1.doFrame(long):void");
            }
        };
        if (C3cH.A1K()) {
            if (supportsFrameSync) {
                fancyPinsFrameSyncRenderer.setFrameListener(this);
                view.getViewTreeObserver().addOnDrawListener(onDrawListener);
                scheduleDisplayFrame();
                return;
            }
            return;
        }
        throw BV4.A0S();
    }

    public /* synthetic */ FancyPinsMapFrameSyncExecutor(FancyPinsFrameSyncRenderer fancyPinsFrameSyncRenderer, View view, G0U g0u, G0U g0u2, G0U g0u3, int i, C06H c06h) {
        this(fancyPinsFrameSyncRenderer, view, (G0U<? super Long, Unit>) g0u, (G0U<? super Long, Unit>) ((i & 8) != 0 ? AnonymousClass1.INSTANCE : g0u2), (G0U<? super Runnable, Unit>) ((i & 16) != 0 ? AnonymousClass2.INSTANCE : g0u3));
    }
}
