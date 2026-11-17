package com.facebook.aura.spaces.preload;

import X.C6t6;
import X.C7384Etj;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import com.facebook.aura.webview.FocusedInputReveal;

/* loaded from: classes3.dex */
public final class SpacesSecureWebView extends C6t6 {
    public int documentGeneration;
    public final FocusedInputReveal focusedInputReveal;
    public volatile long lastTouchDownAtMs;
    public boolean pageDisablesTopPull;
    public boolean pageOverscrolledTop;
    public boolean touching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesSecureWebView(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.focusedInputReveal = new FocusedInputReveal(this, FocusedInputReveal.AnonymousClass1.INSTANCE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touching = true;
            this.pageOverscrolledTop = false;
            this.lastTouchDownAtMs = System.currentTimeMillis();
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touching = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.touching = false;
        this.focusedInputReveal.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    public final long getLastTouchDownAtMs() {
        return this.lastTouchDownAtMs;
    }

    public final boolean getPageYieldsTopPull() {
        if (this.pageDisablesTopPull) {
            return false;
        }
        return !this.touching || this.pageOverscrolledTop;
    }

    public final void onDocumentStarted$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload() {
        this.documentGeneration++;
        this.pageDisablesTopPull = false;
    }

    public final void readRootOverscrollBehavior$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload() {
        final int i = this.documentGeneration;
        evaluateJavascript(SpacesWebViewFactoryKt.ROOT_OVERSCROLL_BEHAVIOR_DISABLES_PULL_JS, new ValueCallback() { // from class: com.facebook.aura.spaces.preload.SpacesSecureWebView$readRootOverscrollBehavior$1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str) {
                int i2 = i;
                SpacesSecureWebView spacesSecureWebView = this;
                if (i2 == spacesSecureWebView.documentGeneration) {
                    spacesSecureWebView.pageDisablesTopPull = "true".equals(str);
                }
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        if (z2 && i2 == 0) {
            this.pageOverscrolledTop = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.focusedInputReveal.onSizeChanged(i2, i4);
    }
}
