package com.facebook.aura.network.transport.tigon.internal;

import X.AbstractC4088Clr;
import X.C06H;
import X.C7384Etj;
import X.CY4;
import X.DCM;
import X.HtJ;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonXplatBodyProvider;
import com.facebook.tigon.iface.TigonPropertyContainer;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class LiveDuplexBodyProvider extends TigonXplatBodyProvider {
    public final LiveDuplexBody body;
    public final Executor executor;

    public LiveDuplexBodyProvider(Executor executor, int i) {
        C7384Etj.A0Y(executor, 0);
        this.executor = executor;
        this.body = new LiveDuplexBody(i);
        TigonPropertyContainer tigonPropertyContainer = this.mProperties;
        CY4 cy4 = AbstractC4088Clr.A08;
        TigonPropertyContainer.Group group = new TigonPropertyContainer.Group();
        group.setProperty(DCM.A00, true, true);
        group.setProperty(DCM.A01, false, true);
        tigonPropertyContainer.setPropertyGroup(cy4, group);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public void beginStream(final TigonBodyStream tigonBodyStream) {
        C7384Etj.A0Y(tigonBodyStream, 0);
        this.executor.execute(new Runnable() { // from class: com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProvider.beginStream.1
            @Override // java.lang.Runnable
            public final void run() {
                LiveDuplexBodyProvider liveDuplexBodyProvider = LiveDuplexBodyProvider.this;
                TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
                liveDuplexBodyProvider.body.writeTo(tigonBodyStream);
            }
        });
    }

    public final void cancel() {
        this.body.cancel();
    }

    public final boolean finish() {
        return this.body.finish();
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public String getName() {
        return "LiveDuplexBodyProvider";
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public void setPausedForOutboundBackpressure(boolean z) {
        this.body.setPausedForOutboundBackpressure(z);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public boolean supportsOutboundBackpressurePause() {
        return true;
    }

    public final Object write(byte[] bArr, HtJ<? super Boolean> htJ) {
        return this.body.write(bArr, htJ);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public long getContentLength() {
        return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    }

    public /* synthetic */ LiveDuplexBodyProvider(Executor executor, int i, int i2, C06H c06h) {
        this(executor, (i2 & 2) != 0 ? 64 : i);
    }
}
