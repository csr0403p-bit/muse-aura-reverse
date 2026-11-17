package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.CU7;
import X.Ht9;
import X.InterfaceC2349BUy;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class FancyPinEngineFrameDelegate implements FancyPinFrameConnection, FancyPinEngineDelegate {
    public final Object callbackLock;
    public volatile boolean callbacksEnabled;
    public boolean closed;
    public final Executor consumerExecutor;
    public List<String> currentVariantIds;
    public boolean delegateInstalled;
    public final FancyPinEngineDelegateHost host;
    public List<String> lastAppliedVariantIds;
    public final Object lock;
    public final FancyPinFrameMailbox mailbox;
    public final FancyPinVariantTableConsumer variantConsumer;

    /* renamed from: com.meta.maps.fancypins.FancyPinEngineFrameDelegate$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements InterfaceC2349BUy, FancyPinEngineDelegateHost {
        public final /* synthetic */ FancyPinEngine $tmp0;

        public AnonymousClass1(FancyPinEngine fancyPinEngine) {
            this.$tmp0 = fancyPinEngine;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FancyPinEngineDelegateHost) && (obj instanceof InterfaceC2349BUy)) {
                return C3cI.A1V(obj, getFunctionDelegate());
            }
            return false;
        }

        @Override // X.InterfaceC2349BUy
        public final Ht9<?> getFunctionDelegate() {
            return new C7438Evz(1, this.$tmp0, FancyPinEngine.class, "setDelegate", "setDelegate(Lcom/meta/maps/fancypins/FancyPinEngineDelegate;)V", 0);
        }

        @Override // com.meta.maps.fancypins.FancyPinEngineDelegateHost
        public final void setDelegate(FancyPinEngineDelegate fancyPinEngineDelegate) {
            this.$tmp0.setDelegate(fancyPinEngineDelegate);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.meta.maps.fancypins.FancyPinEngineDelegate
    public void onVariantTableUpdated(List<String> list) {
        C7384Etj.A0Y(list, 0);
        synchronized (this.callbackLock) {
            if (this.callbacksEnabled) {
                this.currentVariantIds = AbstractC0878AGe.A0X(list);
            }
        }
    }

    public /* synthetic */ FancyPinEngineFrameDelegate(FancyPinEngineDelegateHost fancyPinEngineDelegateHost, FancyPinRenderFrameSource fancyPinRenderFrameSource, Executor executor, FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer, FancyPinVariantTableConsumer fancyPinVariantTableConsumer, FancyPinPresentationEpoch fancyPinPresentationEpoch, int i, C06H c06h) {
        this(fancyPinEngineDelegateHost, fancyPinRenderFrameSource, executor, fancyPinRenderFrameConsumer, fancyPinVariantTableConsumer, (i & 32) != 0 ? new FancyPinPresentationEpoch() : fancyPinPresentationEpoch);
    }

    @Override // com.meta.maps.fancypins.FancyPinFrameConnection
    public void attach() {
        synchronized (this.lock) {
            if (this.closed) {
                throw C3cG.A0Q("Cannot attach a closed FancyPinEngineFrameDelegate");
            }
            if (!this.delegateInstalled) {
                this.callbacksEnabled = true;
                this.delegateInstalled = true;
                try {
                    this.host.setDelegate(this);
                } catch (Throwable th) {
                    this.callbacksEnabled = false;
                    try {
                        this.host.setDelegate(null);
                        this.delegateInstalled = false;
                    } catch (Throwable th2) {
                        CU7.A01(th, th2);
                    }
                }
            } else if (!this.callbacksEnabled) {
                throw C3cG.A0Q("A failed delegate install must be detached before retry");
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (!this.closed) {
                this.closed = true;
                this.callbacksEnabled = false;
                this.mailbox.close();
            } else if (!this.delegateInstalled) {
            }
            if (this.delegateInstalled) {
                this.host.setDelegate(null);
                this.delegateInstalled = false;
            }
        }
    }

    @Override // com.meta.maps.fancypins.FancyPinEngineDelegate
    public void onEngineFrameRendered() {
        synchronized (this.callbackLock) {
            if (this.callbacksEnabled) {
                this.mailbox.onFrameAvailable(this.currentVariantIds);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinEngineFrameDelegate(FancyPinEngine fancyPinEngine, Executor executor, FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer, FancyPinVariantTableConsumer fancyPinVariantTableConsumer, FancyPinPresentationEpoch fancyPinPresentationEpoch) {
        this(new AnonymousClass1(fancyPinEngine), new FancyPinNativeRenderFrameSource(fancyPinEngine), executor, fancyPinRenderFrameConsumer, fancyPinVariantTableConsumer, fancyPinPresentationEpoch);
        AnonymousClass005.A17(fancyPinEngine, executor, fancyPinRenderFrameConsumer, fancyPinVariantTableConsumer, fancyPinPresentationEpoch);
    }

    public FancyPinEngineFrameDelegate(FancyPinEngineDelegateHost fancyPinEngineDelegateHost, FancyPinRenderFrameSource fancyPinRenderFrameSource, Executor executor, final FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer, FancyPinVariantTableConsumer fancyPinVariantTableConsumer, FancyPinPresentationEpoch fancyPinPresentationEpoch) {
        boolean zA1b = AnonymousClass004.A1b(fancyPinEngineDelegateHost, fancyPinRenderFrameSource);
        AnonymousClass005.A16(executor, fancyPinRenderFrameConsumer, fancyPinVariantTableConsumer, fancyPinPresentationEpoch, 2);
        this.host = fancyPinEngineDelegateHost;
        this.consumerExecutor = executor;
        this.variantConsumer = fancyPinVariantTableConsumer;
        this.lock = C3cG.A0T();
        this.callbackLock = C3cG.A0T();
        this.currentVariantIds = C0881AGi.A00;
        this.mailbox = new FancyPinFrameMailbox(fancyPinRenderFrameSource, executor, zA1b ? 1 : 0, fancyPinPresentationEpoch, new FancyPinRenderFrameConsumer() { // from class: com.meta.maps.fancypins.FancyPinEngineFrameDelegate$mailbox$1
            @Override // com.meta.maps.fancypins.FancyPinRenderFrameConsumer
            public final void apply(FancyPinRenderFrame fancyPinRenderFrame) {
                C7384Etj.A0Y(fancyPinRenderFrame, 0);
                FancyPinEngineFrameDelegate fancyPinEngineFrameDelegate = this.this$0;
                List<String> list = fancyPinEngineFrameDelegate.lastAppliedVariantIds;
                List<String> list2 = fancyPinRenderFrame.variantIds;
                if (list != list2) {
                    fancyPinEngineFrameDelegate.variantConsumer.apply(list2);
                    this.this$0.lastAppliedVariantIds = fancyPinRenderFrame.variantIds;
                }
                fancyPinRenderFrameConsumer.apply(fancyPinRenderFrame);
            }
        });
    }

    public /* synthetic */ FancyPinEngineFrameDelegate(FancyPinEngine fancyPinEngine, Executor executor, FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer, FancyPinVariantTableConsumer fancyPinVariantTableConsumer, FancyPinPresentationEpoch fancyPinPresentationEpoch, int i, C06H c06h) {
        this(fancyPinEngine, executor, fancyPinRenderFrameConsumer, fancyPinVariantTableConsumer, (i & 16) != 0 ? new FancyPinPresentationEpoch() : fancyPinPresentationEpoch);
    }
}
