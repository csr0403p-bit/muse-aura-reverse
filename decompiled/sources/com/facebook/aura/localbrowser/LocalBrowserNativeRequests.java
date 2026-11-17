package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.G2j;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LocalBrowserNativeRequests extends WebChromeClient {
    public static final int $stable = 8;
    public LocalBrowserDialogs dialogs;
    public final Function0<Boolean> isFileStageActive;
    public final G0U<WebView, Unit> onCloseWindow;
    public final G2j<WebView, Boolean, Boolean, Message, Boolean> onCreateWindow;
    public final G0W<WebView, ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Boolean> onFileChooser;
    public final Function0<Unit> onUnsupported;

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        this.onCloseWindow.invoke(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C7384Etj.A0Y(callback, 1);
        callback.invoke(str, false, false);
        this.onUnsupported.invoke();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C7384Etj.A0Y(jsResult, 3);
        return offer(LocalBrowserDialogKind.ALERT, str, str2, jsResult, null);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        C7384Etj.A0Y(jsResult, 3);
        return offer(LocalBrowserDialogKind.BEFORE_UNLOAD, str, str2, jsResult, null);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C7384Etj.A0Y(jsResult, 3);
        return offer(LocalBrowserDialogKind.CONFIRM, str, str2, jsResult, null);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C7384Etj.A0Y(jsPromptResult, 4);
        return offer(LocalBrowserDialogKind.PROMPT, str, str2, jsPromptResult, str3);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C7384Etj.A0Y(permissionRequest, 0);
        permissionRequest.deny();
        this.onUnsupported.invoke();
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C7384Etj.A0Y(customViewCallback, 1);
        customViewCallback.onCustomViewHidden();
        this.onUnsupported.invoke();
    }

    public /* synthetic */ LocalBrowserNativeRequests(G2j g2j, G0U g0u, Function0 function0, Function0 function02, G0W g0w, int i, C06H c06h) {
        this(g2j, g0u, function0, (i & 8) != 0 ? new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserNativeRequests$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        } : function02, (i & 16) != 0 ? new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserNativeRequests$$ExternalSyntheticLambda1
            @Override // X.G0W
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnonymousClass001.A0h();
            }
        } : g0w);
    }

    public static final boolean _init_$lambda$0() {
        return false;
    }

    private final boolean offer(LocalBrowserDialogKind localBrowserDialogKind, String str, String str2, JsResult jsResult, String str3) {
        LocalBrowserDialogs localBrowserDialogs = this.dialogs;
        if (localBrowserDialogs != null && localBrowserDialogs.offer(localBrowserDialogKind, str, str2, jsResult, str3)) {
            return true;
        }
        jsResult.cancel();
        this.onUnsupported.invoke();
        return true;
    }

    public static /* synthetic */ boolean offer$default(LocalBrowserNativeRequests localBrowserNativeRequests, LocalBrowserDialogKind localBrowserDialogKind, String str, String str2, JsResult jsResult, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return localBrowserNativeRequests.offer(localBrowserDialogKind, str, str2, jsResult, str3);
    }

    public final void close() {
        LocalBrowserDialogs localBrowserDialogs = this.dialogs;
        if (localBrowserDialogs != null) {
            localBrowserDialogs.close();
        }
        this.dialogs = null;
    }

    public final LocalBrowserDialogs getDialogs() {
        return this.dialogs;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass003.A0w(webView, message);
        boolean zA1X = AnonymousClass001.A1X(this.onCreateWindow.invoke(webView, Boolean.valueOf(z), Boolean.valueOf(z2), message));
        if (!zA1X) {
            this.onUnsupported.invoke();
        }
        return zA1X;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean zA1Z = AnonymousClass005.A1Z(webView, valueCallback, fileChooserParams);
        if (AnonymousClass003.A1Y(this.isFileStageActive) || !AnonymousClass001.A1X(this.onFileChooser.invoke(webView, valueCallback, fileChooserParams))) {
            valueCallback.onReceiveValue(null);
            if (!AnonymousClass003.A1Y(this.isFileStageActive)) {
                this.onUnsupported.invoke();
                return zA1Z;
            }
        }
        return zA1Z;
    }

    public final void setDialogs(LocalBrowserDialogs localBrowserDialogs) {
        this.dialogs = localBrowserDialogs;
    }

    public static final boolean _init_$lambda$1(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalBrowserNativeRequests(G2j<? super WebView, ? super Boolean, ? super Boolean, ? super Message, Boolean> g2j, G0U<? super WebView, Unit> g0u, Function0<Unit> function0, Function0<Boolean> function02, G0W<? super WebView, ? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Boolean> g0w) {
        AnonymousClass005.A17(g2j, g0u, function0, function02, g0w);
        this.onCreateWindow = g2j;
        this.onCloseWindow = g0u;
        this.onUnsupported = function0;
        this.isFileStageActive = function02;
        this.onFileChooser = g0w;
    }
}
