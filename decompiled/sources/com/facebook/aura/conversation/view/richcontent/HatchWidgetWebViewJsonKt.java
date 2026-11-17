package com.facebook.aura.conversation.view.richcontent;

import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;

/* loaded from: classes2.dex */
public abstract class HatchWidgetWebViewJsonKt {
    public static final String TAG = "HatchWidgetWebView";

    public static final WidgetBridgeMessageJson parseWidgetBridgeMessage(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (WidgetBridgeMessageJson) HatchJsonKt.HatchJson.A00(str, WidgetBridgeMessageJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A("HatchWidgetWebView", "widget JS-bridge payload parse failed", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (WidgetBridgeMessageJson) objA0s;
    }
}
