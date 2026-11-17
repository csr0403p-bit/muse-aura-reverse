package X;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Base64;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6tA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6tA {
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;
    public boolean mAdditionalLoadingControlChecksEnabled;
    public boolean mIframeLauncherEnabled;
    public ArrayList<SslCertificate> knownCertificates = C3cG.A0h();
    public final WebViewClient mWebViewClientFallback = new WebViewClient();

    private void initialize() {
        this.mAdditionalLoadingControlChecksEnabled = false;
        this.mIframeLauncherEnabled = false;
    }

    public void addKnownCertificate(String str) {
        try {
            this.knownCertificates.add(new SslCertificate((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0)))));
        } catch (CertificateException e) {
            throw new RuntimeException(e);
        }
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.mWebViewClientFallback.doUpdateVisitedHistory(webView, str, z);
    }

    public boolean getAdditionalLoadingControlChecksEnabled() {
        return this.mAdditionalLoadingControlChecksEnabled;
    }

    public boolean getIframeLancherEnabled() {
        return this.mIframeLauncherEnabled;
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.mWebViewClientFallback.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.mWebViewClientFallback.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        this.mWebViewClientFallback.onPageCommitVisible(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.mWebViewClientFallback.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.mWebViewClientFallback.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.mWebViewClientFallback.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.mWebViewClientFallback.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.mWebViewClientFallback.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.mWebViewClientFallback.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.mWebViewClientFallback.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.mWebViewClientFallback.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.mWebViewClientFallback.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.mWebViewClientFallback.onScaleChanged(webView, f, f2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.mWebViewClientFallback.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void setAdditionalLoadingControlChecksEnabled(boolean z) {
        this.mAdditionalLoadingControlChecksEnabled = z;
    }

    public void setIframeLauncherEnabled(boolean z) {
        this.mIframeLauncherEnabled = z;
    }

    public void setKnownCertificates(ArrayList<SslCertificate> arrayList) {
        this.knownCertificates = arrayList;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.mWebViewClientFallback.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.mWebViewClientFallback.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.mWebViewClientFallback.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public C6tA() {
        initialize();
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SslCertificate certificate = sslError.getCertificate();
        if (AnonymousClass002.A1L(C9X.A04() ? 1 : 0) && certificate != null) {
            Iterator<SslCertificate> it = this.knownCertificates.iterator();
            while (it.hasNext()) {
                if (certificate.toString().equals(it.next().toString())) {
                    sslErrorHandler.proceed();
                    return;
                }
            }
        }
        this.mWebViewClientFallback.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public void addKnownCertificate(SslCertificate sslCertificate) {
        this.knownCertificates.add(sslCertificate);
    }

    @Deprecated
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.mWebViewClientFallback.onReceivedError(webView, i, str, str2);
    }
}
