package X;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.6xT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6xT extends C6xR {
    public static final WeakHashMap<WebViewRenderProcess, C6xT> A01 = new WeakHashMap<>();
    public WeakReference<WebViewRenderProcess> A00;

    public static C6xT A00(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, C6xT> weakHashMap = A01;
        C6xT c6xT = weakHashMap.get(webViewRenderProcess);
        if (c6xT != null) {
            return c6xT;
        }
        C6xT c6xT2 = new C6xT();
        c6xT2.A00 = new WeakReference<>(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, c6xT2);
        return c6xT2;
    }
}
