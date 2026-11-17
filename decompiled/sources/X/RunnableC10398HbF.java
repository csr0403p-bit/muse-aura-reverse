package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;

/* renamed from: X.HbF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10398HbF implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpWebSocketNativeCallbacksAdapter$onTextMessageNative$1";
    public final /* synthetic */ TigonHttpWebSocketNativeCallbacksAdapter A00;
    public final /* synthetic */ String A01;

    public RunnableC10398HbF(TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter, String str) {
        this.A00 = tigonHttpWebSocketNativeCallbacksAdapter;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.callbacks.onMessage(this.A01);
    }
}
