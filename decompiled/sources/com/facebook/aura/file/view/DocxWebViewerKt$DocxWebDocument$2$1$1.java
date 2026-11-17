package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C60R;
import X.C60S;
import X.C6wz;
import X.C6x1;
import X.C7384Etj;
import X.C7418EvO;
import X.C7aV;
import X.CFK;
import X.FGI;
import X.G0U;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.MutableState;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class DocxWebViewerKt$DocxWebDocument$2$1$1 extends AbstractC7559F3s implements G0U<Context, WebView> {
    public final /* synthetic */ File $file;
    public final /* synthetic */ MutableState<Boolean> $isPageLoaded$delegate;
    public final /* synthetic */ MutableState<DocxWebRenderState> $renderState$delegate;
    public final /* synthetic */ C3UX $scope;

    @Override // X.G0U
    public final WebView invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(new C7418EvO("/assets/", new C7aV(context)));
        arrayListA0h.add(new C7418EvO(DocxWebViewerKt.DOCX_VIEWER_DATA_PATH_PREFIX, new DocxDataPathHandler(this.$file)));
        final C6x1 c6x1A00 = C6wz.A00(DocxWebViewerKt.DOCX_VIEWER_ASSET_DOMAIN, arrayListA0h);
        WebView webView = new WebView(context);
        final C3UX c3ux = this.$scope;
        final MutableState<DocxWebRenderState> mutableState = this.$renderState$delegate;
        final MutableState<Boolean> mutableState2 = this.$isPageLoaded$delegate;
        C60R.A1U(webView);
        C60S.A04(webView);
        C60S.A05(webView);
        webView.addJavascriptInterface(new Object() { // from class: com.facebook.aura.file.view.DocxWebViewerKt$DocxWebDocument$2$1$1$1$1
            @JavascriptInterface
            public final void onRenderError(String str) {
                C7384Etj.A0Y(str, 0);
                CFK.A06(DocxWebViewerKt.TAG, FGI.A0M("DOCX render error: ", str));
                AnonymousClass001.A1J(new DocxWebViewerKt$DocxWebDocument$2$1$1$1$1$onRenderError$1(str, mutableState, null), c3ux);
            }

            @JavascriptInterface
            public final void onRenderComplete() {
                AnonymousClass001.A1J(new DocxWebViewerKt$DocxWebDocument$2$1$1$1$1$onRenderComplete$1(mutableState, null), c3ux);
            }
        }, HtmlSourceEditorKt.JS_INTERFACE_NAME);
        webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.file.view.DocxWebViewerKt$DocxWebDocument$2$1$1$1$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                C7384Etj.A0Y(webView2, 0);
                if (MutableState.A0A((MutableState) mutableState2)) {
                    return;
                }
                MutableState.A09(true, mutableState2);
                webView2.evaluateJavascript("loadFromDocxUrl('https://hatch-docx-viewer.local/docx/current.docx');", null);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                int i;
                String str;
                if (DocxWebViewerKt.isDocxInlineResourceUrl(C60R.A0C(webResourceRequest))) {
                    return null;
                }
                if (DocxWebViewerKt.isDocxViewerUrl(C60Q.A0A(webResourceRequest))) {
                    WebResourceResponse webResourceResponseA00 = c6x1A00.A00(webResourceRequest.getUrl());
                    if (webResourceResponseA00 != null) {
                        return webResourceResponseA00;
                    }
                    i = 404;
                    str = "Not Found";
                } else {
                    i = 403;
                    str = "Forbidden";
                }
                return DocxWebViewerKt.docxEmptyResponse(i, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                return !DocxWebViewerKt.isDocxViewerUrl(C60R.A0C(webResourceRequest));
            }
        });
        webView.loadUrl(DocxWebViewerKt.DOCX_VIEWER_INDEX_URL);
        return webView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocxWebViewerKt$DocxWebDocument$2$1$1(File file, C3UX c3ux, MutableState<DocxWebRenderState> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$file = file;
        this.$scope = c3ux;
        this.$renderState$delegate = mutableState;
        this.$isPageLoaded$delegate = mutableState2;
    }
}
