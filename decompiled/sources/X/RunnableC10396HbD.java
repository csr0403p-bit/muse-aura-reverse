package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;

/* renamed from: X.HbD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10396HbD implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpWebSocketNativeCallbacksAdapter$onClosedNative$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ TigonHttpWebSocketNativeCallbacksAdapter A01;
    public final /* synthetic */ String A02;

    public RunnableC10396HbD(TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter, String str, int i) {
        this.A01 = tigonHttpWebSocketNativeCallbacksAdapter;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.callbacks.onClosed(this.A00, this.A02);
    }
}
