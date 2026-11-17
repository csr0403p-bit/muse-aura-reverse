package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    public static final String MULTI_COOKIE_HEADER_NAME = "\u0000Set-Cookie-Multivalue\u0000";
    public static final String MULTI_COOKIE_VALUE_SEPARATOR = "\u0000";

    InvocationHandler buildWebContent(Consumer<BiConsumer<Integer, Object>> consumer);

    InvocationHandler createWebView(WebView webView);

    InvocationHandler getDropDataProvider();

    InvocationHandler getProfileStore();

    InvocationHandler getProxyController();

    InvocationHandler getServiceWorkerController();

    InvocationHandler getStatics();

    String[] getSupportedFeatures();

    InvocationHandler getTracingController();

    InvocationHandler getWebViewBuilder();

    InvocationHandler getWebkitToCompatConverter();

    void startUpWebView(InvocationHandler invocationHandler, InvocationHandler invocationHandler2);

    void startUpWebView(Consumer<BiConsumer<Integer, Object>> consumer, Consumer<Consumer<BiConsumer<Integer, Object>>> consumer2, Consumer<Consumer<BiConsumer<Integer, Object>>> consumer3);
}
