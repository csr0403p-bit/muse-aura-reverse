package com.facebook.aura.spaces.view.cards;

import X.AnonymousClass005;
import X.C6t6;
import X.InterfaceC1559AlZ;
import android.content.Context;
import com.facebook.aura.webview.HtmlWebViewPool;

/* loaded from: classes3.dex */
public final class RememberedSpacesWebView implements InterfaceC1559AlZ {
    public final HtmlWebViewPool.Lease lease;

    private final void release() {
        this.lease.close();
    }

    public final C6t6 getWebView() {
        return this.lease.webView;
    }

    @Override // X.InterfaceC1559AlZ
    public void onRemembered() {
    }

    public RememberedSpacesWebView(HtmlWebViewPool htmlWebViewPool, String str, Context context) {
        AnonymousClass005.A0x(htmlWebViewPool, str, context);
        this.lease = htmlWebViewPool.acquireForHost(str, context);
    }

    @Override // X.InterfaceC1559AlZ
    public void onAbandoned() {
        release();
    }

    @Override // X.InterfaceC1559AlZ
    public void onForgotten() {
        release();
    }
}
