package X;

import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.jni.HybridData;

/* renamed from: X.ERv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6686ERv {
    public static final void A00(C6686ERv c6686ERv) {
        if (NoiseChannelManagerHolder.soLoaded) {
            return;
        }
        synchronized (c6686ERv) {
            if (!NoiseChannelManagerHolder.soLoaded) {
                ETi.loadLibrary("tigon-noise-context-jni");
                NoiseChannelManagerHolder.soLoaded = true;
            }
        }
    }

    private final String connectionKeyFromUrlNative(String str) {
        return NoiseChannelManagerHolder.connectionKeyFromUrlNative(str);
    }

    private final HybridData createNative() {
        return NoiseChannelManagerHolder.createNative();
    }
}
