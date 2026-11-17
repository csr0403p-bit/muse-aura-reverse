package X;

import com.crossapp.tigonhttp.noise.TigonNoiseContext;
import com.crossapp.tigonhttp.noise.TigonNoiseGatewayCarrier;
import com.crossapp.tigonhttp.noise.TigonNoiseGatewayTransport;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class ETG {
    private final HybridData initHybrid(TigonNoiseContext tigonNoiseContext, TigonNoiseGatewayTransport tigonNoiseGatewayTransport) {
        return TigonNoiseGatewayCarrier.initHybrid(tigonNoiseContext, tigonNoiseGatewayTransport);
    }
}
