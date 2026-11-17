package org.webrtc;

import X.BV5;
import X.C3cG;
import X.C60O;
import android.os.Handler;
import android.os.Trace;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class RenderSynchronizer {
    public static final float DEFAULT_TARGET_FPS = 30.0f;
    public static final String TAG = "RenderSynchronizer";
    public Choreographer choreographer;
    public boolean isListening;
    public long lastOpenedTimeNanos;
    public long lastRefreshTimeNanos;
    public final List<Listener> listeners;
    public final Object lock;
    public final Handler mainThreadHandler;
    public boolean renderWindowOpen;
    public final long targetFrameIntervalNanos;

    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisplayRefreshCycleBegin(long j) {
        synchronized (this.lock) {
            if (this.listeners.isEmpty()) {
                Logging.d(TAG, "No listeners, unsubscribing to frame callbacks");
                this.isListening = false;
                return;
            }
            this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda2(this));
            long j2 = j - this.lastOpenedTimeNanos;
            long j3 = j - this.lastRefreshTimeNanos;
            this.lastRefreshTimeNanos = j;
            long j4 = j2 - this.targetFrameIntervalNanos;
            if (Math.abs(j4) < Math.abs(j4 + j3)) {
                this.lastOpenedTimeNanos = j;
                openRenderWindow();
            } else if (this.renderWindowOpen) {
                closeRenderWindow();
            }
        }
    }

    private void traceRenderWindowChange() {
        Trace.setCounter("RenderWindow", BV5.A06(this.renderWindowOpen ? 1 : 0));
    }

    /* renamed from: lambda$registerListener$0$org-webrtc-RenderSynchronizer, reason: not valid java name */
    public /* synthetic */ void m3954lambda$registerListener$0$orgwebrtcRenderSynchronizer() {
        this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda2(this));
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            if (!this.isListening) {
                Logging.d(TAG, "First listener, subscribing to frame callbacks");
                this.isListening = true;
                this.mainThreadHandler.post(new Runnable() { // from class: org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3954lambda$registerListener$0$orgwebrtcRenderSynchronizer();
                    }
                });
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer(float f) {
        this.lock = C3cG.A0T();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(1.0E9f / f);
        Handler handlerA02 = C60O.A02();
        this.mainThreadHandler = handlerA02;
        handlerA02.post(new Runnable() { // from class: org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3953lambda$new$0$orgwebrtcRenderSynchronizer();
            }
        });
        Logging.d(TAG, "Created");
    }

    /* renamed from: lambda$new$0$org-webrtc-RenderSynchronizer, reason: not valid java name */
    public /* synthetic */ void m3953lambda$new$0$orgwebrtcRenderSynchronizer() {
        this.choreographer = Choreographer.getInstance();
    }

    public RenderSynchronizer() {
        this(30.0f);
    }
}
