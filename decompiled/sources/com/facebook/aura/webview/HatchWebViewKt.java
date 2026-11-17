package com.facebook.aura.webview;

import X.AFs;
import X.AbstractC0871AFr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C05253Tt;
import X.C0953AJg;
import X.C0Ig;
import X.C2297BSx;
import X.C3bQ;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.CFK;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HsJ;
import X.InterfaceC0962AJp;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.webview.WebContent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class HatchWebViewKt {
    public static final int MAX_RECORDED_WEBVIEW_ERRORS = 20;
    public static final int NAVIGATION_EVENT_BUFFER = 16;
    public static final String WEBVIEW_TAG = "HatchWebView";
    public static final AFs<WebViewState, Object> WebStateSaver;

    /* renamed from: com.facebook.aura.webview.HatchWebViewKt$WebView$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyFrameLayoutWorkaround;
        public final /* synthetic */ boolean $captureBackPresses;
        public final /* synthetic */ AccompanistWebChromeClient $chromeClient;
        public final /* synthetic */ AccompanistWebViewClient $client;
        public final /* synthetic */ boolean $destroyOnRelease;
        public final /* synthetic */ G0U<Context, WebView> $factory;
        public final /* synthetic */ boolean $javaScriptEnabled;
        public final /* synthetic */ FrameLayout.LayoutParams $layoutParams;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WebViewNavigator $navigator;
        public final /* synthetic */ G0U<WebView, Unit> $onCreated;
        public final /* synthetic */ G0U<WebView, Unit> $onDispose;
        public final /* synthetic */ WebViewState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(WebViewState webViewState, FrameLayout.LayoutParams layoutParams, BRg bRg, boolean z, boolean z2, boolean z3, WebViewNavigator webViewNavigator, G0U<? super WebView, Unit> g0u, G0U<? super WebView, Unit> g0u2, boolean z4, AccompanistWebViewClient accompanistWebViewClient, AccompanistWebChromeClient accompanistWebChromeClient, G0U<? super Context, ? extends WebView> g0u3, int i, int i2, int i3) {
            super(2);
            this.$state = webViewState;
            this.$layoutParams = layoutParams;
            this.$modifier = bRg;
            this.$captureBackPresses = z;
            this.$javaScriptEnabled = z2;
            this.$applyFrameLayoutWorkaround = z3;
            this.$navigator = webViewNavigator;
            this.$onCreated = g0u;
            this.$onDispose = g0u2;
            this.$destroyOnRelease = z4;
            this.$client = accompanistWebViewClient;
            this.$chromeClient = accompanistWebChromeClient;
            this.$factory = g0u3;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWebViewKt.WebView(this.$state, this.$layoutParams, this.$modifier, this.$captureBackPresses, this.$javaScriptEnabled, this.$applyFrameLayoutWorkaround, this.$navigator, this.$onCreated, this.$onDispose, this.$destroyOnRelease, this.$client, this.$chromeClient, this.$factory, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.webview.HatchWebViewKt$WebView$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $applyFrameLayoutWorkaround;
        public final /* synthetic */ boolean $captureBackPresses;
        public final /* synthetic */ AccompanistWebChromeClient $chromeClient;
        public final /* synthetic */ AccompanistWebViewClient $client;
        public final /* synthetic */ boolean $destroyOnRelease;
        public final /* synthetic */ G0U<Context, WebView> $factory;
        public final /* synthetic */ boolean $javaScriptEnabled;
        public final /* synthetic */ WebViewNavigator $navigator;
        public final /* synthetic */ G0U<WebView, Unit> $onCreated;
        public final /* synthetic */ G0U<WebView, Unit> $onDispose;
        public final /* synthetic */ WebViewState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(WebViewState webViewState, boolean z, boolean z2, boolean z3, WebViewNavigator webViewNavigator, G0U<? super WebView, Unit> g0u, G0U<? super WebView, Unit> g0u2, boolean z4, AccompanistWebViewClient accompanistWebViewClient, AccompanistWebChromeClient accompanistWebChromeClient, G0U<? super Context, ? extends WebView> g0u3) {
            super(3);
            this.$state = webViewState;
            this.$captureBackPresses = z;
            this.$javaScriptEnabled = z2;
            this.$applyFrameLayoutWorkaround = z3;
            this.$navigator = webViewNavigator;
            this.$onCreated = g0u;
            this.$onDispose = g0u2;
            this.$destroyOnRelease = z4;
            this.$client = accompanistWebViewClient;
            this.$chromeClient = accompanistWebChromeClient;
            this.$factory = g0u3;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
            } else {
                long j = ((C05253Tt) c0Ig).A00;
                HatchWebViewKt.WebView(this.$state, new FrameLayout.LayoutParams(Constraints.A0C(j) ? -1 : -2, Constraints.A0B(j) ? -1 : -2), BRg.A00, this.$captureBackPresses, this.$javaScriptEnabled, this.$applyFrameLayoutWorkaround, this.$navigator, this.$onCreated, this.$onDispose, this.$destroyOnRelease, this.$client, this.$chromeClient, this.$factory, bfm, 384, 0, 0);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.webview.HatchWebViewKt$WebView$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyFrameLayoutWorkaround;
        public final /* synthetic */ boolean $captureBackPresses;
        public final /* synthetic */ AccompanistWebChromeClient $chromeClient;
        public final /* synthetic */ AccompanistWebViewClient $client;
        public final /* synthetic */ boolean $destroyOnRelease;
        public final /* synthetic */ G0U<Context, WebView> $factory;
        public final /* synthetic */ boolean $javaScriptEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WebViewNavigator $navigator;
        public final /* synthetic */ G0U<WebView, Unit> $onCreated;
        public final /* synthetic */ G0U<WebView, Unit> $onDispose;
        public final /* synthetic */ WebViewState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(WebViewState webViewState, BRg bRg, boolean z, boolean z2, boolean z3, WebViewNavigator webViewNavigator, G0U<? super WebView, Unit> g0u, G0U<? super WebView, Unit> g0u2, boolean z4, AccompanistWebViewClient accompanistWebViewClient, AccompanistWebChromeClient accompanistWebChromeClient, G0U<? super Context, ? extends WebView> g0u3, int i, int i2, int i3) {
            super(2);
            this.$state = webViewState;
            this.$modifier = bRg;
            this.$captureBackPresses = z;
            this.$javaScriptEnabled = z2;
            this.$applyFrameLayoutWorkaround = z3;
            this.$navigator = webViewNavigator;
            this.$onCreated = g0u;
            this.$onDispose = g0u2;
            this.$destroyOnRelease = z4;
            this.$client = accompanistWebViewClient;
            this.$chromeClient = accompanistWebChromeClient;
            this.$factory = g0u3;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWebViewKt.WebView(this.$state, this.$modifier, this.$captureBackPresses, this.$javaScriptEnabled, this.$applyFrameLayoutWorkaround, this.$navigator, this.$onCreated, this.$onDispose, this.$destroyOnRelease, this.$client, this.$chromeClient, this.$factory, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    static {
        HatchWebViewKt$WebStateSaver$1$1 hatchWebViewKt$WebStateSaver$1$1 = new HatchWebViewKt$WebStateSaver$1$1("pagetitle", "lastloaded", "bundle");
        HatchWebViewKt$WebStateSaver$1$2 hatchWebViewKt$WebStateSaver$1$2 = new HatchWebViewKt$WebStateSaver$1$2("pagetitle", "lastloaded", "bundle");
        WebStateSaver = AbstractC0871AFr.A00(new C2297BSx((G0U) hatchWebViewKt$WebStateSaver$1$2, 29), new C3bQ(hatchWebViewKt$WebStateSaver$1$1, 3));
    }

    public static final AFs<WebViewState, Object> getWebStateSaver() {
        return WebStateSaver;
    }

    public static final void destroyOwnedWebView(WebView webView) {
        Object objA0s;
        ViewGroup viewGroup;
        try {
            webView.stopLoading();
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
        try {
            webView.clearHistory();
        } catch (Throwable th2) {
            C3cG.A0s(th2);
        }
        try {
            webView.onPause();
        } catch (Throwable th3) {
            C3cG.A0s(th3);
        }
        try {
            webView.setWebChromeClient(null);
        } catch (Throwable th4) {
            C3cG.A0s(th4);
        }
        try {
            webView.setWebViewClient(new WebViewClient());
        } catch (Throwable th5) {
            C3cG.A0s(th5);
        }
        try {
            ViewParent parent = webView.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(webView);
            }
        } catch (Throwable th6) {
            C3cG.A0s(th6);
        }
        try {
            webView.removeAllViews();
        } catch (Throwable th7) {
            C3cG.A0s(th7);
        }
        try {
            webView.destroy();
            objA0s = Unit.INSTANCE;
        } catch (Throwable th8) {
            objA0s = C3cG.A0s(th8);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A(WEBVIEW_TAG, "Failed to destroy owned WebView", thA00);
        }
    }

    public static final WebViewNavigator rememberWebViewNavigator(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new WebViewNavigator();
            bfm.Ai0(objAaT);
        }
        return (WebViewNavigator) objAaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.webview.WebViewState rememberWebViewState(java.lang.String r4, byte[] r5, X.BFM r6, int r7) {
        /*
            X.AnonymousClass003.A0u(r4, r5)
            com.facebook.aura.webview.PostBodyKey r3 = new com.facebook.aura.webview.PostBodyKey
            r3.<init>(r5)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L15
            boolean r0 = r6.A65(r4)
            if (r0 != 0) goto L1a
        L15:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L1b
        L1a:
            r0 = 1
        L1b:
            boolean r0 = X.AnonymousClass001.A1R(r6, r3, r0)
            java.lang.Object r1 = r6.AaT()
            if (r0 != 0) goto L29
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L36
        L29:
            com.facebook.aura.webview.WebContent$Post r0 = new com.facebook.aura.webview.WebContent$Post
            r0.<init>(r4, r5)
            com.facebook.aura.webview.WebViewState r1 = new com.facebook.aura.webview.WebViewState
            r1.<init>(r0)
            r6.Ai0(r1)
        L36:
            com.facebook.aura.webview.WebViewState r1 = (com.facebook.aura.webview.WebViewState) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.HatchWebViewKt.rememberWebViewState(java.lang.String, byte[], X.BFM, int):com.facebook.aura.webview.WebViewState");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WebView(com.facebook.aura.webview.WebViewState r34, android.widget.FrameLayout.LayoutParams r35, X.BRg r36, boolean r37, boolean r38, boolean r39, com.facebook.aura.webview.WebViewNavigator r40, X.G0U<? super android.webkit.WebView, kotlin.Unit> r41, X.G0U<? super android.webkit.WebView, kotlin.Unit> r42, boolean r43, com.facebook.aura.webview.AccompanistWebViewClient r44, com.facebook.aura.webview.AccompanistWebChromeClient r45, X.G0U<? super android.content.Context, ? extends android.webkit.WebView> r46, X.BFM r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.HatchWebViewKt.WebView(com.facebook.aura.webview.WebViewState, android.widget.FrameLayout$LayoutParams, X.BRg, boolean, boolean, boolean, com.facebook.aura.webview.WebViewNavigator, X.G0U, X.G0U, boolean, com.facebook.aura.webview.AccompanistWebViewClient, com.facebook.aura.webview.AccompanistWebChromeClient, X.G0U, X.BFM, int, int, int):void");
    }

    public static final WebViewState rememberWebViewState(String str, InterfaceC0962AJp<String, String> interfaceC0962AJp, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        if ((i2 & 2) != 0) {
            interfaceC0962AJp = C0953AJg.A00();
        }
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new WebViewState(new WebContent.Url(str, interfaceC0962AJp));
            bfm.Ai0(objAaT);
        }
        WebViewState webViewState = (WebViewState) objAaT;
        webViewState.setContent(new WebContent.Url(str, interfaceC0962AJp));
        return webViewState;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WebView(com.facebook.aura.webview.WebViewState r27, X.BRg r28, boolean r29, boolean r30, boolean r31, com.facebook.aura.webview.WebViewNavigator r32, X.G0U<? super android.webkit.WebView, kotlin.Unit> r33, X.G0U<? super android.webkit.WebView, kotlin.Unit> r34, boolean r35, com.facebook.aura.webview.AccompanistWebViewClient r36, com.facebook.aura.webview.AccompanistWebChromeClient r37, X.G0U<? super android.content.Context, ? extends android.webkit.WebView> r38, X.BFM r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.HatchWebViewKt.WebView(com.facebook.aura.webview.WebViewState, X.BRg, boolean, boolean, boolean, com.facebook.aura.webview.WebViewNavigator, X.G0U, X.G0U, boolean, com.facebook.aura.webview.AccompanistWebViewClient, com.facebook.aura.webview.AccompanistWebChromeClient, X.G0U, X.BFM, int, int, int):void");
    }
}
