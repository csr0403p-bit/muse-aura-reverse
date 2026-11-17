package com.facebook.aura.network.transport.tigon.internal;

import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonXplatBodyProvider;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class TigonMultipartStreamingProvider extends TigonXplatBodyProvider {
    public final Executor executor;
    public final NoisePauseGate pauseGate;
    public final MultipartStreamPlan plan;
    public final long uploadNoProgressTimeoutMs;

    @Override // com.facebook.tigon.TigonBodyProvider
    public void beginStream(final TigonBodyStream tigonBodyStream) {
        C7384Etj.A0Y(tigonBodyStream, 0);
        this.executor.execute(new Runnable() { // from class: com.facebook.aura.network.transport.tigon.internal.TigonMultipartStreamingProvider.beginStream.1
            @Override // java.lang.Runnable
            public final void run() {
                TigonBodyStream tigonBodyStream2 = tigonBodyStream;
                TigonMultipartStreamingProvider tigonMultipartStreamingProvider = this;
                TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
                TigonMultipartStreamingProviderKt.writeMultipartStream(tigonBodyStream2, tigonMultipartStreamingProvider.plan, tigonMultipartStreamingProvider.pauseGate, tigonMultipartStreamingProvider.uploadNoProgressTimeoutMs);
            }
        });
    }

    public /* synthetic */ TigonMultipartStreamingProvider(MultipartStreamPlan multipartStreamPlan, Executor executor, long j, int i, C06H c06h) {
        this(multipartStreamPlan, executor, (i & 4) != 0 ? 120000L : j);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public long getContentLength() {
        return this.plan.declaredTotalLength;
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public String getName() {
        return "TigonMultipartStreamingProvider";
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public void setPausedForOutboundBackpressure(boolean z) {
        this.pauseGate.setPaused(z);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public boolean supportsOutboundBackpressurePause() {
        return true;
    }

    public TigonMultipartStreamingProvider(MultipartStreamPlan multipartStreamPlan, Executor executor, long j) {
        AnonymousClass003.A0u(multipartStreamPlan, executor);
        this.plan = multipartStreamPlan;
        this.executor = executor;
        this.uploadNoProgressTimeoutMs = j;
        this.pauseGate = new NoisePauseGate();
    }
}
