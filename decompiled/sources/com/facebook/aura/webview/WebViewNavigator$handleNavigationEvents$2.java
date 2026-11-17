package com.facebook.aura.webview;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C05563uZ;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import android.webkit.WebView;
import com.facebook.aura.webview.WebViewNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.webview.WebViewNavigator$handleNavigationEvents$2", f = "HatchWebView.kt", l = {491}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class WebViewNavigator$handleNavigationEvents$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ WebView $this_handleNavigationEvents;
    public int label;
    public final /* synthetic */ WebViewNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigator$handleNavigationEvents$2(WebViewNavigator webViewNavigator, WebView webView, HtJ<? super WebViewNavigator$handleNavigationEvents$2> htJ) {
        super(2, htJ);
        this.this$0 = webViewNavigator;
        this.$this_handleNavigationEvents = webView;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WebViewNavigator$handleNavigationEvents$2(this.this$0, this.$this_handleNavigationEvents, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05563uZ c05563uZA01 = Hu1.A01(this.this$0.navigationEvents);
            final WebView webView = this.$this_handleNavigationEvents;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.webview.WebViewNavigator$handleNavigationEvents$2.1
                public final Object emit(WebViewNavigator.NavigationEvent navigationEvent, HtJ<? super Unit> htJ) {
                    if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Back) {
                        webView.goBack();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Forward) {
                        webView.goForward();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Reload) {
                        webView.reload();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.StopLoading) {
                        webView.stopLoading();
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.LoadHtml) {
                        WebViewNavigator.NavigationEvent.LoadHtml loadHtml = (WebViewNavigator.NavigationEvent.LoadHtml) navigationEvent;
                        webView.loadDataWithBaseURL(loadHtml.baseUrl, loadHtml.html, loadHtml.mimeType, loadHtml.encoding, loadHtml.historyUrl);
                    } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.LoadUrl) {
                        WebViewNavigator.NavigationEvent.LoadUrl loadUrl = (WebViewNavigator.NavigationEvent.LoadUrl) navigationEvent;
                        webView.loadUrl(loadUrl.url, loadUrl.additionalHttpHeaders);
                    } else {
                        if (!(navigationEvent instanceof WebViewNavigator.NavigationEvent.PostUrl)) {
                            throw C3cG.A0q();
                        }
                        WebViewNavigator.NavigationEvent.PostUrl postUrl = (WebViewNavigator.NavigationEvent.PostUrl) navigationEvent;
                        webView.postUrl(postUrl.url, postUrl.postData);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((WebViewNavigator.NavigationEvent) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c05563uZA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((WebViewNavigator$handleNavigationEvents$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
