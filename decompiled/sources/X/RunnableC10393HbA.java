package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;

/* renamed from: X.HbA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10393HbA implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpWebSocketNativeCallbacksAdapter$onOpenNative$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ TigonHttpWebSocketNativeCallbacksAdapter A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String[] A03;
    public final /* synthetic */ String[] A04;

    public RunnableC10393HbA(TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter, String str, String[] strArr, String[] strArr2, int i) {
        this.A01 = tigonHttpWebSocketNativeCallbacksAdapter;
        this.A00 = i;
        this.A03 = strArr;
        this.A04 = strArr2;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.callbacks.onOpen(new C4256CrU(this.A03, this.A04, this.A00));
    }
}
