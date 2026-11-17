package X;

import com.crossapp.tigonhttp.noise.TigonHttpClientNoiseContextJni;
import com.crossapp.tigonhttp.noise.TigonNoiseContextConfig;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes5.dex */
public final class ES0 {
    public final HybridData createNoiseContextNative(TigonServiceHolder tigonServiceHolder, TigonNoiseContextConfig tigonNoiseContextConfig) {
        return TigonHttpClientNoiseContextJni.createNoiseContextNative(tigonServiceHolder, tigonNoiseContextConfig);
    }
}
