package com.facebook.aura.file.view;

import X.C7384Etj;
import X.G0U;
import android.webkit.JavascriptInterface;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSourceBridge {
    public static final int $stable = 0;
    public final G0U<String, Unit> post;

    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSourceBridge(G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.post = g0u;
    }

    @JavascriptInterface
    public final void onChange(String str) {
        C7384Etj.A0Y(str, 0);
        this.post.invoke(str);
    }
}
