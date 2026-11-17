package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GU7 extends ConnectFunnelProxy {
    public final com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy A00;

    public GU7(com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy connectFunnelProxy) {
        C7384Etj.A0Y(connectFunnelProxy, 0);
        this.A00 = connectFunnelProxy;
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void markPoint(String str, int i) {
        C7384Etj.A0Y(str, 0);
        ConnectFunnel.CProxy.markPoint(str, i, null);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void upload(String str, McfReference mcfReference) {
        C7384Etj.A0Y(str, 0);
        ConnectFunnel.CProxy.succeed(str, mcfReference);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void annotateMultiple(String str, Map<Integer, McfReference> map, Map<Integer, String> map2, Map<Integer, Boolean> map3, Map<Integer, Long> map4) {
        AnonymousClass003.A0u(str, map);
        ConnectFunnel.CProxy.annotateMultiple(str, map);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void associateCallIds(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        ConnectFunnel.CProxy.associateCallIds(str, str2, z);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void start(String str, int i, Map<Integer, McfReference> map) {
        AnonymousClass003.A0v(str, map);
        ConnectFunnel.CProxy.startWithProxy(this.A00, str, i, null, map);
    }
}
