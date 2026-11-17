package X;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* renamed from: X.6xj, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6xj {
    public static final Uri A01 = Uri.parse("*");
    public static final Uri A00 = Uri.parse("");
    public static final WeakHashMap<WebView, C6xl> A02 = new WeakHashMap<>();

    public static C6oa A00(WebView webView) {
        if (C6xU.A0h.A01()) {
            return new C6oa((ProfileBoundaryInterface) C7510EyX.A00(ProfileBoundaryInterface.class, A02(webView).A00.getProfile()));
        }
        throw C60Q.A0q();
    }

    public static InterfaceC05836xn A01(WebView webView, String str, Set<String> set) {
        if (!C6xU.A0W.A01()) {
            throw C60Q.A0q();
        }
        C6xl c6xlA02 = A02(webView);
        return new C05826xm((ScriptHandlerBoundaryInterface) C7510EyX.A00(ScriptHandlerBoundaryInterface.class, c6xlA02.A00.addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))));
    }

    public static C6xl A02(WebView webView) {
        if (!C6xU.A0q.A01()) {
            return new C6xl(AbstractC05846xo.A00.A85(webView));
        }
        WeakHashMap<WebView, C6xl> weakHashMap = A02;
        C6xl c6xl = weakHashMap.get(webView);
        if (c6xl != null) {
            return c6xl;
        }
        C6xl c6xl2 = new C6xl(AbstractC05846xo.A00.A85(webView));
        weakHashMap.put(webView, c6xl2);
        return c6xl2;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;LX/6y5;)V */
    public static void A03(WebView webView, final C6y5 c6y5, String str, Set set) {
        if (!C6xU.A18.A01()) {
            throw C60Q.A0q();
        }
        C6xl c6xlA02 = A02(webView);
        c6xlA02.A00.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new C7413EvE(new WebMessageListenerBoundaryInterface(c6y5) { // from class: X.6yH
            public final C6y5 A00;

            @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
            public final String[] getSupportedFeatures() {
                return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
            }

            @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
            public final void onPostMessage(WebView webView2, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
                String data;
                C6yG c6yG;
                WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) C7510EyX.A00(WebMessageBoundaryInterface.class, invocationHandler);
                InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
                int length = ports.length;
                C6yY[] c6yYArr = new C6yY[length];
                for (int i = 0; i < length; i++) {
                    InvocationHandler invocationHandler3 = ports[i];
                    C6yY c6yY = new C6yY();
                    c6yY.A00 = (WebMessagePortBoundaryInterface) C7510EyX.A00(WebMessagePortBoundaryInterface.class, invocationHandler3);
                    c6yYArr[i] = c6yY;
                }
                if (C6xU.A17.A01()) {
                    WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C7510EyX.A00(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
                    int type = webMessagePayloadBoundaryInterface.getType();
                    if (type != 0) {
                        if (type == 1) {
                            c6yG = new C6yG(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), c6yYArr);
                            final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C7510EyX.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                            this.A00.onPostMessage(webView2, c6yG, uri, z, (C6yA) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: X.6yL
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return new C6yP(jsReplyProxyBoundaryInterface);
                                }
                            }));
                        }
                        return;
                    }
                    data = webMessagePayloadBoundaryInterface.getAsString();
                } else {
                    data = webMessageBoundaryInterface.getData();
                }
                c6yG = new C6yG(data, c6yYArr);
                final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface2 = (JsReplyProxyBoundaryInterface) C7510EyX.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                this.A00.onPostMessage(webView2, c6yG, uri, z, (C6yA) jsReplyProxyBoundaryInterface2.getOrCreatePeer(new Callable() { // from class: X.6yL
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C6yP(jsReplyProxyBoundaryInterface2);
                    }
                }));
            }

            {
                this.A00 = c6y5;
            }
        }));
    }

    public static void A04(WebView webView, String str) {
        if (!C6xU.A18.A01()) {
            throw C60Q.A0q();
        }
        A02(webView).A00.removeWebMessageListener(str);
    }
}
