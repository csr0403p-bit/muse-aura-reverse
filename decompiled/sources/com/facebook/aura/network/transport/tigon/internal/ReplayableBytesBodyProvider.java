package com.facebook.aura.network.transport.tigon.internal;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonXplatBodyProvider;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ReplayableBytesBodyProvider extends TigonXplatBodyProvider {
    public final byte[] bytes;
    public final Executor executor;
    public final NoisePauseGate pauseGate;

    @Override // com.facebook.tigon.TigonBodyProvider
    public void beginStream(final TigonBodyStream tigonBodyStream) {
        C7384Etj.A0Y(tigonBodyStream, 0);
        this.executor.execute(new Runnable() { // from class: com.facebook.aura.network.transport.tigon.internal.ReplayableBytesBodyProvider.beginStream.1
            @Override // java.lang.Runnable
            public final void run() {
                TigonBodyStream tigonBodyStream2 = tigonBodyStream;
                ReplayableBytesBodyProvider replayableBytesBodyProvider = this;
                TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
                ReplayableBytesBodyProviderKt.writeReplayableBytes(tigonBodyStream2, replayableBytesBodyProvider.bytes, replayableBytesBodyProvider.pauseGate);
            }
        });
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public long getContentLength() {
        return this.bytes.length;
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public String getName() {
        return "ReplayableBytesBodyProvider";
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public void setPausedForOutboundBackpressure(boolean z) {
        this.pauseGate.setPaused(z);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public boolean supportsOutboundBackpressurePause() {
        return true;
    }

    public ReplayableBytesBodyProvider(byte[] bArr, Executor executor) {
        AnonymousClass003.A0u(bArr, executor);
        this.bytes = bArr;
        this.executor = executor;
        this.pauseGate = new NoisePauseGate();
    }
}
