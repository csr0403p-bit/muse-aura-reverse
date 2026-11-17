package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass005;
import X.BV5;
import X.C3cG;
import X.HtJ;
import X.InterfaceC10560Hsz;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProvider;
import com.facebook.tigon.TigonRequestToken;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class TigonDuplexHttpStream implements HatchDuplexHttpStream {
    public final LiveDuplexBodyProvider bodyProvider;
    public final InterfaceC10560Hsz<HatchHttpResponse> completion;
    public final AtomicReference<TigonRequestToken> requestToken;

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public Object awaitResponse(HtJ<? super HatchHttpResponse> htJ) {
        return C3cG.A0W(this.completion, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public void cancel() {
        this.bodyProvider.cancel();
        BV5.A1L(this.requestToken);
        C3cG.A1F(this.completion, TigonHatchHttpClientKt.transportFailureResponse(new CancellationException("duplex stream canceled")));
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public boolean finishRequest() {
        return this.bodyProvider.body.finish();
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public Object writeRequestChunk(byte[] bArr, HtJ<? super Boolean> htJ) {
        return this.bodyProvider.body.write(bArr, htJ);
    }

    public TigonDuplexHttpStream(LiveDuplexBodyProvider liveDuplexBodyProvider, InterfaceC10560Hsz<HatchHttpResponse> interfaceC10560Hsz, AtomicReference<TigonRequestToken> atomicReference) {
        AnonymousClass005.A0x(liveDuplexBodyProvider, interfaceC10560Hsz, atomicReference);
        this.bodyProvider = liveDuplexBodyProvider;
        this.completion = interfaceC10560Hsz;
        this.requestToken = atomicReference;
    }
}
