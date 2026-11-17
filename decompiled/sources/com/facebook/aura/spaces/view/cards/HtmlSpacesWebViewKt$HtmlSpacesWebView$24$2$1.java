package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.C6t6;
import X.C7384Etj;
import X.C8117FUh;
import X.G0U;
import X.InterfaceC10528Hpg;
import X.InterfaceC7937FLj;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.aura.spaces.preload.SpacesActionResponseBridge;
import com.facebook.aura.spaces.preload.SpacesBlobViewerBridge;
import com.facebook.aura.spaces.preload.SpacesInitialDataBridge;
import com.facebook.aura.spaces.preload.SpacesSecureWebView;
import com.facebook.aura.spaces.preload.SpacesTtsBridge;
import com.facebook.aura.spaces.preload.SpacesWebViewTouchContainer;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.webview.HtmlWebViewPoolKt;
import com.facebook.aura.widgets.SpaceSnapshotRendererKt;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$24$2$1 extends AbstractC7559F3s implements G0U<Context, ViewGroup> {
    public final /* synthetic */ SpacesActionResponseBridge $actionBridge;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ SpacesBlobViewerBridge $blobViewerBridge;
    public final /* synthetic */ SpacesInitialDataBridge $initialDataBridge;
    public final /* synthetic */ boolean $isPeerSpace;
    public final /* synthetic */ int $ptrBackgroundColor;
    public final /* synthetic */ int $ptrSpinnerColor;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ C8117FUh $swipeRefreshLayout;
    public final /* synthetic */ SpacesWebViewTouchContainer $touchContainer;
    public final /* synthetic */ SpacesTtsBridge $ttsBridge;
    public final /* synthetic */ C6t6 $webView;

    @Override // X.G0U
    public final ViewGroup invoke(Context context) {
        ViewGroup viewGroup;
        MutableContextWrapper mutableContextWrapper;
        C7384Etj.A0Y(context, 0);
        Context context2 = this.$webView.getContext();
        if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
            Activity activity = this.$activity;
            if (activity != null) {
                context = activity;
            }
            mutableContextWrapper.setBaseContext(context);
        }
        this.$webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.$webView.removeJavascriptInterface("_fwaSpacesTouchBridge");
        this.$webView.addJavascriptInterface(this.$touchContainer, "_fwaSpacesTouchBridge");
        this.$touchContainer.secureWebView = this.$webView;
        if (this.$session.authToken != null) {
            this.$webView.removeJavascriptInterface(SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
            if (!this.$isPeerSpace) {
                this.$webView.addJavascriptInterface(this.$initialDataBridge, SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
                this.$initialDataBridge.secureWebView = this.$webView;
            }
            this.$webView.removeJavascriptInterface(SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
            this.$webView.addJavascriptInterface(this.$actionBridge, SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
            this.$actionBridge.secureWebView = this.$webView;
            this.$webView.removeJavascriptInterface("_fwaSpacesTts");
            this.$webView.addJavascriptInterface(this.$ttsBridge, "_fwaSpacesTts");
            this.$ttsBridge.secureWebView = this.$webView;
            this.$webView.removeJavascriptInterface("_fwaSpacesBlobViewer");
            this.$webView.addJavascriptInterface(this.$blobViewerBridge, "_fwaSpacesBlobViewer");
            this.$blobViewerBridge.secureWebView = this.$webView;
        }
        this.$touchContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        HtmlWebViewPoolKt.adoptChild(this.$touchContainer, this.$webView);
        C8117FUh c8117FUh = this.$swipeRefreshLayout;
        if (c8117FUh != null) {
            c8117FUh.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.$swipeRefreshLayout.setColorSchemeColors(this.$ptrSpinnerColor);
            this.$swipeRefreshLayout.setProgressBackgroundColorSchemeColor(this.$ptrBackgroundColor);
            C8117FUh c8117FUh2 = this.$swipeRefreshLayout;
            final C6t6 c6t6 = this.$webView;
            c8117FUh2.A0I = new InterfaceC10528Hpg() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$24$2$1.1
                @Override // X.InterfaceC10528Hpg
                public final boolean canChildScrollUp(C8117FUh c8117FUh3, View view) {
                    SpacesSecureWebView spacesSecureWebView;
                    if (c6t6.getScrollY() > 0) {
                        return true;
                    }
                    C6t6 c6t62 = c6t6;
                    return (!(c6t62 instanceof SpacesSecureWebView) || (spacesSecureWebView = (SpacesSecureWebView) c6t62) == null || spacesSecureWebView.getPageYieldsTopPull()) ? false : true;
                }
            };
            final HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            c8117FUh2.A0J = new InterfaceC7937FLj() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$24$2$1.2
                @Override // X.InterfaceC7937FLj
                public final void onRefresh() {
                    AnonymousClass004.A1D(true, htmlSpacesWebViewSession.isLoading);
                    htmlSpacesWebViewSession.beginRender(c6t6.getUrl());
                    c6t6.reload();
                }
            };
            c8117FUh2.addView(this.$touchContainer);
            viewGroup = this.$swipeRefreshLayout;
        } else {
            viewGroup = this.$touchContainer;
        }
        return viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$24$2$1(C6t6 c6t6, Activity activity, SpacesWebViewTouchContainer spacesWebViewTouchContainer, HtmlSpacesWebViewSession htmlSpacesWebViewSession, boolean z, SpacesInitialDataBridge spacesInitialDataBridge, SpacesActionResponseBridge spacesActionResponseBridge, SpacesTtsBridge spacesTtsBridge, SpacesBlobViewerBridge spacesBlobViewerBridge, C8117FUh c8117FUh, int i, int i2) {
        super(1);
        this.$webView = c6t6;
        this.$activity = activity;
        this.$touchContainer = spacesWebViewTouchContainer;
        this.$session = htmlSpacesWebViewSession;
        this.$isPeerSpace = z;
        this.$initialDataBridge = spacesInitialDataBridge;
        this.$actionBridge = spacesActionResponseBridge;
        this.$ttsBridge = spacesTtsBridge;
        this.$blobViewerBridge = spacesBlobViewerBridge;
        this.$swipeRefreshLayout = c8117FUh;
        this.$ptrSpinnerColor = i;
        this.$ptrBackgroundColor = i2;
    }
}
