package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.6tF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6tF {
    public final WebChromeClient webChromeClientFallback = new WebChromeClient();

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        C7384Etj.A0Y(valueCallback, 0);
        this.webChromeClientFallback.getVisitedHistory(valueCallback);
    }

    public void onCloseWindow(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        this.webChromeClientFallback.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C7384Etj.A0Y(consoleMessage, 0);
        return this.webChromeClientFallback.onConsoleMessage(consoleMessage);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C7384Etj.A0Y(permissionRequest, 0);
        this.webChromeClientFallback.onPermissionRequest(permissionRequest);
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        C7384Etj.A0Y(permissionRequest, 0);
        this.webChromeClientFallback.onPermissionRequestCanceled(permissionRequest);
    }

    public void onProgressChanged(WebView webView, int i) {
        C7384Etj.A0Y(webView, 0);
        this.webChromeClientFallback.onProgressChanged(webView, i);
    }

    public void onRequestFocus(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        this.webChromeClientFallback.onRequestFocus(webView);
    }

    public Bitmap getDefaultVideoPoster() {
        return this.webChromeClientFallback.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        return this.webChromeClientFallback.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.webChromeClientFallback.onGeolocationPermissionsHidePrompt();
    }

    public void onHideCustomView() {
        this.webChromeClientFallback.onHideCustomView();
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass003.A0w(webView, message);
        return this.webChromeClientFallback.onCreateWindow(webView, z, z2, message);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        AnonymousClass003.A0u(str, callback);
        this.webChromeClientFallback.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AnonymousClass005.A14(webView, str, str2, jsResult);
        return this.webChromeClientFallback.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AnonymousClass005.A14(webView, str, str2, jsResult);
        return this.webChromeClientFallback.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AnonymousClass005.A14(webView, str, str2, jsResult);
        return this.webChromeClientFallback.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AnonymousClass005.A17(webView, str, str2, str3, jsPromptResult);
        return this.webChromeClientFallback.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        AnonymousClass003.A0u(webView, bitmap);
        this.webChromeClientFallback.onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        AnonymousClass003.A0u(webView, str);
        this.webChromeClientFallback.onReceivedTitle(webView, str);
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AnonymousClass003.A0u(webView, str);
        this.webChromeClientFallback.onReceivedTouchIconUrl(webView, str, z);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AnonymousClass003.A0u(view, customViewCallback);
        this.webChromeClientFallback.onShowCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AnonymousClass005.A0x(webView, valueCallback, fileChooserParams);
        return this.webChromeClientFallback.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}
