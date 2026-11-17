package com.facebook.aura.webview;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import android.os.SystemClock;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class WebViewTopColorSampler implements ViewTreeObserver.OnPreDrawListener {
    public static final Companion Companion = new Companion();
    public static final long[] FOLLOW_UP_DELAYS = {500, 1000, 2000, 4000};
    public final int backgroundColor;
    public final Runnable capture;
    public boolean capturePosted;
    public boolean closed;
    public int followUpIndex;
    public int height;
    public final Function0<Boolean> isLoaded;
    public Integer lastColor;
    public boolean loaded;
    public long nextCaptureAt;
    public ViewTreeObserver observer;
    public final G0U<Integer, Unit> onColor;
    public String url;
    public final WebView view;
    public final Runnable wake;
    public int width;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewTopColorSampler(WebView webView, int i, Function0<Boolean> function0, G0U<? super Integer, Unit> g0u) {
        AnonymousClass005.A11(webView, function0, g0u, 0);
        this.view = webView;
        this.backgroundColor = i;
        this.isLoaded = function0;
        this.onColor = g0u;
        this.wake = new Runnable() { // from class: com.facebook.aura.webview.WebViewTopColorSampler$wake$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.view.invalidate();
            }
        };
        this.capture = new Runnable() { // from class: com.facebook.aura.webview.WebViewTopColorSampler$capture$1
            @Override // java.lang.Runnable
            public final void run() {
                WebViewTopColorSampler webViewTopColorSampler = this.this$0;
                webViewTopColorSampler.capturePosted = false;
                if (webViewTopColorSampler.canCapture()) {
                    WebViewTopColorSampler webViewTopColorSampler2 = this.this$0;
                    Integer numCaptureTopColor = WebViewTopColorKt.captureTopColor(webViewTopColorSampler2.view, webViewTopColorSampler2.backgroundColor);
                    if (numCaptureTopColor != null) {
                        int iIntValue = numCaptureTopColor.intValue();
                        WebViewTopColorSampler webViewTopColorSampler3 = this.this$0;
                        Integer num = webViewTopColorSampler3.lastColor;
                        if (num == null || iIntValue != num.intValue()) {
                            webViewTopColorSampler3.lastColor = numCaptureTopColor;
                            webViewTopColorSampler3.onColor.invoke(numCaptureTopColor);
                        }
                        long[] jArr = WebViewTopColorSampler.FOLLOW_UP_DELAYS;
                        WebViewTopColorSampler webViewTopColorSampler4 = this.this$0;
                        int i2 = webViewTopColorSampler4.followUpIndex;
                        webViewTopColorSampler4.followUpIndex = i2 + 1;
                        C7384Etj.A0Y(jArr, 0);
                        Long lValueOf = (i2 < 0 || i2 >= jArr.length) ? null : Long.valueOf(jArr[i2]);
                        WebViewTopColorSampler webViewTopColorSampler5 = this.this$0;
                        webViewTopColorSampler5.nextCaptureAt = lValueOf != null ? SystemClock.uptimeMillis() + lValueOf.longValue() : LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                        if (lValueOf != null) {
                            webViewTopColorSampler5.view.postDelayed(webViewTopColorSampler5.wake, lValueOf.longValue());
                        }
                    }
                }
            }
        };
    }

    public final void close() {
        this.closed = true;
        this.view.removeCallbacks(this.capture);
        this.view.removeCallbacks(this.wake);
        ViewTreeObserver viewTreeObserver = this.observer;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        ViewTreeObserver viewTreeObserver2 = this.view.getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && viewTreeObserver2 != this.observer) {
            viewTreeObserver2.removeOnPreDrawListener(this);
        }
        this.observer = null;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canCapture() {
        if (!this.closed && this.loaded && AnonymousClass003.A1Y(this.isLoaded) && this.view.getProgress() == 100 && C7384Etj.areEqual(this.view.getUrl(), this.url) && this.view.getWidth() == this.width) {
            int height = this.view.getHeight();
            int i = this.height;
            if (height == i && this.width > 0 && i > 0 && this.view.isAttachedToWindow() && this.view.isShown() && this.view.hasWindowFocus() && this.view.getAlpha() == 1.0f && this.view.getScrollY() == 0 && this.view.getScrollX() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreDraw() {
        /*
            r6 = this;
            boolean r0 = r6.closed
            r5 = 1
            if (r0 != 0) goto L90
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r6.isLoaded
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            r3 = 0
            if (r0 == 0) goto L19
            android.webkit.WebView r0 = r6.view
            int r1 = r0.getProgress()
            r0 = 100
            r2 = 1
            if (r1 == r0) goto L1a
        L19:
            r2 = 0
        L1a:
            int r1 = r6.width
            android.webkit.WebView r0 = r6.view
            int r0 = r0.getWidth()
            if (r1 != r0) goto L40
            int r1 = r6.height
            android.webkit.WebView r0 = r6.view
            int r0 = r0.getHeight()
            if (r1 != r0) goto L40
            java.lang.String r1 = r6.url
            android.webkit.WebView r0 = r6.view
            java.lang.String r0 = r0.getUrl()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L40
            boolean r0 = r6.loaded
            if (r0 == r2) goto L73
        L40:
            android.webkit.WebView r0 = r6.view
            int r0 = r0.getWidth()
            r6.width = r0
            android.webkit.WebView r0 = r6.view
            int r0 = r0.getHeight()
            r6.height = r0
            android.webkit.WebView r0 = r6.view
            java.lang.String r0 = r0.getUrl()
            r6.url = r0
            r6.loaded = r2
            r6.followUpIndex = r3
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 150(0x96, double:7.4E-322)
            long r0 = r0 + r2
            r6.nextCaptureAt = r0
            android.webkit.WebView r1 = r6.view
            java.lang.Runnable r0 = r6.wake
            r1.removeCallbacks(r0)
            android.webkit.WebView r1 = r6.view
            java.lang.Runnable r0 = r6.wake
            r1.postDelayed(r0, r2)
        L73:
            boolean r0 = r6.capturePosted
            if (r0 != 0) goto L90
            boolean r0 = r6.canCapture()
            if (r0 == 0) goto L90
            long r3 = android.os.SystemClock.uptimeMillis()
            long r1 = r6.nextCaptureAt
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L90
            r6.capturePosted = r5
            android.webkit.WebView r1 = r6.view
            java.lang.Runnable r0 = r6.capture
            r1.post(r0)
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.WebViewTopColorSampler.onPreDraw():boolean");
    }

    public final void start() {
        ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(this);
        this.observer = viewTreeObserver;
        this.view.invalidate();
    }
}
