package com.facebook.aura.ccv.nativeflow.ui;

import X.C60Q;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import com.facebook.aura.webview.AccompanistWebViewClient;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ThreeDSChallengeClient extends AccompanistWebViewClient {
    public final G0U<HatchThreeDSChallengeResult, Unit> onResult;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreeDSChallengeClient(G0U<? super HatchThreeDSChallengeResult, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onResult = g0u;
    }

    @Override // com.facebook.aura.webview.AccompanistWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C7384Etj.A0Y(webView, 0);
        if (str != null) {
            Uri uri = Uri.parse(str);
            C7384Etj.A0U(uri);
            HatchThreeDSChallengeResult hatchThreeDSChallengeResultCompletionResult = completionResult(uri);
            if (hatchThreeDSChallengeResultCompletionResult != null) {
                webView.stopLoading();
                this.onResult.invoke(hatchThreeDSChallengeResultCompletionResult);
                return;
            }
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        HatchThreeDSChallengeResult hatchThreeDSChallengeResultCompletionResult;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            if (!webResourceRequest.isForMainFrame() || (hatchThreeDSChallengeResultCompletionResult = completionResult(url)) == null) {
                return true ^ "https".equals(url.getScheme());
            }
            this.onResult.invoke(hatchThreeDSChallengeResultCompletionResult);
        }
        return true;
    }

    private final HatchThreeDSChallengeResult completionResult(Uri uri) {
        String queryParameter;
        if (C60Q.A1R(uri) && HatchCcvThreeDSChallengeDialogKt.COMPLETION_HOST.equals(uri.getHost()) && (queryParameter = uri.getQueryParameter(HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_PARAM)) != null) {
            return queryParameter.equals(HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS) ? HatchThreeDSChallengeResult.AUTHENTICATED : HatchThreeDSChallengeResult.AUTH_FAILED;
        }
        return null;
    }
}
