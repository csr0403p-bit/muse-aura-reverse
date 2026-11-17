package X;

import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;

/* loaded from: classes6.dex */
public final class GQR extends AudioStateManagerListener {
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession A00;

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
    public final void onError(String str) {
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
    public final void onFirstFramePlayed() {
        AnonymousClass004.A1D(true, this.A00.A0Z);
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
    public final void onFirstFrameRecorded() {
        GQS gqs = (GQS) this.A00.A0P.getValue();
        gqs.A00 = true;
        GQS.A00(gqs, C9659Gcj.A00(gqs.A03));
        ConnectFunnel.CProxy.markPoint(gqs.A05, 24, null);
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
    public final void onPlayoutPathLive() {
        AnonymousClass004.A1D(true, this.A00.A0Y);
    }

    public GQR() {
    }

    public GQR(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession) {
        this.A00 = metaAiRsysSdkRealTimeSession;
    }
}
