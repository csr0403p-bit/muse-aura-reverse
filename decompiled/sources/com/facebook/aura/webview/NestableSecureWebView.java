package com.facebook.aura.webview;

import X.C06H;
import X.C6t6;
import X.C7384Etj;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.aura.webview.FocusedInputReveal;

/* loaded from: classes3.dex */
public final class NestableSecureWebView extends C6t6 {
    public static final int $stable = 8;
    public final FocusedInputReveal focusedInputReveal;
    public boolean touchIsHorizontalScroll;
    public boolean touchIsVerticalScroll;
    public float touchStartX;
    public float touchStartY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestableSecureWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7384Etj.A0Y(context, 0);
        this.focusedInputReveal = new FocusedInputReveal(this, FocusedInputReveal.AnonymousClass1.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r2 = 0
            X.C7384Etj.A0Y(r6, r2)
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L5e
            r4 = 1
            if (r1 == r4) goto L6e
            r0 = 2
            if (r1 == r0) goto L18
            r0 = 3
            if (r1 == r0) goto L6e
        L13:
            boolean r0 = super.onTouchEvent(r6)
            return r0
        L18:
            float r1 = r6.getX()
            float r0 = r5.touchStartX
            float r1 = r1 - r0
            float r3 = r6.getY()
            float r0 = r5.touchStartY
            float r3 = r3 - r0
            boolean r2 = r5.touchIsVerticalScroll
            if (r2 != 0) goto L3c
            boolean r0 = r5.touchIsHorizontalScroll
            if (r0 != 0) goto L3c
            float r1 = java.lang.Math.abs(r1)
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5b
            r5.touchIsHorizontalScroll = r4
        L3c:
            if (r2 == 0) goto L4f
        L3e:
            r0 = -1
            boolean r2 = r5.canScrollVertically(r0)
            boolean r1 = r5.canScrollVertically(r4)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
            r5.requestDisallowInterceptTouchEvent(r2)
        L4f:
            boolean r0 = r5.touchIsHorizontalScroll
            if (r0 == 0) goto L13
            r5.requestDisallowInterceptTouchEvent(r4)
            goto L13
        L57:
            r5.requestDisallowInterceptTouchEvent(r1)
            goto L4f
        L5b:
            r5.touchIsVerticalScroll = r4
            goto L3e
        L5e:
            float r0 = r6.getX()
            r5.touchStartX = r0
            float r0 = r6.getY()
            r5.touchStartY = r0
            r5.touchIsVerticalScroll = r2
            r5.touchIsHorizontalScroll = r2
        L6e:
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.NestableSecureWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.focusedInputReveal.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        if (z2 && this.touchIsVerticalScroll) {
            requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.focusedInputReveal.onSizeChanged(i2, i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestableSecureWebView(Context context) {
        this(context, null, R.attr.webViewStyle);
        C7384Etj.A0Y(context, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestableSecureWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.webViewStyle);
        C7384Etj.A0Y(context, 0);
    }

    public /* synthetic */ NestableSecureWebView(Context context, AttributeSet attributeSet, int i, int i2, C06H c06h) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.webViewStyle : i);
    }
}
