package com.meta.maps.fancypins;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class FancyPinFrameMailbox implements AutoCloseable {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int FRAME_COUNT = 3;
    public final ArrayDeque<FancyPinRenderFrame> availableFrames;
    public boolean closed;
    public final FancyPinRenderFrameConsumer consumer;
    public final Executor consumerExecutor;
    public final Object consumerLock;
    public final Runnable deliveryRunnable;
    public boolean deliveryScheduled;
    public final Object lock;
    public FancyPinRenderFrame pendingFrame;
    public final FancyPinPresentationEpoch presentationEpoch;
    public final Object producerLock;
    public final FancyPinRenderFrameSource source;

    public final void onFrameAvailable(List<String> list) {
        boolean z;
        C7384Etj.A0Y(list, 0);
        synchronized (this.producerLock) {
            Object obj = this.lock;
            synchronized (obj) {
                if (!this.closed) {
                    if (this.availableFrames.isEmpty()) {
                        throw C3cG.A0Q("No render frame is available for the producer");
                    }
                    FancyPinRenderFrame fancyPinRenderFrameRemoveFirst = this.availableFrames.removeFirst();
                    try {
                        long jA05 = C3cG.A05(this.presentationEpoch.capture(FancyPinFrameMailbox$onFrameAvailable$1$epoch$1.INSTANCE));
                        fancyPinRenderFrameRemoveFirst.clear();
                        this.source.copyInto(fancyPinRenderFrameRemoveFirst);
                        fancyPinRenderFrameRemoveFirst.presentationEpoch = jA05;
                        fancyPinRenderFrameRemoveFirst.mapFrameIdentity = FancyPinRenderFrameIdentity.INSTANCE.currentMapFrameIdentity$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
                        fancyPinRenderFrameRemoveFirst.variantIds = list;
                        synchronized (this.lock) {
                            try {
                                z = false;
                                if (this.closed) {
                                    this.availableFrames.addLast(fancyPinRenderFrameRemoveFirst);
                                } else {
                                    FancyPinRenderFrame fancyPinRenderFrame = this.pendingFrame;
                                    if (fancyPinRenderFrame != null) {
                                        this.availableFrames.addLast(fancyPinRenderFrame);
                                    }
                                    this.pendingFrame = fancyPinRenderFrameRemoveFirst;
                                    if (!this.deliveryScheduled) {
                                        this.deliveryScheduled = true;
                                        z = true;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z) {
                            scheduleDelivery();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = this.lock;
                        synchronized (obj) {
                            try {
                                this.availableFrames.addLast(fancyPinRenderFrameRemoveFirst);
                            } finally {
                            }
                        }
                    }
                }
            }
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverOne() {
        boolean z;
        synchronized (this.lock) {
            FancyPinRenderFrame fancyPinRenderFrame = this.pendingFrame;
            boolean z2 = false;
            if (fancyPinRenderFrame == null) {
                this.deliveryScheduled = false;
                return;
            }
            this.pendingFrame = null;
            try {
                synchronized (this.consumerLock) {
                    synchronized (this.lock) {
                        z = this.closed;
                    }
                    if (!z && this.presentationEpoch.isCurrent(fancyPinRenderFrame.presentationEpoch)) {
                        this.consumer.apply(fancyPinRenderFrame);
                    }
                }
                synchronized (this.lock) {
                    this.availableFrames.addLast(fancyPinRenderFrame);
                    if (this.pendingFrame == null) {
                        this.deliveryScheduled = false;
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    scheduleDelivery();
                }
            } catch (Throwable th) {
                synchronized (this.lock) {
                    this.availableFrames.addLast(fancyPinRenderFrame);
                    if (this.pendingFrame == null) {
                        this.deliveryScheduled = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        scheduleDelivery();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onFrameAvailable$default(FancyPinFrameMailbox fancyPinFrameMailbox, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = C0881AGi.A00;
        }
        fancyPinFrameMailbox.onFrameAvailable(list);
    }

    private final void scheduleDelivery() {
        try {
            this.consumerExecutor.execute(this.deliveryRunnable);
        } catch (Throwable th) {
            synchronized (this.lock) {
                FancyPinRenderFrame fancyPinRenderFrame = this.pendingFrame;
                if (fancyPinRenderFrame != null) {
                    this.availableFrames.addLast(fancyPinRenderFrame);
                }
                this.pendingFrame = null;
                this.deliveryScheduled = false;
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Object obj = this.producerLock;
        synchronized (obj) {
            synchronized (this.lock) {
                if (!this.closed) {
                    this.closed = true;
                    FancyPinRenderFrame fancyPinRenderFrame = this.pendingFrame;
                    if (fancyPinRenderFrame != null) {
                        this.availableFrames.addLast(fancyPinRenderFrame);
                    }
                    this.pendingFrame = null;
                    this.deliveryScheduled = false;
                }
            }
        }
        obj = this.consumerLock;
        synchronized (obj) {
        }
    }

    public FancyPinFrameMailbox(FancyPinRenderFrameSource fancyPinRenderFrameSource, Executor executor, int i, FancyPinPresentationEpoch fancyPinPresentationEpoch, FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer) {
        AnonymousClass003.A0u(fancyPinRenderFrameSource, executor);
        AnonymousClass002.A1C(fancyPinPresentationEpoch, 3, fancyPinRenderFrameConsumer);
        this.source = fancyPinRenderFrameSource;
        this.consumerExecutor = executor;
        this.presentationEpoch = fancyPinPresentationEpoch;
        this.consumer = fancyPinRenderFrameConsumer;
        this.lock = C3cG.A0T();
        this.producerLock = C3cG.A0T();
        this.consumerLock = C3cG.A0T();
        this.availableFrames = new ArrayDeque<>(3);
        this.deliveryRunnable = new Runnable() { // from class: com.meta.maps.fancypins.FancyPinFrameMailbox$deliveryRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.deliverOne();
            }
        };
        int i2 = 0;
        do {
            this.availableFrames.addLast(new FancyPinRenderFrame(i));
            i2++;
        } while (i2 < 3);
    }

    public /* synthetic */ FancyPinFrameMailbox(FancyPinRenderFrameSource fancyPinRenderFrameSource, Executor executor, int i, FancyPinPresentationEpoch fancyPinPresentationEpoch, FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer, int i2, C06H c06h) {
        this(fancyPinRenderFrameSource, executor, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new FancyPinPresentationEpoch() : fancyPinPresentationEpoch, fancyPinRenderFrameConsumer);
    }
}
