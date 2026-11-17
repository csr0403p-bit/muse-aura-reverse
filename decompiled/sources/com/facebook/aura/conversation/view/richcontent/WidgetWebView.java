package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass001;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9tJ;
import X.G0V;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WidgetWebView extends WebView implements WidgetFieldHost {
    public Runnable pendingFieldBounds;
    public boolean touchIsHorizontalScroll;
    public boolean touchIsVerticalScroll;
    public final int touchSlop;
    public float touchStartX;
    public float touchStartY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetWebView(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX() - this.touchStartX;
                    float y = motionEvent.getY() - this.touchStartY;
                    boolean z = this.touchIsVerticalScroll;
                    if (!z && !this.touchIsHorizontalScroll) {
                        float fAbs = Math.abs(x);
                        float f = this.touchSlop;
                        if (fAbs < f && Math.abs(y) < f) {
                            return super.onTouchEvent(motionEvent);
                        }
                        if (fAbs > Math.abs(y) * 2.0f) {
                            this.touchIsHorizontalScroll = true;
                        } else {
                            this.touchIsVerticalScroll = true;
                            z = true;
                        }
                    }
                    if (this.touchIsHorizontalScroll) {
                        requestDisallowInterceptTouchEvent(true);
                    } else if (z) {
                    }
                } else if (actionMasked == 3) {
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.touchStartX = motionEvent.getX();
        this.touchStartY = motionEvent.getY();
        this.touchIsVerticalScroll = false;
        this.touchIsHorizontalScroll = false;
        requestDisallowInterceptTouchEvent(false);
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.aura.conversation.view.richcontent.WidgetFieldHost
    public void requestFocusedFieldBounds(final G0V<? super Float, ? super Float, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        evaluateJavascript(HatchWidgetWebViewKt.FOCUSED_FIELD_BOUNDS_SCRIPT, new ValueCallback() { // from class: com.facebook.aura.conversation.view.richcontent.WidgetWebView.requestFocusedFieldBounds.1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str) {
                String strA0J;
                List listA0h;
                if (str == null || (strA0J = C7BY.A0J("[", "]", str)) == null || (listA0h = C7BY.A0h(strA0J, new char[1], ',')) == null) {
                    return;
                }
                final ArrayList arrayListA0h = C3cG.A0h();
                Iterator it = listA0h.iterator();
                while (it.hasNext()) {
                    Float fA0w = C9tJ.A0w(C7BY.A0b(it));
                    if (fA0w != null) {
                        arrayListA0h.add(fA0w);
                    }
                }
                if (arrayListA0h.size() == 2) {
                    final WidgetWebView widgetWebView = WidgetWebView.this;
                    final G0V<Float, Float, Unit> g0v2 = g0v;
                    Runnable runnable = new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.WidgetWebView$requestFocusedFieldBounds$1$reveal$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int[] iArr = new int[2];
                            widgetWebView.getLocationInWindow(iArr);
                            int i = iArr[1];
                            float f = widgetWebView.getResources().getDisplayMetrics().density;
                            float f2 = i;
                            g0v2.invoke(Float.valueOf((AnonymousClass001.A02(arrayListA0h.get(0)) * f) + f2), Float.valueOf(f2 + (AnonymousClass001.A02(arrayListA0h.get(1)) * f)));
                        }
                    };
                    Runnable runnable2 = widgetWebView.pendingFieldBounds;
                    if (runnable2 != null) {
                        widgetWebView.removeCallbacks(runnable2);
                    }
                    WidgetWebView widgetWebView2 = WidgetWebView.this;
                    widgetWebView2.pendingFieldBounds = runnable;
                    widgetWebView2.postOnAnimation(runnable);
                }
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (!z) {
            evaluateJavascript(HatchWidgetWebViewKt.RESET_FOCUS_INTENT_SCRIPT, null);
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        suspendAutomaticFocus();
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
        if (i == i3 || i3 <= 0) {
            return;
        }
        post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.WidgetWebView.onSizeChanged.1
            @Override // java.lang.Runnable
            public final void run() {
                WidgetWebView.this.evaluateJavascript("if (typeof scheduleWidgetHeightReports === 'function') scheduleWidgetHeightReports();", null);
            }
        });
    }

    public final void suspendAutomaticFocus() {
        clearFocus();
        evaluateJavascript(HatchWidgetWebViewKt.SUSPEND_AUTOMATIC_FOCUS_SCRIPT, null);
    }
}
