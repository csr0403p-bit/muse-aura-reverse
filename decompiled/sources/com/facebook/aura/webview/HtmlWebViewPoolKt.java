package com.facebook.aura.webview;

import X.AnonymousClass003;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes3.dex */
public abstract class HtmlWebViewPoolKt {
    public static final int HTML_WEBVIEW_POOL_LOW_RAM_MAX_SIZE = 1;
    public static final int HTML_WEBVIEW_POOL_MAX_SIZE = 2;

    public static final void adoptChild(ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2;
        AnonymousClass003.A0u(viewGroup, view);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view);
    }
}
