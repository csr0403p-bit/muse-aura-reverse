package X;

import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;

/* loaded from: classes6.dex */
public interface GV7 {
    FeatureHolder createRsysFeature();

    SignalingTransportProxy getSignalingTransportProxy();

    String getUserId();

    void tearDown(String str);
}
