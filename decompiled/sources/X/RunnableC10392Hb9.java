package X;

import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketNativeCallbacksAdapter;

/* renamed from: X.Hb9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10392Hb9 implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpWebSocketNativeCallbacksAdapter$onFailureNative$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ TigonHttpWebSocketNativeCallbacksAdapter A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ String[] A05;
    public final /* synthetic */ String[] A06;

    public RunnableC10392Hb9(TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter, String str, String str2, String[] strArr, String[] strArr2, int i, boolean z) {
        this.A01 = tigonHttpWebSocketNativeCallbacksAdapter;
        this.A02 = str;
        this.A04 = z;
        this.A00 = i;
        this.A05 = strArr;
        this.A06 = strArr2;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC10395HbC abstractC10395HbC = this.A01.callbacks;
        String str = this.A02;
        C4256CrU c4256CrU = null;
        if (this.A04) {
            c4256CrU = new C4256CrU(this.A05, this.A06, this.A00);
        }
        abstractC10395HbC.onFailure(str, c4256CrU);
    }
}
