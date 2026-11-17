package com.facebook.aura.spaces.view.cards;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C6t6;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import android.view.ViewGroup;
import com.facebook.aura.spaces.preload.SpacesActionResponseBridge;
import com.facebook.aura.spaces.preload.SpacesBlobViewerBridge;
import com.facebook.aura.spaces.preload.SpacesInitialDataBridge;
import com.facebook.aura.spaces.preload.SpacesTtsBridge;
import com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt;
import com.facebook.aura.spaces.preload.SpacesWebViewTouchContainer;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.webview.HtmlWebViewPoolKt;
import com.facebook.aura.widgets.SpaceSnapshotRendererKt;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$24$3$1 extends AbstractC7559F3s implements G0U<ViewGroup, Unit> {
    public final /* synthetic */ SpacesActionResponseBridge $actionBridge;
    public final /* synthetic */ SpacesBlobViewerBridge $blobViewerBridge;
    public final /* synthetic */ int $bottomPaddingCssPx;
    public final /* synthetic */ String $canonicalSourceUrl;
    public final /* synthetic */ String $contentKey;
    public final /* synthetic */ String $envCss;
    public final /* synthetic */ Map<String, String> $extraRequestHeaders;
    public final /* synthetic */ int $headerHeightCssPx;
    public final /* synthetic */ String $htmlContent;
    public final /* synthetic */ SpacesInitialDataBridge $initialDataBridge;
    public final /* synthetic */ boolean $isPeerSpace;
    public final /* synthetic */ boolean $rendersFromShare;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ SpacesWebViewTouchContainer $touchContainer;
    public final /* synthetic */ SpacesTtsBridge $ttsBridge;
    public final /* synthetic */ Long $updatedAtMs;
    public final /* synthetic */ C6t6 $webView;

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$24$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ HtmlSpacesWebViewSession $session;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            G0U<? super String, Unit> g0u = this.$session.onOpenUrl;
            if (g0u != null) {
                g0u.invoke(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
            super(1);
            this.$session = htmlSpacesWebViewSession;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$24$3$1(SpacesWebViewTouchContainer spacesWebViewTouchContainer, C6t6 c6t6, HtmlSpacesWebViewSession htmlSpacesWebViewSession, SpacesInitialDataBridge spacesInitialDataBridge, SpacesActionResponseBridge spacesActionResponseBridge, SpacesTtsBridge spacesTtsBridge, SpacesBlobViewerBridge spacesBlobViewerBridge, String str, int i, int i2, boolean z, String str2, String str3, String str4, Map<String, String> map, Long l, boolean z2) {
        super(1);
        this.$touchContainer = spacesWebViewTouchContainer;
        this.$webView = c6t6;
        this.$session = htmlSpacesWebViewSession;
        this.$initialDataBridge = spacesInitialDataBridge;
        this.$actionBridge = spacesActionResponseBridge;
        this.$ttsBridge = spacesTtsBridge;
        this.$blobViewerBridge = spacesBlobViewerBridge;
        this.$contentKey = str;
        this.$headerHeightCssPx = i;
        this.$bottomPaddingCssPx = i2;
        this.$rendersFromShare = z;
        this.$canonicalSourceUrl = str2;
        this.$htmlContent = str3;
        this.$envCss = str4;
        this.$extraRequestHeaders = map;
        this.$updatedAtMs = l;
        this.$isPeerSpace = z2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewGroup viewGroup) {
        String str;
        Map mapA0E;
        this.$touchContainer.plainTextUrlClickListener = new AnonymousClass1(this.$session);
        SpacesWebViewTouchContainer spacesWebViewTouchContainer = this.$touchContainer;
        C6t6 c6t6 = spacesWebViewTouchContainer.secureWebView;
        C6t6 c6t62 = this.$webView;
        if (c6t6 != c6t62) {
            spacesWebViewTouchContainer.secureWebView = c6t62;
            c6t62.removeJavascriptInterface("_fwaSpacesTouchBridge");
            this.$webView.addJavascriptInterface(this.$touchContainer, "_fwaSpacesTouchBridge");
            HtmlWebViewPoolKt.adoptChild(this.$touchContainer, this.$webView);
        }
        if (this.$session.authToken != null) {
            C6t6 c6t63 = this.$initialDataBridge.secureWebView;
            C6t6 c6t64 = this.$webView;
            if (c6t63 != c6t64) {
                this.$initialDataBridge.secureWebView = c6t64;
                this.$webView.removeJavascriptInterface(SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
                this.$webView.addJavascriptInterface(this.$initialDataBridge, SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
            }
            C6t6 c6t65 = this.$actionBridge.secureWebView;
            C6t6 c6t66 = this.$webView;
            if (c6t65 != c6t66) {
                this.$actionBridge.secureWebView = c6t66;
                this.$webView.removeJavascriptInterface(SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
                this.$webView.addJavascriptInterface(this.$actionBridge, SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
            }
            C6t6 c6t67 = this.$ttsBridge.secureWebView;
            C6t6 c6t68 = this.$webView;
            if (c6t67 != c6t68) {
                this.$ttsBridge.secureWebView = c6t68;
                this.$webView.removeJavascriptInterface("_fwaSpacesTts");
                this.$webView.addJavascriptInterface(this.$ttsBridge, "_fwaSpacesTts");
            }
            C6t6 c6t69 = this.$blobViewerBridge.secureWebView;
            C6t6 c6t610 = this.$webView;
            if (c6t69 != c6t610) {
                this.$blobViewerBridge.secureWebView = c6t610;
                this.$webView.removeJavascriptInterface("_fwaSpacesBlobViewer");
                this.$webView.addJavascriptInterface(this.$blobViewerBridge, "_fwaSpacesBlobViewer");
            }
        }
        String str2 = this.$contentKey;
        if (str2 != null && str2.equals(this.$session.loadedContent)) {
            this.$webView.evaluateJavascript(FGI.A0Y("document.documentElement.style.setProperty('--header-height','", "px');document.documentElement.style.setProperty('--bottom-padding','", "px');", this.$headerHeightCssPx, this.$bottomPaddingCssPx), null);
            SpacesWebViewFactoryKt.injectSafeAreaInsets(this.$webView, this.$session);
        }
        if (this.$rendersFromShare || (str = this.$contentKey) == null || str.equals(this.$session.loadedContent)) {
            return;
        }
        this.$session.loadedContent = this.$contentKey;
        AnonymousClass003.A14(this.$session.showError, false);
        AnonymousClass003.A14(this.$session.isLoading, true);
        this.$session.beginRender(this.$canonicalSourceUrl);
        String str3 = this.$htmlContent;
        if (str3 != null) {
            this.$webView.loadDataWithBaseURL(null, SpacesWebViewFactoryKt.injectEnvCss(str3, this.$envCss), "text/html", "utf-8", null);
        } else if (this.$canonicalSourceUrl != null) {
            String str4 = this.$session.authToken;
            if (str4 == null || this.$isPeerSpace || (mapA0E = AnonymousClass006.A10("Authorization", FGI.A0M("Bearer ", str4))) == null) {
                mapA0E = AGH.A0E();
            }
            this.$webView.loadUrl(this.$canonicalSourceUrl, AGH.A02(mapA0E, this.$extraRequestHeaders));
        }
        this.$session.loadedUpdatedAtMs = this.$updatedAtMs;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup) {
        invoke2(viewGroup);
        return Unit.INSTANCE;
    }
}
