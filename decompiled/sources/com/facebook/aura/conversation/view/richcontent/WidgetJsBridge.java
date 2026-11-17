package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass003;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class WidgetJsBridge {
    public final Function0<Float> densityProvider;
    public final Handler mainHandler;
    public volatile G0U<? super Integer, Unit> onHeightMeasured;
    public volatile G0U<? super String, Unit> onSetState;

    public WidgetJsBridge(Function0<Float> function0) {
        C7384Etj.A0Y(function0, 0);
        this.densityProvider = function0;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.onSetState = WidgetJsBridge$onSetState$1.INSTANCE;
        this.onHeightMeasured = WidgetJsBridge$onHeightMeasured$1.INSTANCE;
    }

    public final void onMessage(String str, boolean z) {
        Double d;
        C7384Etj.A0Y(str, 0);
        WidgetBridgeMessageJson widgetBridgeMessage = HatchWidgetWebViewJsonKt.parseWidgetBridgeMessage(str);
        if (widgetBridgeMessage != null) {
            String str2 = widgetBridgeMessage.type;
            if (!"chat-widget-state".equals(str2)) {
                if (!"chat-widget-height".equals(str2) || (d = widgetBridgeMessage.height) == null) {
                    return;
                }
                onWidgetHeight(d.doubleValue());
                return;
            }
            if (z && "set_state".equals(widgetBridgeMessage.action)) {
                final String string = widgetBridgeMessage.state.toString();
                this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.WidgetJsBridge.onMessage.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WidgetJsBridge.this.onSetState.invoke(string);
                    }
                });
            }
        }
    }

    private final void onWidgetHeight(double d) {
        if (d > 0.0d) {
            int iCeil = (int) Math.ceil(d * this.densityProvider.invoke().doubleValue());
            final int iClampWidgetHeightPx = HatchWidgetWebViewKt.clampWidgetHeightPx(iCeil);
            if (iClampWidgetHeightPx != iCeil) {
                CFK.A0H("HatchWidgetWebView", "Widget reported out-of-range height: %d px (clamped to %d)", Integer.valueOf(iCeil), Integer.valueOf(iClampWidgetHeightPx));
            }
            this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.WidgetJsBridge.onWidgetHeight.1
                @Override // java.lang.Runnable
                public final void run() {
                    WidgetJsBridge.this.onHeightMeasured.invoke(Integer.valueOf(iClampWidgetHeightPx));
                }
            });
        }
    }

    public final void update(G0U<? super String, Unit> g0u, G0U<? super Integer, Unit> g0u2) {
        AnonymousClass003.A0u(g0u, g0u2);
        this.onSetState = g0u;
        this.onHeightMeasured = g0u2;
    }
}
