package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C6t6;
import X.C78g;
import X.G0U;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$3$1(C6t6 c6t6, Activity activity) {
        super(1);
        this.$webView = c6t6;
        this.$activity = activity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final MutableContextWrapper mutableContextWrapper;
        Activity activity;
        Context context = this.$webView.getContext();
        if (context instanceof MutableContextWrapper) {
            mutableContextWrapper = (MutableContextWrapper) context;
            if (mutableContextWrapper != null && (activity = this.$activity) != null) {
                mutableContextWrapper.setBaseContext(activity);
            }
        } else {
            mutableContextWrapper = null;
        }
        return new C78g() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                MutableContextWrapper mutableContextWrapper2 = mutableContextWrapper;
                if (mutableContextWrapper2 != null) {
                    Context baseContext = mutableContextWrapper2.getBaseContext();
                    mutableContextWrapper2.setBaseContext(baseContext != null ? baseContext.getApplicationContext() : null);
                }
            }
        };
    }
}
