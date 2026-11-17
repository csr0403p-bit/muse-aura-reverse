package com.facebook.aura.email.view;

import X.AbstractC0878AGe;
import X.AbstractC3422CMk;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C60O;
import X.C60Q;
import X.C60S;
import X.C7384Etj;
import X.C7mU;
import X.G0U;
import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.tigon.iface.TigonRequest;
import java.io.ByteArrayInputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class EmailBodyWebView extends WebView {
    public String document;
    public boolean heightLimited;
    public int lastHeight;
    public float lastTouchY;
    public Function0<Unit> onFailure;
    public G0U<? super Integer, Unit> onHeight;
    public final Runnable publishHeight;
    public boolean released;
    public boolean rendererGone;
    public boolean resourceFailureLogged;

    /* renamed from: com.facebook.aura.email.view.EmailBodyWebView$release$2, reason: invalid class name and case insensitive filesystem */
    public final class C117562 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C117562 INSTANCE = new C117562();

        public C117562() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailBodyWebView(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.onHeight = EmailBodyWebView$onHeight$1.INSTANCE;
        this.onFailure = EmailBodyWebView$onFailure$1.INSTANCE;
        this.publishHeight = new Runnable() { // from class: com.facebook.aura.email.view.EmailBodyWebView$publishHeight$1
            @Override // java.lang.Runnable
            public final void run() {
                EmailBodyWebView emailBodyWebView = this.this$0;
                if (emailBodyWebView.released) {
                    return;
                }
                emailBodyWebView.onHeight.invoke(Integer.valueOf(emailBodyWebView.lastHeight));
            }
        };
        getSettings().setJavaScriptEnabled(false);
        C60S.A04(this);
        getSettings().setDomStorageEnabled(false);
        getSettings().setDatabaseEnabled(false);
        getSettings().setMixedContentMode(1);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        getSettings().setSupportMultipleWindows(false);
        getSettings().setSupportZoom(false);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSaveFormData(false);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setDownloadListener(new DownloadListener() { // from class: com.facebook.aura.email.view.EmailBodyWebView.1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            }
        });
        setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.email.view.EmailBodyWebView.2
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                AnonymousClass002.A1A(webResourceRequest, 1, webResourceError);
                EmailBodyWebView emailBodyWebView = EmailBodyWebView.this;
                if (emailBodyWebView.resourceFailureLogged) {
                    return;
                }
                emailBodyWebView.resourceFailureLogged = true;
                AbstractC3422CMk.A06("EmailHtmlBody", "Resource failed: mainFrame=%s code=%d", Boolean.valueOf(webResourceRequest.isForMainFrame()), Integer.valueOf(webResourceError.getErrorCode()));
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                AnonymousClass002.A1A(webResourceRequest, 1, webResourceResponse);
                EmailBodyWebView emailBodyWebView = EmailBodyWebView.this;
                if (emailBodyWebView.resourceFailureLogged) {
                    return;
                }
                emailBodyWebView.resourceFailureLogged = true;
                AbstractC3422CMk.A06("EmailHtmlBody", "HTTP resource failed: mainFrame=%s status=%d", Boolean.valueOf(webResourceRequest.isForMainFrame()), Integer.valueOf(webResourceResponse.getStatusCode()));
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                C7384Etj.A0Y(renderProcessGoneDetail, 1);
                EmailBodyWebView emailBodyWebView = EmailBodyWebView.this;
                emailBodyWebView.rendererGone = true;
                emailBodyWebView.removeCallbacks(emailBodyWebView.publishHeight);
                AbstractC3422CMk.A06("EmailHtmlBody", "Renderer exited: crashed=%s height=%d lastHeight=%d; showing message text", Boolean.valueOf(renderProcessGoneDetail.didCrash()), Integer.valueOf(EmailBodyWebView.this.getHeight()), Integer.valueOf(EmailBodyWebView.this.lastHeight));
                EmailBodyWebView.this.onFailure.invoke();
                return true;
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                String host;
                C7384Etj.A0Y(webResourceRequest, 1);
                Uri url = webResourceRequest.getUrl();
                if (!webResourceRequest.isForMainFrame() && C60Q.A1R(url) && (host = url.getHost()) != null && C60Q.A0j(host).endsWith(HatchWidgetWebViewKt.META_CDN_HOST_SUFFIX) && C60Q.A1W(BFI.A0H(new Integer[]{-1, 443}), url.getPort()) && TigonRequest.GET.equals(webResourceRequest.getMethod())) {
                    return null;
                }
                return new WebResourceResponse("text/plain", HatchWebPageParserKt.UTF_8, new ByteArrayInputStream(new byte[0]));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                C7384Etj.A0Y(webResourceRequest, 1);
                if (webResourceRequest.isForMainFrame() && webResourceRequest.hasGesture() && TigonRequest.GET.equals(webResourceRequest.getMethod())) {
                    EmailBodyWebView.this.openLink(C60Q.A0A(webResourceRequest));
                }
                return true;
            }
        });
    }

    public final void bind(String str, float f, int i) {
        C7384Etj.A0Y(str, 0);
        if (this.released || this.rendererGone) {
            return;
        }
        setBackgroundColor(i);
        getSettings().setTextZoom((int) (f * 100.0f));
        if (str.equals(this.document)) {
            return;
        }
        this.document = str;
        this.lastHeight = 0;
        this.heightLimited = false;
        this.resourceFailureLogged = false;
        removeCallbacks(this.publishHeight);
        loadDataWithBaseURL(null, str, "text/html", HatchWebPageParserKt.UTF_8, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        C7384Etj.A0Y(canvas, 0);
        if (this.released || this.rendererGone) {
            return;
        }
        super.onDraw(canvas);
        int iCeil = (int) Math.ceil(getContentHeight() * getScale());
        if (iCeil >= 1) {
            if (iCeil > 8192) {
                i = 8192;
                if (!this.heightLimited) {
                    this.heightLimited = true;
                    AbstractC3422CMk.A06("EmailHtmlBody", "HTML height bounded: measured=%d viewport=%d scale=%s", Integer.valueOf(iCeil), Integer.valueOf(getHeight()), Float.valueOf(getScale()));
                }
            }
            i2 = this.lastHeight;
            if (i2 != 0 || Math.abs(i - i2) > ((int) Math.ceil(getScale()))) {
                this.lastHeight = i;
                removeCallbacks(this.publishHeight);
                post(this.publishHeight);
            }
            return;
        }
        iCeil = 1;
        i = iCeil;
        i2 = this.lastHeight;
        if (i2 != 0) {
        }
        this.lastHeight = i;
        removeCallbacks(this.publishHeight);
        post(this.publishHeight);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r5 = 0
            X.C7384Etj.A0Y(r7, r5)
            boolean r0 = r6.released
            r4 = 0
            if (r0 != 0) goto L68
            boolean r0 = r6.rendererGone
            if (r0 != 0) goto L68
            int r1 = r7.getActionMasked()
            r3 = -1
            r2 = 1
            if (r1 == 0) goto L4b
            if (r1 == r2) goto L41
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 3
            if (r1 == r0) goto L41
        L1d:
            boolean r0 = super.onTouchEvent(r7)
            return r0
        L22:
            float r1 = r7.getY()
            float r0 = r6.lastTouchY
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r3 = 1
        L2d:
            android.view.ViewParent r1 = r6.getParent()
            if (r1 == 0) goto L3a
            boolean r0 = r6.canScrollVertically(r3)
            r1.requestDisallowInterceptTouchEvent(r0)
        L3a:
            float r0 = r7.getY()
            r6.lastTouchY = r0
            goto L1d
        L41:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L1d
            r0.requestDisallowInterceptTouchEvent(r5)
            goto L1d
        L4b:
            float r0 = r7.getY()
            r6.lastTouchY = r0
            android.view.ViewParent r1 = r6.getParent()
            if (r1 == 0) goto L1d
            boolean r0 = r6.canScrollVertically(r3)
            if (r0 != 0) goto L63
            boolean r0 = r6.canScrollVertically(r2)
            if (r0 == 0) goto L64
        L63:
            r4 = 1
        L64:
            r1.requestDisallowInterceptTouchEvent(r4)
            goto L1d
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailBodyWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnFailure(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onFailure = function0;
    }

    public final void setOnHeight(G0U<? super Integer, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onHeight = g0u;
    }

    /* renamed from: com.facebook.aura.email.view.EmailBodyWebView$release$1, reason: invalid class name and case insensitive filesystem */
    public final class C117551 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public static final C117551 INSTANCE = new C117551();

        public C117551() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            AnonymousClass005.A0w(num);
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openLink(Uri uri) {
        Set setA1A = C60O.A1A("https", AuraDeeplinkHandlerActivity.HTTP, "mailto");
        String scheme = uri.getScheme();
        if (AbstractC0878AGe.A0k(setA1A, scheme != null ? C60Q.A0j(scheme) : null)) {
            try {
                C7mU.A00().A04().A05(getContext(), C60Q.A09(uri).addCategory("android.intent.category.BROWSABLE"));
            } catch (RuntimeException unused) {
            }
        }
    }

    public final Function0<Unit> getOnFailure() {
        return this.onFailure;
    }

    public final G0U<Integer, Unit> getOnHeight() {
        return this.onHeight;
    }

    public final void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        removeCallbacks(this.publishHeight);
        this.onHeight = C117551.INSTANCE;
        this.onFailure = C117562.INSTANCE;
        if (!this.rendererGone) {
            stopLoading();
        }
        destroy();
    }
}
