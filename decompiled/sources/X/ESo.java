package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketClient;
import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes5.dex */
public final class ESo {
    private final HybridData newWebSocketNative(TigonServiceHolder tigonServiceHolder, String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, long j, TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter) {
        return TigonHttpWebSocketClient.newWebSocketNative(tigonServiceHolder, str, strArr, strArr2, strArr3, i, i2, j, tigonHttpWebSocketNativeCallbacksAdapter);
    }
}
