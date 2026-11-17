package com.facebook.aura.webview;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C6t6;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.webkit.WebView;
import com.facebook.aura.webview.WebContent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.webview.HatchWebViewKt$WebView$12$2$1", f = "HatchWebView.kt", l = {168}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebView$12$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ WebViewState $state;
    public final /* synthetic */ WebView $wv;
    public int label;

    /* renamed from: com.facebook.aura.webview.HatchWebViewKt$WebView$12$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<WebContent> {
        public final /* synthetic */ WebViewState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewState webViewState) {
            super(0);
            this.$state = webViewState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final WebContent invoke() {
            return this.$state.getContent();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ WebContent invoke() {
            return this.$state.getContent();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWebViewKt$WebView$12$2$1(WebViewState webViewState, WebView webView, HtJ<? super HatchWebViewKt$WebView$12$2$1> htJ) {
        super(2, htJ);
        this.$state = webViewState;
        this.$wv = webView;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWebViewKt$WebView$12$2$1(this.$state, this.$wv, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$state));
            final WebView webView = this.$wv;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.webview.HatchWebViewKt$WebView$12$2$1.2
                public final Object emit(WebContent webContent, HtJ<? super Unit> htJ) {
                    if (webContent instanceof WebContent.Url) {
                        WebContent.Url url = (WebContent.Url) webContent;
                        webView.loadUrl(url.url, url.additionalHttpHeaders);
                    } else if (webContent instanceof WebContent.AuthenticatedUrl) {
                        WebView webView2 = webView;
                        if (webView2 instanceof C6t6) {
                            WebContent.AuthenticatedUrl authenticatedUrl = (WebContent.AuthenticatedUrl) webContent;
                            ((C6t6) webView2).loadUrlWithMetaAICookies(authenticatedUrl.url, authenticatedUrl.cookies);
                        }
                    } else if (webContent instanceof WebContent.Data) {
                        WebContent.Data data = (WebContent.Data) webContent;
                        webView.loadDataWithBaseURL(data.baseUrl, data.data, data.mimeType, data.encoding, data.historyUrl);
                    } else if (webContent instanceof WebContent.Post) {
                        WebContent.Post post = (WebContent.Post) webContent;
                        webView.postUrl(post.url, post.postData);
                    } else if (!(webContent instanceof WebContent.NavigatorOnly)) {
                        throw C3cG.A0q();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((WebContent) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchWebViewKt$WebView$12$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
