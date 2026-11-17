package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;
import com.facebook.rtc.logging.connectfunnel.structuredlogger.StructuredAnalyticsLoggerConverter;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GVL extends ConnectFunnelProxy {
    public final DJU A00;

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final McfReference createStructuredLoggerPointer() {
        DJU dju = this.A00;
        if (dju == null) {
            return null;
        }
        StructuredAnalyticsLoggerConverter structuredAnalyticsLoggerConverter = StructuredAnalyticsLoggerConverter.$redex_init_class;
        return new StructuredAnalyticsLoggerConverter(dju.getXAnalyticsNative()).convertToMcfReference();
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final ArrayList<Integer> createSubscribedEvents() {
        return null;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final String diskCachingCreateDirectory() {
        return null;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final boolean diskCachingIsEnabled() {
        return false;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final McfReference getPrivacyContext() {
        return null;
    }

    public GVL(DJU dju) {
        this.A00 = dju;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final void handleFunnelEvent(int i, Map<String, Long> map, Map<String, String> map2) {
    }
}
