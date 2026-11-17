package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.aura.webview.AccompanistWebChromeClient;

/* loaded from: classes3.dex */
public final class HatchEmbeddedHtmlKt$HatchEmbeddedHtml$1$1 extends AbstractC7559F3s implements G0U<Context, WebView> {
    public final /* synthetic */ AccompanistWebChromeClient $chromeClient;
    public final /* synthetic */ HatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1 $client;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $enableVerticalScrollBar;
    public final /* synthetic */ FrameLayout.LayoutParams $layoutParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbeddedHtmlKt$HatchEmbeddedHtml$1$1(Context context, FrameLayout.LayoutParams layoutParams, AccompanistWebChromeClient accompanistWebChromeClient, HatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1 hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1, boolean z) {
        super(1);
        this.$context = context;
        this.$layoutParams = layoutParams;
        this.$chromeClient = accompanistWebChromeClient;
        this.$client = hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1;
        this.$enableVerticalScrollBar = z;
    }

    @Override // X.G0U
    public final WebView invoke(Context context) {
        WebView webView = new WebView(this.$context);
        FrameLayout.LayoutParams layoutParams = this.$layoutParams;
        AccompanistWebChromeClient accompanistWebChromeClient = this.$chromeClient;
        HatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1 hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1 = this.$client;
        boolean z = this.$enableVerticalScrollBar;
        webView.setLayoutParams(layoutParams);
        webView.setWebChromeClient(accompanistWebChromeClient);
        webView.setWebViewClient(hatchEmbeddedHtmlKt$HatchEmbeddedHtml$client$1$1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(z);
        webView.setHorizontalScrollBarEnabled(false);
        return webView;
    }
}
