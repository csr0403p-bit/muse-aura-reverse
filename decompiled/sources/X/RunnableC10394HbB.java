package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;

/* renamed from: X.HbB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10394HbB implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpWebSocketNativeCallbacksAdapter$onBinaryMessageNative$1";
    public final /* synthetic */ TigonHttpWebSocketNativeCallbacksAdapter A00;
    public final /* synthetic */ byte[] A01;

    public RunnableC10394HbB(TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter, byte[] bArr) {
        this.A00 = tigonHttpWebSocketNativeCallbacksAdapter;
        this.A01 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.callbacks.onMessage(this.A01);
    }
}
