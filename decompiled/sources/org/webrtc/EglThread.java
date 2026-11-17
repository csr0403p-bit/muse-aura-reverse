package org.webrtc;

import X.BV4;
import X.BV5;
import X.C3cG;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.RenderSynchronizer;

/* loaded from: classes5.dex */
public class EglThread implements RenderSynchronizer.Listener {
    public final EglBase.EglConnection eglConnection;
    public final HandlerWithExceptionCallbacks handler;
    public final ReleaseMonitor releaseMonitor;
    public final RenderSynchronizer renderSynchronizer;
    public final Map<UUID, RenderUpdate> pendingRenderUpdates = BV4.A0u();
    public final List<RenderUpdate> pendingRenderUpdatesQueued = C3cG.A0h();
    public boolean renderWindowOpen = true;

    public class HandlerWithExceptionCallbacks extends Handler {
        public final Object callbackLock;
        public final List<Runnable> exceptionCallbacks;

        public void addExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(runnable);
            }
        }

        public void removeExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(runnable);
            }
        }

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
            this.callbackLock = C3cG.A0T();
            this.exceptionCallbacks = C3cG.A0h();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0025
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.Handler
        public void dispatchMessage(android.os.Message r5) {
            /*
                r4 = this;
                super.dispatchMessage(r5)     // Catch: java.lang.Exception -> L4
                return
            L4:
                r3 = move-exception
                java.lang.String r1 = "EglThread"
                java.lang.String r0 = "Exception on EglThread"
                org.webrtc.Logging.e(r1, r0, r3)
                java.lang.Object r2 = r4.callbackLock
                monitor-enter(r2)
                java.util.List<java.lang.Runnable> r0 = r4.exceptionCallbacks     // Catch: java.lang.Throwable -> L25
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L25
            L15:
                boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L26
                java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L25
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L25
                r0.run()     // Catch: java.lang.Throwable -> L25
                goto L15
            L25:
                r3 = move-exception
            L26:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglThread.HandlerWithExceptionCallbacks.dispatchMessage(android.os.Message):void");
        }
    }

    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    public interface RenderUpdate {
        void update(boolean z);
    }

    /* renamed from: lambda$onRenderWindowClose$0$org-webrtc-EglThread, reason: not valid java name */
    public /* synthetic */ void m3948lambda$onRenderWindowClose$0$orgwebrtcEglThread() {
        this.renderWindowOpen = false;
    }

    /* renamed from: lambda$onRenderWindowOpen$0$org-webrtc-EglThread, reason: not valid java name */
    public /* synthetic */ void m3949lambda$onRenderWindowOpen$0$orgwebrtcEglThread() {
        this.renderWindowOpen = true;
        Iterator itA10 = BV5.A10(this.pendingRenderUpdates);
        while (itA10.hasNext()) {
            ((RenderUpdate) itA10.next()).update(false);
        }
        this.pendingRenderUpdates.clear();
        Iterator<RenderUpdate> it = this.pendingRenderUpdatesQueued.iterator();
        while (it.hasNext()) {
            it.next().update(false);
        }
        this.pendingRenderUpdatesQueued.clear();
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, final EglBase.Context context, final int[] iArr, RenderSynchronizer renderSynchronizer) {
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(BV5.A0D("EglThread"));
        EglBase.EglConnection eglConnection = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallbacks, new Callable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EglThread.lambda$create$0(context, iArr);
            }
        });
        if (releaseMonitor == null) {
            releaseMonitor = new ReleaseMonitor() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda1
                @Override // org.webrtc.EglThread.ReleaseMonitor
                public final boolean onRelease(EglThread eglThread) {
                    return true;
                }
            };
        }
        return new EglThread(releaseMonitor, handlerWithExceptionCallbacks, eglConnection, renderSynchronizer);
    }

    public static /* synthetic */ EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) {
        return context == null ? new EglBase10Impl.EglConnection(null, iArr) : EglBase.EglConnection.CC.create(context, iArr);
    }

    public void addExceptionCallback(Runnable runnable) {
        this.handler.addExceptionCallback(runnable);
    }

    public EglBase createEglBaseWithSharedConnection() {
        return EglBase.CC.create(this.eglConnection);
    }

    public Handler getHandler() {
        return this.handler;
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowClose() {
        this.handler.post(new Runnable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.renderWindowOpen = false;
            }
        });
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowOpen() {
        this.handler.post(new Runnable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3949lambda$onRenderWindowOpen$0$orgwebrtcEglThread();
            }
        });
    }

    public void release() {
        if (this.releaseMonitor.onRelease(this)) {
            RenderSynchronizer renderSynchronizer = this.renderSynchronizer;
            if (renderSynchronizer != null) {
                renderSynchronizer.removeListener(this);
            }
            HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
            final EglBase.EglConnection eglConnection = this.eglConnection;
            eglConnection.getClass();
            handlerWithExceptionCallbacks.post(new Runnable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    eglConnection.release();
                }
            });
            this.handler.getLooper().quitSafely();
        }
    }

    public void removeExceptionCallback(Runnable runnable) {
        this.handler.removeExceptionCallback(runnable);
    }

    @Deprecated
    public void scheduleRenderUpdate(RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdatesQueued.add(renderUpdate);
        }
    }

    public EglThread(ReleaseMonitor releaseMonitor, HandlerWithExceptionCallbacks handlerWithExceptionCallbacks, EglBase.EglConnection eglConnection, RenderSynchronizer renderSynchronizer) {
        this.releaseMonitor = releaseMonitor;
        this.handler = handlerWithExceptionCallbacks;
        this.eglConnection = eglConnection;
        this.renderSynchronizer = renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.registerListener(this);
        }
    }

    public static /* synthetic */ boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, EglBase.Context context, int[] iArr) {
        return create(releaseMonitor, context, iArr, null);
    }

    public void scheduleRenderUpdate(UUID uuid, RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdates.put(uuid, renderUpdate);
        }
    }
}
