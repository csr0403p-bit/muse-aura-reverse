package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C6xU;
import X.C6xj;
import X.C6y5;
import X.C6yA;
import X.C6yG;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0U;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WidgetWebViewState {
    public String appliedStateJson;
    public String appliedTheme;
    public volatile String assetAuthToken;
    public volatile String assetBaseUrl;
    public final WidgetJsBridge bridge;
    public volatile String documentPath;
    public String loadedContentKey;
    public volatile Function0<Unit> onRendererGone;
    public volatile HatchHtmlRenderTrace renderTrace;
    public volatile String shellPrefix;
    public volatile String shellSuffix;

    public WidgetWebViewState(Function0<Float> function0) {
        C7384Etj.A0Y(function0, 0);
        this.bridge = new WidgetJsBridge(function0);
        this.shellPrefix = "";
        this.shellSuffix = "";
        this.onRendererGone = WidgetWebViewState$onRendererGone$1.INSTANCE;
    }

    public final WebResourceResponse fetchAsset(String str) {
        C7384Etj.A0Y(str, 0);
        return HatchWidgetWebViewKt.fetchWidgetAsset(str, this.assetBaseUrl, this.assetAuthToken);
    }

    public final WebResourceResponse fetchFromWidgetHost(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(HatchWidgetWebViewKt.WIDGET_FAVICON_PATH)) {
            return HatchWidgetWebViewKt.widgetHostNoContent();
        }
        String str2 = this.documentPath;
        if (str2 != null && C7384Etj.areEqual(C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str), C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2))) {
            return HatchWidgetWebViewKt.fetchWidgetDocument(str2, this.shellPrefix, this.shellSuffix, this.assetBaseUrl, this.assetAuthToken);
        }
        if (HatchUtil.INSTANCE.isWidgetWebViewIsolationEnabled() && (str = HatchWidgetWebViewKt.documentTreeAssetPath(str, str2)) == null) {
            return HatchWidgetWebViewKt.widgetHostForbidden();
        }
        WebResourceResponse webResourceResponseFetchAsset = fetchAsset(str);
        return webResourceResponseFetchAsset == null ? HatchWidgetWebViewKt.widgetHostNotFound() : webResourceResponseFetchAsset;
    }

    public final void installBridge(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        if (!C6xU.A00("WEB_MESSAGE_LISTENER")) {
            webView.addJavascriptInterface(new WidgetHeightOnlyBridge(this.bridge), HatchWidgetWebViewKt.BRIDGE_NAME);
        } else {
            C6xj.A03(webView, new C6y5() { // from class: com.facebook.aura.conversation.view.richcontent.WidgetWebViewState.installBridge.1
                @Override // X.C6y5
                public final void onPostMessage(WebView webView2, C6yG c6yG, Uri uri, boolean z, C6yA c6yA) {
                    AnonymousClass002.A1A(c6yG, 1, uri);
                    if (0 != c6yG.A00) {
                        throw C3cG.A0Q(FGI.A0d("Wrong data accessor type detected. ", "ArrayBuffer", " expected, but got ", "String"));
                    }
                    String str = c6yG.A01;
                    if (z && HatchWidgetWebViewKt.isWidgetOrigin(uri) && str != null) {
                        WidgetWebViewState.this.bridge.onMessage(str, true);
                    }
                }
            }, HatchWidgetWebViewKt.BRIDGE_NAME, Collections.singleton(HatchWidgetWebViewKt.WIDGET_ORIGIN));
        }
    }

    public final boolean shouldApplyState(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.appliedStateJson)) {
            return false;
        }
        this.appliedStateJson = str;
        return true;
    }

    public final boolean shouldApplyTheme(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.appliedTheme)) {
            return false;
        }
        this.appliedTheme = str;
        return true;
    }

    public final boolean shouldLoadContent(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        if (str.equals(this.loadedContentKey)) {
            return false;
        }
        this.loadedContentKey = str;
        this.appliedTheme = str2;
        this.appliedStateJson = null;
        return zA1a;
    }

    public final void update(String str, String str2, G0U<? super String, Unit> g0u, G0U<? super Integer, Unit> g0u2, Function0<Unit> function0) {
        AnonymousClass005.A12(g0u, g0u2, function0, 2);
        this.assetBaseUrl = str;
        this.assetAuthToken = str2;
        this.onRendererGone = function0;
        this.bridge.update(g0u, g0u2);
    }

    public final HatchHtmlRenderTrace getRenderTrace() {
        return this.renderTrace;
    }

    public final void notifyRendererGone() {
        this.onRendererGone.invoke();
    }

    public final void setRenderTrace(HatchHtmlRenderTrace hatchHtmlRenderTrace) {
        this.renderTrace = hatchHtmlRenderTrace;
    }

    public final void updateDocumentSource(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        this.documentPath = str;
        this.shellPrefix = str2;
        this.shellSuffix = str3;
    }
}
