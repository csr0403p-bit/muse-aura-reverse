package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass001;
import X.C3cG;
import X.C7384Etj;
import X.GAt;
import X.HtJ;
import X.InterfaceC10560Hsz;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchHttpResponse;

/* loaded from: classes5.dex */
public final class FailedTigonDuplexHttpStream implements HatchDuplexHttpStream {
    public final InterfaceC10560Hsz<HatchHttpResponse> completion;

    public FailedTigonDuplexHttpStream(HatchHttpResponse hatchHttpResponse) {
        C7384Etj.A0Y(hatchHttpResponse, 0);
        GAt gAt = new GAt(null);
        gAt.A0R(hatchHttpResponse);
        this.completion = gAt;
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public void cancel() {
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public Object awaitResponse(HtJ<? super HatchHttpResponse> htJ) {
        return C3cG.A0W(this.completion, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public boolean finishRequest() {
        return false;
    }

    @Override // com.facebook.aura.network.transport.HatchDuplexHttpStream
    public Object writeRequestChunk(byte[] bArr, HtJ<? super Boolean> htJ) {
        return AnonymousClass001.A0h();
    }
}
