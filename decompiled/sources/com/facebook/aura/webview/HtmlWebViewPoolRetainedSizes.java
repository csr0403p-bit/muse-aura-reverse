package com.facebook.aura.webview;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass007;
import X.C3cG;
import com.facebook.aura.memory.AuraRetainedSizeSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HtmlWebViewPoolRetainedSizes implements AuraRetainedSizeSource {
    public static final int $stable = 0;
    public static final HtmlWebViewPoolRetainedSizes INSTANCE = new HtmlWebViewPoolRetainedSizes();

    @Override // com.facebook.aura.memory.AuraRetainedSizeSource
    public Map<String, Long> retainedSizes(AbstractC3358CGz abstractC3358CGz) {
        HtmlWebViewPool htmlWebViewPool;
        return (abstractC3358CGz == null || (htmlWebViewPool = (HtmlWebViewPool) abstractC3358CGz.A02(HtmlWebViewPool.class)) == null) ? AGH.A0E() : AnonymousClass007.A0d("webview_pending_destroy", Long.valueOf(htmlWebViewPool.getPendingDestructionCount$fbandroid_express_aura_java_com_facebook_aura_webview_webview()), C3cG.A0r("webview_pool", Long.valueOf(htmlWebViewPool.getPooledCount$fbandroid_express_aura_java_com_facebook_aura_webview_webview())));
    }
}
