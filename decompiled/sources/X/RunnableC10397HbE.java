package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;

/* renamed from: X.HbE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10397HbE implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpWebSocketNativeCallbacksAdapter$onClosingNative$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ TigonHttpWebSocketNativeCallbacksAdapter A01;
    public final /* synthetic */ String A02;

    public RunnableC10397HbE(TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter, String str, int i) {
        this.A01 = tigonHttpWebSocketNativeCallbacksAdapter;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.callbacks.onClosing(this.A00, this.A02);
    }
}
