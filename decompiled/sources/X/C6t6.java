package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6t6, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6t6 extends WebView {
    public String TAG;
    public ArrayList<C6tC> callbacks;
    public boolean mChromeClientWasSet;
    public boolean mClientWasSet;
    public final Context mContext;
    public String mCurrentLoadedUrl;
    public C7mY mReporter;
    public final C6t7 mSecureJsBridgeAuth;
    public C6oc mUriHandler;

    public static void A00(WebSettings webSettings) {
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void A01(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public void evaluateJavascriptFunction(String str, ValueCallback<String> valueCallback, Object... objArr) {
        String strSubstring;
        if (str == null || str.isEmpty()) {
            CFK.A04(this.TAG, "Function name cannot be null or empty");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        int length = objArr.length;
        if (length > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                do {
                    Object obj = objArr[i];
                    if (obj instanceof Map) {
                        jSONArray.put(new JSONObject((Map) obj));
                    } else {
                        jSONArray.put(obj);
                    }
                    i++;
                } while (i < length);
                String string = jSONArray.toString();
                if (string == null) {
                    CFK.A04(this.TAG, "Failed to serialize arguments: JSONArray.toString() returned null");
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(null);
                        return;
                    }
                    return;
                }
                strSubstring = string.substring(1, string.length() - 1);
            } catch (Exception e) {
                CFK.A0J(this.TAG, e, "Failed to serialize arguments");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                    return;
                }
                return;
            }
        } else {
            strSubstring = "";
        }
        evaluateJavascript(FGI.A0d(str, "(", strSubstring, ")"), valueCallback);
    }

    public final void loadUrlWithCookiesSecure(String str, C6od c6od, Collection<String> collection) {
        loadUrlWithCookies(str, c6od, null, collection, null);
    }

    public final void loadUrlWithFacebookCookies(String str, Collection<String> collection) {
        C6od.A00(this, str, collection, 0);
    }

    public final void loadUrlWithInstagramCookies(String str, Collection<String> collection) {
        C6od.A00(this, str, collection, 1);
    }

    public final void loadUrlWithMetaAICookies(String str, Collection<String> collection) {
        C6od.A00(this, str, collection, 3);
    }

    public final void loadUrlWithMetaCookies(String str, Collection<String> collection) {
        C6od.A00(this, str, collection, 2);
    }

    public final void loadUrlWithWorkplaceCookies(String str, Collection<String> collection) {
        C6od.A00(this, str, collection, 4);
    }

    public final void setCookieStringsSecure(String str, C6od c6od, Collection<String> collection) {
        setCookieStrings(str, c6od, collection, null);
    }

    public final boolean validateJsInterfaceToken(String str) {
        String url;
        C7Jf c7Jf;
        if (str == null || (url = getUrl()) == null) {
            return false;
        }
        C6t7 c6t7 = this.mSecureJsBridgeAuth;
        if (!c6t7.A02) {
            return true;
        }
        String strA00 = C7Jf.A00(url);
        HashMap<String, C7Jf> map = c6t7.A04;
        if (!map.containsKey(strA00) || (c7Jf = map.get(strA00)) == null) {
            return false;
        }
        return str.equals(c7Jf.A01);
    }

    private void invokeUriCallbacks(String str) {
        Iterator<C6tC> it = this.callbacks.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("execute");
        }
    }

    public final void addOnLoadCallback(C6tC c6tC) {
        this.callbacks.add(c6tC);
    }

    public final void clearLoadCallbacks() {
        this.callbacks.clear();
    }

    public final void enableSecureJsBridge(boolean z) {
        this.mSecureJsBridgeAuth.A02 = z;
    }

    public void forceLoadUrl(String str) {
        navigateToWebview(str, C6tp.A00, null, null, null);
    }

    public String getCurrentLoadedUrl() {
        return this.mCurrentLoadedUrl;
    }

    public final C6t7 getSecureJsBridgeAuth() {
        return this.mSecureJsBridgeAuth;
    }

    public final C6oc getUriHandler() {
        return this.mUriHandler;
    }

    public final boolean isSecureJsBridgeEnabled() {
        return this.mSecureJsBridgeAuth.A02;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        this.mCurrentLoadedUrl = str;
        loadUrl(str, null);
    }

    public final void loadUrlWithCookies(String str, C6od c6od, Map<String, String> map, Collection<String> collection, ValueCallback<Boolean> valueCallback) {
        if (this.mUriHandler.A00(getContext(), str).intValue() == 0) {
            if (map == null) {
                map = new HashMap<>();
            }
            navigateToWebview(str, c6od, map, collection, valueCallback);
        }
    }

    public final void loadUrlWithCookiesForRandomInsecure(String str, Collection<String> collection, ValueCallback<Boolean> valueCallback) {
        loadUrlWithCookies(str, C6tp.A00, null, collection, valueCallback);
    }

    public final void removeLoadCallback(C6tC c6tC) {
        this.callbacks.remove(c6tC);
    }

    public final void setCookieStrings(String str, C6od c6od, Collection<String> collection, ValueCallback<Boolean> valueCallback) {
        if (collection != null) {
            try {
                if (!c6od.A01(C7Je.A01(str))) {
                    CFK.A0F(this.TAG, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", str);
                    return;
                }
                try {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.flush();
                    cookieManager.setAcceptCookie(true);
                    Iterator<String> it = collection.iterator();
                    while (it.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it);
                        if (valueCallback != null) {
                            cookieManager.setCookie(str, strA0j, valueCallback);
                        } else {
                            cookieManager.setCookie(str, strA0j);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                CFK.A0C(this.TAG, "Parse url run triggers the exception on url: \n%s\n", e, str);
            }
        }
    }

    public final void setCookieStringsInsecure(String str, Collection<String> collection) {
        setCookieStrings(str, C6tp.A00, collection, null);
    }

    public final void setReporter(C7mY c7mY) {
        this.mReporter = c7mY;
    }

    public final C6t6 setWebChromeClient(final C6tF c6tF) {
        C7mY c7mY;
        if (this.mChromeClientWasSet && (c7mY = this.mReporter) != null) {
            c7mY.report("webview.SecureWebView", "WebChromeClient has been set already", null);
        }
        this.mChromeClientWasSet = true;
        super.setWebChromeClient(new WebChromeClient(c6tF) { // from class: X.6tE
            public final C6tF A00;

            @Override // android.webkit.WebChromeClient
            public final Bitmap getDefaultVideoPoster() {
                return this.A00.webChromeClientFallback.getDefaultVideoPoster();
            }

            @Override // android.webkit.WebChromeClient
            public final View getVideoLoadingProgressView() {
                return this.A00.webChromeClientFallback.getVideoLoadingProgressView();
            }

            @Override // android.webkit.WebChromeClient
            public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                this.A00.getVisitedHistory(valueCallback);
            }

            @Override // android.webkit.WebChromeClient
            public final void onCloseWindow(WebView webView) {
                this.A00.onCloseWindow(webView);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return this.A00.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                return this.A00.onCreateWindow(webView, z, z2, message);
            }

            @Override // android.webkit.WebChromeClient
            public final void onGeolocationPermissionsHidePrompt() {
                this.A00.onGeolocationPermissionsHidePrompt();
            }

            @Override // android.webkit.WebChromeClient
            public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                this.A00.onGeolocationPermissionsShowPrompt(str, callback);
            }

            @Override // android.webkit.WebChromeClient
            public final void onHideCustomView() {
                this.A00.onHideCustomView();
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                return this.A00.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                return this.A00.onJsBeforeUnload(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                return this.A00.onJsConfirm(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                return this.A00.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }

            @Override // android.webkit.WebChromeClient
            public final void onPermissionRequest(PermissionRequest permissionRequest) {
                this.A00.onPermissionRequest(permissionRequest);
            }

            @Override // android.webkit.WebChromeClient
            public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                this.A00.onPermissionRequestCanceled(permissionRequest);
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                String str;
                String str2;
                if ((webView instanceof C6t6) && i >= 20) {
                    C6t7 c6t7 = ((C6t6) webView).mSecureJsBridgeAuth;
                    if (c6t7.A02) {
                        C6t6 c6t6 = c6t7.A03;
                        if (c6t6.getSettings().getJavaScriptEnabled() && (str = c6t7.A00) != null && !c6t7.A01) {
                            HashMap<String, C7Jf> map = c6t7.A04;
                            boolean zContainsKey = map.containsKey(str);
                            String str3 = c6t7.A00;
                            if (zContainsKey) {
                                C7Jf c7Jf = map.get(str3);
                                str2 = c7Jf != null ? c7Jf.A01 : "";
                            } else {
                                C7Jf c7Jf2 = new C7Jf(str3);
                                str2 = c7Jf2.A01;
                                map.put(c6t7.A00, c7Jf2);
                            }
                            c6t6.loadUrlBypassLoadingControl(FGI.A0U("javascript:var __fbAndroidBridgeAuthToken = '", str2, "';window.dispatchEvent(new Event('__fbAndroidBridgeAuthTokenInjected'));"));
                            c6t7.A01 = true;
                        }
                    }
                }
                this.A00.onProgressChanged(webView, i);
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
                this.A00.onReceivedIcon(webView, bitmap);
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedTitle(WebView webView, String str) {
                this.A00.onReceivedTitle(webView, str);
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                this.A00.onReceivedTouchIconUrl(webView, str, z);
            }

            @Override // android.webkit.WebChromeClient
            public final void onRequestFocus(WebView webView) {
                this.A00.onRequestFocus(webView);
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                this.A00.onShowCustomView(view, customViewCallback);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return this.A00.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            {
                this.A00 = c6tF;
            }
        });
        return this;
    }

    public final C6t6 setWebViewClient(final C6tA c6tA) {
        C7mY c7mY;
        if (this.mClientWasSet && (c7mY = this.mReporter) != null) {
            c7mY.report("webview.SecureWebView", "WebViewClient has been set already", null);
        }
        this.mClientWasSet = true;
        super.setWebViewClient(new WebViewClient(c6tA) { // from class: X.6t9
            public boolean A00 = false;
            public final C6tA A01;

            private boolean A00(WebResourceRequest webResourceRequest, WebView webView, String str, boolean z) {
                boolean zDoAdditionalShouldOverrideUrlLoading;
                if (webView instanceof C6t6) {
                    C6t6 c6t6 = (C6t6) webView;
                    this.A00 = true;
                    C6oc c6oc = c6t6.mUriHandler;
                    boolean zA1Z = AnonymousClass006.A1Z(z ? c6oc.A00(c6t6.getContext(), str) : c6oc.A01(str), C79.A00);
                    Object obj = this.A01;
                    if (obj instanceof C6tB) {
                        C6tB c6tB = (C6tB) obj;
                        zDoAdditionalShouldOverrideUrlLoading = webResourceRequest == null ? c6tB.doAdditionalShouldOverrideUrlLoading(c6t6, str) : c6tB.doAdditionalShouldOverrideUrlLoading(c6t6, webResourceRequest);
                    } else {
                        zDoAdditionalShouldOverrideUrlLoading = false;
                    }
                    if (zA1Z || zDoAdditionalShouldOverrideUrlLoading) {
                        this.A00 = false;
                        if (zA1Z || zDoAdditionalShouldOverrideUrlLoading) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                this.A01.doUpdateVisitedHistory(webView, str, z);
            }

            @Override // android.webkit.WebViewClient
            public final void onFormResubmission(WebView webView, Message message, Message message2) {
                this.A01.onFormResubmission(webView, message, message2);
            }

            @Override // android.webkit.WebViewClient
            public final void onLoadResource(WebView webView, String str) {
                this.A01.onLoadResource(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageCommitVisible(WebView webView, String str) {
                this.A01.onPageCommitVisible(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                this.A01.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (webView instanceof C6t6) {
                    C6t6 c6t6 = (C6t6) webView;
                    C6t7 c6t7 = c6t6.mSecureJsBridgeAuth;
                    if (c6t7.A02 && c6t7.A03.getSettings().getJavaScriptEnabled()) {
                        c6t7.A01 = false;
                        c6t7.A00 = C7Jf.A00(str);
                    }
                    if (this.A00) {
                        this.A00 = false;
                    } else if (this.A01.mAdditionalLoadingControlChecksEnabled && c6t6.mUriHandler.A01(str) != C79.A00) {
                        c6t6.stopLoading();
                        return;
                    }
                    this.A01.onPageStarted(c6t6, str, bitmap);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
                this.A01.onReceivedClientCertRequest(webView, clientCertRequest);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                this.A01.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                this.A01.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                this.A01.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
                this.A01.onReceivedLoginRequest(webView, str, str2, str3);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                this.A01.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return this.A01.onRenderProcessGone(webView, renderProcessGoneDetail);
            }

            @Override // android.webkit.WebViewClient
            public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
                this.A01.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }

            @Override // android.webkit.WebViewClient
            public final void onScaleChanged(WebView webView, float f, float f2) {
                this.A01.onScaleChanged(webView, f, f2);
            }

            @Override // android.webkit.WebViewClient
            public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
                this.A01.onUnhandledKeyEvent(webView, keyEvent);
            }

            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return this.A01.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
                return this.A01.mWebViewClientFallback.shouldOverrideKeyEvent(webView, keyEvent);
            }

            {
                this.A01 = c6tA;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
            @Override // android.webkit.WebViewClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView r4, android.webkit.WebResourceRequest r5) {
                /*
                    r3 = this;
                    java.lang.String r2 = X.C60Q.A0d(r5)
                    X.6tA r0 = r3.A01
                    boolean r0 = r0.mIframeLauncherEnabled
                    if (r0 != 0) goto L11
                    boolean r1 = r5.isForMainFrame()
                    r0 = 0
                    if (r1 == 0) goto L12
                L11:
                    r0 = 1
                L12:
                    boolean r0 = r3.A00(r5, r4, r2, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6t9.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
            }

            @Override // android.webkit.WebViewClient
            @Deprecated
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                this.A01.onReceivedError(webView, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            @Deprecated
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return A00(null, webView, str, true);
            }
        });
        return this;
    }

    public final C6t6 setWebViewUriHandler(C6oc c6oc) {
        this.mUriHandler = c6oc;
        return this;
    }

    public C6t6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentLoadedUrl = "";
        this.mSecureJsBridgeAuth = new C6t7(this);
        C6oR.A00(this);
        this.mContext = context.getApplicationContext();
        initialize();
    }

    private void initialize() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        A00(settings);
        A01(settings);
        C75I c75i = new C75I();
        this.callbacks = C3cG.A0h();
        this.mReporter = c75i;
        this.mClientWasSet = false;
        this.mChromeClientWasSet = false;
    }

    private void navigateToWebview(String str, C6od c6od, Map<String, String> map, Collection<String> collection, ValueCallback<Boolean> valueCallback) {
        invokeUriCallbacks(str);
        setCookieStrings(str, c6od, collection, valueCallback);
        if (map == null) {
            map = new HashMap<>();
        }
        super.loadUrl(str, map);
    }

    public String getCookie(String str) {
        return CookieManager.getInstance().getCookie(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6t8] */
    public C6t8 getSecureSettings() {
        final WebSettings settings = getSettings();
        return new Object(settings) { // from class: X.6t8
            public final WebSettings A00;

            {
                this.A00 = settings;
            }
        };
    }

    public C6t6 setBlockNetworkImage(boolean z) {
        getSettings().setBlockNetworkImage(z);
        return this;
    }

    public C6t6 setBlockNetworkLoads(boolean z) {
        getSettings().setBlockNetworkLoads(z);
        return this;
    }

    public C6t6 setBuiltInZoomControls(boolean z) {
        getSettings().setBuiltInZoomControls(z);
        return this;
    }

    public C6t6 setCacheMode(int i) {
        getSettings().setCacheMode(i);
        return this;
    }

    public C6t6 setCursiveFontFamily(String str) {
        getSettings().setCursiveFontFamily(str);
        return this;
    }

    public C6t6 setDatabaseEnabled(boolean z) {
        getSettings().setDatabaseEnabled(z);
        return this;
    }

    @Deprecated
    public C6t6 setDatabasePathInsecure(String str) {
        getSettings().setDatabasePath(str);
        return this;
    }

    public C6t6 setDefaultFixedFontSize(int i) {
        getSettings().setDefaultFixedFontSize(i);
        return this;
    }

    public C6t6 setDefaultFontSize(int i) {
        getSettings().setDefaultFontSize(i);
        return this;
    }

    public C6t6 setDefaultTextEncodingName(String str) {
        getSettings().setDefaultTextEncodingName(str);
        return this;
    }

    public C6t6 setDisabledActionModeMenuItems(int i) {
        getSettings().setDisabledActionModeMenuItems(i);
        return this;
    }

    public C6t6 setDisplayZoomControls(boolean z) {
        getSettings().setDisplayZoomControls(z);
        return this;
    }

    public C6t6 setDomStorageEnabled(boolean z) {
        getSettings().setDomStorageEnabled(z);
        return this;
    }

    public C6t6 setFantasyFontFamily(String str) {
        getSettings().setFantasyFontFamily(str);
        return this;
    }

    public C6t6 setFixedFontFamily(String str) {
        getSettings().setFixedFontFamily(str);
        return this;
    }

    public C6t6 setGeolocationEnabled(boolean z) {
        getSettings().setGeolocationEnabled(z);
        return this;
    }

    public C6t6 setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        return this;
    }

    public C6t6 setJavaScriptEnabled(boolean z) {
        getSettings().setJavaScriptEnabled(z);
        return this;
    }

    public C6t6 setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        getSettings().setLayoutAlgorithm(layoutAlgorithm);
        return this;
    }

    public C6t6 setLoadWithOverviewMode(boolean z) {
        getSettings().setLoadWithOverviewMode(z);
        return this;
    }

    public C6t6 setLoadsImagesAutomatically(boolean z) {
        getSettings().setLoadsImagesAutomatically(z);
        return this;
    }

    public C6t6 setMediaPlaybackRequiresUserGesture(boolean z) {
        getSettings().setMediaPlaybackRequiresUserGesture(z);
        return this;
    }

    public C6t6 setMinimumFontSize(int i) {
        getSettings().setMinimumFontSize(i);
        return this;
    }

    public C6t6 setMinimumLogicalFontSize(int i) {
        getSettings().setMinimumLogicalFontSize(i);
        return this;
    }

    public C6t6 setMixedContentModeInsecure(int i) {
        getSettings().setMixedContentMode(i);
        return this;
    }

    public C6t6 setNeedInitialFocus(boolean z) {
        getSettings().setNeedInitialFocus(z);
        return this;
    }

    public C6t6 setOffscreenPreRaster(boolean z) {
        getSettings().setOffscreenPreRaster(z);
        return this;
    }

    public C6t6 setSafeBrowsingEnabled(boolean z) {
        getSettings().setSafeBrowsingEnabled(z);
        return this;
    }

    public C6t6 setSansSerifFontFamily(String str) {
        getSettings().setSansSerifFontFamily(str);
        return this;
    }

    @Deprecated
    public C6t6 setSaveFormDataDeprecated(boolean z) {
        getSettings().setSaveFormData(z);
        return this;
    }

    @Deprecated
    public C6t6 setSavePasswordDeprecated(boolean z) {
        getSettings().setSavePassword(z);
        return this;
    }

    public C6t6 setSerifFontFamily(String str) {
        getSettings().setSerifFontFamily(str);
        return this;
    }

    public C6t6 setStandardFontFamily(String str) {
        getSettings().setStandardFontFamily(str);
        return this;
    }

    public C6t6 setSupportMultipleWindows(boolean z) {
        getSettings().setSupportMultipleWindows(z);
        return this;
    }

    public C6t6 setSupportZoom(boolean z) {
        getSettings().setSupportZoom(z);
        return this;
    }

    public C6t6 setTextZoom(int i) {
        getSettings().setTextZoom(i);
        return this;
    }

    public C6t6 setUseWideViewPort(boolean z) {
        getSettings().setUseWideViewPort(z);
        return this;
    }

    public C6t6 setUserAgentString(String str) {
        getSettings().setUserAgentString(str);
        return this;
    }

    public void loadUrlBypassLoadingControl(String str) {
        super.loadUrl(str);
    }

    public C6t6(Context context) {
        super(context);
        this.mCurrentLoadedUrl = "";
        this.mSecureJsBridgeAuth = new C6t7(this);
        C6oR.A00(this);
        this.mContext = context.getApplicationContext();
        initialize();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        Map<String, String> map2 = map;
        C6od c6od = C6tp.A00;
        if (map == null) {
            map2 = new HashMap<>();
        }
        loadUrlWithCookies(str, c6od, map2, null, null);
    }

    public final void loadUrlWithCookiesForRandomInsecure(String str, Collection<String> collection) {
        loadUrlWithCookies(str, C6tp.A00, null, collection, null);
    }

    public C6t6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurrentLoadedUrl = "";
        this.mSecureJsBridgeAuth = new C6t7(this);
        C6oR.A00(this);
        this.mContext = context.getApplicationContext();
        initialize();
    }

    public final void loadUrlWithCookiesForRandomInsecure(String str, Map<String, String> map, Collection<String> collection) {
        loadUrlWithCookies(str, C6tp.A00, map, collection, null);
    }

    public C6t6(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mCurrentLoadedUrl = "";
        this.mSecureJsBridgeAuth = new C6t7(this);
        C6oR.A00(this);
        this.mContext = context.getApplicationContext();
        initialize();
    }

    @Deprecated
    public C6t6(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        this.mCurrentLoadedUrl = "";
        this.mSecureJsBridgeAuth = new C6t7(this);
        C6oR.A00(this);
        this.mContext = context.getApplicationContext();
        initialize();
    }
}
