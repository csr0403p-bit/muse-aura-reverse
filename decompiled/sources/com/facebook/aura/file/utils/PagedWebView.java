package com.facebook.aura.file.utils;

import X.C7384Etj;
import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class PagedWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedWebView(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
    }

    public final int getContentHeightPx() {
        return computeVerticalScrollRange();
    }
}
