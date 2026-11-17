package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C60Q;
import X.C60R;
import X.C78N;
import X.CFK;
import X.FGI;
import X.G0U;
import X.G0V;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.webview.AccompanistWebChromeClient;
import com.facebook.aura.webview.AccompanistWebViewClient;
import com.facebook.aura.webview.HatchWebViewKt;
import com.facebook.aura.webview.WebContent;
import com.facebook.aura.webview.WebViewState;
import java.net.URISyntaxException;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class HatchEmbeddedHtmlKt {

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchEmbeddedHtmlKt$HatchEmbeddedHtml$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enableVerticalScrollBar;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WebContent $webContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WebContent webContent, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$webContent = webContent;
            this.$modifier = bRg;
            this.$enableVerticalScrollBar = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEmbeddedHtmlKt.HatchEmbeddedHtml(this.$webContent, this.$modifier, this.$enableVerticalScrollBar, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchEmbeddedHtml(WebContent webContent, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean zA1Q = z;
        boolean zA1a = AnonymousClass002.A1a(webContent, bRg);
        bfm.AgG(710968343);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(webContent, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, zA1Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            zA1Q = C60Q.A1Q(i3, zA1Q);
            boolean z2 = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(webContent));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new WebViewState(webContent);
                bfm.Ai0(objAaT);
            }
            WebViewState webViewState = (WebViewState) objAaT;
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new AccompanistWebChromeClient();
                bfm.Ai0(objAaT2);
            }
            AccompanistWebChromeClient accompanistWebChromeClient = (AccompanistWebChromeClient) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new AccompanistWebViewClient() { // from class: com.facebook.aura.conversation.view.richcontent.HatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                        AnonymousClass003.A0u(webView, webResourceRequest);
                        return HatchEmbeddedHtmlKt.launchUriIfRequired(C60R.A0c(webResourceRequest), webView);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        AnonymousClass003.A0u(webView, str);
                        return HatchEmbeddedHtmlKt.launchUriIfRequired(str, webView);
                    }
                };
                bfm.Ai0(objAaT3);
            }
            HatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1 hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1 = (HatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1) objAaT3;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            boolean zA1V = AnonymousClass005.A1V(bfm, layoutParams, accompanistWebChromeClient, hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1, bfm.A67(contextA0H)) | ((iA05 & 896) == 256);
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == obj) {
                objAaT4 = new HatchEmbeddedHtmlKt$HatchEmbeddedHtml$1$1(contextA0H, layoutParams, accompanistWebChromeClient, hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1, zA1Q);
                bfm.Ai0(objAaT4);
            }
            HatchWebViewKt.WebView(webViewState, layoutParams, bRg, false, false, zA1a, null, null, null, false, hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1, accompanistWebChromeClient, (G0U) objAaT4, bfm, ((iA05 << 3) & 896) | 196608, AccompanistWebViewClient.$stable | (AccompanistWebChromeClient.$stable << 3), 984);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(webContent, bRg, zA1Q, i, i2);
        }
    }

    public static final boolean launchUriIfRequired(String str, WebView webView) throws URISyntaxException {
        if (AnonymousClass005.A1a(str, AuraDeeplinkHandlerActivity.HTTP)) {
            return false;
        }
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addFlags(268468224);
            uri.putExtra("expect_activity_not_found", true);
            C60Q.A0S().A05(webView.getContext(), uri);
            return true;
        } catch (Exception e) {
            CFK.A04("HatchEmbeddedHtml", FGI.A0M("Error while launching intent: ", e.getMessage()));
            return true;
        }
    }
}
